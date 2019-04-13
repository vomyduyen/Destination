package com.myduyen.destination;

public class RV {

    private int anh;
    private String ten,dc,review;
    private double latitude,longtitude;

    public RV(int anh, String ten, String dc, String review ,Double latitude,Double longtitude) {
        this.anh = anh;
        this.ten = ten;
        this.dc = dc;
        this.review = review;
        this.latitude= latitude;
        this.longtitude=longtitude;

    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }
}
