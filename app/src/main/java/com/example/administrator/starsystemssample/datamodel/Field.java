package com.example.administrator.starsystemssample.datamodel;

/**
 * Created by Administrator on 3/22/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Field {

    @SerializedName("fieldLabel")
    @Expose
    private String fieldLabel;
    @SerializedName("fieldAnswerType")
    @Expose
    private String fieldAnswerType;
    @SerializedName("fieldVariableName")
    @Expose
    private String fieldVariableName;

    /**
     * No args constructor for use in serialization
     *
     */
    public Field() {
    }

    /**
     *
     * @param fieldAnswerType
     * @param fieldVariableName
     * @param fieldLabel
     */
    public Field(String fieldLabel, String fieldAnswerType, String fieldVariableName) {
        super();
        this.fieldLabel = fieldLabel;
        this.fieldAnswerType = fieldAnswerType;
        this.fieldVariableName = fieldVariableName;
    }

    public String getFieldLabel() {
        return fieldLabel;
    }

    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
    }

    public String getFieldAnswerType() {
        return fieldAnswerType;
    }

    public void setFieldAnswerType(String fieldAnswerType) {
        this.fieldAnswerType = fieldAnswerType;
    }

    public String getFieldVariableName() {
        return fieldVariableName;
    }

    public void setFieldVariableName(String fieldVariableName) {
        this.fieldVariableName = fieldVariableName;
    }

}