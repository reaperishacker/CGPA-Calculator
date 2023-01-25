package mainpage;

import cgpapage.cgpaFrame;
import gpapage.gpaFrame;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cgpaCalculatorText = new javax.swing.JLabel();
        gpaCalculatorText = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        cgpaCalculatorButton = new javax.swing.JLabel();
        gpaCalculatorButton = new javax.swing.JLabel();
        backgroundOpacity = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Page");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cgpaCalculatorText.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        cgpaCalculatorText.setForeground(new java.awt.Color(51, 51, 51));
        cgpaCalculatorText.setText("CGPA Calculator");
        jPanel1.add(cgpaCalculatorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 190, 40));

        gpaCalculatorText.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        gpaCalculatorText.setForeground(new java.awt.Color(51, 51, 51));
        gpaCalculatorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpaCalculatorText.setText("GPA Calculator");
        gpaCalculatorText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpaCalculatorTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gpaCalculatorTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gpaCalculatorTextMouseExited(evt);
            }
        });
        jPanel1.add(gpaCalculatorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 230, 40));

        title.setBackground(new java.awt.Color(243, 240, 236));
        title.setFont(new java.awt.Font("Rockwell", 1, 68)); // NOI18N
        title.setForeground(new java.awt.Color(204, 204, 204));
        title.setText("CGPA Calculator");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        cgpaCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1).png"))); // NOI18N
        cgpaCalculatorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cgpaCalculatorButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cgpaCalculatorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cgpaCalculatorButtonMouseExited(evt);
            }
        });
        jPanel1.add(cgpaCalculatorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        gpaCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1).png"))); // NOI18N
        gpaCalculatorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpaCalculatorButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gpaCalculatorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gpaCalculatorButtonMouseExited(evt);
            }
        });
        jPanel1.add(gpaCalculatorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        backgroundOpacity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background50Opacity 1280x720.png"))); // NOI18N
        jPanel1.add(backgroundOpacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mediamodifier-I3HPUolh5hA-unsplash (1) (1).jpg"))); // NOI18N
        jPanel1.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gpaCalculatorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaCalculatorButtonMouseEntered
        gpaCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_hover (1).png")));
    }//GEN-LAST:event_gpaCalculatorButtonMouseEntered

    private void gpaCalculatorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaCalculatorButtonMouseExited
        gpaCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1).png")));
    }//GEN-LAST:event_gpaCalculatorButtonMouseExited

    private void cgpaCalculatorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cgpaCalculatorButtonMouseEntered
        cgpaCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_hover (1).png")));
    }//GEN-LAST:event_cgpaCalculatorButtonMouseEntered

    private void cgpaCalculatorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cgpaCalculatorButtonMouseExited
        cgpaCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1).png")));
    }//GEN-LAST:event_cgpaCalculatorButtonMouseExited

    private void gpaCalculatorTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaCalculatorTextMouseClicked
        new gpaFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_gpaCalculatorTextMouseClicked

    private void gpaCalculatorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaCalculatorButtonMouseClicked
        new gpaFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_gpaCalculatorButtonMouseClicked

    private void gpaCalculatorTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaCalculatorTextMouseEntered
        gpaCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_hover (1).png")));
    }//GEN-LAST:event_gpaCalculatorTextMouseEntered

    private void gpaCalculatorTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaCalculatorTextMouseExited
        gpaCalculatorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1).png")));
    }//GEN-LAST:event_gpaCalculatorTextMouseExited

    private void cgpaCalculatorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cgpaCalculatorButtonMouseClicked
        new cgpaFrame().setVisible(true);
        dispose();

    }//GEN-LAST:event_cgpaCalculatorButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel backgroundOpacity;
    private javax.swing.JLabel cgpaCalculatorButton;
    private javax.swing.JLabel cgpaCalculatorText;
    private javax.swing.JLabel gpaCalculatorButton;
    private javax.swing.JLabel gpaCalculatorText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
