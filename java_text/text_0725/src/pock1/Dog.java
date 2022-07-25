package pock1;

public class Dog {
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
        public void myDog(int age, int size, String name, String colour){
            this.age = age;
            this.size = size;
            this.name = name;
            this.colour = colour;
        }
        public void myPrint(){
            System.out.println(" name: " + name + " age: " + age + " size: " + size + " colour: " + colour);
        }
       }
