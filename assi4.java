// class abc extends Thread
// {
//     public void run()
//     {
//         for(int i = 0 ; i < 11 ; i++)
//         {
//             System.out.println(i);
//         }
//     }
// }

// public class assi4 {
    
//     public static void main(String[] args) {

//         Thread t1 = new abc();
//         t1.start();
        
//     }
// }








// class abc implements Runnable
// {
//     public void run()
//     {
//         for(int i = 0 ; i < 21 ; i += 2)
//         {
//             System.out.println(i);
//         }
//     }
// }

// public class assi4 {
    
//     public static void main(String[] args) {

//         abc t1 = new abc();
//         Thread t2 = new Thread(t1);

//         t2.start();
        
//     }
// }







class BA extends Thread
{

    int money = 100000;

    public synchronized void withdraw(int m)
    {
        money -= m;
        System.out.println(money);
    }
}

class with extends Thread
{
    BA acc;

    public  with(BA acco)
    {
        acc = acco;
    }

    public void run()
    {
        acc.withdraw(MAX_PRIORITY);
    }

}


public class assi4 {
    
    public static void main(String[] args) {

        BA b1 = new BA();
        b1.withdraw(500);

        Thread t1 = new BA();
        t1.start();

        with w1 = new with(b1);
        Thread w11 = new Thread(w1);

        with w2 = new with(b1);
        Thread w12 = new Thread(w2);

        with w3 = new with(b1);
        Thread w13 = new Thread(w3);

        with w4 = new with(b1);
        Thread w14 = new Thread(w4);

        w11.start();
        w12.start();
        w13.start();
        w14.start();
       
    }
}





