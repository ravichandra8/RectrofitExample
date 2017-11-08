package com.ravi.rectrofitexample.model;

/**
 * Created by LENOVO on 07-11-2017.
 */



        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Post {

    //data
    @SerializedName("Latitude")
    @Expose
    private String Latitude;
    @SerializedName("Longitude")
    @Expose
    private String Longitude;
    @SerializedName("crimetypeId")
    @Expose
    private String crimetypeId;
    @SerializedName("psid")
    @Expose
    private String psid;

    @SerializedName("subTypeId")
    @Expose
    private String subTypeId;

    @SerializedName("fromdate")
    @Expose
    private String fromdate;

    @SerializedName("todate")
    @Expose
    private String todate;

    @SerializedName("Radius")
    @Expose
    private String Radius;


    public String getCrimetypeId() {
        return crimetypeId;
    }

    public String getFromdate() {
        return fromdate;
    }

    public String getLatitude() {
        return Latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public String getPsid() {
        return psid;
    }

    public String getRadius() {
        return Radius;
    }

    public String getSubTypeId() {
        return subTypeId;
    }

    public String getTodate() {
        return todate;
    }

    public void setCrimetypeId(String crimetypeId) {
        this.crimetypeId = crimetypeId;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public void setPsid(String psid) {
        this.psid = psid;
    }

    public void setRadius(String radius) {
        Radius = radius;
    }

    public void setSubTypeId(String subTypeId) {
        this.subTypeId = subTypeId;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public Post(String latitude, String longitude, String crimetypeId, String psid, String subTypeId, String fromdate, String todate, String radius) {
        Latitude = latitude;
        Longitude = longitude;
        this.crimetypeId = crimetypeId;
        this.psid = psid;
        this.subTypeId = subTypeId;
        this.fromdate = fromdate;
        this.todate = todate;
        Radius = radius;
    }

//    @Override
//    public String toString() {
//        return "Post{" +
//                "title='" + title + '\'' +
//                ", body='" + body + '\'' +
//                ", userId=" + userId +
//                ", id=" + id +
//                '}';
//    }
}