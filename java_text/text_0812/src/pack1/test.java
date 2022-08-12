package pack1;

import java.util.Scanner;

/**
 * @author carina
 * @version 0.0.1
 * test
 */
public class test {
    public static void main(String[] args) {
        int getnum = 0;
        Stars stars = new Stars();
        Scanner sc = new Scanner(System.in);
        System.out.print("数字：");
        getnum = sc.nextInt();
        stars.getter();
        stars.setter(getnum);
        stars.forStars();
        sc.close();
    }    
}