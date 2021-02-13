package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemplateData {

    private TemplateCategory category;
    private String imgSrc;
    private ImgStyle imgStyle;
    private int fontSize;
    private Boolean darkTheme;
    private FontFamily textFontFamily;
    private FontFamily titleFontFamily;
    private FontFamily footerFontFamily;

    public TemplateData(@JsonProperty("category") TemplateCategory category,
                        @JsonProperty("imgSrc") String imgSrc,
                        @JsonProperty("imgStyle") ImgStyle imgStyle,
                        @JsonProperty("fontSize") int fontSize,
                        @JsonProperty("textFontFamily") FontFamily textFontFamily,
                        @JsonProperty("darkTheme") Boolean darkTheme,
                        @JsonProperty("titleFontFamily") FontFamily titleFontFamily,
                        @JsonProperty("footerFontFamily") FontFamily footerFontFamily
                        )
    {
        this.category = category;
        this.imgSrc = imgSrc;
        this.imgStyle = imgStyle;
        this.fontSize = fontSize;
        this.textFontFamily = textFontFamily;
        this.darkTheme = darkTheme;
        this.titleFontFamily = titleFontFamily;
        this.footerFontFamily = footerFontFamily;

    }

    public TemplateCategory getCategory() {
        return category;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public ImgStyle getImgStyle() {
        return imgStyle;
    }

    public int getFontSize() {
        return fontSize;
    }

    public Boolean getDarkTheme() {
        return darkTheme;
    }

    public FontFamily getTextFontFamily() {
        return textFontFamily;
    }

    public FontFamily getTitleFontFamily() {
        return titleFontFamily;
    }

    public FontFamily getFooterFontFamily() {
        return footerFontFamily;
    }
}
