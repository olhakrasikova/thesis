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
    private TemplateType templateType;

    public TemplateData(@JsonProperty("category") TemplateCategory category,
                        @JsonProperty("imgSrc") String imgSrc,
                        @JsonProperty("imgStyle") ImgStyle imgStyle,
                        @JsonProperty("fontSize") int fontSize,
                        @JsonProperty("textFontFamily") FontFamily textFontFamily,
                        @JsonProperty("darkTheme") Boolean darkTheme,
                        @JsonProperty("titleFontFamily") FontFamily titleFontFamily,
                        @JsonProperty("footerFontFamily") FontFamily footerFontFamily,
                        @JsonProperty("templateType") TemplateType templateType
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
        this.templateType = templateType;
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

    public void setCategory(TemplateCategory category) {
        this.category = category;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public void setImgStyle(ImgStyle imgStyle) {
        this.imgStyle = imgStyle;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setDarkTheme(Boolean darkTheme) {
        this.darkTheme = darkTheme;
    }

    public void setTextFontFamily(FontFamily textFontFamily) {
        this.textFontFamily = textFontFamily;
    }

    public void setTitleFontFamily(FontFamily titleFontFamily) {
        this.titleFontFamily = titleFontFamily;
    }

    public void setFooterFontFamily(FontFamily footerFontFamily) {
        this.footerFontFamily = footerFontFamily;
    }

    public void setTemplateType(TemplateType templateType) {
        this.templateType = templateType;
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

    public TemplateType getTemplateType() {
        return this.templateType;
    }
}
