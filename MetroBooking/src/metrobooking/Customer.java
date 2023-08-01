package metrobooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customer implements Runnable{
    List<Ticket> ticketsWindow;
    Random r = new Random();
    
    public Customer(List<Ticket> tikcetsWindow){
        this.ticketsWindow = tikcetsWindow;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                buyTicket();
            } catch (InterruptedException ex) {}
        }
    }
    
    public void buyTicket() throws InterruptedException{
        synchronized(ticketsWindow){
            while(ticketsWindow.isEmpty()){
                System.out.println(Thread.currentThread().getName() + " -> Tickets Window now is EMPTY!");
                System.out.println("=============");
                ticketsWindow.wait();
            }
            
            // remove first ticket
            Ticket ticket = ticketsWindow.remove(0);
            System.out.println(Thread.currentThread().getName() + " -> is Buying a ticket");
            ticket.printTicketInfo();
            
            // create list of tickets IDS
            List<Integer> ticketsWindowIDs = new ArrayList<Integer>();
            
            // print tickets in console
            System.out.print("Tickets Window: ");
            for(int j = 0 ; j < ticketsWindow.size() ; j++){
                System.out.print("[" + ticketsWindow.get(j).ticketID + "]");
                ticketsWindowIDs.add(ticketsWindow.get(j).getTicketID());
            }
            System.out.println("\n=============");
            
            // update GUI
            page.ticketWindow.setText(String.valueOf(ticketsWindowIDs));
            int boughtCount = Integer.parseInt(page.boughtCount.getText());
            page.boughtCount.setText(String.valueOf(++boughtCount));
            int producedCount = Integer.parseInt(page.producedCount.getText());
            page.remainingCount.setText(String.valueOf(producedCount - boughtCount));
            
            // notify all suppliers threads
            ticketsWindow.notifyAll();
            
            // simulating processing time
            Thread.sleep(1000);
        }
    }
}
