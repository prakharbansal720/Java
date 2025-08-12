interface animal{
    void eat();
}

interface pet{
    void play();
}

class dog implements animal, pet {

    public void eat()
    {
        System.out.println("eating ");
    }

    public void play()
    {
        System.out.println("playing ");
    }

}


public class interface1{
    public static void main(String[] args) {
        
        dog d1 = new dog();
        d1.eat();
        d1.play();

    }
    
}
