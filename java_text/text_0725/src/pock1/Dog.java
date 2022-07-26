package pock1;

public class Dog {
        int age;
        int size;
        String name;
        String colour;
        String breed;
        void eat(){
            System.out.println("hhhhh");
        }
        void run(){
            System.out.println("xxxxx");
    
        }

        //重载构造器
        public Dog(int age, String breed, int size, String name, String colour){
            this.age = age;
            this.size = size;
            this.name = name;
            this.colour = colour;
            this.breed = breed;
        }
        public void myPrint(){
            System.out.println(" name: " + name + " 种类是： "+ breed +  " age: " + age + " size: " + size + " colour: " + colour);
        }
        //空构造器
        public Dog(){

        }
       }
