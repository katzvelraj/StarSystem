package com.example.administrator.starsystemssample.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 3/22/2018.
 */

public class Section {

    @SerializedName("sectionName")
    @Expose
    private String sectionName;
    @SerializedName("fields")
    @Expose
    private List<Field_> fields = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Section() {
    }

    /**
     *
     * @param sectionName
     * @param fields
     */
    public Section(String sectionName, List<Field_> fields) {
        super();
        this.sectionName = sectionName;
        this.fields = fields;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public List<Field_> getFields() {
        return fields;
    }

    public void setFields(List<Field_> fields) {
        this.fields = fields;
    }
}
