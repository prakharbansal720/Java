class chef extends Thread{

    public void run()
    {
        System.out.println("your order will be prepared in 5 seconds");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
            System.out.println("your order is prepared ");
        }
}

class waiter extends Thread{
    
    public void run()
    {
        System.out.println("food is prepared");
    }
}

public class assi3 {

    public static void main(String[] args) {
        
        Thread t1 = new chef();
        Thread t2 = new waiter();

        t1.start();
        try
        {
            t1.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        t2.start();
    }
    
}
