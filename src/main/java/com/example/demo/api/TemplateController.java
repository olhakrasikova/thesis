package com.example.demo.api;

import com.example.demo.model.Template;
import com.example.demo.model.TemplateData;
import com.example.demo.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RequestMapping("api/v1/templates")

@RestController
public class TemplateController {

    private final TemplateService templateService;

    @Autowired
    public TemplateController(TemplateService templateService)
    {
        this.templateService = templateService;
    }

    @PostMapping
    public void addTemplate(@RequestBody TemplateData data) throws Exception
    {
        templateService.addTemplate(data);
    }

    @GetMapping
    @CrossOrigin(originPatterns = "*")
    @ResponseBody
    public List<Template> getTemplates(@RequestParam("offset") int offset, @RequestParam("max") int max, @RequestParam("filters") String filters) throws Exception
    {
        String str = filters.replaceAll("[^a-zA-Z0-9]", "");
        str = str.replaceAll("category", "");
        String [] arrayOfFilters = str.split(" ");

        System.out.println(Arrays.toString(arrayOfFilters));
        System.out.println(filters);
        System.out.println(str);

         return templateService.getTemplates(offset, max);
    }

    @GetMapping("/{id}")
    @CrossOrigin(originPatterns = "*")
    @ResponseBody
    public Template getTemplate(@PathVariable("id") String id) throws Exception
    {
        return templateService.getTemplate(id);
    }

    @GetMapping("/numberOfRows")
    @CrossOrigin(originPatterns = "*")
    @ResponseBody
    public int getNumberOfRows() throws Exception
    {
        return templateService.getNumOfRows();
    }
}
