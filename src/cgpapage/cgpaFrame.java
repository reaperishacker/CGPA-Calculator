package cgpapage;

import mainpage.MainFrame;

public final class cgpaFrame extends javax.swing.JFrame {

    boolean panel3 = false, panel4 = false, panel5 = false, panel6 = false, panel7 = false, panel8 = false;

    public cgpaFrame() {
        initComponents();
        showPanel3(false);
        showPanel4(false);
        showPanel5(false);
        showPanel6(false);
        showPanel7(false);
        showPanel8(false);
        showButton4.setVisible(false);
        showButton5.setVisible(false);
        showButton6.setVisible(false);
        showButton7.setVisible(false);
        showButton8.setVisible(false);
    }

    public void showPanel3(boolean show) {
        showButton3.setVisible(!show);
        showCourse3.setVisible(show);
        showButton4.setVisible(show);
        panel3 = show;
    }

    public void showPanel4(boolean show) {
        showButton4.setVisible(!show);
        showCourse4.setVisible(show);
        dustbin3.setVisible(!show);
        showButton5.setVisible(show);
        panel4 = show;
    }

    public void showPanel5(boolean show) {
        showButton5.setVisible(!show);
        showCourse5.setVisible(show);
        dustbin4.setVisible(!show);
        showButton6.setVisible(show);
        panel5 = show;
    }

    public void showPanel6(boolean show) {
        showButton6.setVisible(!show);
        showCourse6.setVisible(show);
        dustbin5.setVisible(!show);
        showButton7.setVisible(show);
        panel6 = show;
    }

    public void showPanel7(boolean show) {
        showButton7.setVisible(!show);
        showCourse7.setVisible(show);
        dustbin6.setVisible(!show);
        showButton8.setVisible(show);
        panel7 = show;
    }

    public void showPanel8(boolean show) {
        showButton8.setVisible(!show);
        showCourse8.setVisible(show);
        dustbin7.setVisible(!show);
        panel8 = show;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gif = new javax.swing.JLabel();
        gpaSem1 = new javax.swing.JTextField();
        totalChSem1 = new javax.swing.JTextField();
        gpaSem2 = new javax.swing.JTextField();
        totalChSem2 = new javax.swing.JTextField();
        showButton3 = new javax.swing.JLabel();
        showButton4 = new javax.swing.JLabel();
        showButton5 = new javax.swing.JLabel();
        showButton6 = new javax.swing.JLabel();
        showButton7 = new javax.swing.JLabel();
        showButton8 = new javax.swing.JLabel();
        showCourse3 = new javax.swing.JPanel();
        gpaSem3 = new javax.swing.JTextField();
        totalChSem3 = new javax.swing.JTextField();
        dustbin3 = new javax.swing.JLabel();
        showCourse4 = new javax.swing.JPanel();
        gpaSem4 = new javax.swing.JTextField();
        totalChSem4 = new javax.swing.JTextField();
        dustbin4 = new javax.swing.JLabel();
        showCourse5 = new javax.swing.JPanel();
        gpaSem5 = new javax.swing.JTextField();
        totalChSem5 = new javax.swing.JTextField();
        dustbin5 = new javax.swing.JLabel();
        showCourse6 = new javax.swing.JPanel();
        gpaSem6 = new javax.swing.JTextField();
        totalChSem6 = new javax.swing.JTextField();
        dustbin6 = new javax.swing.JLabel();
        showCourse7 = new javax.swing.JPanel();
        gpaSem7 = new javax.swing.JTextField();
        totalChSem7 = new javax.swing.JTextField();
        dustbin7 = new javax.swing.JLabel();
        showCourse8 = new javax.swing.JPanel();
        gpaSem8 = new javax.swing.JTextField();
        totalChSem8 = new javax.swing.JTextField();
        dustbin8 = new javax.swing.JLabel();
        calculateButtonText = new javax.swing.JLabel();
        calculateButton = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        prompt = new javax.swing.JLabel();
        CgpaHeading = new javax.swing.JLabel();
        CGPA = new javax.swing.JLabel();
        backgroundOpacity = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CGPA Calculator");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, 180));

        gpaSem1.setBackground(new java.awt.Color(51, 51, 51));
        gpaSem1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        gpaSem1.setForeground(new java.awt.Color(204, 204, 204));
        gpaSem1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpaSem1.setText("1st Semester GPA");
        gpaSem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpaSem1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        gpaSem1.setFocusable(false);
        gpaSem1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpaSem1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpaSem1FocusLost(evt);
            }
        });
        gpaSem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpaSem1MouseClicked(evt);
            }
        });
        jPanel1.add(gpaSem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 180, 40));

        totalChSem1.setBackground(new java.awt.Color(51, 51, 51));
        totalChSem1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalChSem1.setForeground(new java.awt.Color(204, 204, 204));
        totalChSem1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalChSem1.setText("Total Credit Hours");
        totalChSem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totalChSem1.setFocusable(false);
        totalChSem1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalChSem1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalChSem1FocusLost(evt);
            }
        });
        totalChSem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalChSem1MouseClicked(evt);
            }
        });
        jPanel1.add(totalChSem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 180, 40));

        gpaSem2.setBackground(new java.awt.Color(51, 51, 51));
        gpaSem2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        gpaSem2.setForeground(new java.awt.Color(204, 204, 204));
        gpaSem2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpaSem2.setText("2nd Semester GPA");
        gpaSem2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpaSem2.setFocusable(false);
        gpaSem2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpaSem2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpaSem2FocusLost(evt);
            }
        });
        gpaSem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpaSem2MouseClicked(evt);
            }
        });
        jPanel1.add(gpaSem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 180, 40));

        totalChSem2.setBackground(new java.awt.Color(51, 51, 51));
        totalChSem2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalChSem2.setForeground(new java.awt.Color(204, 204, 204));
        totalChSem2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalChSem2.setText("Total Credit Hours");
        totalChSem2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totalChSem2.setFocusable(false);
        totalChSem2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalChSem2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalChSem2FocusLost(evt);
            }
        });
        totalChSem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalChSem2MouseClicked(evt);
            }
        });
        jPanel1.add(totalChSem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 180, 40));

        showButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton3MouseClicked(evt);
            }
        });
        jPanel1.add(showButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 480, 60));

        showButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton4MouseClicked(evt);
            }
        });
        jPanel1.add(showButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 480, 60));

        showButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton5MouseClicked(evt);
            }
        });
        jPanel1.add(showButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 480, 60));

        showButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton6MouseClicked(evt);
            }
        });
        jPanel1.add(showButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 480, 60));

        showButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton7MouseClicked(evt);
            }
        });
        jPanel1.add(showButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 480, 60));

        showButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton8MouseClicked(evt);
            }
        });
        jPanel1.add(showButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 480, 60));

        showCourse3.setOpaque(false);
        showCourse3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpaSem3.setBackground(new java.awt.Color(51, 51, 51));
        gpaSem3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        gpaSem3.setForeground(new java.awt.Color(204, 204, 204));
        gpaSem3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpaSem3.setText("3rd Semester GPA");
        gpaSem3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpaSem3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpaSem3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpaSem3FocusLost(evt);
            }
        });
        showCourse3.add(gpaSem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 40));

        totalChSem3.setBackground(new java.awt.Color(51, 51, 51));
        totalChSem3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalChSem3.setForeground(new java.awt.Color(204, 204, 204));
        totalChSem3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalChSem3.setText("Total Credit Hours");
        totalChSem3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totalChSem3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalChSem3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalChSem3FocusLost(evt);
            }
        });
        showCourse3.add(totalChSem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 40));

        dustbin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin3MouseClicked(evt);
            }
        });
        showCourse3.add(dustbin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, 40));

        jPanel1.add(showCourse3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 560, 60));

        showCourse4.setOpaque(false);
        showCourse4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpaSem4.setBackground(new java.awt.Color(51, 51, 51));
        gpaSem4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        gpaSem4.setForeground(new java.awt.Color(204, 204, 204));
        gpaSem4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpaSem4.setText("4th Semester GPA");
        gpaSem4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpaSem4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpaSem4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpaSem4FocusLost(evt);
            }
        });
        showCourse4.add(gpaSem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 40));

        totalChSem4.setBackground(new java.awt.Color(51, 51, 51));
        totalChSem4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalChSem4.setForeground(new java.awt.Color(204, 204, 204));
        totalChSem4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalChSem4.setText("Total Credit Hours");
        totalChSem4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totalChSem4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalChSem4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalChSem4FocusLost(evt);
            }
        });
        showCourse4.add(totalChSem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 40));

        dustbin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin4MouseClicked(evt);
            }
        });
        showCourse4.add(dustbin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, 40));

        jPanel1.add(showCourse4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 560, 60));

        showCourse5.setOpaque(false);
        showCourse5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpaSem5.setBackground(new java.awt.Color(51, 51, 51));
        gpaSem5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        gpaSem5.setForeground(new java.awt.Color(204, 204, 204));
        gpaSem5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpaSem5.setText("6th Semester GPA");
        gpaSem5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpaSem5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpaSem5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpaSem5FocusLost(evt);
            }
        });
        showCourse5.add(gpaSem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 40));

        totalChSem5.setBackground(new java.awt.Color(51, 51, 51));
        totalChSem5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalChSem5.setForeground(new java.awt.Color(204, 204, 204));
        totalChSem5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalChSem5.setText("Total Credit Hours");
        totalChSem5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totalChSem5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalChSem5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalChSem5FocusLost(evt);
            }
        });
        showCourse5.add(totalChSem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 40));

        dustbin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin5MouseClicked(evt);
            }
        });
        showCourse5.add(dustbin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, 40));

        jPanel1.add(showCourse5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 560, 60));

        showCourse6.setOpaque(false);
        showCourse6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpaSem6.setBackground(new java.awt.Color(51, 51, 51));
        gpaSem6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        gpaSem6.setForeground(new java.awt.Color(204, 204, 204));
        gpaSem6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpaSem6.setText("6th Semester GPA");
        gpaSem6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpaSem6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpaSem6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpaSem6FocusLost(evt);
            }
        });
        showCourse6.add(gpaSem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 40));

        totalChSem6.setBackground(new java.awt.Color(51, 51, 51));
        totalChSem6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalChSem6.setForeground(new java.awt.Color(204, 204, 204));
        totalChSem6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalChSem6.setText("Total Credit Hours");
        totalChSem6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totalChSem6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalChSem6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalChSem6FocusLost(evt);
            }
        });
        totalChSem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalChSem6ActionPerformed(evt);
            }
        });
        showCourse6.add(totalChSem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 40));

        dustbin6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin6MouseClicked(evt);
            }
        });
        showCourse6.add(dustbin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, 40));

        jPanel1.add(showCourse6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 560, 60));

        showCourse7.setOpaque(false);
        showCourse7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpaSem7.setBackground(new java.awt.Color(51, 51, 51));
        gpaSem7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        gpaSem7.setForeground(new java.awt.Color(204, 204, 204));
        gpaSem7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpaSem7.setText("7th Semester GPA");
        gpaSem7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpaSem7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpaSem7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpaSem7FocusLost(evt);
            }
        });
        showCourse7.add(gpaSem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 40));

        totalChSem7.setBackground(new java.awt.Color(51, 51, 51));
        totalChSem7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalChSem7.setForeground(new java.awt.Color(204, 204, 204));
        totalChSem7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalChSem7.setText("Total Credit Hours");
        totalChSem7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totalChSem7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalChSem7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalChSem7FocusLost(evt);
            }
        });
        showCourse7.add(totalChSem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 40));

        dustbin7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin7MouseClicked(evt);
            }
        });
        showCourse7.add(dustbin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, 40));

        jPanel1.add(showCourse7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 560, 60));

        showCourse8.setOpaque(false);
        showCourse8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpaSem8.setBackground(new java.awt.Color(51, 51, 51));
        gpaSem8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        gpaSem8.setForeground(new java.awt.Color(204, 204, 204));
        gpaSem8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpaSem8.setText("8th Semester GPA");
        gpaSem8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpaSem8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpaSem8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpaSem8FocusLost(evt);
            }
        });
        showCourse8.add(gpaSem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 40));

        totalChSem8.setBackground(new java.awt.Color(51, 51, 51));
        totalChSem8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalChSem8.setForeground(new java.awt.Color(204, 204, 204));
        totalChSem8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalChSem8.setText("Total Credit Hours");
        totalChSem8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        totalChSem8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalChSem8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalChSem8FocusLost(evt);
            }
        });
        showCourse8.add(totalChSem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 180, 40));

        dustbin8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin8MouseClicked(evt);
            }
        });
        showCourse8.add(dustbin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 40, 40));

        jPanel1.add(showCourse8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 560, 60));

        calculateButtonText.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        calculateButtonText.setForeground(new java.awt.Color(51, 51, 51));
        calculateButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculateButtonText.setText("Calculate");
        calculateButtonText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateButtonTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateButtonTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateButtonTextMouseExited(evt);
            }
        });
        jPanel1.add(calculateButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 170, -1));

        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1) resized.png"))); // NOI18N
        calculateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateButtonMouseExited(evt);
            }
        });
        jPanel1.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, -1, -1));

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
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        prompt.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        prompt.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(prompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        CgpaHeading.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        CgpaHeading.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(CgpaHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        CGPA.setFont(new java.awt.Font("Rockwell", 1, 128)); // NOI18N
        CGPA.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(CGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, -1, -1));

        backgroundOpacity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background50Opacity 1280x720.png"))); // NOI18N
        jPanel1.add(backgroundOpacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mediamodifier-I3HPUolh5hA-unsplash (1) (1).jpg"))); // NOI18N
        jPanel1.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gpaSem1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem1FocusGained
        if (gpaSem1.getText().equals("1st Semester GPA")) {
            gpaSem1.setText("");
        }
    }//GEN-LAST:event_gpaSem1FocusGained

    private void gpaSem1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem1FocusLost
        if (gpaSem1.getText().equals("")) {
            gpaSem1.setText("1st Semester GPA");
        }
    }//GEN-LAST:event_gpaSem1FocusLost

    private void gpaSem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaSem1MouseClicked
        gpaSem1.setFocusable(true);
        gpaSem1.requestFocus();
    }//GEN-LAST:event_gpaSem1MouseClicked

    private void gpaSem2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem2FocusGained
        if (gpaSem2.getText().equals("2nd Semester GPA")) {
            gpaSem2.setText("");
        }
    }//GEN-LAST:event_gpaSem2FocusGained

    private void gpaSem2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem2FocusLost
        if (gpaSem2.getText().equals("")) {
            gpaSem2.setText("2nd Semester GPA");
        }
    }//GEN-LAST:event_gpaSem2FocusLost

    private void gpaSem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaSem2MouseClicked
        gpaSem2.setFocusable(true);
        gpaSem2.requestFocus();
    }//GEN-LAST:event_gpaSem2MouseClicked

    private void totalChSem1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem1FocusGained
        if (totalChSem1.getText().equals("Total Credit Hours")) {
            totalChSem1.setText("");
        }
    }//GEN-LAST:event_totalChSem1FocusGained

    private void totalChSem1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem1FocusLost
        if (totalChSem1.getText().equals("")) {
            totalChSem1.setText("Total Credit Hours");
        }
    }//GEN-LAST:event_totalChSem1FocusLost

    private void totalChSem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalChSem1MouseClicked
        totalChSem1.setFocusable(true);
        totalChSem1.requestFocus();
    }//GEN-LAST:event_totalChSem1MouseClicked

    private void totalChSem2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem2FocusGained
        if (totalChSem2.getText().equals("Total Credit Hours")) {
            totalChSem2.setText("");
        }
    }//GEN-LAST:event_totalChSem2FocusGained

    private void totalChSem2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem2FocusLost
        if (totalChSem2.getText().equals("")) {
            totalChSem2.setText("Total Credit Hours");
        }
    }//GEN-LAST:event_totalChSem2FocusLost

    private void totalChSem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalChSem2MouseClicked
        totalChSem2.setFocusable(true);
        totalChSem2.requestFocus();
    }//GEN-LAST:event_totalChSem2MouseClicked

    private void gpaSem3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem3FocusGained
        if (gpaSem3.getText().equals("3rd Semester GPA")) {
            gpaSem3.setText("");
        }
    }//GEN-LAST:event_gpaSem3FocusGained

    private void gpaSem3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem3FocusLost
        if (gpaSem3.getText().equals("")) {
            gpaSem3.setText("3rd Semester GPA");
        }
    }//GEN-LAST:event_gpaSem3FocusLost

    private void totalChSem3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem3FocusGained
        if (totalChSem3.getText().equals("Total Credit Hours")) {
            totalChSem3.setText("");
        }
    }//GEN-LAST:event_totalChSem3FocusGained

    private void totalChSem3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem3FocusLost
        if (totalChSem3.getText().equals("")) {
            totalChSem3.setText("Total Credit Hours");
        }
    }//GEN-LAST:event_totalChSem3FocusLost

    private void dustbin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin3MouseClicked
        showPanel3(false);
    }//GEN-LAST:event_dustbin3MouseClicked

    private void calculateButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonTextMouseClicked

        double[] gpa = new double[8];
        int[] ch = new int[8];

        double[] credited_gpa = new double[8];

        double totalCgpa = 0;
        int totalCh = 0;

        if (checkFields()) {

            gpa[0] = Double.parseDouble(gpaSem1.getText());
            ch[0] = Integer.parseInt(totalChSem1.getText());
            credited_gpa[0] = gpa[0] * ch[0];

            gpa[1] = Double.parseDouble(gpaSem2.getText());
            ch[1] = Integer.parseInt(totalChSem2.getText());
            credited_gpa[1] = gpa[1] * ch[1];

            if (panel3) {
                gpa[2] = Double.parseDouble(gpaSem3.getText());
                ch[2] = Integer.parseInt(totalChSem3.getText());
                credited_gpa[2] = gpa[2] * ch[2];
            }

            if (panel4) {
                gpa[3] = Double.parseDouble(gpaSem4.getText());
                ch[3] = Integer.parseInt(totalChSem4.getText());
                credited_gpa[3] = gpa[3] * ch[3];
            }
            if (panel5) {
                gpa[4] = Double.parseDouble(gpaSem5.getText());
                ch[4] = Integer.parseInt(totalChSem5.getText());
                credited_gpa[4] = gpa[4] * ch[4];
            }
            if (panel6) {
                gpa[5] = Double.parseDouble(gpaSem6.getText());
                ch[5] = Integer.parseInt(totalChSem6.getText());
                credited_gpa[5] = gpa[5] * ch[5];
            }
            if (panel7) {
                gpa[6] = Double.parseDouble(gpaSem7.getText());
                ch[6] = Integer.parseInt(totalChSem7.getText());
                credited_gpa[6] = gpa[6] * ch[6];
            }
            if (panel8) {
                gpa[7] = Double.parseDouble(gpaSem8.getText());
                ch[7] = Integer.parseInt(totalChSem8.getText());
                credited_gpa[7] = gpa[7] * ch[7];
            }

            for (int i = 0; i < 8; i++) {
                totalCgpa += credited_gpa[i];
                totalCh += ch[i];
            }

            double cgpa = totalCgpa / totalCh;

            CgpaHeading.setText("YOUR CGPA IS: ");
            CGPA.setText(String.format("%.2f", (cgpa)));

            String[] gif0_1 = {"/gif/01_1.gif", "/gif/01_2.gif", "/gif/01_3.gif", "/gif/01_4.gif"};
            String[] gif1_2 = {"/gif/12_1.gif", "/gif/12_2.gif", "/gif/12_3.gif", "/gif/12_4.gif"};
            String[] gif2_3 = {"/gif/23_1.gif", "/gif/23_2.gif", "/gif/23_3.gif", "/gif/23_4.gif"};
            String[] gif3_4 = {"/gif/34_1.gif", "/gif/34_2.gif", "/gif/34_3.gif", "/gif/34_4.gif"};

            int gifChooser = (int) (Math.random() * 3);

            try {
                if ((cgpa > 3.00) && (cgpa < 4.00)) {
                    gif.setIcon(new javax.swing.ImageIcon(getClass().getResource(gif3_4[gifChooser])));
                } else if ((cgpa > 2.00) && (cgpa < 3.00)) {
                    gif.setIcon(new javax.swing.ImageIcon(getClass().getResource(gif2_3[gifChooser])));
                } else if ((cgpa > 1.00) && (cgpa < 2.00)) {
                    gif.setIcon(new javax.swing.ImageIcon(getClass().getResource(gif1_2[gifChooser])));
                } else if (cgpa < 1.00) {
                    gif.setIcon(new javax.swing.ImageIcon(getClass().getResource(gif0_1[gifChooser])));
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No GIF found at given index!");
            }

        } else {
            prompt.setText("Field(s) Empty");
        }
    }//GEN-LAST:event_calculateButtonTextMouseClicked

    private void calculateButtonTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonTextMouseEntered
        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_hover (1) resized.png")));
    }//GEN-LAST:event_calculateButtonTextMouseEntered

    private void calculateButtonTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonTextMouseExited
        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1) resized.png")));
    }//GEN-LAST:event_calculateButtonTextMouseExited

    private void calculateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseEntered
        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_hover (1) resized.png")));
    }//GEN-LAST:event_calculateButtonMouseEntered

    private void calculateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseExited
        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1) resized.png")));
    }//GEN-LAST:event_calculateButtonMouseExited

    private void gpaSem4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem4FocusGained
        if (gpaSem4.getText().equals("4th Semester GPA")) {
            gpaSem4.setText("");
        }
    }//GEN-LAST:event_gpaSem4FocusGained

    private void gpaSem4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem4FocusLost
        if (gpaSem4.getText().equals("")) {
            gpaSem4.setText("4th Semester GPA");
        }
    }//GEN-LAST:event_gpaSem4FocusLost

    private void totalChSem4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem4FocusGained
        if (totalChSem4.getText().equals("Total Credit Hours")) {
            totalChSem4.setText("");
        }
    }//GEN-LAST:event_totalChSem4FocusGained

    private void totalChSem4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem4FocusLost
        if (totalChSem4.getText().equals("")) {
            totalChSem4.setText("Total Credit Hours");
        }
    }//GEN-LAST:event_totalChSem4FocusLost

    private void dustbin4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin4MouseClicked
        showPanel4(false);
    }//GEN-LAST:event_dustbin4MouseClicked

    private void gpaSem5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem5FocusGained
        if (gpaSem5.getText().equals("5th Semester GPA")) {
            gpaSem5.setText("");
        }
    }//GEN-LAST:event_gpaSem5FocusGained

    private void gpaSem5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem5FocusLost
        if (gpaSem5.getText().equals("")) {
            gpaSem5.setText("5th Semester GPA");
        }
    }//GEN-LAST:event_gpaSem5FocusLost

    private void totalChSem5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem5FocusGained
        if (totalChSem5.getText().equals("Total Credit Hours")) {
            totalChSem5.setText("");
        }
    }//GEN-LAST:event_totalChSem5FocusGained

    private void totalChSem5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem5FocusLost
        if (totalChSem5.getText().equals("")) {
            totalChSem5.setText("Total Credit Hours");
        }
    }//GEN-LAST:event_totalChSem5FocusLost

    private void dustbin5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin5MouseClicked
        showPanel5(false);
    }//GEN-LAST:event_dustbin5MouseClicked

    private void gpaSem6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem6FocusGained
        if (gpaSem6.getText().equals("6th Semester GPA")) {
            gpaSem6.setText("");
        }
    }//GEN-LAST:event_gpaSem6FocusGained

    private void gpaSem6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem6FocusLost
        if (gpaSem6.getText().equals("")) {
            gpaSem6.setText("6th Semester GPA");
        }
    }//GEN-LAST:event_gpaSem6FocusLost

    private void totalChSem6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem6FocusGained
        if (totalChSem6.getText().equals("Total Credit Hours")) {
            totalChSem6.setText("");
        }
    }//GEN-LAST:event_totalChSem6FocusGained

    private void totalChSem6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem6FocusLost
        if (totalChSem6.getText().equals("")) {
            totalChSem6.setText("Total Credit Hours");
        }
    }//GEN-LAST:event_totalChSem6FocusLost

    private void dustbin6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin6MouseClicked
        showPanel6(false);
    }//GEN-LAST:event_dustbin6MouseClicked

    private void gpaSem7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem7FocusGained
        if (gpaSem7.getText().equals("7th Semester GPA")) {
            gpaSem7.setText("");
        }
    }//GEN-LAST:event_gpaSem7FocusGained

    private void gpaSem7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem7FocusLost
        if (gpaSem7.getText().equals("")) {
            gpaSem7.setText("7th Semester GPA");
        }
    }//GEN-LAST:event_gpaSem7FocusLost

    private void totalChSem7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem7FocusGained
        if (totalChSem7.getText().equals("Total Credit Hours")) {
            totalChSem7.setText("");
        }
    }//GEN-LAST:event_totalChSem7FocusGained

    private void totalChSem7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem7FocusLost
        if (totalChSem7.getText().equals("")) {
            totalChSem7.setText("Total Credit Hours");
        }
    }//GEN-LAST:event_totalChSem7FocusLost

    private void dustbin7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin7MouseClicked
        showPanel7(false);
    }//GEN-LAST:event_dustbin7MouseClicked

    private void gpaSem8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem8FocusGained
        if (gpaSem8.getText().equals("8th Semester GPA")) {
            gpaSem8.setText("");
        }
    }//GEN-LAST:event_gpaSem8FocusGained

    private void gpaSem8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpaSem8FocusLost
        if (gpaSem8.getText().equals("")) {
            gpaSem8.setText("8th Semester GPA");
        }
    }//GEN-LAST:event_gpaSem8FocusLost

    private void totalChSem8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem8FocusGained
        if (totalChSem8.getText().equals("Total Credit Hours")) {
            totalChSem8.setText("");
        }
    }//GEN-LAST:event_totalChSem8FocusGained

    private void totalChSem8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalChSem8FocusLost
        if (totalChSem8.getText().equals("")) {
            totalChSem8.setText("Total Credit Hours");
        }
    }//GEN-LAST:event_totalChSem8FocusLost

    private void dustbin8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin8MouseClicked
        showPanel8(false);
    }//GEN-LAST:event_dustbin8MouseClicked

    private void showButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButton3MouseClicked
        showPanel3(true);
    }//GEN-LAST:event_showButton3MouseClicked

    private void totalChSem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalChSem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalChSem6ActionPerformed

    private void showButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButton4MouseClicked
        showPanel4(true);
    }//GEN-LAST:event_showButton4MouseClicked

    private void showButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButton5MouseClicked
        showPanel5(true);
    }//GEN-LAST:event_showButton5MouseClicked

    private void showButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButton6MouseClicked
        showPanel6(true);
    }//GEN-LAST:event_showButton6MouseClicked

    private void showButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButton7MouseClicked
        showPanel7(true);
    }//GEN-LAST:event_showButton7MouseClicked

    private void showButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButton8MouseClicked
        showPanel8(true);
    }//GEN-LAST:event_showButton8MouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        new MainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aaaa1.png")));
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aaaa.png")));
    }//GEN-LAST:event_backButtonMouseExited

    private boolean checkFields() {
        if (gpaSem1.getText().equals("Course Name") || gpaSem1.getText().equals("")) {
            return false;
        }
        if (gpaSem2.getText().equals("Course Name") || gpaSem2.getText().equals("")) {
            return false;
        }
        if ((panel3) && (gpaSem3.getText().equals("Course Name") || gpaSem3.getText().equals(""))) {
            return false;
        }
        if ((panel4) && (gpaSem4.getText().equals("Course Name") || gpaSem4.getText().equals(""))) {
            return false;
        }
        if ((panel5) && (gpaSem5.getText().equals("Course Name") || gpaSem5.getText().equals(""))) {
            return false;
        }
        if ((panel6) && (gpaSem6.getText().equals("Course Name") || gpaSem6.getText().equals(""))) {
            return false;
        }
        if ((panel7) && (gpaSem7.getText().equals("Course Name") || gpaSem7.getText().equals(""))) {
            return false;
        }
        if ((panel8) && (gpaSem8.getText().equals("Course Name") || gpaSem8.getText().equals(""))) {
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CGPA;
    private javax.swing.JLabel CgpaHeading;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel backgroundOpacity;
    private javax.swing.JLabel calculateButton;
    private javax.swing.JLabel calculateButtonText;
    private javax.swing.JLabel dustbin3;
    private javax.swing.JLabel dustbin4;
    private javax.swing.JLabel dustbin5;
    private javax.swing.JLabel dustbin6;
    private javax.swing.JLabel dustbin7;
    private javax.swing.JLabel dustbin8;
    private javax.swing.JLabel gif;
    private javax.swing.JTextField gpaSem1;
    private javax.swing.JTextField gpaSem2;
    private javax.swing.JTextField gpaSem3;
    private javax.swing.JTextField gpaSem4;
    private javax.swing.JTextField gpaSem5;
    private javax.swing.JTextField gpaSem6;
    private javax.swing.JTextField gpaSem7;
    private javax.swing.JTextField gpaSem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel prompt;
    private javax.swing.JLabel showButton3;
    private javax.swing.JLabel showButton4;
    private javax.swing.JLabel showButton5;
    private javax.swing.JLabel showButton6;
    private javax.swing.JLabel showButton7;
    private javax.swing.JLabel showButton8;
    private javax.swing.JPanel showCourse3;
    private javax.swing.JPanel showCourse4;
    private javax.swing.JPanel showCourse5;
    private javax.swing.JPanel showCourse6;
    private javax.swing.JPanel showCourse7;
    private javax.swing.JPanel showCourse8;
    private javax.swing.JTextField totalChSem1;
    private javax.swing.JTextField totalChSem2;
    private javax.swing.JTextField totalChSem3;
    private javax.swing.JTextField totalChSem4;
    private javax.swing.JTextField totalChSem5;
    private javax.swing.JTextField totalChSem6;
    private javax.swing.JTextField totalChSem7;
    private javax.swing.JTextField totalChSem8;
    // End of variables declaration//GEN-END:variables

}
