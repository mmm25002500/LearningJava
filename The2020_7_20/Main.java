package The2020_7_20; //pack the package with the name
/*
    今日重點: 資料型別
*/
    public class Main { //公開的Main 類別
    //存取修飾子(Access Modifiers) 類別(Class) 類名稱(Class Name)
    /*Access Modifiers:
        種類(Types)    Same_Class   Same_Package    Different_pkg_class Different_pkg_not_Class
        public(公開) : all can
        protected(保護):one to three
        default(預設): one to two
        private(私人):only one
    */
        
        public static void main(String []args){
      /*Access_Modifiers the_Static no_value_returned main_Function(func)(Dim String Array index(引數或是索引))
            完整:公開且靜態無返回值的主要陣列引數方法
        */
        byte a = 127;   //127〜-128  Ram(bytes) 1   位元數
        short b = 32767;//32767~-32768 Ram(bytes) 2 短整數
        int c = 2147483647;      //2147483647~-2147483648 Ram(bytes) 4  整數
        long d = 9223372036854775807l;   //9223372036854775807~-9223372036854775808 Ram(bytes) 8    長整數
        float e = 3.14f;    //+-3.40282347 *10**38 ~ +-1.40239846**-45 Ram(bytes)4  實數
        double f = 3.14159265359d;  //+-1.76769313486231570*10**308 ~ +-4.94065645841246544*10**-324 Ram(bytes)8    精倍數
        char g = 'a' ;  //All Unicode word Ram(bytes)2 字元(Unicode)
        boolean h = true; //true or false Ram(bytes) 1(bit) 布林值
        
            System.out.println("byte:" + a + "\nShort:" + b +  "\nInteger" + c + "\nLong Integer" + d + "\nFloat" + e + "\nDouble" + f + "," + g + "," + h );
        }
}
