abstract class animal{
    abstract void makesound();
void sleep()
{
    System.out.println("sleeping");
}
}


class dog extends animal{
    void makesound()
    {
        System.out.println("bhaoo bhaoo");
    }
}

public class abstractclass{
    public static void main(String[] args) {
        dog mydog = new dog();
        mydog.makesound();
        mydog.sleep();

    }
}

