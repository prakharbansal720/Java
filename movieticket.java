public class movieticket{
    
    String moviename;
    int ticketprice;
    int seatnumber;


movieticket(String movname , int ticket , int seatno)
{
    moviename = movname;
    ticketprice = ticket;
    seatnumber = seatno;
}

void display()
{
    System.out.println("name : " + moviename + " price : " + ticketprice + " no. : " + seatnumber);
}


public static void main(String[] args) {
    movieticket m1 = new movieticket("bahubali", 123, 21);
    m1.display();
}



}

    
    

