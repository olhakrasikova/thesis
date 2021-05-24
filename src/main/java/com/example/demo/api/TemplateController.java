package com.example.demo.api;

import com.example.demo.model.Template;
import com.example.demo.model.TemplateData;
import com.example.demo.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.sql.Types.NULL;


@RequestMapping("api/v1/templates")
@RestController
@CrossOrigin//(origins = "http://localhost:8080/")

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
//    @CrossOrigin(originPatterns = "*")
    @ResponseBody
    public List<Template> getTemplates(@RequestParam("offset") int offset, @RequestParam ("max") int max, @RequestParam("filter") String filters)
    {


//        String str =
//        str = str.replaceAll("category", "");
//        str = str.replaceAll("templateType", "");
//        str = str.replaceAll("font", "");
//
//        String [] arrayOfFilters = str.split(" ");

//        System.out.println(arrayOfFilters[0]);
//        System.out.println(arrayOfFilters[1]);
//        System.out.println(arrayOfFilters[2]);

//        System.out.println(Arrays.toString(arrayOfFilters));

//        String category = arrayOfFilters[0];
//        String templateType = arrayOfFilters[1];
//        String font = arrayOfFilters[2];
        Map<String, String> map = new HashMap<>();

        System.out.println();
        // [^a-zA-Z0-9]
        String [] arrayOfFilters = filters
                .replaceAll(" ", "")
                .replaceAll("\\{", "")
                .replaceAll("}", "")
                .replaceAll("\"", "")
                .split(",");
        if (!arrayOfFilters[0].equals(""))
        {
            for (String filter: arrayOfFilters) {
                String [] filterSegments = filter.split(":");
                map.put(filterSegments[0], filterSegments[1]);
            }
        }

        return templateService.getTemplates(offset, max, map);
    }

    @GetMapping("/{id}")
//    @CrossOrigin(originPatterns = "*")
    @ResponseBody
    public Template getTemplate(@PathVariable("id") String id)
    {
        return templateService.getTemplate(id);
    }

    @GetMapping("/numberOfRows")
    @CrossOrigin(originPatterns = "*")
    @ResponseBody
    public int getNumberOfRows()
    {
           return templateService.getNumOfRows();
    }
}
