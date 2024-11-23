

// class one{
//     void calculate(int x){
//         System.out.println("square is:"+(x*x));
//     }
// }

// class two extends one{
//     void calculate(int x){
//         System.out.println("cube is:"+(x*x*x));
//     }
// }

// class Player{
//     int hp;
//     int kd;
//     String name;
//     int power;
// }

// class Human{
//     void fun(){
//         System.out.println("I can breathe");
//     }
//     String type = "Homosapians";
// }
// class Men extends Human{
//     void fun(){
//         System.out.println("I am a man!");
//     }
// }
// class Women extends Human{
//     void fun(){
//         System.out.println("I am a woman & I can give birth!");
//     }
// }
// public class OOps {
//     public static void main(String[] args) {
//         // two t1=new two();
//         // t1.calculate(4);

//         // one t2=new two();
//         // t2.calculate(4);

//         // Player ravi = new Player();
//         // ravi.name = "Ravi";
//         // ravi.kd = 1;
//         // ravi.hp = 75;
//         Men m = new Men();
//         m.fun();

//         Women w = new Women();
//         w.fun();

//         System.out.println(w.type);
//     }

    
// }


// class Person{
//     int age;
//     String name;

//     void talk(){
//         System.out.println("Hello I'm"+name);
//         System.out.println("My age is="+age);
//     }
// }

// public class OOps{
//     public static void main(String[] args) {
//         Person p1=new Person();
//         System.out.println(p1.hashCode());
//         p1.name="Ravi Panchal";
//         System.out.println(p1.name);
//         p1.talk();
//         p1.age=21;
//         System.out.println(p1.age);
//        p1.talk();
//     }
// }

class Person{
    //Properties
    String name;
    String message;

    //methods
    void talk(){
        System.out.println(name+" ma'am sahab");
        System.out.print("Good Night!\n"+ message);
    }

}

public class OOps{
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Saloni";
        // System.out.println(raju.age);
        p1.message="Radhe-Radhe ";
        // System.out.println(raju.name);
        p1.talk();
    }

}