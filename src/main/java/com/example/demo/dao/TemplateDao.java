package com.example.demo.dao;

import com.example.demo.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import java.sql.*;
import java.util.concurrent.ExecutionException;

@Repository("templateDAO")
public class TemplateDao {

    public static final String URL = "jdbc:postgresql://localhost/templatedata";
    public static final String USER = "userw";
    public static final String PASSWORD = "password";

    public static final String INSERT_TEMPLATE =
            "INSERT INTO \"templateData\" (category, imgsrc, imgStyle, fontSize, textFontFamily, " +
                    "darkTheme, titleFontFamily, footerFontFamily, templateType, id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public String getTemplatesSQLQuery(int offset, int max) {
        return "SELECT * FROM \"templateData\" OFFSET " + offset + " ROWS FETCH NEXT " + max + " ROWS ONLY";
    }

    public String getTemplateSQLQuery(String id) {
        return "SELECT * FROM \"templateData\" WHERE id = '" + id + "'";
    }

    public String getNumberOfTemp(){
        return "SELECT COUNT(*) as rows FROM \"templateData\"";
    }


    public UUID generateId()
    {
        return UUID.randomUUID();
    }


    public void insertTemplate(TemplateData data) throws Exception
    {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            try(PreparedStatement ps = connection.prepareStatement(INSERT_TEMPLATE)){
            ps.setString(1, data.getCategory().toString());
            ps.setString(2, data.getImgSrc());
            ps.setString(3, data.getImgStyle().toString());
            ps.setInt(4, data.getFontSize());
            ps.setString(5, data.getTextFontFamily().toString());
            ps.setBoolean(6, data.getDarkTheme());
            ps.setString(7, data.getTitleFontFamily().toString());
            ps.setString(8, data.getFooterFontFamily().toString());
            ps.setString(9, data.getTemplateType().toString());
            ps.setString(10, generateId().toString());

            ps.executeUpdate();
        } } catch (SQLException e) {
            throw new Exception("Error saving template", e);
        }
    }

    public List<Template> readTemplates(int offset, int max) throws Exception
    {
        List<Template> templates = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            try(PreparedStatement ps = connection.prepareStatement(this.getTemplatesSQLQuery(offset, max))){
                try(ResultSet rs = ps.executeQuery()) {
                    while(rs.next()) {
                        TemplateData data = new TemplateData(
                                Enum.valueOf(TemplateCategory.class, rs.getString(1)),
                                rs.getString(2),
                                Enum.valueOf(ImgStyle.class, rs.getString(3)),
                                rs.getInt(4),
                                Enum.valueOf(FontFamily.class, rs.getString(5)),
                                rs.getBoolean(6),
                                Enum.valueOf(FontFamily.class, rs.getString(7)),
                                Enum.valueOf(FontFamily.class, rs.getString(8)),
                                Enum.valueOf(TemplateType.class, rs.getString(9))
                        );
                        Template template = new Template(
                                UUID.fromString(rs.getString(10)),
                                data
                        );
                        templates.add(template);
                    }
                    return templates;
                }

            } } catch (SQLException e) {
            throw new Exception("Error reading templates", e);
        }
    }

    public Template readTemplate(String id) throws Exception
    {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            try(PreparedStatement ps = connection.prepareStatement(this.getTemplateSQLQuery(id))){
                try(ResultSet rs = ps.executeQuery()) {
                    rs.next();
                    TemplateData data = new TemplateData(
                            Enum.valueOf(TemplateCategory.class, rs.getString(1)),
                            rs.getString(2),
                            Enum.valueOf(ImgStyle.class, rs.getString(3)),
                            rs.getInt(4),
                            Enum.valueOf(FontFamily.class, rs.getString(5)),
                            rs.getBoolean(6),
                            Enum.valueOf(FontFamily.class, rs.getString(7)),
                            Enum.valueOf(FontFamily.class, rs.getString(8)),
                            Enum.valueOf(TemplateType.class, rs.getString(9))
                    );
                    return new Template(
                            UUID.fromString(rs.getString(10)),
                            data
                    );
                }

            } } catch (SQLException e) {
            throw new Exception("Error reading template", e);
        }
    }

    public int getNumberOfRows() throws Exception {
        int i = -1;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            try (PreparedStatement ps = connection.prepareStatement(this.getNumberOfTemp())) {
                try (ResultSet rs = ps.executeQuery()) {
                    rs.next();
                    i = rs.getInt("rows");
                    return rs.getInt("rows");
                }
            }
        } catch (SQLException e) {
            throw new Exception("Error getting the number of templates" + i, e);
        }
    }

}
