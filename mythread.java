class mythread implements Runnable{

    public void run()
    {
        for(int i = 0 ; i<= 5 ; i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        mythread m1 = new mythread();
        Thread t1 = new Thread(m1);
        t1.start();   
    }    
}