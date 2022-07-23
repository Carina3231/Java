import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        //杨辉三角，要求：输入元素为层数
        int layers = 0;
        // int num = 0;
        // int num2 = 0;

        //提醒输入
        System.out.print("请输入层数：" + " ");
        //读取键盘输入,将输入层数赋给变量layers
        Scanner sc = new Scanner(System.in);
        layers = sc.nextInt();
        
        //创建数组
        int arr [][] = new int [layers][];
        for (int k = 0; k < layers; k++) {
            arr[k] = new int [k+1];
        } 

        //三角形两条边
        for (int num = 0; num < layers; num++) {
            arr[num][0] = 1;
            arr[num][num] = 1;
        }

        //第一层循环，输出层数
        for (int i = 2; i < layers; i++) {
            //输出每层的数据
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        //遍历数组，输出杨辉三角形
        //确定数组行数
        for (int num2 = 0; num2 < layers; num2++) {
            ///////确定每一行前有多少空格，将直角三角形装变为等腰三角形
            for (int k = layers-num2-1;k > 0;k--){
                System.out.print(" ");
            }
            ///////输出数组中的元素
            for (int j = 0; j <= num2; j++){
                System.out.print(arr[num2][j]+" ");
            }
            ////////换行
            System.out.println();

        sc.close();
    }
}
}
