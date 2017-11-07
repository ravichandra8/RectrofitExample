package com.ravi.rectrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MoviesResponse {
//    @SerializedName("page")
//    private int page;
    @SerializedName("PoliceStaionlist")
    private List<Movie> PoliceStaionlist;
//    @SerializedName("total_results")
//    private int totalResults;
//    @SerializedName("total_pages")
//    private int totalPages;

//    public int getPage() {
//        return page;
//    }
//
//    public void setPage(int page) {
//        this.page = page;
//    }

    public List<Movie> getResults() {
        return PoliceStaionlist;
    }

    public void setResults(List<Movie> results) {
        this.PoliceStaionlist = results;
    }

//    public int getTotalResults() {
//        return totalResults;
//    }
//
//    public void setTotalResults(int totalResults) {
//        this.totalResults = totalResults;
//    }
//
//    public int getTotalPages() {
//        return totalPages;
//    }
//
//    public void setTotalPages(int totalPages) {
//        this.totalPages = totalPages;
//    }
}
