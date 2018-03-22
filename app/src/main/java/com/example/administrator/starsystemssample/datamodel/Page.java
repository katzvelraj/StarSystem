package com.example.administrator.starsystemssample.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 3/22/2018.
 */

public class Page {

    @SerializedName("pageName")
    @Expose
    private String pageName;
    @SerializedName("pageType")
    @Expose
    private String pageType;
    @SerializedName("fields")
    @Expose
    private List<Field> fields = null;
    @SerializedName("sections")
    @Expose
    private List<Section> sections = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Page() {
    }

    /**
     *
     * @param pageType
     * @param sections
     * @param pageName
     * @param fields
     */
    public Page(String pageName, String pageType, List<Field> fields, List<Section> sections) {
        super();
        this.pageName = pageName;
        this.pageType = pageType;
        this.fields = fields;
        this.sections = sections;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
