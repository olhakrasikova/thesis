package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Template {

    private final UUID id;
    private final int imgNum;



    public Template(@JsonProperty("id") UUID id,
                    @JsonProperty("imgNum")int imgNum) // numbers of pre-made elements need to be pasted too
    {
        this.id = id;
        this.imgNum = imgNum;
    }

    public UUID getId() {
        return id;
    }

    public int getImgNum() { return imgNum; }
}

