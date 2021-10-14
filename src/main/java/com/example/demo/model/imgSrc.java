package com.example.demo.model;

import jdk.jfr.Category;

public enum imgSrc {
    A("https://images.unsplash.com/photo-1513135065346-a098a63a71ee?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1349&q=80", TemplateCategory.COOKING),
    Q("https://images.unsplash.com/photo-1547592180-85f173990554?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.COOKING),
    W("https://images.unsplash.com/photo-1605522469906-3fe226b356bc?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1052&q=80", TemplateCategory.COOKING),
    E("https://images.unsplash.com/photo-1484910292437-025e5d13ce87?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1088&q=80", TemplateCategory.TRAVELING),
    R("https://images.unsplash.com/photo-1523592121529-f6dde35f079e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.TRAVELING),
    T("https://images.unsplash.com/photo-1507671280192-5900ae887d3d?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1053&q=80", TemplateCategory.TRAVELING),
    Y("https://images.unsplash.com/photo-1537832816519-689ad163238b?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1040&q=80", TemplateCategory.FASHION),
    U("https://images.unsplash.com/photo-1490481651871-ab68de25d43d?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", TemplateCategory.FASHION),
    I("https://images.unsplash.com/photo-1479064555552-3ef4979f8908?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.FASHION),
    O("https://images.unsplash.com/photo-1522065893269-6fd20f6d7438?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", TemplateCategory.DIY),
    P("https://images.unsplash.com/photo-1452860606245-08befc0ff44b?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", TemplateCategory.DIY),
    S("https://images.unsplash.com/photo-1607346705432-b3047f8c20bf?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1051&q=80", TemplateCategory.DIY),
    D("https://images.unsplash.com/photo-1608308594534-223d7579f3c9?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.DIY),
    F("https://images.unsplash.com/photo-1542204165-65bf26472b9b?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=967&q=80", TemplateCategory.MOVIES),
    G("https://images.unsplash.com/photo-1578674473215-9e07ee2e577d?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1339&q=80", TemplateCategory.MOVIES),
    H("https://images.unsplash.com/photo-1485846234645-a62644f84728?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1040&q=80", TemplateCategory.MOVIES),
    J("https://images.unsplash.com/3/doctype-hi-res.jpg?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1046&q=80", TemplateCategory.EDUCATION),
    K("https://images.unsplash.com/photo-1486312338219-ce68d2c6f44d?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1052&q=80", TemplateCategory.EDUCATION),
    L("https://images.unsplash.com/photo-1488190211105-8b0e65b80b4e?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", TemplateCategory.EDUCATION),
    Z("https://images.unsplash.com/photo-1584697964400-2af6a2f6204c?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.EDUCATION),
    X("https://images.unsplash.com/photo-1532094349884-543bc11b234d?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", TemplateCategory.SCIENCE),
    C("https://images.unsplash.com/photo-1581091014534-898da33e356e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.SCIENCE),
    V("https://images.unsplash.com/photo-1581093588401-fbb62a02f120?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.SCIENCE),
    B("https://images.unsplash.com/photo-1453847668862-487637052f8a?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1055&q=80", TemplateCategory.SCIENCE),
    N("https://images.unsplash.com/photo-1511174511562-5f7f18b874f8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", TemplateCategory.SCIENCE),
    M("https://images.unsplash.com/photo-1590533936661-78b3893494c9?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.BOATS),
    QQ("https://images.unsplash.com/photo-1544634043-dde2dc1b3813?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.BOATS),
    WW("https://images.unsplash.com/photo-1567899378494-47b22a2ae96a?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.BOATS),
    RR("https://images.unsplash.com/photo-1562281302-809108fd533c?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.BOATS),
    TT("https://images.unsplash.com/photo-1480951921287-2ecdd81efbc2?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", TemplateCategory.BOATS),
    YY("https://images.unsplash.com/photo-1554118811-1e0d58224f24?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1030&q=80", TemplateCategory.CAFES),
    UU("https://images.unsplash.com/photo-1541173109020-9c5d8a48e169?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=999&q=80", TemplateCategory.CAFES),
    II("https://images.unsplash.com/photo-1559925393-8be0ec4767c8?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1051&q=80", TemplateCategory.CAFES),
    OO("https://images.unsplash.com/photo-1453614512568-c4024d13c247?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1189&q=80", TemplateCategory.CAFES),
    AA("https://images.unsplash.com/photo-1566073771259-6a8506099945?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.CAFES),
    PP("https://images.unsplash.com/photo-1445019980597-93fa8acb246c?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1053&q=80", TemplateCategory.HOTELS),
    SS("https://images.unsplash.com/photo-1529290130-4ca3753253ae?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1055&q=80", TemplateCategory.HOTELS),
    DD("https://images.unsplash.com/photo-1541971875076-8f970d573be6?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=967&q=80", TemplateCategory.HOTELS),
    FF("https://images.unsplash.com/reserve/8T8J12VQxyqCiQFGa2ct_bahamas-atlantis.jpg?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1050&q=80", TemplateCategory.HOTELS),
    GG("https://images.unsplash.com/photo-1570213489059-0aac6626cade?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80", TemplateCategory.HOTELS);

    private String filepath;
    private TemplateCategory category;

    private imgSrc(String filepath, TemplateCategory category) {
        this.filepath = filepath;
        this.category = category;
    }

    public String getFilepath() {
        return filepath;
    }

    public TemplateCategory getCategory() {
        return category;
    }
}
