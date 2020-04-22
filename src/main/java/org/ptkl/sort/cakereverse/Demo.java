package org.ptkl.sort.cakereverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* 编程之美 一摞烙饼的排序
* */

public class Demo {
    static List<Integer> list;  //input list
    static List<Integer> tmp;   //swap temp list
    static List<Integer> tmp2;  //swap temp list
    static List<Integer> tmpswaplist;   //存储翻转过程 [1,3,2]表示第一次翻转前2个,第二次翻转前4个,第三次翻转前3个
    static List<Integer> swaplist;  //最优翻转过程
    static int max_step;    //最多翻转次数
    static int res_step;    //最优解
    static int len; //list length
    static int searchCount; //查找次数

    public static void main(String[] args) {
        Integer[] a = {2,4,1,5,3};
        len = a.length;
        list = new ArrayList<>(Arrays.asList(a));
        max_step = len*2-3; //最后两个只需要翻转一次,2(n-2)+1
        res_step = max_step;
        tmpswaplist = new ArrayList<>(Arrays.asList(new Integer[max_step]));
        swaplist = new ArrayList<>(Arrays.asList(new Integer[max_step]));
        search(0);
        System.out.println(res_step);
        System.out.println(swaplist);
        System.out.println(searchCount);
    }

    static void search(int step) {
        searchCount++;
        int estimateStep = estimateStep();
        if(step+estimateStep>=res_step)
            return;
        if(isSort(list)) {
            if(step < max_step) {
                res_step = step;
                swaplist.clear();
                swaplist.addAll(tmpswaplist);
            }
            return;
        }
        for(int i=1;i<len;i++){
            swap(i);
            tmpswaplist.set(step, i);
            search(step+1);
            tmpswaplist.set(step, 0);
            swap(i);
        }
    }

    //当前状态下,至少还要多少次翻转
    static int estimateStep() {
        int res=0;
        for(int i=1;i<len;i++){
            int t = list.get(i)-list.get(i-1);
            if(t==1 || t==-1){

            } else {
                res++;
            }
        }
        return res;
    }

    static void swap(int len) {
        tmp = list.subList(0, len+1);
        tmp2 = list.subList(len+1, list.size());
        Collections.reverse(tmp);
        tmp.addAll(tmp2);
        list = tmp;
    }

    static boolean isSort(List<Integer> l) {
        for(int i=0;i<l.size()-1;i++) {
            if(l.get(i) > l.get(i+1))
                return false;
        }
        return true;
    }
}
