package com.memory.dto;

/**
 * @Classname Result
 * @Description TODO
 * @Date 19-11-6 上午9:18
 * @Created by xns
 */
public class Result {
    private boolean judge;
    private Object data;
    private String mes;

    public Result(){
    }
    public Result(boolean judge,String mes,Object data){
        this.judge=judge;
        this.mes = mes;
        this.data=data;
    }

    public boolean getJudge() {
        return judge;
    }

    public void setJudge(boolean judge) {
        this.judge = judge;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
