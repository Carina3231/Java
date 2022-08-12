package pack1;

public class Stars {

    private int Level;
    //空构造器
    public Stars(){

    }

    public int getter() {
        return Level;
    }

    public void setter(int Level) {
        this.Level = Level;
    }
    
    public void forStars() {
        //控制层数
        for (int i = 1; i <= Level; i++) {
        
            //空格
            for (int j = 1; j <= Level - i; j++) {
                System.out.print(" ");
            }

            //控制每层打印*的个数
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (1 == j || 2 * i - 1 == j || Level == i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
