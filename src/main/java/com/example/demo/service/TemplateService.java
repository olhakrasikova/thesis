package com.example.demo.service;

import com.example.demo.dao.TemplateDao;
import com.example.demo.model.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateService {

    private final TemplateDao templateDao;

    @Autowired
    public TemplateService(@Qualifier("templateDAO") TemplateDao templateDao)
    {
        this.templateDao = templateDao;
    }

    public int addTemplate(Template template)
    {
        return templateDao.insertTemplate(template);
    }

    public List<Template> getAllTemplates()
    {
        return templateDao.selectAllTemplates();
    }

}
