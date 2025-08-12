class parent{

    void show()
    {
        System.out.println("hello parent");
    }
}

class child1 extends parent{

    void show1()
    {
        System.out.println("hello first child");
    }
}

class child2 extends child1 {
    
    void show2()
    {
        System.out.println("hello second child");
    }
}
public class multilevelinheri {
    
    public static void main(String[] args) {
        
        child2 c1 = new child2();
        c1.show();
        c1.show1();
        c1.show2();

    }

}
