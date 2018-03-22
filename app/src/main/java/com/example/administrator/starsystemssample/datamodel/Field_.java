package com.example.administrator.starsystemssample.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 3/22/2018.
 */

public class Field_ {

    @SerializedName("fieldLabel")
    @Expose
    private String fieldLabel;
    @SerializedName("fieldAnswerType")
    @Expose
    private String fieldAnswerType;
    @SerializedName("fieldVariableName")
    @Expose
    private String fieldVariableName;
    @SerializedName("fieldRequired")
    @Expose
    private boolean fieldRequired;

    /**
     * No args constructor for use in serialization
     *
     */
    public Field_() {
    }

    /**
     *
     * @param fieldAnswerType
     * @param fieldVariableName
     * @param fieldRequired
     * @param fieldLabel
     */
    public Field_(String fieldLabel, String fieldAnswerType, String fieldVariableName, boolean fieldRequired) {
        super();
        this.fieldLabel = fieldLabel;
        this.fieldAnswerType = fieldAnswerType;
        this.fieldVariableName = fieldVariableName;
        this.fieldRequired = fieldRequired;
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

    public boolean isFieldRequired() {
        return fieldRequired;
    }

    public void setFieldRequired(boolean fieldRequired) {
        this.fieldRequired = fieldRequired;
    }
}
