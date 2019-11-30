package com.memory.pojo;

public class ViewRouter {


    private Integer routerId;

    private Integer viewId;

    private String routerLine;

    private String routerRecommend;

    public Integer getRouterId() {
        return routerId;
    }

    public void setRouterId(Integer routerId) {
        this.routerId = routerId;
    }

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public String getRouterLine() {
        return routerLine;
    }

    public void setRouterLine(String routerLine) {
        this.routerLine = routerLine == null ? null : routerLine.trim();
    }

    public String getRouterRecommend() {
        return routerRecommend;
    }

    public void setRouterRecommend(String routerRecommend) {
        this.routerRecommend = routerRecommend == null ? null : routerRecommend.trim();
    }
}