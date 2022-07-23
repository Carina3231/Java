/* public class text_0723 {
    public static void main(String[] args) {
        // 类变量(静态变量)：独立于方法之外的变量，用 static 修饰。
        // 实例变量(非静态变量)：独立于方法之外的变量，不过没有 static 修饰。---------实例变量在对象创建的时候创建，在对象被销毁的时候销毁
        //<-------------至少一次被引用
        //乘法口诀表，两个元素，x y
        
        //声明一个变量负责接收乘法结果
        // int result [] = {0};
        int multipResult = 0;
        // int i = 0;

        //第一个元素
        for (int firstNum = 1; firstNum <= 9; firstNum++) {
            //第二个元素
            for (int secondNum = 1; secondNum <= 9; secondNum++) {
                multipResult = firstNum * secondNum;
                    // result [i] = multipResult;
                    System.out.print(firstNum + "*" + secondNum + "=" + multipResult + "\n");
                    // i++;
            }
        }
    }
}
 */


import java.util.Scanner;
public class text_0723 {
    //编写一个main方法
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("输入杨辉三角的层数：");
        int nums = myScanner.nextInt();
 
        //创建数组
        int[][] arr = new int[nums][];
        for (int i = 0;i<nums;i++) {
            arr[i] = new int[i+1];
        }
 
        //初始化边框
        for (int i = 0;i<nums;i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
 
        //完善内部
        for (int i = 2;i<nums;i++){
            for(int j = 1;j<i;j++){
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
 
        //遍历这个杨辉三角
        System.out.println("====杨辉三角如下====");
        for (int i = 0;i<nums;i++) {
            for (int k = nums-i-1;k>0;k--){
                System.out.print(" ");
            }
            for (int j = 0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        myScanner.close();
 
    }
}