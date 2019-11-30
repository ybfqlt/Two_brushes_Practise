package com.memory.pojo;

public class ViewFood {


    private Integer foodId;

    private Integer viewId;

    private String foodName;

    private Integer foodPrice;

    private String foodDistance;

    private String foodAddress;

    private String foodHot;

    private String foodDesc;

    private String foodChineseName;

    private String foodLocate;

    private String foodTaste;

    private String foodOrigin;

    private String foodRecommend;

    public String getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }

    private String foodImg;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public Integer getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Integer foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodDistance() {
        return foodDistance;
    }

    public void setFoodDistance(String foodDistance) {
        this.foodDistance = foodDistance == null ? null : foodDistance.trim();
    }

    public String getFoodAddress() {
        return foodAddress;
    }

    public void setFoodAddress(String foodAddress) {
        this.foodAddress = foodAddress == null ? null : foodAddress.trim();
    }

    public String getFoodHot() {
        return foodHot;
    }

    public void setFoodHot(String foodHot) {
        this.foodHot = foodHot == null ? null : foodHot.trim();
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc == null ? null : foodDesc.trim();
    }

    public String getFoodChineseName() {
        return foodChineseName;
    }

    public void setFoodChineseName(String foodChineseName) {
        this.foodChineseName = foodChineseName == null ? null : foodChineseName.trim();
    }

    public String getFoodLocate() {
        return foodLocate;
    }

    public void setFoodLocate(String foodLocate) {
        this.foodLocate = foodLocate == null ? null : foodLocate.trim();
    }

    public String getFoodTaste() {
        return foodTaste;
    }

    public void setFoodTaste(String foodTaste) {
        this.foodTaste = foodTaste == null ? null : foodTaste.trim();
    }

    public String getFoodOrigin() {
        return foodOrigin;
    }

    public void setFoodOrigin(String foodOrigin) {
        this.foodOrigin = foodOrigin == null ? null : foodOrigin.trim();
    }

    public String getFoodRecommend() {
        return foodRecommend;
    }

    public void setFoodRecommend(String foodRecommend) {
        this.foodRecommend = foodRecommend == null ? null : foodRecommend.trim();
    }
}