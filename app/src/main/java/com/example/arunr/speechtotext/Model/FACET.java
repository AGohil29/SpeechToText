package com.example.arunr.speechtotext.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FACET {

    @SerializedName("Audio_Track")
    @Expose
    private AudioTrack audioTrack;

    public AudioTrack getAudioTrack() {
        return audioTrack;
    }

    public void setAudioTrack(AudioTrack audioTrack) {
        this.audioTrack = audioTrack;
    }
}
