let urlBase = ""

async function fetchAndDisplayArticles(targetElm) {
    const url = urlBase + 'article/';
    try {
        const offset = (currentPage - 1) * 20;

        // const response = await fetch(`${url}?tag=${tag}&max=20&offset=${offset}`);
        const response = await fetch(`${url}?&max=20&offset=${offset}`);
        const data = await response.json();
        totalPages = Math.ceil(data.meta.totalCount/20);



        let articles = await Promise.all(
            data.articles.map(async (article) => {
                const articleResponse = await fetch(url + article.id);
                return articleResponse.json();
            }),
        );

        articles = articles.map((article) => ({
            ...article,
            link: '#article/' + article.id,
        }));


        const template = document.querySelector('#template-articles');
        document.getElementById(
            targetElm,
        ).innerHTML = Mustache.render(template.innerHTML, { articles });
    } catch (errMessage) {
        document.getElementById(
            targetElm,
        ).innerHTML = Mustache.render(
            document.querySelector('#template-articles-error').innerHTML,
            { errMessage },
        );
    }
}

async function getArticleData(id) {
    const response = await fetch(`${urlBase}article/${id}`);
    return response.json();
}

async function fetchAndDisplayArticleDetails(targetElm) {
    const id = getIdFromHash(location.hash);
    const article = await getArticleData(id);

    renderComments();

    const template = document.querySelector('#template-article');
    document.getElementById(targetElm).innerHTML = Mustache.render(
        template.innerHTML,
        article,
    );
}
