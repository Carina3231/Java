import java.io.IOException;

public class text_0720 {


    
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("请输入你的成绩：");
        int a = (int)System.in.read();
        // char b = (char)System.in.read();
        // int score = (a - '0')*10 + b - '0';
        if (a >= 60) {
            System.out.println("恭喜你及格了！！！！！");
        }else{ 
            System.out.println("菜鸡，你没及格！！！！");
        }
        }
    




    // public static void main(String[] args) throws IOException {
    //     System.out.println("你喜欢Java吗（Y/N)");
    //     char like = (char)System.in.read();
    //     if ('Y' == like || 'Y' == like) {
    //         System.out.println("good");
    //     }
    //}


    // public static void main(String[] args) {
    //     // byte a = 48;
    //     // byte a1 = (byte) (a << 2);
    //     // System.out.println("a1 = " + a1);
    //     // byte a2 = (byte) (a >> 2);
    //     // System.out.println("a2 = " + a2);
    //     // byte a3 = (byte) (a >>> 2);
    //     // System.out.println("a3 = " + a3);

    // }

    // public static void main(String[] args) {
    //     int a = 123 , b = 258;
    //     boolean y = a < b;
    //     boolean x = a >= a * 5 - 3 * b;
    //     boolean c = 'a' < 'b';
    //     System.out.println("y = " + y);
    //     System.out.println("x = " + x);
    //     System.out.println("c = " + c);

    // }
    // static byte a = 60;
    // static short b = 2;
    // static int c = 20;
    // static long d = 70l;
    // static long result = 0l;
//     public static void main(String[] args){
//         // int a = 257;
//         // byte b = (byte)a;
//         // System.out.println("a = " + a);
//         // System.out.println("b = " + b);







//         // result +=a+6;
//         // System.out.println("result = " + result);
//         // result *=b+6;
//         // System.out.println("result = " + result);
//         // result /=c-8;
//         // System.out.println("result = " + result);
//         // result -=d;
//         // System.out.println("result = " + result);
//         // result %= d;
//         // System.out.println("result = " + result);
//     }
// }
// /*     // private static void myPrint(String s){
//     //     System.out.println(s);
//     // }
//     // }
//  */
}