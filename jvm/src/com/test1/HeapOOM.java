package com.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname HeapOOM
 * @Description TODO
 * @Date 19-11-26 下午7:24
 * @Created by xns
 */
public class HeapOOM {
    static class OOMObject{
    }

    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
