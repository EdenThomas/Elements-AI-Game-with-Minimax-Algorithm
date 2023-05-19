package egame;

import java.awt.Color;
import javax.swing.*;
import java.util.concurrent.*;

public class Elements extends javax.swing.JFrame {

    private Logic a = new Logic();
    public Elements() {
        initComponents();
        
        ScrollPane.setBorder(null);
        ScrollPane.setViewportBorder(null);
        ScrollPane.getViewport().setOpaque(false);
        ScrollPane.setViewportBorder(null);
        
        TextArea1.setBorder(null);
        TextArea1.setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Parent = new javax.swing.JPanel();
        Screen1 = new javax.swing.JPanel();
        MainLabel = new javax.swing.JLabel();
        StartGameButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        AboutButton = new javax.swing.JButton();
        Screen2 = new javax.swing.JPanel();
        QuitButton = new javax.swing.JButton();
        Slider = new javax.swing.JSlider();
        ChooseElement = new javax.swing.JButton();
        DisplayedE = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        ComputerScorecard = new javax.swing.JPanel();
        Player3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cfire = new javax.swing.JTextField();
        cwater = new javax.swing.JTextField();
        cwood = new javax.swing.JTextField();
        PlayerScorecard = new javax.swing.JPanel();
        Player7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pfire = new javax.swing.JTextField();
        pwater = new javax.swing.JTextField();
        pwood = new javax.swing.JTextField();
        Result = new javax.swing.JLabel();
        Screen3 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Element");
        setResizable(false);

        Parent.setBackground(new java.awt.Color(102, 102, 255));
        Parent.setLayout(new java.awt.CardLayout());

        Screen1.setName(""); // NOI18N

        MainLabel.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        MainLabel.setText("Elements");

        StartGameButton.setText("Start Game");
        StartGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartGameButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        AboutButton.setText("About");
        AboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Screen1Layout = new javax.swing.GroupLayout(Screen1);
        Screen1.setLayout(Screen1Layout);
        Screen1Layout.setHorizontalGroup(
            Screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Screen1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(172, 172, 172))
            .addGroup(Screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Screen1Layout.createSequentialGroup()
                    .addGap(169, 169, 169)
                    .addGroup(Screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StartGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
        Screen1Layout.setVerticalGroup(
            Screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Screen1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(MainLabel)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(Screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Screen1Layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(StartGameButton)
                    .addGap(18, 18, 18)
                    .addComponent(ExitButton)
                    .addGap(18, 18, 18)
                    .addComponent(AboutButton)
                    .addContainerGap(139, Short.MAX_VALUE)))
        );

        Parent.add(Screen1, "card2");

        QuitButton.setBackground(new java.awt.Color(255, 0, 0));
        QuitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        QuitButton.setText("X");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        Slider.setMajorTickSpacing(1);
        Slider.setMaximum(2);
        Slider.setMinimum(1);
        Slider.setPaintTicks(true);
        Slider.setPaintTrack(false);

        ChooseElement.setText("Select");
        ChooseElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseElementActionPerformed(evt);
            }
        });

        DisplayedE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DisplayedE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisplayedE.setText("Fire");

        E1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        E1.setText("Water");

        E2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        E2.setText("Water");

        Player3.setText("Computer");

        jLabel6.setText("Fire");

        jLabel7.setText("Water");

        jLabel8.setText("Wood");

        cfire.setText("jTextField7");

        cwater.setText("jTextField8");

        cwood.setText("jTextField9");

        javax.swing.GroupLayout ComputerScorecardLayout = new javax.swing.GroupLayout(ComputerScorecard);
        ComputerScorecard.setLayout(ComputerScorecardLayout);
        ComputerScorecardLayout.setHorizontalGroup(
            ComputerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerScorecardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ComputerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ComputerScorecardLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Player3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ComputerScorecardLayout.createSequentialGroup()
                        .addGroup(ComputerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cwood, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(cwater, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(cfire, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ComputerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ComputerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        ComputerScorecardLayout.setVerticalGroup(
            ComputerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerScorecardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Player3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ComputerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cfire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ComputerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cwater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ComputerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cwood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Player7.setText("Player");

        jLabel18.setText("Fire");

        jLabel19.setText("Water");

        jLabel20.setText("Wood");

        pfire.setText("p1f");

        pwater.setText("jTextField8");

        pwood.setText("jTextField9");

        javax.swing.GroupLayout PlayerScorecardLayout = new javax.swing.GroupLayout(PlayerScorecard);
        PlayerScorecard.setLayout(PlayerScorecardLayout);
        PlayerScorecardLayout.setHorizontalGroup(
            PlayerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerScorecardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlayerScorecardLayout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(Player7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlayerScorecardLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pwood, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(PlayerScorecardLayout.createSequentialGroup()
                        .addGroup(PlayerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PlayerScorecardLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlayerScorecardLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)))
                        .addGroup(PlayerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfire, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(pwater, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PlayerScorecardLayout.setVerticalGroup(
            PlayerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayerScorecardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Player7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(pfire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayerScorecardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(pwood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Result.setText("The player wins");

        javax.swing.GroupLayout Screen2Layout = new javax.swing.GroupLayout(Screen2);
        Screen2.setLayout(Screen2Layout);
        Screen2Layout.setHorizontalGroup(
            Screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Screen2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(QuitButton))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Screen2Layout.createSequentialGroup()
                .addComponent(PlayerScorecard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Screen2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(Screen2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(E1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(E2)
                        .addGap(56, 56, 56))
                    .addGroup(Screen2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(ComputerScorecard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Screen2Layout.createSequentialGroup()
                .addGroup(Screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Screen2Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(ChooseElement))
                    .addGroup(Screen2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(DisplayedE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Screen2Layout.setVerticalGroup(
            Screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Screen2Layout.createSequentialGroup()
                .addComponent(QuitButton)
                .addGap(8, 8, 8)
                .addComponent(Result)
                .addGap(36, 36, 36)
                .addComponent(DisplayedE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Screen2Layout.createSequentialGroup()
                            .addGroup(Screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(E2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(PlayerScorecard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComputerScorecard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(ChooseElement)
                .addGap(44, 44, 44))
        );

        ChooseElement.getAccessibleContext().setAccessibleDescription("");

        Parent.add(Screen2, "card3");

        Screen3.setBackground(new java.awt.Color(153, 255, 102));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("About 'Elements'");

        TextArea1.setEditable(false);
        TextArea1.setColumns(20);
        TextArea1.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        TextArea1.setLineWrap(true);
        TextArea1.setRows(5);
        TextArea1.setText("Both players have 9 fire, wood and water each. An element will be displayed and the players can choose fire, water or wood to interact with the displayed element but the chosen element will decrease by one. The players also cannot choose the displayed element. The game starts with the element fire. The game ends after each player gets 5 moves. The player who have most elements win. Or else it is a draw.\n\nThe rules for how the elements interact are as follows:\n1. If the current element is fire, and the player chooses water, they gain one fire and the new element becomes water.\n2. If the current element is fire, and the player chooses wood, the opponent loses one fire and the new element becomes fire.\n3. If the current element is wood, and the player chooses water, they gain one wood and the new element becomes water.\n4. If the current element is wood, and the player chooses fire, the opponent loses one wood and the new element becomes fire.\n5. If the current element is water, and the player chooses wood, they gain one water and the new element becomes wood.\n6. If the current element is water, and the player chooses fire, the opponent loses one water and the new element becomes fire.\n");
        TextArea1.setWrapStyleWord(true);
        ScrollPane.setViewportView(TextArea1);

        javax.swing.GroupLayout Screen3Layout = new javax.swing.GroupLayout(Screen3);
        Screen3.setLayout(Screen3Layout);
        Screen3Layout.setHorizontalGroup(
            Screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Screen3Layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Screen3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        Screen3Layout.setVerticalGroup(
            Screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Screen3Layout.createSequentialGroup()
                .addGroup(Screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton)
                    .addGroup(Screen3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        Parent.add(Screen3, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameButtonActionPerformed
        Parent.removeAll();
        Parent.add(Screen2);
        Parent.repaint();
        Parent.revalidate();
        Result.setVisible(false);
        DisplayedE.setText(a.element1);
        E1.setText(a.element2);
        E2.setText(a.element3);
        
        pfire.setText(Integer.toString(a.pf));
        pwater.setText(Integer.toString(a.pw));
        pwood.setText(Integer.toString(a.pwd));
        
        cfire.setText(Integer.toString(a.cf));
        cwater.setText(Integer.toString(a.cw));
        cwood.setText(Integer.toString(a.cwd));
        
        int strtgme = JOptionPane.showConfirmDialog(null,"Do you want to start the game?","Start",JOptionPane.YES_NO_OPTION);
        if (strtgme==0)
            a.setComputerturn(false);
        else
            a.setComputerturn(true);
        
        if (a.computerturn == true) {
            
            //disabling player button
            ChooseElement.setEnabled(false);
            
            //scheduling computer play
            ScheduledExecutorService compmove = Executors.newSingleThreadScheduledExecutor();
            compmove.schedule(new Runnable(){
            @Override
            public void run() {
                
                //choosing the move
                a.makeComputerMove();
                
                //Update GUI
                DisplayedE.setText(a.DE);
                E1.setText(a.E1);
                E2.setText(a.E2);
                pfire.setText(Integer.toString(a.pf));
                pwater.setText(Integer.toString(a.pw));
                pwood.setText(Integer.toString(a.pwd));
                cfire.setText(Integer.toString(a.cf));
                cwater.setText(Integer.toString(a.cw));
                cwood.setText(Integer.toString(a.cwd));
                
                //Enable player button for their turn
                ChooseElement.setEnabled(true);
            }
        }, 1, TimeUnit.SECONDS);
        }
        
    }//GEN-LAST:event_StartGameButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        int e = JOptionPane.showConfirmDialog(null,"Do you want to exit Elements?","Exit?",JOptionPane.YES_NO_OPTION);
        if (e==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        Parent.removeAll();
        Parent.add(Screen3);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_AboutButtonActionPerformed

    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        int e = JOptionPane.showConfirmDialog(null,"Do you want to quit to main menu? All progress will be lost!","Main Menu?",JOptionPane.YES_NO_OPTION);
        if (e==0)
        {
            Parent.removeAll();
            Parent.add(Screen1);
            Parent.repaint();
            Parent.revalidate();
            Slider.setValue(2);
            ChooseElement.setEnabled(true);
            
            DisplayedE.setText(a.element1);
            E1.setText(a.element2);
            E2.setText(a.element3);
            
            a.DE=a.element1;
            a.E1=a.element2;
            a.E2=a.element3;
            a.pf=9;
            a.pw=9;
            a.pwd=9;
            a.cf=9;
            a.cw=9;
            a.cwd=9;     
            a.moveno=0;
        }
    }//GEN-LAST:event_QuitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Parent.removeAll();
        Parent.add(Screen1);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ChooseElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseElementActionPerformed

        int s = Slider.getValue();
        a.setS(s);
        a.setDE(DisplayedE.getText());
        
        a.gamelogic();
        a.setmoveno(++a.moveno);
        
        DisplayedE.setText(a.DE);
        E1.setText(a.E1);
        E2.setText(a.E2);
        pfire.setText(Integer.toString(a.pf));
        pwater.setText(Integer.toString(a.pw));
        pwood.setText(Integer.toString(a.pwd));
        cfire.setText(Integer.toString(a.cf));
        cwater.setText(Integer.toString(a.cw));
        cwood.setText(Integer.toString(a.cwd));
        
        //Disable players button to prevent playing during computer move
        ChooseElement.setEnabled(false);
        
        //checking if moves ran out
        if (a.moveno >= 10)
        {
            Result.setText(a.Winner());
            Result.setVisible(true);
            return;
        }
       
        //Schedule computer move after player move
        ScheduledExecutorService compmove = Executors.newSingleThreadScheduledExecutor();
        compmove.schedule(new Runnable(){
            @Override
            public void run() {
                
                //choosing the move
                a.makeComputerMove();
                a.setmoveno(++a.moveno);
                
                //Update GUI
                DisplayedE.setText(a.DE);
                E1.setText(a.E1);
                E2.setText(a.E2);
                pfire.setText(Integer.toString(a.pf));
                pwater.setText(Integer.toString(a.pw));
                pwood.setText(Integer.toString(a.pwd));
                cfire.setText(Integer.toString(a.cf));
                cwater.setText(Integer.toString(a.cw));
                cwood.setText(Integer.toString(a.cwd));
                
                //Enable player button for their turn
                ChooseElement.setEnabled(true);
            }
        }, 1, TimeUnit.SECONDS);
        
        //checking if moves ran out
                if (a.moveno >= 10)
                {
                    ChooseElement.setEnabled(false);
                    Result.setText(a.Winner());
                    Result.setVisible(true);
                }
    }//GEN-LAST:event_ChooseElementActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Elements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Elements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Elements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Elements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elements().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ChooseElement;
    private javax.swing.JPanel ComputerScorecard;
    private javax.swing.JLabel DisplayedE;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JPanel Parent;
    private javax.swing.JLabel Player3;
    private javax.swing.JLabel Player7;
    private javax.swing.JPanel PlayerScorecard;
    private javax.swing.JButton QuitButton;
    private javax.swing.JLabel Result;
    private javax.swing.JPanel Screen1;
    private javax.swing.JPanel Screen2;
    private javax.swing.JPanel Screen3;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JSlider Slider;
    private javax.swing.JButton StartGameButton;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextField cfire;
    private javax.swing.JTextField cwater;
    private javax.swing.JTextField cwood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField pfire;
    private javax.swing.JTextField pwater;
    private javax.swing.JTextField pwood;
    // End of variables declaration//GEN-END:variables
}
