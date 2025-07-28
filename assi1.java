abstract class bankaccount{
    protected double balance;

    void deposit(double amount)
    {
        balance += amount; 
        System.out.println("Updated balance : " + balance);
    }

    abstract void withdraw(double amount);
    // {
    //     balance -= amount;
    //     System.out.println("Updated balance : " + balance);
    // }
}

class savacc extends bankaccount{
    void withdraw(double amount)
    {
        if ((balance-amount) >= 500) 
        {
            balance -= amount;
            System.out.println("Updated balance : " + balance);    
        }
    }
}

class cuacc extends bankaccount{
    
    void withdraw(double amount) {

        balance -= amount;
        System.out.println("Updated balance : " + balance);

    }
}

public class assi1 {

    public static void main(String[] args) {
        
    
    cuacc c1 = new cuacc();
    savacc s1 = new savacc();

    s1.deposit(10000);
    s1.withdraw(300);

    c1.deposit(1000);
    c1.withdraw(500);
}
    
}
