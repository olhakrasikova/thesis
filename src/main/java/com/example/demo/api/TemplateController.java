package com.example.demo.api;

import com.example.demo.model.Template;
import com.example.demo.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("api/v1/template")

@RestController
public class TemplateController {

    private final TemplateService templateService;

    @Autowired
    public TemplateController(TemplateService templateService)
    {
        this.templateService = templateService;
    }

    @PostMapping
    public void addTemplate(@RequestBody Template template)
    {
        templateService.addTemplate(template);
    }

    @GetMapping
    public List<Template> getAllTemplates()
    {
        return templateService.getAllTemplates();
    }

}
