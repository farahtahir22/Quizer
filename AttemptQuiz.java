/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.farahtahir_bscs5a_123030;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class AttemptQuiz extends javax.swing.JFrame {
    Quiz quiz = new Quiz();
    public static int count = 0; 
    public static int score = 0;
    public String correctAns;
    /**
     * Creates new form AttemptQuiz
     */
    public AttemptQuiz() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        FinishButton = new javax.swing.JButton();
        QuestionField = new javax.swing.JTextField();
        Option1Radio = new javax.swing.JRadioButton();
        Option2Radio = new javax.swing.JRadioButton();
        Option3Radio = new javax.swing.JRadioButton();
        Option4Radio = new javax.swing.JRadioButton();
        LogoutButton = new javax.swing.JButton();
        NextQuestionButton = new javax.swing.JButton();
        StartQuizButton = new javax.swing.JButton();

        buttonGroup2.add(Option1Radio);
        buttonGroup2.add(Option2Radio);
        buttonGroup2.add(Option3Radio);
        buttonGroup2.add(Option4Radio);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Attempt Quiz");
        jScrollPane1.setViewportView(jTextArea1);

        FinishButton.setText("Finish Quiz");
        FinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishButtonActionPerformed(evt);
            }
        });

        QuestionField.setEditable(false);
        QuestionField.setText("Question");
        QuestionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionFieldActionPerformed(evt);
            }
        });

        Option1Radio.setText("jRadioButton1");

        Option2Radio.setText("jRadioButton2");

        Option3Radio.setText("jRadioButton3");

        Option4Radio.setText("jRadioButton4");

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        NextQuestionButton.setText("Next Question");
        NextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextQuestionButtonActionPerformed(evt);
            }
        });

        StartQuizButton.setText("Start Quiz");
        StartQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartQuizButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Option3Radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Option4Radio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Option1Radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Option2Radio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NextQuestionButton)
                        .addGap(29, 29, 29)
                        .addComponent(FinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(QuestionField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StartQuizButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(StartQuizButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QuestionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option1Radio)
                    .addComponent(Option2Radio))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option3Radio)
                    .addComponent(Option4Radio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinishButton)
                    .addComponent(LogoutButton)
                    .addComponent(NextQuestionButton))
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionFieldActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishButtonActionPerformed
        JOptionPane frame = new JOptionPane();
        JOptionPane.showMessageDialog(frame, "Quiz Finished. Score: " + score);
    }//GEN-LAST:event_FinishButtonActionPerformed

    private void NextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextQuestionButtonActionPerformed
        if (Option1Radio.getText().equals(correctAns)){
            score++;
        }
        else if (Option2Radio.getText().equals(correctAns)){
            score++;
        }
        else if (Option3Radio.getText().equals(correctAns)){
            score++;
        }
        else if (Option4Radio.getText().equals(correctAns)){
            score++;
        }
        
        if (count != QuizSerialization.quizzes.size()){
            count++;
        }
        QuizSerialization.load_quiz();
        Quiz q = QuizSerialization.quizzes.get(count);
        Ques_Ans qA = q.queAns.get(count);
        QuestionField.setText(qA.question);
        Option1Radio.setText(qA.opt1);
        Option2Radio.setText(qA.opt2);
        Option3Radio.setText(qA.opt3);
        Option4Radio.setText(qA.opt4);
        correctAns = qA.correctAnswer;
    }//GEN-LAST:event_NextQuestionButtonActionPerformed

    private void StartQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartQuizButtonActionPerformed
        QuizSerialization.load_quiz();
        Quiz q = QuizSerialization.quizzes.get(count);
        Ques_Ans qA = q.queAns.get(count);
        QuestionField.setText(qA.question);
        Option1Radio.setText(qA.opt1);
        Option2Radio.setText(qA.opt2);
        Option3Radio.setText(qA.opt3);
        Option4Radio.setText(qA.opt4);
        correctAns = qA.correctAnswer;
        
        StartQuizButton.setEnabled(false);
    }//GEN-LAST:event_StartQuizButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AttemptQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttemptQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttemptQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttemptQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttemptQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FinishButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton NextQuestionButton;
    private javax.swing.JRadioButton Option1Radio;
    private javax.swing.JRadioButton Option2Radio;
    private javax.swing.JRadioButton Option3Radio;
    private javax.swing.JRadioButton Option4Radio;
    private javax.swing.JTextField QuestionField;
    private javax.swing.JButton StartQuizButton;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
