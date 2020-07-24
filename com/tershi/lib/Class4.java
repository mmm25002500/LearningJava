package com.tershi.lib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/*集合 Collection
*   List    順序
*   Set     不重複          {1,2,3,4,5,6,7} 隨機取出
*   Queue   二式操作        [OOOOOOOOO] 左右拿
* */
public class Class4 {
    public static void main(String[] args) {
        ArrayList a01 = new ArrayList();           //ArrayList
        a01.add(100);
        a01.add(70);
        a01.add(40);
        a01.add(10);
        System.out.println(a01.get(1));
        //System.out.println(a01.get(1) + 100); //Error: 出現70 不能加減 因為是物件  只認得 7 和 0是組合 不認得70為數字
        ArrayList<Integer> a02 = new ArrayList();   //泛型
        a02.add(100);
        a02.add(70);
        a02.add(40);
        a02.add(10);
        System.out.println(a02.get(1) + 100);   //No-Error

        TreeSet<String> ts = new TreeSet<String>(); //Just put String 不重複並且排序 Tree(樹狀)
        ts.add("apple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("apple");
        ts.add("APple");
        ts.add("APPle");
        System.out.println(ts);

        for(Integer  i:a02){
            System.out.println(i-100);
        }
        Collections.sort(a02);                  //排序
        System.out.println(a01);
    }
}
