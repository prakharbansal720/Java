class animal{
    void makesound()
    {
        System.out.println("hello");
    }
}

class cat extends animal{
    void makesound()
    {
        System.out.println("meoww");
    }
}

class dog extends animal{
    void makesound()
    {
        System.out.println("bhao bhao");
    }
}


public class animalkingdom {
    
    public static void main(String[] args) {
        
        dog d1 = new dog();
        d1.makesound();
    
        cat c1 = new cat();
        c1.makesound();

    }
}
