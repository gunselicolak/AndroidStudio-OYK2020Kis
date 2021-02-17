package com.kis.recyclerviewornek;

public class SocialMedia {
    private String ad;
    private int imgId;

    public SocialMedia(String ad, int imgId) {
        this.ad = ad;
        this.imgId = imgId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
