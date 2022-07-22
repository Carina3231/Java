import java.util.Scanner;
// import java.util.Scanner;

public class text_0721 {
////////////   计算闰年/////////////////////////////

/*     public static void main(String[] args) {
        System.out.println("生命周期 = ");
        Scanner sc = new Scanner( System.in);
        int year = 0;
        int a = 0;
        int length = 0;
        length = sc.nextInt();
        System.out.println("出生年 = ");
        year = sc.nextInt();
        for (int i = 0; i < length; i++) {
            year ++;
            
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year);
                a ++;
            }
        }
        System.out.println("a = " + a);
    } */


///////////////这块是各级阶乘相加/////////////////////

/*     public static void main(String[] args) {
        System.out.println("输入整数：");
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        num = sc.nextInt();
        
        
        for (int i = 1; i <= num; i++) {
            //计算阶乘
            num2 = 1;
            for (int j = 1; j <= i; j++) {
                num2 *= j;
            }
            num3 = num3 + num2; 
        }
        System.out.println(num3);
        sc.close();
    } */


/////////////////反转排序///////////////
public static void main(String[] args) {
    char arr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    
}
}