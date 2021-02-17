package com.example.demo.service;

import com.example.demo.dao.TemplateDao;
import com.example.demo.model.Template;
import com.example.demo.model.TemplateData;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@Service
public class TemplateService {

    private final TemplateDao templateDao;

    @Autowired
    public TemplateService(@Qualifier("templateDAO") TemplateDao templateDao)
    {
        this.templateDao = templateDao;
    }

    public void addTemplate(TemplateData data) throws Exception {
        templateDao.insertTemplate(data);
    }

    public List<Template> getTemplates() throws Exception {
        return templateDao.readTemplates();
    }

    public void generateTemplate() throws FileNotFoundException {
//        Object obj = new JSONParser().parse(new FileReader("json/categoryData"));

    }
}
