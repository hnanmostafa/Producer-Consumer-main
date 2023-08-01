package metrobooking;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class page extends javax.swing.JFrame {
    final int MAX_SIZE = 5;
    List<Ticket> sharedList = new ArrayList <Ticket>();
    
    public page() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numberProducersLabel = new javax.swing.JLabel();
        numberConsumersLabel = new javax.swing.JLabel();
        numCustomers = new javax.swing.JTextField();
        startBtn = new javax.swing.JButton();
        ticketWindow = new javax.swing.JTextField();
        numSuppliers = new javax.swing.JTextField();
        numberProducersLabel1 = new javax.swing.JLabel();
        producedCount = new javax.swing.JTextField();
        boughtCount = new javax.swing.JTextField();
        numberProducersLabel2 = new javax.swing.JLabel();
        numberProducersLabel3 = new javax.swing.JLabel();
        remainingCount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(6, 10, 35));

        numberProducersLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberProducersLabel.setText("Number Of Suppliers: ");

        numberConsumersLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberConsumersLabel.setText("Number Of Customers: ");

        numCustomers.setBackground(new java.awt.Color(11, 12, 38));
        numCustomers.setForeground(new java.awt.Color(255, 255, 255));
        numCustomers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numCustomers.setAutoscrolls(false);
        numCustomers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        numCustomers.setCaretColor(new java.awt.Color(255, 255, 255));
        numCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCustomersActionPerformed(evt);
            }
        });

        startBtn.setBackground(new java.awt.Color(10, 199, 81));
        startBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        startBtn.setForeground(new java.awt.Color(255, 255, 255));
        startBtn.setText("Start");
        startBtn.setBorder(null);
        startBtn.setBorderPainted(false);
        startBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startBtn.setDefaultCapable(false);
        startBtn.setFocusPainted(false);
        startBtn.setFocusable(false);
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        ticketWindow.setBackground(new java.awt.Color(11, 12, 38));
        ticketWindow.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ticketWindow.setForeground(new java.awt.Color(255, 153, 0));
        ticketWindow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ticketWindow.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));
        ticketWindow.setCaretColor(new java.awt.Color(255, 255, 255));
        ticketWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketWindowActionPerformed(evt);
            }
        });

        numSuppliers.setBackground(new java.awt.Color(11, 12, 38));
        numSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        numSuppliers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numSuppliers.setAutoscrolls(false);
        numSuppliers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        numSuppliers.setCaretColor(new java.awt.Color(255, 255, 255));
        numSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSuppliersActionPerformed(evt);
            }
        });

        numberProducersLabel1.setForeground(new java.awt.Color(255, 255, 255));
        numberProducersLabel1.setText("Produced:");

        producedCount.setBackground(new java.awt.Color(11, 12, 38));
        producedCount.setForeground(new java.awt.Color(255, 255, 255));
        producedCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        producedCount.setText("0");
        producedCount.setAutoscrolls(false);
        producedCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51)));
        producedCount.setCaretColor(new java.awt.Color(255, 255, 255));
        producedCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producedCountActionPerformed(evt);
            }
        });

        boughtCount.setBackground(new java.awt.Color(11, 12, 38));
        boughtCount.setForeground(new java.awt.Color(255, 255, 255));
        boughtCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        boughtCount.setText("0");
        boughtCount.setAutoscrolls(false);
        boughtCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        boughtCount.setCaretColor(new java.awt.Color(255, 255, 255));
        boughtCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boughtCountActionPerformed(evt);
            }
        });

        numberProducersLabel2.setForeground(new java.awt.Color(255, 255, 255));
        numberProducersLabel2.setText("Bought:");

        numberProducersLabel3.setForeground(new java.awt.Color(255, 255, 255));
        numberProducersLabel3.setText("Remaining:");

        remainingCount.setBackground(new java.awt.Color(11, 12, 38));
        remainingCount.setForeground(new java.awt.Color(255, 255, 255));
        remainingCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        remainingCount.setText("0");
        remainingCount.setAutoscrolls(false);
        remainingCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        remainingCount.setCaretColor(new java.awt.Color(255, 255, 255));
        remainingCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remainingCountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numberProducersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numberConsumersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(numberProducersLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(producedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numberProducersLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boughtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(numberProducersLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remainingCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ticketWindow))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberProducersLabel)
                    .addComponent(numCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberConsumersLabel)
                    .addComponent(numSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(ticketWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boughtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberProducersLabel2)
                    .addComponent(producedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberProducersLabel1)
                    .addComponent(remainingCount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberProducersLabel3))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void numCustomersActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void ticketWindowActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void numSuppliersActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }                                            

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String numSuppliersStr = numSuppliers.getText();
        String numCustomersStr = numCustomers.getText();
        
        if(!validationOnInput(numSuppliersStr, numCustomersStr)){
            numSuppliersStr = numSuppliers.getText();
            numCustomersStr = numCustomers.getText();
        }
        else{
            int numOfSuppliers = Integer.parseInt(numSuppliersStr);
            int numOfCustomers = Integer.parseInt(numCustomersStr);

            Supplier[] suppliers = new Supplier[numOfSuppliers];
            Customer[] customers = new Customer[numOfCustomers];

            for(int i = 0 ; i < numOfSuppliers ; i++){
                suppliers[i] = new Supplier(sharedList, MAX_SIZE);
                new Thread(suppliers[i], "Supplier "+(i+1)).start();
            }

            for(int i = 0 ; i < numOfCustomers ; i++){
                customers[i] = new Customer(sharedList);
                new Thread(customers[i], "Customer "+(i+1)).start();
            }
        }
    }                                        

    private boolean validationOnInput(String numberSuppliersStr, String numberCustomersStr){
        if(isNumeric(numberSuppliersStr) && isNumeric(numberCustomersStr)){
            int numberSuppliers = Integer.parseInt(numberSuppliersStr);
            int numberCustomers = Integer.parseInt(numberCustomersStr);
            
            if(numberSuppliers == 0 || numberCustomers == 0){
                JOptionPane.showMessageDialog(rootPane, "Supplier and customer cannot be equal 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else{
                return true;
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Please, enter a numeric value for supplier and customer", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    private void producedCountActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void boughtCountActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void remainingCountActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private Thread[] createSuppliersThreads(){
        String numSuppliersString = numSuppliers.getText();
        int numberOfSuppliers;
        
        if(numSuppliersString.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please, enter number of suppliers!", "", JOptionPane.ERROR_MESSAGE);
        }
        numberOfSuppliers = Integer.parseInt(numSuppliersString);
        Thread[] producersThreads = new Thread[numberOfSuppliers];

        return producersThreads;
    }
    
    private Thread[] createCustomersThreads(){
        String numCustomersString = numCustomers.getText();
        int numberOfCustomers;
        
        if(numCustomersString.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please, enter number of customers!", "", JOptionPane.ERROR_MESSAGE);
        }
        numberOfCustomers = Integer.parseInt(numCustomersString);
        Thread[] consumersThreads = new Thread[numberOfCustomers];

        return consumersThreads;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public static javax.swing.JTextField boughtCount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numCustomers;
    private javax.swing.JTextField numSuppliers;
    private javax.swing.JLabel numberConsumersLabel;
    private javax.swing.JLabel numberProducersLabel;
    private javax.swing.JLabel numberProducersLabel1;
    private javax.swing.JLabel numberProducersLabel2;
    private javax.swing.JLabel numberProducersLabel3;
    public static javax.swing.JTextField producedCount;
    public static javax.swing.JTextField remainingCount;
    private javax.swing.JButton startBtn;
    public static javax.swing.JTextField ticketWindow;
    // End of variables declaration                   

}
