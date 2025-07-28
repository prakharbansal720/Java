public class exception {
    public static void main(String[] args) {
        
        try{
            int a = 2;
            int b =0;
            int c = a/b ;
            
            System.out.println(c);
        }

        catch(ArithmeticException exception)
        {
            System.out.println("exception is 0");
        }

        finally{
            System.out.println("hello");
        }
    }
}