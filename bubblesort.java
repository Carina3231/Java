public class bubblesort {
    public static void main(String[] args) {
        //冒泡排序

        //定义数组
        int arr [] = {123, 58, 59, 48, 23, 21, 2, 285, 93, 85};
        int getlength = arr.length;
        // int getarr[] = new int [getlength];
        int num1 = 0;
 
        //输出排序好的数组
        // System.out.print(arr);

        //////判断数组中元素是否符合冒泡排序的规则
        if (arr == null || getlength == 1) {
            return;
        } 

        ////////可以写成方法，但是我不想
        //第一层for循环，控制轮数
        for (int rounds = 0; rounds < getlength; rounds++) {
            //第二层循环控制比较，
            for (int num = 0; num < getlength - rounds - 1; num++) {
                if (arr[num] > arr[num+1]) {
                    num1 = arr[num];
                    arr[num] = arr[num + 1];
                    arr[num + 1] = num1;

                }
                else{
                    continue;
                }
            }
        }
        for (int i = 0; i < getlength; i++)                 
        System.out.print(arr[i] + " ");

        }
    }

