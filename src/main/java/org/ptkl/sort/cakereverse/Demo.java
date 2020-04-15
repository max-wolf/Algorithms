package org.ptkl.sort.cakereverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
* 星期五的晚上，一帮同事在希格玛大厦附近的“硬盘酒吧”多喝了几杯。程序员多喝了几杯之后谈什么呢？自然是算法问题。
* 有个同事说：“我以前在餐馆打工，顾客经常点非常多的烙饼。店里的饼大小不一，我习惯在到达顾客饭桌前，把一摞饼按照大小次序摆好——小的在上面，大的在下面。
* 由于我一只手托着盘子，只好用另一只手，一次抓住最上面的几块饼，把它们上下颠倒个个儿，反复几次之后，这摞烙饼就排好序了。
* 我后来想，这实际上是个有趣的排序问题：假设有n块大小不一的烙饼，那最少要翻几次，才能达到最后大小有序的结果呢？”
* 你能否写出一个程序，对于n块大小不一的烙饼，输出最优化的翻饼过程呢？
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
