package com.memory.pojo;

public class ViewHotel {
    private Integer hotelId;

    private Integer viewId;

    private String hotelName;

    private Integer hotelPrice;

    private String hotelDistance;

    private String hotelAddress;

    private String hotelScore;

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public Integer getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(Integer hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public String getHotelDistance() {
        return hotelDistance;
    }

    public void setHotelDistance(String hotelDistance) {
        this.hotelDistance = hotelDistance == null ? null : hotelDistance.trim();
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress == null ? null : hotelAddress.trim();
    }

    public String getHotelScore() {
        return hotelScore;
    }

    public void setHotelScore(String hotelScore) {
        this.hotelScore = hotelScore == null ? null : hotelScore.trim();
    }
}