package com.example.demo.dao;

import com.example.demo.model.Template;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("templateDAO")
public class TemplateDataAccessService implements TemplateDao{

    private static List<Template> DB = new ArrayList<>();

    @Override
    public int insertTemplate(UUID id, Template template) {
        DB.add(new Template(id, template.getImgNum()));
        return 1;
    }

    @Override
    public List<Template> selectAllTemplates() {
        return DB;
    }
}
