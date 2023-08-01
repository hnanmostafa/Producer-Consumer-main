package metrobooking;

public class Ticket {
    int ticketID;
    double price;
    
    // setters
    public void setTicketID(int ticketID){
        this.ticketID = ticketID;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    // getters
    public int getTicketID(){
        return ticketID;
    }
    
    public double getTicketPrice(){
        return price;
    }
    
    public void printTicketInfo(){
        System.out.println("Ticket's ID: " + ticketID);
        System.out.println("Ticket's Price: " + price);
    }
}
