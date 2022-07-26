import pock1.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        //////调用重载的构造器，来对对象进行赋值
    Dog dog1 = new Dog(5, "大黑耗子", 6, "孙志豪", "黑");
    
    dog1.myPrint();
    }
}
