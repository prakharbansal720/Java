class evenodd implements Runnable{

    public void run()
    {
    synchronized(this)
    {
        
    }
    }
}

public class evenoddthread {

    evenodd e1 = new evenodd();
    Thread t1 = new Thread(e1);

    evenodd e2 = new evenodd();
    Thread t2 = new Thread(e2);      
}
