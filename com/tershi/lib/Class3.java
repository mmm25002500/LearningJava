package com.tershi.lib;

public class Class3 {
    /*      Class:
    *         1.Object creatable (new)
    *         2.Include Attributes(屬性) , Method ,Reformer
    *         3.Can be extendable
    *       Interface:
    *         1.Cannot be "new"
    *         2.include Constant(常數),Abstract Method(definition no "{}" -> Body(incomplete))
    *
    *           Interface Example:
    *               Popular Phone(Abstract Method)
    *       Abstract:
    *         1.Cannot be "new"
    *         2.include Attributes , Method ..... Abstract Method(definition no "{}" -> Body(incomplete))
    *           Abstract Method Example:
    *               void Study();
    *               none explain.
    *       enum:
    *         1.Cannot be "new"
    *         2.include Attributes , Method ,Reformer
    * */


    public static void main(String[] args) {
        School student2 = new School() {            //這是Class 不是Interface 因為他沒有名字
            @Override
            public void study() {
                System.out.println("不用看就會");
            }
        };

        student2.study();

    }
}
interface School{
    //常數
    public static final int a = 100;
    //抽象方法
    public abstract void study();       //沒有內容
}
//---------------------------
//子類
class Student1 implements School{        //實做/附加功能

    @Override
    public void study() {
        System.out.println("躺著讀");
    }
}