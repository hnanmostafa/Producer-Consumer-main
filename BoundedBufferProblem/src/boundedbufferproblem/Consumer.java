package boundedbufferproblem;

import java.util.List;

public class Consumer implements Runnable{
    List<Integer> sharedList = null;
    final String YELLOW = "\u001B[33m";
    final String RESET = "\u001B[0m";
    
    public Consumer(List<Integer> sharedList){
        this.sharedList = sharedList;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                consume();
            } catch (InterruptedException ex) {}
        }
    }
    
    public void consume() throws InterruptedException{
        synchronized(sharedList){
            while(sharedList.isEmpty()){
                System.out.println(YELLOW + Thread.currentThread().getName() + " -> Shared List is Empty!" + RESET);
                System.out.println("==================");
                sharedList.wait();
            }
            
            // consuming first element
            int number = sharedList.remove(0);
            System.out.println(Thread.currentThread().getName() + " -> Is Consuming an item: " + number);
            System.out.println("Shared List: " + sharedList);
            System.out.println("==================");
            
            // update GUI
            page.sharedBuffer.setText(String.valueOf(sharedList));
            int consumedCount = Integer.parseInt(page.consumedCount.getText());
            page.consumedCount.setText(String.valueOf(++consumedCount));
            int producedCount = Integer.parseInt(page.producedCount.getText());
            page.remainingCount.setText(String.valueOf(producedCount - consumedCount));
            
            // notify all producer threads
            sharedList.notifyAll();
            
            // simulating consuming time
            Thread.sleep(1000);
        }
    }
}
