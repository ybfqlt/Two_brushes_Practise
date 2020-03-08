package com.ns.suiji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

/**
 * @Author: xns
 * @Date: 20-2-25 下午8:47
 */
public class test3 {

    public boolean Find(int target, int [][] array) {
        StringBuffer a = new StringBuffer();
        ArrayList<Integer> b = new ArrayList<>();
        if(array == null){
            return false;
        }
        StringBuffer str = new StringBuffer();
        String s =null;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            s= array[i].toString();
            if(s.contains(target+"")){
                return true;
            }
        }
        return false;
    }
}
