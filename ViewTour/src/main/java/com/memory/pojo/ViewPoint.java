package com.memory.pojo;

public class ViewPoint {
    private Integer viewId;

    private String viewName;

    private String viewDesc;

    private String viewAddress;

    private Integer viewPrice;

    private String viewDate;

    private String viewType;

    private String viewImg;

    private String openTime;

    private String ticketInfo;

    private String busRouter;

    private String netLocate;

    private String connectAddress;

    public ViewPoint(){
    }

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName == null ? null : viewName.trim();
    }

    public String getViewDesc() {
        return viewDesc;
    }

    public void setViewDesc(String viewDesc) {
        this.viewDesc = viewDesc == null ? null : viewDesc.trim();
    }

    public String getViewAddress() {
        return viewAddress;
    }

    public void setViewAddress(String viewAddress) {
        this.viewAddress = viewAddress == null ? null : viewAddress.trim();
    }

    public Integer getViewPrice() {
        return viewPrice;
    }

    public void setViewPrice(Integer viewPrice) {
        this.viewPrice = viewPrice;
    }

    public String getViewDate() {
        return viewDate;
    }

    public void setViewDate(String viewDate) {
        this.viewDate = viewDate == null ? null : viewDate.trim();
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType == null ? null : viewType.trim();
    }

    public String getViewImg() {
        return viewImg;
    }

    public void setViewImg(String viewImg) {
        this.viewImg = viewImg == null ? null : viewImg.trim();
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getTicketInfo() {
        return ticketInfo;
    }

    public void setTicketInfo(String ticketInfo) {
        this.ticketInfo = ticketInfo == null ? null : ticketInfo.trim();
    }

    public String getBusRouter() {
        return busRouter;
    }

    public void setBusRouter(String busRouter) {
        this.busRouter = busRouter == null ? null : busRouter.trim();
    }

    public String getNetLocate() {
        return netLocate;
    }

    public void setNetLocate(String netLocate) {
        this.netLocate = netLocate == null ? null : netLocate.trim();
    }

    public String getConnectAddress() {
        return connectAddress;
    }

    public void setConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress == null ? null : connectAddress.trim();
    }
}