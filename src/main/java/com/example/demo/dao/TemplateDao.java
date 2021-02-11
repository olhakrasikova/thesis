package com.example.demo.dao;

import com.example.demo.model.Template;

import java.util.List;
import java.util.UUID;

public interface TemplateDao {

    int insertTemplate(UUID id, Template template);

    default int insertTemplate(Template template){
        UUID id = UUID.randomUUID();
        return insertTemplate(id, template);
    }

    List<Template> selectAllTemplates();
}
