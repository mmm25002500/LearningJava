package com.tershi.lib;

public class Class2 {
    static class Animal{
            public String name = "原始動物";
            public int leg = 4;
            public String food = "肉食";

            public void move(){
                System.out.println("慢慢移動");
            }
    }
    static class cat extends Animal{
        public String name = "貓";
        public int leg = 4;
        public String food = "魚";

        public void move(){
            System.out.println("跑步");
        }
        public void voice(){
            System.out.println("喵喵喵");
        }
    }
    static class dog extends Animal{
        public String name = "狗";
        public int leg = 4;
        public String food = "骨頭";

        public void move(){
            System.out.println("跑步");
        }
        public void voice(){
            System.out.println("旺旺旺");
        }
    }
    static class fish extends Animal{
        public String name = "魚";
        public int leg = 4;
        public String food = "微生物";

        public void move(){
            System.out.println("游泳");
        }
    }



    public static void main(String[] args){
        Animal[] animals = {                //多型 -> 方法
                new Animal(),
                new cat(),
                new fish(),
                new dog()
        };
        animals[0].move();
        animals[1].move();


        //內部類別 Inner class
        dog backy = new dog(){
            public void move(){
                System.out.println("愛嘴砲");
            }
            public void voice(){
                System.out.println("撲拉撲拉撲拉");
            }
        };
        cat yuwen = new cat(){
            public void move(){
                System.out.println("愛畫畫");
            }
            public void voice(){
                System.out.println("afjioasfjhasofrearuqe98");
            }
        };
        fish kimi = new fish(){
            public void move(){
                System.out.println("愛遊戲");
            }
            public void voice(){
                System.out.println("不要屁話");
            }
        };


    }
}
