

public class JavaCalculator extends javax.swing.JFrame {
private double total1 = 0.0;
private double total2 = 0.0;
private char math_operator;
    
private void getOperator(String btnText){
    math_operator = btnText.charAt(0);
    total1 = total1 + Double.parseDouble(txtDisplay.getText());
    txtDisplay.setText("");
}

    public JavaCalculator() {
        initComponents();
    }

    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();
        NumberPanel = new javax.swing.JPanel();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnPlus = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NumberPanelLayout = new javax.swing.GroupLayout(NumberPanel);
        NumberPanel.setLayout(NumberPanelLayout);
        NumberPanelLayout.setHorizontalGroup(
            NumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NumberPanelLayout.createSequentialGroup()
                        .addGroup(NumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NumberPanelLayout.createSequentialGroup()
                                .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NumberPanelLayout.createSequentialGroup()
                                .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(NumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NumberPanelLayout.createSequentialGroup()
                        .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(NumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NumberPanelLayout.createSequentialGroup()
                                .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NumberPanelLayout.setVerticalGroup(
            NumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumberPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(NumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

         
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        
        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

      

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {                                        
   String btnZeroText = txtDisplay.getText() +btnZero.getText();
        txtDisplay.setText(btnZeroText);
    }                                       

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {                                       
           String btnOneText = txtDisplay.getText() + btnOne.getText();
           txtDisplay.setText(btnOneText);

    }
    
    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String btnTwoText = txtDisplay.getText() +btnTwo.getText();
        txtDisplay.setText(btnTwoText);
}                                      

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String btnThreeText = txtDisplay.getText() +btnThree.getText();
        txtDisplay.setText(btnThreeText);
    }                                        

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {                                        
   String btnFourText = txtDisplay.getText() +btnFour.getText();
        txtDisplay.setText(btnFourText);

    }                                       

    
    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {                                        
   String btnFiveText = txtDisplay.getText() +btnFive.getText();
        txtDisplay.setText(btnFiveText);
    }                                       
    
    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {                                       
   String btnSixText = txtDisplay.getText() +btnSix.getText();
        txtDisplay.setText(btnSixText);

    }                                      

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {                                         
   String btnSevenText = txtDisplay.getText() +btnSeven.getText();
        txtDisplay.setText(btnSevenText);
    }                                        

        
    
    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {                                         
   String btnEightText = txtDisplay.getText() +btnEight.getText();
        txtDisplay.setText(btnEightText);

    }                                        

    
    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {                                        
   String btnNineText = txtDisplay.getText() +btnNine.getText();
        txtDisplay.setText(btnNineText);
    }                                       

    
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {                                        

String button_text = btnPlus.getText();
getOperator(button_text);
    }                                       

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

                                          


    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {                                         

switch (math_operator){
    case '+' :
        total2 = total1 + Double.parseDouble(txtDisplay.getText());
        break;
    case '-' :
        total2 = total1 - Double.parseDouble(txtDisplay.getText());
        break;
     case '/' :
        total2 = total1 / Double.parseDouble(txtDisplay.getText());
        break;
     case '*' :
        total2 = total1 * Double.parseDouble(txtDisplay.getText());
        break;
        }
txtDisplay.setText(Double.toString(total2));
total1 = 0;
    }                                        

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
total2 = 0;
txtDisplay.setText("");        
    }                                        

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {                                         
String button_text = btnMinus.getText();
getOperator(button_text);      
    }                                        

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {                                          
String button_text = btnDivide.getText();
getOperator(button_text);      
    }                                         

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {                                            
String button_text = btnMultiply.getText();
getOperator(button_text);      
    }                                           

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaCalculator().setVisible(true);
            }
        });
    }

                      
    private javax.swing.JPanel NumberPanel, jPanel2;
    private javax.swing.JButton btnClear, btnDivide,btnPlus,btnEqual,btnMinus, btnMultiply;
    private javax.swing.JButton btnOne,  btnTwo, btnThree, btnFour, btnFive,  btnSix, btnSeven, btnEight, btnNine, btnZero;
    private javax.swing.JTextField txtDisplay;
   }
