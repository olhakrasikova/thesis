package com.example.demo;


import com.example.demo.dao.TemplateDao;
import com.example.demo.model.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert.*;


@SpringBootTest
public class daoTests {

    TemplateDao templateDao = new TemplateDao();

    public UUID generateId()
    {
        return UUID.randomUUID();
    }

    @Test
    public void readTemplatesTest(){
        Map filters = new HashMap();
        List<Template> templates = templateDao.readTemplates(0, 1, filters);
        TemplateData data = new TemplateData(TemplateCategory.COOKING, "https://images.unsplash.com/photo-1513135065346-a098a63a71ee?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1349&q=80", ImgStyle.square, 14, FontFamily.ROBOTO, false, FontFamily.ROBOTO, FontFamily.ROBOTO, TemplateType.HORIZONTAL);
        Template template = new Template(generateId(), data);
//        Assert.
    }

    @Test
    public void getNumberOfRowsTest()
    {
        Assert.assertEquals(2129, templateDao.getNumberOfRows() );
    }

    @Test
    public void insertTemplateTest(){
        TemplateData data = new TemplateData(TemplateCategory.COOKING, "https://images.unsplash.com/photo-1513135065346-a098a63a71ee?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1349&q=80", ImgStyle.square, 14, FontFamily.ROBOTO, false, FontFamily.ROBOTO, FontFamily.ROBOTO, TemplateType.HORIZONTAL);
        templateDao.insertTemplate(data);
        Template template = templateDao.readTemplate(generateId().toString());
    }
}
