package com.example.arunr.speechtotext.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SongsResponse {

    @SerializedName("STATUS_CODE")
    @Expose
    private Integer statusCode;
    @SerializedName("RESPONSE")
    @Expose
    private List<Song> response = null;
    @SerializedName("FACET")
    @Expose
    private FACET facet;
    @SerializedName("RESPONSE_COUNT")
    @Expose
    private Integer responseCount;
    @SerializedName("TOTAL")
    @Expose
    private Integer total;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public List<Song> getResponse() {
        return response;
    }

    public void setResponse(List<Song> response) {
        this.response = response;
    }

    public FACET getFacet() {
        return facet;
    }

    public void setFacet(FACET facet) {
        this.facet = facet;
    }

    public Integer getResponseCount() {
        return responseCount;
    }

    public void setResponseCount(Integer responseCount) {
        this.responseCount = responseCount;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
