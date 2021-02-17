package com.kis.intentparcelableornek;

import android.os.Parcel;
import android.os.Parcelable;

public class Kitap implements Parcelable {

    String ad;
    int fiyat;

    public Kitap(String ad, int fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }


    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public int getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "ad='" + ad + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }



    public static final Creator<Kitap> CREATOR = new Creator<Kitap>() {
        @Override
        public Kitap createFromParcel(Parcel in) {
            return new Kitap(in);
        }

        @Override
        public Kitap[] newArray(int size) {
            return new Kitap[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }


    protected Kitap(Parcel in) {
        ad = in.readString();
        fiyat = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ad);
        dest.writeInt(fiyat);
    }
}
