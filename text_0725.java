public class text_0725 {
   public static class Dog{
    public int age;
    public int size;
    public String name;
    public String colour;
    void eat(){
        System.out.println("hhhhh");
    }
    void run(){
        System.out.println("xxxxx");

    }
    void myDog(int age, int size, String name, String colour){
        this.age = age;
        this.size = size;
        this.name = name;
        this.colour = colour;
    }
    void myPrint(){
        System.out.println(" name: " + name + " age: " + age + " size: " + size + " colour: " + colour);
    }
   }
   public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.myDog(5, 12, "孙志豪", "黑");
    dog1.myPrint();
   }
}
