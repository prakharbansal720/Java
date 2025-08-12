class parent{

    final int maxage = 100;

    void display()
    {
        System.out.println("max age : "+maxage);
    }
}

class child extends parent{
    void changeage()
    {
        // maxage = 200;
    }
}



public class finalkey {
    
    public static void main(String[] args) {
        
        child c1 = new child();
        c1.changeage();
    }
}