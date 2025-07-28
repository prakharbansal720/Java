public class bankaccount {
    private double balance;

    bankaccount(int balance)
    {
        this.balance = balance;
    }
    
    double depositbalance(double amount)
    {
        balance += amount;

        return balance;
    }

    double withdrawbalance(double amount)
    {
        balance -= amount;
        return balance;
    }

    void getbalance()
    {
        System.out.println("the balance is : " + balance);
    }

    public static void main(String[] args) {
        
        bankaccount b1 = new bankaccount(12);
        
        b1.depositbalance(200);
        b1.getbalance();

        b1.withdrawbalance(100);
        b1.getbalance();

    }

}