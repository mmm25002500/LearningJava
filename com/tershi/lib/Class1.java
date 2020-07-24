package com.tershi.lib;     //Android Studio package
import java.util.Date;      //import the classes of packages

public class Class1 {      //the class name
    public static void main(String[] args) {    //the main method

        //Basic1
        System.out.println("你好");              //print hello
        System.out.println(new Date());         //print date and time
        int [] array1 = {1,2,3,4,5,6,7,8,9,10}; //array
        int [] array2 = new int[5];             //int new array and 5 values
        array2[0] = 10;                         //give the value
        array2[1] = 20;
        array2[2] = 30;
        array2[3] = 40;
        array2[4] = 50;
        int [] array3 = new int[10];            //int new array and 10 values
        for (int i = 0;i <array3.length;i++){   //use for loo[
            array3[i] = i;
            System.out.println(array3[i]);
        }

        //Basic2
        Phone Andy = new Phone(87.87,"UR87","Yellow","Tershi Inc");
        Phone Marry = new Phone(123.123,"Fucker69","Pink","Tershi Inc");
        Phone Backy = new Phone(321.321,"Ugly25","Black","Tershi Inc");
        Phone Yuwen = new Phone(878787878787.87878787878787,"Ugly16","Green","Tershi Inc");
        System.out.println("安帝手機的大小:" + Andy.getSize() + "顏色:" + Andy.getColor() + "機型:" + Andy.getModule() + "公司:" + Andy.getCompany());
        System.out.println("馬力手機的大小:" + Marry.getSize() + "顏色:" + Marry.getColor() + "機型:" + Marry.getModule() + "公司:" + Marry.getCompany());
        System.out.println("敗去餅乾手機的大小:" + Backy.getSize() + "顏色:" + Backy.getColor() + "機型:" + Backy.getModule() + "公司:" + Backy.getCompany());
        System.out.println("愛文芒果手機的大小:" + Yuwen.getSize() + "顏色:" + Yuwen.getColor() + "機型:" + Yuwen.getModule() + "公司:" + Yuwen.getCompany());
        Phone[] items = {Andy,Marry,Backy,Yuwen};
        System.out.println(items[0].getModule());
        System.out.println(items[1].getModule());
        System.out.println(items[2].getModule());
        System.out.println(items[3].getModule());
        Strprint("Hi");    // print方法
        Intprint(sum(1,2));
    }

    static class Phone{         //Basic2
        public Phone(double size,String module,String Color,String Company){             //建構子
            super();
            this.size = size;
            this.Color = Color;
            this.module = module;
            this.Company = Company;
        }
        double size;
        String module;
        String Color;
        String Company;
        double getSize(){
            return size;
        }
        String getModule(){
            return module;
        }
        String getColor() {
            return Color;
        }
        String getCompany(){
            return Company;
        }
    }
    class Special extends Phone{


        public Special(double size, String module, String Color, String Company) {
            super(size, module, Color, Company);
        }
    }







    public static void Strprint(String sentence) {      //print方法
        System.out.println(sentence);
    }

    public static void Intprint(int value) {            //print方法
        System.out.println(value);
    }

    public static int sum(int a, int b) {               //加總方法
        return a + b;
    }

    public static double div(int a, int b) {
        return a / b;
    }
}
