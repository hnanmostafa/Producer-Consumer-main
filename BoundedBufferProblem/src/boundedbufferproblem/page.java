package boundedbufferproblem;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class page extends javax.swing.JFrame {
    final int MAX_SIZE = 5;
    List<Integer> sharedList = new ArrayList <Integer>();
    
    public page() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numberProducersLabel = new javax.swing.JLabel();
        numberConsumersLabel = new javax.swing.JLabel();
        numConsumers = new javax.swing.JTextField();
        startBtn = new javax.swing.JButton();
        sharedBuffer = new javax.swing.JTextField();
        numProducers = new javax.swing.JTextField();
        numberProducersLabel1 = new javax.swing.JLabel();
        producedCount = new javax.swing.JTextField();
        consumedCount = new javax.swing.JTextField();
        numberProducersLabel2 = new javax.swing.JLabel();
        numberProducersLabel3 = new javax.swing.JLabel();
        remainingCount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(6, 10, 35));

        numberProducersLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberProducersLabel.setText("Number Of Producers: ");

        numberConsumersLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberConsumersLabel.setText("Number Of Consumers: ");

        numConsumers.setBackground(new java.awt.Color(11, 12, 38));
        numConsumers.setForeground(new java.awt.Color(255, 255, 255));
        numConsumers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numConsumers.setAutoscrolls(false);
        numConsumers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        numConsumers.setCaretColor(new java.awt.Color(255, 255, 255));
        numConsumers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numConsumersActionPerformed(evt);
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

        sharedBuffer.setBackground(new java.awt.Color(11, 12, 38));
        sharedBuffer.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        sharedBuffer.setForeground(new java.awt.Color(255, 153, 0));
        sharedBuffer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sharedBuffer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));
        sharedBuffer.setCaretColor(new java.awt.Color(255, 255, 255));
        sharedBuffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharedBufferActionPerformed(evt);
            }
        });

        numProducers.setBackground(new java.awt.Color(11, 12, 38));
        numProducers.setForeground(new java.awt.Color(255, 255, 255));
        numProducers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numProducers.setAutoscrolls(false);
        numProducers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        numProducers.setCaretColor(new java.awt.Color(255, 255, 255));
        numProducers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numProducersActionPerformed(evt);
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

        consumedCount.setBackground(new java.awt.Color(11, 12, 38));
        consumedCount.setForeground(new java.awt.Color(255, 255, 255));
        consumedCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        consumedCount.setText("0");
        consumedCount.setAutoscrolls(false);
        consumedCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        consumedCount.setCaretColor(new java.awt.Color(255, 255, 255));
        consumedCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consumedCountActionPerformed(evt);
            }
        });

        numberProducersLabel2.setForeground(new java.awt.Color(255, 255, 255));
        numberProducersLabel2.setText("Consumed:");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numProducers, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(numberConsumersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numConsumers, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numberProducersLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(producedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numberProducersLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consumedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(numberProducersLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(remainingCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sharedBuffer))
                        .addGap(28, 28, 28)))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberProducersLabel)
                    .addComponent(numConsumers, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberConsumersLabel)
                    .addComponent(numProducers, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(sharedBuffer, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consumedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void numConsumersActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void sharedBufferActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void numProducersActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String numProducersStr = numProducers.getText();
        String numConsumersStr = numConsumers.getText();
        
        if(!validationOnInput(numProducersStr, numConsumersStr)){
            numProducersStr = numProducers.getText();
            numConsumersStr = numConsumers.getText();
        }
        else{
            int numOfProducers = Integer.parseInt(numProducersStr);
            int numOfConsumers = Integer.parseInt(numConsumersStr);

            Producer[] producers = new Producer[numOfProducers];
            Consumer[] consumers = new Consumer[numOfConsumers];

            for(int i = 0 ; i < numOfProducers ; i++){
                producers[i] = new Producer(sharedList, MAX_SIZE);
                new Thread(producers[i], "Producer "+(i+1)).start();
            }

            for(int i = 0 ; i < numOfConsumers ; i++){
                consumers[i] = new Consumer(sharedList);
                new Thread(consumers[i], "Consumer "+(i+1)).start();
            }
        }
    }                                        
    
    private boolean validationOnInput(String numberProducersStr, String numberConsumersStr){
        if(isNumeric(numberProducersStr) && isNumeric(numberConsumersStr)){
            int numberProducers = Integer.parseInt(numberProducersStr);
            int numberConsumers = Integer.parseInt(numberConsumersStr);
            
            if(numberProducers == 0 || numberConsumers == 0){
                JOptionPane.showMessageDialog(rootPane, "producer and consumer cannot be equal 0", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else{
                return true;
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Please, enter a numeric value for producer and consumer", "", JOptionPane.ERROR_MESSAGE);
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

    private void consumedCountActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void remainingCountActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public static javax.swing.JTextField consumedCount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numConsumers;
    private javax.swing.JTextField numProducers;
    private javax.swing.JLabel numberConsumersLabel;
    private javax.swing.JLabel numberProducersLabel;
    private javax.swing.JLabel numberProducersLabel1;
    private javax.swing.JLabel numberProducersLabel2;
    private javax.swing.JLabel numberProducersLabel3;
    public static javax.swing.JTextField producedCount;
    public static javax.swing.JTextField remainingCount;
    public static javax.swing.JTextField sharedBuffer;
    private javax.swing.JButton startBtn;
    // End of variables declaration                   

}
