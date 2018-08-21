package com.example.arunr.speechtotext.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SongsResponse {

    @SerializedName("STATUS_CODE")
    @Expose
    private Integer sTATUSCODE;
    @SerializedName("RESPONSE")
    @Expose
    private List<Song> rESPONSE = null;
    @SerializedName("FACET")
    @Expose
    private FACET fACET;
    @SerializedName("RESPONSE_COUNT")
    @Expose
    private Integer rESPONSECOUNT;
    @SerializedName("TOTAL")
    @Expose
    private Integer tOTAL;

    public Integer getSTATUSCODE() {
        return sTATUSCODE;
    }

    public void setSTATUSCODE(Integer sTATUSCODE) {
        this.sTATUSCODE = sTATUSCODE;
    }

    public List<Song> getRESPONSE() {
        return rESPONSE;
    }

    public void setRESPONSE(List<Song> rESPONSE) {
        this.rESPONSE = rESPONSE;
    }

    public FACET getFACET() {
        return fACET;
    }

    public void setFACET(FACET fACET) {
        this.fACET = fACET;
    }

    public Integer getRESPONSECOUNT() {
        return rESPONSECOUNT;
    }

    public void setRESPONSECOUNT(Integer rESPONSECOUNT) {
        this.rESPONSECOUNT = rESPONSECOUNT;
    }

    public Integer getTOTAL() {
        return tOTAL;
    }

    public void setTOTAL(Integer tOTAL) {
        this.tOTAL = tOTAL;
    }
}
