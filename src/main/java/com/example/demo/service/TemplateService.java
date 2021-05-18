package com.example.demo.service;

import com.example.demo.dao.TemplateDao;
import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

@Service
public class TemplateService {

    private final TemplateDao templateDao;

    @Autowired
    public TemplateService(@Qualifier("templateDAO") TemplateDao templateDao) throws Exception {
        this.templateDao = templateDao;
//        generateTemplates();
    }

    public void addTemplate(TemplateData data) throws Exception {
        templateDao.insertTemplate(data);
    }

    public List<Template> getTemplates(int offset, int max) throws Exception {
        return templateDao.readTemplates(offset, max);
    }

    public Template getTemplate(String id) throws Exception {
        return templateDao.readTemplate(id);
    }

    public int getNumOfRows() throws Exception{
        return templateDao.getNumberOfRows();
    }

    public void generateTemplates() throws Exception {
        TemplateData templateData = new TemplateData(TemplateCategory.COOKING, "", ImgStyle.square, 0, FontFamily.ROBOTO, false, FontFamily.ROBOTO, FontFamily.ROBOTO, TemplateType.HORIZONTAL);

        for (TemplateType type: TemplateType.values())
        {
            templateData.setTemplateType(type);
            for (TemplateCategory category : TemplateCategory.values()){
                templateData.setCategory(category);
                for (imgSrc imgSrc: imgSrc.values())
                {
                    templateData.setImgSrc(imgSrc.getFilepath());
                    for (ImgStyle imgStyle: ImgStyle.values())
                    {
                        templateData.setImgStyle(imgStyle);
                        templateData.setFontSize(14);
                        for (FontFamily font: FontFamily.values())
                        {
                            templateData.setTextFontFamily(font);
                            templateData.setTitleFontFamily(font);
                            templateData.setFooterFontFamily(font);
                            templateDao.insertTemplate(templateData);
                        }
                    }
                }
            }
        }

    }

}
