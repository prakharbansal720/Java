// public class copycons {

//     String name;
//     int age;

//     copycons(String name , int age)
//     {
//         this.name = name;
//         this.age = age;
//     }

//     copycons(copycons s1)
//     {
//         this.name = s1.name;
//         this.age = s1.age;
//     }

//     void display()
//     {
//         System.out.println("Name : " + name);
//         System.out.println("age : " + age);
//     }

//     public static void main(String[] args) {
//         copycons s1 = new copycons("prakh", 22);
//         copycons s2 = new copycons(s1);

//         s1.display();
//         s2.display();
//     }


    
// }









public class copycons{

    int a;

    copycons(int a)
    {
        this.a = a;
        System.out.println("A = " + a);
    }

    copycons(copycons s1)
    {
        this.a = s1.a;
        System.out.println("A = " + a);
    }

    public static void main(String[] args) {
        
        copycons s1 = new copycons(5);
        copycons s2 = new copycons(s1);
    }


}