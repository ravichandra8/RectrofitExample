package com.ravi.rectrofitexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LENOVO on 07-11-2017.
 */

public class PostReponseChild {
    @SerializedName("CrimeId")
    private String CrimeId;
    @SerializedName("Crimenumber")
    private String Crimenumber;
    @SerializedName("PoliceStation")
    private String PoliceStation;

    public String getCrimeId() {
        return CrimeId;
    }

    public void setCrimeId(String crimeId) {
        CrimeId = crimeId;
    }

    public String getCrimenumber() {
        return Crimenumber;
    }

    public void setCrimenumber(String crimenumber) {
        Crimenumber = crimenumber;
    }

    public void setPoliceStation(String policeStation) {
        PoliceStation = policeStation;
    }

    public String getPoliceStation() {
        return PoliceStation;
    }
}
