package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Template {

    private final UUID id;
    private TemplateData templateData;



    public Template(@JsonProperty("did") UUID id,
                    @JsonProperty("templateData") TemplateData templateData) // numbers of pre-made elements need to be pasted too
    {
        this.id = id;
        this.templateData = templateData;
    }

    public UUID getId() {
        return id;
    }


    public TemplateData getTemplateData() {
        return templateData;
    }

}

