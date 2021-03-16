// let heading = document.querySelector('#header');
// let text = document.querySelector('#main-text');
//
// // let btn = document.createElement("BUTTON");
// // btn.innerHTML = "EDIT";
// // document.body.appendChild(btn);
//
//
// document.addEventListener('click', (e) =>{
//     // const changePhotoButton = document;
//     const editHeadingButton = document.querySelector('#EditHeadingButton');
//     const confirmHeadingButton = document.querySelector('#confirmHeading');
//
//     const editTextButton = document.querySelector('#EditTextButton');
//     const confirmTextButton = document.querySelector('#confirmText');
//
//     const changePhotoButton = document.querySelector('#changePhotoButton');
//     const confirmPhotoButton = document.querySelector('#confirmPhoto');
//
//     if(e.target === editHeadingButton)
//     {
//         editingEnabled(heading);
//         editHeadingButton.classList.add('hidden');
//         confirmHeadingButton.classList.remove('hidden');
//     }
//     if (e.target === confirmHeadingButton)
//     {
//         editingDisabled(heading);
//         editHeadingButton.classList.remove('hidden');
//         confirmHeadingButton.classList.add('hidden');
//     }
//     if (e.target === editTextButton)
//     {
//         editingEnabled(text);
//         editTextButton.classList.add('hidden');
//         confirmTextButton.classList.remove('hidden');
//     }
//     if(e.target === confirmTextButton)
//     {
//         editingDisabled(text);
//         editTextButton.classList.remove('hidden');
//         confirmTextButton.classList.add('hidden');
//     }
//     if(e.target === changePhotoButton)
//     {
//         document.querySelector('#imageLink').classList.remove('hidden');
//         confirmPhotoButton.classList.remove('hidden');
//         changePhotoButton.classList.add('hidden');
//     }
//     if (e.target === confirmPhotoButton)
//     {
//         uploadImg();
//         document.querySelector('#imageLink').classList.add('hidden');
//         confirmPhotoButton.classList.add('hidden');
//         changePhotoButton.classList.remove('hidden');
//
//     }
// });
//
//
// function photoEditor(){
//
//
// }
//
// function uploadImg() {
//     let imgLinkElement = document.querySelector('#imageLink').value.trim();
//     let imgInput = document.querySelector('#imageLinkInput').value.trim();
//     imgLinkElement = imgInput;
// }
//
//
// function editingEnabled(editingElem)
// {
//     editingElem.contentEditable = "true";
// }
//
// function editingDisabled(editingElem)
// {
//     editingElem.contentEditable = "false";
// }
