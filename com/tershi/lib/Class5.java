package com.tershi.lib;

public class Class5 {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01();           //執行序物件
        t1.start();
        Thread01 t2 = new Thread01();
        t2.start();


        //create Task Object
        A work = new A();
        Thread t3 = new Thread(work,"T3");
        t3.start();
        Thread t4 = new Thread(work,"T4");
        t4.start();
        }
    }

    /*
    * Extends + class or Abstract
    * implements + interface
    * */
class Thread01 extends Thread{          //extends thread class (Pool)
    @Override
    public void run(){
        for(int i =1;i<=5000;i++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
class A implements Runnable{            //implements Runnable (tasks)
    @Override
    public void run() {

    }
}