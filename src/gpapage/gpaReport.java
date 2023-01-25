package gpapage;

public class gpaReport extends javax.swing.JFrame {

    int totalCreditHours = 0;
    double totalCreditedGpa = 0;

    public gpaReport() {
        initComponents();
        setText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportPanel = new javax.swing.JPanel();
        gif = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        gpaNumber = new javax.swing.JLabel();
        gpaText = new javax.swing.JLabel();
        cn8 = new javax.swing.JLabel();
        om8 = new javax.swing.JLabel();
        tm8 = new javax.swing.JLabel();
        ch8 = new javax.swing.JLabel();
        gpa8 = new javax.swing.JLabel();
        cn7 = new javax.swing.JLabel();
        om7 = new javax.swing.JLabel();
        tm7 = new javax.swing.JLabel();
        ch7 = new javax.swing.JLabel();
        gpa7 = new javax.swing.JLabel();
        cn6 = new javax.swing.JLabel();
        om6 = new javax.swing.JLabel();
        tm6 = new javax.swing.JLabel();
        ch6 = new javax.swing.JLabel();
        gpa6 = new javax.swing.JLabel();
        cn5 = new javax.swing.JLabel();
        om5 = new javax.swing.JLabel();
        tm5 = new javax.swing.JLabel();
        ch5 = new javax.swing.JLabel();
        gpa5 = new javax.swing.JLabel();
        cn4 = new javax.swing.JLabel();
        om4 = new javax.swing.JLabel();
        tm4 = new javax.swing.JLabel();
        ch4 = new javax.swing.JLabel();
        gpa4 = new javax.swing.JLabel();
        cn3 = new javax.swing.JLabel();
        om3 = new javax.swing.JLabel();
        tm3 = new javax.swing.JLabel();
        ch3 = new javax.swing.JLabel();
        gpa3 = new javax.swing.JLabel();
        cn2 = new javax.swing.JLabel();
        om2 = new javax.swing.JLabel();
        tm2 = new javax.swing.JLabel();
        ch2 = new javax.swing.JLabel();
        gpa2 = new javax.swing.JLabel();
        cn1 = new javax.swing.JLabel();
        om1 = new javax.swing.JLabel();
        tm1 = new javax.swing.JLabel();
        ch1 = new javax.swing.JLabel();
        gpa1 = new javax.swing.JLabel();
        reportCardTitle = new javax.swing.JLabel();
        gpaTitle = new javax.swing.JLabel();
        credithoursTitle = new javax.swing.JLabel();
        obtainMarksTitle = new javax.swing.JLabel();
        totalMarksTitle = new javax.swing.JLabel();
        courseTitle = new javax.swing.JLabel();
        reportBackground = new javax.swing.JLabel();
        backgroundOpacity = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report Card");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        reportPanel.add(gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 190, 190));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aaaa.png"))); // NOI18N
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        reportPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        gpaNumber.setFont(new java.awt.Font("Rockwell", 1, 100)); // NOI18N
        gpaNumber.setText("3.06");
        reportPanel.add(gpaNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, 120));

        gpaText.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        gpaText.setForeground(new java.awt.Color(204, 204, 204));
        gpaText.setText("Your GPA is: ");
        reportPanel.add(gpaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        cn8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cn8.setForeground(new java.awt.Color(204, 204, 204));
        cn8.setText("Software Construction and Development");
        reportPanel.add(cn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 260, 18));

        om8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        om8.setForeground(new java.awt.Color(204, 204, 204));
        om8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(om8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 150, 18));

        tm8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tm8.setForeground(new java.awt.Color(204, 204, 204));
        tm8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(tm8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 110, 18));

        ch8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ch8.setForeground(new java.awt.Color(204, 204, 204));
        ch8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(ch8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 120, 18));

        gpa8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gpa8.setForeground(new java.awt.Color(204, 204, 204));
        gpa8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(gpa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 60, 18));

        cn7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cn7.setForeground(new java.awt.Color(204, 204, 204));
        cn7.setText("Software Construction and Development");
        reportPanel.add(cn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 260, 18));

        om7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        om7.setForeground(new java.awt.Color(204, 204, 204));
        om7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(om7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 150, 18));

        tm7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tm7.setForeground(new java.awt.Color(204, 204, 204));
        tm7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(tm7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 110, 18));

        ch7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ch7.setForeground(new java.awt.Color(204, 204, 204));
        ch7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(ch7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 120, 18));

        gpa7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gpa7.setForeground(new java.awt.Color(204, 204, 204));
        gpa7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(gpa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 60, 18));

        cn6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cn6.setForeground(new java.awt.Color(204, 204, 204));
        cn6.setText("Software Construction and Development");
        reportPanel.add(cn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 260, 18));

        om6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        om6.setForeground(new java.awt.Color(204, 204, 204));
        om6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(om6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 150, 18));

        tm6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tm6.setForeground(new java.awt.Color(204, 204, 204));
        tm6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(tm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 110, 18));

        ch6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ch6.setForeground(new java.awt.Color(204, 204, 204));
        ch6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(ch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 120, 18));

        gpa6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gpa6.setForeground(new java.awt.Color(204, 204, 204));
        gpa6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(gpa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 60, 18));

        cn5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cn5.setForeground(new java.awt.Color(204, 204, 204));
        cn5.setText("Software Construction and Development");
        reportPanel.add(cn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 260, 18));

        om5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        om5.setForeground(new java.awt.Color(204, 204, 204));
        om5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(om5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 150, 18));

        tm5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tm5.setForeground(new java.awt.Color(204, 204, 204));
        tm5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(tm5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 110, 18));

        ch5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ch5.setForeground(new java.awt.Color(204, 204, 204));
        ch5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(ch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 120, 18));

        gpa5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gpa5.setForeground(new java.awt.Color(204, 204, 204));
        gpa5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(gpa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 60, 18));

        cn4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cn4.setForeground(new java.awt.Color(204, 204, 204));
        cn4.setText("Software Construction and Development");
        reportPanel.add(cn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 260, 18));

        om4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        om4.setForeground(new java.awt.Color(204, 204, 204));
        om4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(om4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 150, 18));

        tm4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tm4.setForeground(new java.awt.Color(204, 204, 204));
        tm4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(tm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 110, 18));

        ch4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ch4.setForeground(new java.awt.Color(204, 204, 204));
        ch4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(ch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 120, 18));

        gpa4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gpa4.setForeground(new java.awt.Color(204, 204, 204));
        gpa4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(gpa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 60, 18));

        cn3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cn3.setForeground(new java.awt.Color(204, 204, 204));
        cn3.setText("Software Construction and Development");
        reportPanel.add(cn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 260, 18));

        om3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        om3.setForeground(new java.awt.Color(204, 204, 204));
        om3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(om3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 150, 18));

        tm3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tm3.setForeground(new java.awt.Color(204, 204, 204));
        tm3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(tm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 110, 18));

        ch3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ch3.setForeground(new java.awt.Color(204, 204, 204));
        ch3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(ch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 120, 18));

        gpa3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gpa3.setForeground(new java.awt.Color(204, 204, 204));
        gpa3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportPanel.add(gpa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 60, 18));

        cn2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cn2.setForeground(new java.awt.Color(204, 204, 204));
        cn2.setText("Software Construction and Development");
        reportPanel.add(cn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 260, 18));

        om2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        om2.setForeground(new java.awt.Color(204, 204, 204));
        om2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        om2.setText("100");
        reportPanel.add(om2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 150, 18));

        tm2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tm2.setForeground(new java.awt.Color(204, 204, 204));
        tm2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tm2.setText("100");
        reportPanel.add(tm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 110, 18));

        ch2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ch2.setForeground(new java.awt.Color(204, 204, 204));
        ch2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch2.setText("0 + 0");
        reportPanel.add(ch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 120, 18));

        gpa2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gpa2.setForeground(new java.awt.Color(204, 204, 204));
        gpa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpa2.setText("3.00");
        reportPanel.add(gpa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 60, 18));

        cn1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cn1.setForeground(new java.awt.Color(204, 204, 204));
        cn1.setText("Software Construction and Development");
        reportPanel.add(cn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 260, 18));

        om1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        om1.setForeground(new java.awt.Color(204, 204, 204));
        om1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        om1.setText("100");
        reportPanel.add(om1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 150, 18));

        tm1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tm1.setForeground(new java.awt.Color(204, 204, 204));
        tm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tm1.setText("100");
        reportPanel.add(tm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 110, 18));

        ch1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ch1.setForeground(new java.awt.Color(204, 204, 204));
        ch1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ch1.setText("0 + 0");
        reportPanel.add(ch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 120, 18));

        gpa1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gpa1.setForeground(new java.awt.Color(204, 204, 204));
        gpa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpa1.setText("3.00");
        reportPanel.add(gpa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 60, 18));

        reportCardTitle.setFont(new java.awt.Font("Rockwell", 1, 60)); // NOI18N
        reportCardTitle.setForeground(new java.awt.Color(204, 204, 204));
        reportCardTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportCardTitle.setText("Report Card");
        reportPanel.add(reportCardTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 510, -1));

        gpaTitle.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        gpaTitle.setForeground(new java.awt.Color(153, 153, 153));
        gpaTitle.setText("GPA");
        reportPanel.add(gpaTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 140, -1));

        credithoursTitle.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        credithoursTitle.setForeground(new java.awt.Color(153, 153, 153));
        credithoursTitle.setText("Credit Hours");
        reportPanel.add(credithoursTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 140, -1));

        obtainMarksTitle.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        obtainMarksTitle.setForeground(new java.awt.Color(153, 153, 153));
        obtainMarksTitle.setText("Obtained Marks");
        reportPanel.add(obtainMarksTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 150, -1));

        totalMarksTitle.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        totalMarksTitle.setForeground(new java.awt.Color(153, 153, 153));
        totalMarksTitle.setText("Total Marks");
        reportPanel.add(totalMarksTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 140, -1));

        courseTitle.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        courseTitle.setForeground(new java.awt.Color(153, 153, 153));
        courseTitle.setText("Course Name");
        reportPanel.add(courseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, -1));

        reportBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background50Opacity 1280x720.png"))); // NOI18N
        reportBackground.setText("jLabel1");
        reportPanel.add(reportBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 120, 810, 290));

        backgroundOpacity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background50Opacity 1280x720.png"))); // NOI18N
        reportPanel.add(backgroundOpacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mediamodifier-I3HPUolh5hA-unsplash (1) (1).jpg"))); // NOI18N
        reportPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(reportPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aaaa1.png")));
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aaaa.png")));
    }//GEN-LAST:event_backButtonMouseExited

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        new gpaFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void setText() {
        var data = reportData.getInstance();
        cn1.setText(data.courseNames[0]);
        cn2.setText(data.courseNames[1]);

        om1.setText(String.valueOf(data.obtainedMarks[0]));
        om2.setText(String.valueOf(data.obtainedMarks[1]));

        tm1.setText(String.valueOf(data.totalMarks[0]));
        tm2.setText(String.valueOf(data.totalMarks[1]));

        ch1.setText(String.valueOf(data.creditHours[0]));
        ch2.setText(String.valueOf(data.creditHours[1]));

        gpa1.setText(String.valueOf(calculateGpa(data.obtainedMarks[0], data.totalMarks[0], data.creditHours[0])));
        gpa2.setText(String.valueOf(calculateGpa(data.obtainedMarks[1], data.totalMarks[1], data.creditHours[1])));

        cn3.setText(data.courseNames[2]);
        cn4.setText(data.courseNames[3]);
        cn5.setText(data.courseNames[4]);
        cn6.setText(data.courseNames[5]);
        cn7.setText(data.courseNames[6]);
        cn8.setText(data.courseNames[7]);

        if ((cn3.getText() != null)) {
            om3.setText(String.valueOf(data.obtainedMarks[2]));
            tm3.setText(String.valueOf(data.totalMarks[2]));
            ch3.setText(String.valueOf(data.creditHours[2]));
            gpa3.setText(String.valueOf(calculateGpa(data.obtainedMarks[2], data.totalMarks[2], data.creditHours[2])));
        }

        if ((cn4.getText() != null)) {
            om4.setText(String.valueOf(data.obtainedMarks[3]));
            tm4.setText(String.valueOf(data.totalMarks[3]));
            ch4.setText(String.valueOf(data.creditHours[3]));
            gpa4.setText(String.valueOf(calculateGpa(data.obtainedMarks[3], data.totalMarks[3], data.creditHours[3])));
        }
        if ((cn5.getText() != null)) {
            om5.setText(String.valueOf(data.obtainedMarks[4]));
            tm5.setText(String.valueOf(data.totalMarks[4]));
            ch5.setText(String.valueOf(data.creditHours[4]));
            gpa5.setText(String.valueOf(calculateGpa(data.obtainedMarks[4], data.totalMarks[4], data.creditHours[4])));
        }
        if ((cn6.getText() != null)) {
            om6.setText(String.valueOf(data.obtainedMarks[5]));
            tm6.setText(String.valueOf(data.totalMarks[5]));
            ch6.setText(String.valueOf(data.creditHours[5]));
            gpa6.setText(String.valueOf(calculateGpa(data.obtainedMarks[5], data.totalMarks[5], data.creditHours[5])));
        }
        if ((cn7.getText() != null)) {
            om7.setText(String.valueOf(data.obtainedMarks[6]));
            tm7.setText(String.valueOf(data.totalMarks[6]));
            ch7.setText(String.valueOf(data.creditHours[6]));
            gpa7.setText(String.valueOf(calculateGpa(data.obtainedMarks[6], data.totalMarks[6], data.creditHours[6])));
        }
        if ((cn8.getText() != null)) {
            om8.setText(String.valueOf(data.obtainedMarks[7]));
            tm8.setText(String.valueOf(data.totalMarks[7]));
            ch8.setText(String.valueOf(data.creditHours[7]));
            gpa8.setText(String.valueOf(calculateGpa(data.obtainedMarks[7], data.totalMarks[7], data.creditHours[7])));
        }

        double gpa = totalCreditedGpa / totalCreditHours;

        gpaNumber.setText(String.format("%.2f", (gpa)));

        int gifChooser = (int) (Math.random() * 3);

        class t extends Thread {

            @Override
            public void run() {
                double gpa = totalCreditedGpa / totalCreditHours;
            }
        }
        new t().start();

        if ((gpa > 3.00) && (gpa < 4.00)) {
            gif.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.gif3_4[gifChooser])));
        } else if ((gpa > 2.00) && (gpa < 3.00)) {
            gif.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.gif2_3[gifChooser])));
        } else if ((gpa > 1.00) && (gpa < 2.00)) {
            gif.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.gif1_2[gifChooser])));
        } else if (gpa < 1.00) {
            gif.setIcon(new javax.swing.ImageIcon(getClass().getResource(data.gif0_1[gifChooser])));
        }

    }

    public double calculateGpa(double obtainedMarks, int totalMarks, int creditHours) {

        double creditedGpa, gpa = 0.00;
        if (totalMarks == 50) {
            obtainedMarks = obtainedMarks * 2;
        }
        if (obtainedMarks >= 86 && obtainedMarks <= 100) {
            gpa = 4.00;
        } else if (obtainedMarks >= 80 && obtainedMarks <= 85) {
            gpa = 3.66;
        } else if (obtainedMarks >= 75 && obtainedMarks <= 79) {
            gpa = 3.33;
        } else if (obtainedMarks >= 70 && obtainedMarks <= 74) {
            gpa = 3.00;
        } else if (obtainedMarks >= 67 && obtainedMarks <= 69) {
            gpa = 2.66;
        } else if (obtainedMarks >= 63 && obtainedMarks <= 66) {
            gpa = 2.33;
        } else if (obtainedMarks >= 60 && obtainedMarks <= 62) {
            gpa = 2.00;
        } else if (obtainedMarks >= 57 && obtainedMarks <= 59) {
            gpa = 1.66;
        } else if (obtainedMarks >= 54 && obtainedMarks <= 56) {
            gpa = 1.30;
        } else if (obtainedMarks >= 50 && obtainedMarks <= 53) {
            gpa = 1.00;
        } else if (obtainedMarks < 50) {
            gpa = 0.00;
        }
        totalCreditHours += creditHours;
        creditedGpa = gpa * creditHours;
        totalCreditedGpa += creditedGpa;
        return gpa;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel backgroundOpacity;
    private javax.swing.JLabel ch1;
    private javax.swing.JLabel ch2;
    private javax.swing.JLabel ch3;
    private javax.swing.JLabel ch4;
    private javax.swing.JLabel ch5;
    private javax.swing.JLabel ch6;
    private javax.swing.JLabel ch7;
    private javax.swing.JLabel ch8;
    private javax.swing.JLabel cn1;
    private javax.swing.JLabel cn2;
    private javax.swing.JLabel cn3;
    private javax.swing.JLabel cn4;
    private javax.swing.JLabel cn5;
    private javax.swing.JLabel cn6;
    private javax.swing.JLabel cn7;
    private javax.swing.JLabel cn8;
    private javax.swing.JLabel courseTitle;
    private javax.swing.JLabel credithoursTitle;
    private javax.swing.JLabel gif;
    private javax.swing.JLabel gpa1;
    private javax.swing.JLabel gpa2;
    private javax.swing.JLabel gpa3;
    private javax.swing.JLabel gpa4;
    private javax.swing.JLabel gpa5;
    private javax.swing.JLabel gpa6;
    private javax.swing.JLabel gpa7;
    private javax.swing.JLabel gpa8;
    private javax.swing.JLabel gpaNumber;
    private javax.swing.JLabel gpaText;
    private javax.swing.JLabel gpaTitle;
    private javax.swing.JLabel obtainMarksTitle;
    private javax.swing.JLabel om1;
    private javax.swing.JLabel om2;
    private javax.swing.JLabel om3;
    private javax.swing.JLabel om4;
    private javax.swing.JLabel om5;
    private javax.swing.JLabel om6;
    private javax.swing.JLabel om7;
    private javax.swing.JLabel om8;
    private javax.swing.JLabel reportBackground;
    private javax.swing.JLabel reportCardTitle;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JLabel tm1;
    private javax.swing.JLabel tm2;
    private javax.swing.JLabel tm3;
    private javax.swing.JLabel tm4;
    private javax.swing.JLabel tm5;
    private javax.swing.JLabel tm6;
    private javax.swing.JLabel tm7;
    private javax.swing.JLabel tm8;
    private javax.swing.JLabel totalMarksTitle;
    // End of variables declaration//GEN-END:variables
}
