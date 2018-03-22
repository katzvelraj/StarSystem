package com.example.administrator.starsystemssample.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 3/22/2018.
 */

public class SectionList {

    @SerializedName("formName")
    @Expose
    private String formName;
    @SerializedName("pages")
    @Expose
    private List<Page> pages = null;

    /**
     * No args constructor for use in serialization
     */
    public SectionList() {
    }

    /**
     * @param pages
     * @param formName
     */
    public SectionList(String formName, List<Page> pages) {
        super();
        this.formName = formName;
        this.pages = pages;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

}
