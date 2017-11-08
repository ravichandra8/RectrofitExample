package com.ravi.rectrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by LENOVO on 07-11-2017.
 */

public class PostResponseParent {
    @SerializedName("CrimeDetails")
    private List<PostReponseChild> CrimeDetails;

    @SerializedName("Code")
    private String Code;

    @SerializedName("Message")
    private String Message;



    public void setCode(String code) {
        Code = code;
    }

    public String getCode() {
        return Code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setCrimeDetails(List<PostReponseChild> crimeDetails) {
        CrimeDetails = crimeDetails;
    }

    public List<PostReponseChild> getCrimeDetails() {
        return CrimeDetails;
    }
}
