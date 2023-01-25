package gpapage;

import mainpage.MainFrame;

public final class gpaFrame extends javax.swing.JFrame {

    boolean panel3 = false, panel4 = false, panel5 = false, panel6 = false, panel7 = false, panel8 = false;

    public gpaFrame() {
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

        gpaPanel = new javax.swing.JPanel();
        prompt = new javax.swing.JLabel();
        courseName1 = new javax.swing.JTextField();
        courseName2 = new javax.swing.JTextField();
        obtainedMarks1 = new javax.swing.JTextField();
        obtainedMarks2 = new javax.swing.JTextField();
        totalMarks1 = new javax.swing.JComboBox<>();
        totalMarks2 = new javax.swing.JComboBox<>();
        CreditHours1 = new javax.swing.JComboBox<>();
        CreditHours2 = new javax.swing.JComboBox<>();
        showButton3 = new javax.swing.JLabel();
        showButton4 = new javax.swing.JLabel();
        showButton5 = new javax.swing.JLabel();
        showButton6 = new javax.swing.JLabel();
        showButton7 = new javax.swing.JLabel();
        showButton8 = new javax.swing.JLabel();
        showCourse3 = new javax.swing.JPanel();
        courseName3 = new javax.swing.JTextField();
        obtainedMarks3 = new javax.swing.JTextField();
        totalMarks3 = new javax.swing.JComboBox<>();
        CreditHours3 = new javax.swing.JComboBox<>();
        dustbin3 = new javax.swing.JLabel();
        showCourse4 = new javax.swing.JPanel();
        courseName4 = new javax.swing.JTextField();
        obtainedMarks4 = new javax.swing.JTextField();
        totalMarks4 = new javax.swing.JComboBox<>();
        CreditHours4 = new javax.swing.JComboBox<>();
        dustbin4 = new javax.swing.JLabel();
        showCourse5 = new javax.swing.JPanel();
        obtainedMarks5 = new javax.swing.JTextField();
        courseName5 = new javax.swing.JTextField();
        totalMarks5 = new javax.swing.JComboBox<>();
        CreditHours5 = new javax.swing.JComboBox<>();
        dustbin5 = new javax.swing.JLabel();
        showCourse6 = new javax.swing.JPanel();
        courseName6 = new javax.swing.JTextField();
        obtainedMarks6 = new javax.swing.JTextField();
        totalMarks6 = new javax.swing.JComboBox<>();
        CreditHours6 = new javax.swing.JComboBox<>();
        dustbin6 = new javax.swing.JLabel();
        showCourse7 = new javax.swing.JPanel();
        courseName7 = new javax.swing.JTextField();
        obtainedMarks7 = new javax.swing.JTextField();
        totalMarks7 = new javax.swing.JComboBox<>();
        CreditHours7 = new javax.swing.JComboBox<>();
        dustbin7 = new javax.swing.JLabel();
        showCourse8 = new javax.swing.JPanel();
        courseName8 = new javax.swing.JTextField();
        obtainedMarks8 = new javax.swing.JTextField();
        totalMarks8 = new javax.swing.JComboBox<>();
        CreditHours8 = new javax.swing.JComboBox<>();
        dustbin8 = new javax.swing.JLabel();
        calculateButtonText = new javax.swing.JLabel();
        calculateButton = new javax.swing.JLabel();
        backButtonText = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        backgroundOpacity = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GPA Calculator");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prompt.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        prompt.setForeground(new java.awt.Color(204, 0, 0));
        prompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpaPanel.add(prompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 190, 40));

        courseName1.setBackground(new java.awt.Color(51, 51, 51));
        courseName1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        courseName1.setForeground(new java.awt.Color(204, 204, 204));
        courseName1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseName1.setText("Course Name");
        courseName1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        courseName1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        courseName1.setFocusable(false);
        courseName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                courseName1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                courseName1FocusLost(evt);
            }
        });
        courseName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseName1MouseClicked(evt);
            }
        });
        gpaPanel.add(courseName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 400, 40));

        courseName2.setBackground(new java.awt.Color(51, 51, 51));
        courseName2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        courseName2.setForeground(new java.awt.Color(204, 204, 204));
        courseName2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseName2.setText("Course Name");
        courseName2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        courseName2.setFocusable(false);
        courseName2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                courseName2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                courseName2FocusLost(evt);
            }
        });
        courseName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseName2MouseClicked(evt);
            }
        });
        gpaPanel.add(courseName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 400, 40));

        obtainedMarks1.setBackground(new java.awt.Color(51, 51, 51));
        obtainedMarks1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        obtainedMarks1.setForeground(new java.awt.Color(204, 204, 204));
        obtainedMarks1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        obtainedMarks1.setText("Obtained Marks");
        obtainedMarks1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        obtainedMarks1.setFocusable(false);
        obtainedMarks1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                obtainedMarks1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                obtainedMarks1FocusLost(evt);
            }
        });
        obtainedMarks1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obtainedMarks1MouseClicked(evt);
            }
        });
        gpaPanel.add(obtainedMarks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 150, 40));

        obtainedMarks2.setBackground(new java.awt.Color(51, 51, 51));
        obtainedMarks2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        obtainedMarks2.setForeground(new java.awt.Color(204, 204, 204));
        obtainedMarks2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        obtainedMarks2.setText("Obtained Marks");
        obtainedMarks2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        obtainedMarks2.setFocusable(false);
        obtainedMarks2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                obtainedMarks2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                obtainedMarks2FocusLost(evt);
            }
        });
        obtainedMarks2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obtainedMarks2MouseClicked(evt);
            }
        });
        gpaPanel.add(obtainedMarks2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 150, 40));

        totalMarks1.setBackground(new java.awt.Color(51, 51, 51));
        totalMarks1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalMarks1.setForeground(new java.awt.Color(204, 204, 204));
        totalMarks1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Total Marks", "  50", "  100" }));
        totalMarks1.setFocusable(false);
        totalMarks1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalMarks1MouseClicked(evt);
            }
        });
        totalMarks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMarks1ActionPerformed(evt);
            }
        });
        gpaPanel.add(totalMarks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 140, 40));

        totalMarks2.setBackground(new java.awt.Color(51, 51, 51));
        totalMarks2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalMarks2.setForeground(new java.awt.Color(204, 204, 204));
        totalMarks2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Total Marks", "  50", "  100" }));
        totalMarks2.setFocusable(false);
        totalMarks2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalMarks2MouseClicked(evt);
            }
        });
        totalMarks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMarks2ActionPerformed(evt);
            }
        });
        gpaPanel.add(totalMarks2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 140, 40));

        CreditHours1.setBackground(new java.awt.Color(51, 51, 51));
        CreditHours1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreditHours1.setForeground(new java.awt.Color(204, 204, 204));
        CreditHours1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Credit Hours", "  2+0", "  3+0", "  0+1" }));
        CreditHours1.setFocusable(false);
        CreditHours1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreditHours1MouseClicked(evt);
            }
        });
        CreditHours1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditHours1ActionPerformed(evt);
            }
        });
        gpaPanel.add(CreditHours1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 160, 40));

        CreditHours2.setBackground(new java.awt.Color(51, 51, 51));
        CreditHours2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreditHours2.setForeground(new java.awt.Color(204, 204, 204));
        CreditHours2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Credit Hours", "  2+0", "  3+0", "  0+1" }));
        CreditHours2.setFocusable(false);
        CreditHours2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreditHours2MouseClicked(evt);
            }
        });
        CreditHours2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditHours2ActionPerformed(evt);
            }
        });
        gpaPanel.add(CreditHours2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 160, 40));

        showButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton3MouseClicked(evt);
            }
        });
        gpaPanel.add(showButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 410, 60));

        showButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton4MouseClicked(evt);
            }
        });
        gpaPanel.add(showButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 410, 60));

        showButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton5MouseClicked(evt);
            }
        });
        gpaPanel.add(showButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 410, 60));

        showButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton6MouseClicked(evt);
            }
        });
        gpaPanel.add(showButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 410, 60));

        showButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton7MouseClicked(evt);
            }
        });
        gpaPanel.add(showButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 410, 60));

        showButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_button.png"))); // NOI18N
        showButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButton8MouseClicked(evt);
            }
        });
        gpaPanel.add(showButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 410, 60));

        showCourse3.setOpaque(false);
        showCourse3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseName3.setBackground(new java.awt.Color(51, 51, 51));
        courseName3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        courseName3.setForeground(new java.awt.Color(204, 204, 204));
        courseName3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseName3.setText("Course Name");
        courseName3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        courseName3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                courseName3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                courseName3FocusLost(evt);
            }
        });
        showCourse3.add(courseName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 40));

        obtainedMarks3.setBackground(new java.awt.Color(51, 51, 51));
        obtainedMarks3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        obtainedMarks3.setForeground(new java.awt.Color(204, 204, 204));
        obtainedMarks3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        obtainedMarks3.setText("Obtained Marks");
        obtainedMarks3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        obtainedMarks3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                obtainedMarks3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                obtainedMarks3FocusLost(evt);
            }
        });
        showCourse3.add(obtainedMarks3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, 40));

        totalMarks3.setBackground(new java.awt.Color(51, 51, 51));
        totalMarks3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalMarks3.setForeground(new java.awt.Color(204, 204, 204));
        totalMarks3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Total Marks", "  50", "  100" }));
        totalMarks3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMarks3ActionPerformed(evt);
            }
        });
        showCourse3.add(totalMarks3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 140, 40));

        CreditHours3.setBackground(new java.awt.Color(51, 51, 51));
        CreditHours3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreditHours3.setForeground(new java.awt.Color(204, 204, 204));
        CreditHours3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Credit Hours", "  2+0", "  3+0", "  0+1" }));
        CreditHours3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditHours3ActionPerformed(evt);
            }
        });
        showCourse3.add(CreditHours3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 160, 40));

        dustbin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin3MouseClicked(evt);
            }
        });
        showCourse3.add(dustbin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 40, 40));

        gpaPanel.add(showCourse3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 950, 60));

        showCourse4.setOpaque(false);
        showCourse4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseName4.setBackground(new java.awt.Color(51, 51, 51));
        courseName4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        courseName4.setForeground(new java.awt.Color(204, 204, 204));
        courseName4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseName4.setText("Course Name");
        courseName4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        courseName4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                courseName4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                courseName4FocusLost(evt);
            }
        });
        showCourse4.add(courseName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 40));

        obtainedMarks4.setBackground(new java.awt.Color(51, 51, 51));
        obtainedMarks4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        obtainedMarks4.setForeground(new java.awt.Color(204, 204, 204));
        obtainedMarks4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        obtainedMarks4.setText("Obtained Marks");
        obtainedMarks4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        obtainedMarks4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                obtainedMarks4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                obtainedMarks4FocusLost(evt);
            }
        });
        showCourse4.add(obtainedMarks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, 40));

        totalMarks4.setBackground(new java.awt.Color(51, 51, 51));
        totalMarks4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalMarks4.setForeground(new java.awt.Color(204, 204, 204));
        totalMarks4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Total Marks", "  50", "  100" }));
        totalMarks4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMarks4ActionPerformed(evt);
            }
        });
        showCourse4.add(totalMarks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 140, 40));

        CreditHours4.setBackground(new java.awt.Color(51, 51, 51));
        CreditHours4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreditHours4.setForeground(new java.awt.Color(204, 204, 204));
        CreditHours4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Credit Hours", "  2+0", "  3+0", "  0+1" }));
        CreditHours4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditHours4ActionPerformed(evt);
            }
        });
        showCourse4.add(CreditHours4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 160, 40));

        dustbin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin4MouseClicked(evt);
            }
        });
        showCourse4.add(dustbin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 40, 40));

        gpaPanel.add(showCourse4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 950, 60));

        showCourse5.setOpaque(false);
        showCourse5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        obtainedMarks5.setBackground(new java.awt.Color(51, 51, 51));
        obtainedMarks5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        obtainedMarks5.setForeground(new java.awt.Color(204, 204, 204));
        obtainedMarks5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        obtainedMarks5.setText("Obtained Marks");
        obtainedMarks5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        obtainedMarks5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                obtainedMarks5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                obtainedMarks5FocusLost(evt);
            }
        });
        showCourse5.add(obtainedMarks5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 150, 40));

        courseName5.setBackground(new java.awt.Color(51, 51, 51));
        courseName5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        courseName5.setForeground(new java.awt.Color(204, 204, 204));
        courseName5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseName5.setText("Course Name");
        courseName5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        courseName5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                courseName5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                courseName5FocusLost(evt);
            }
        });
        showCourse5.add(courseName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 40));

        totalMarks5.setBackground(new java.awt.Color(51, 51, 51));
        totalMarks5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalMarks5.setForeground(new java.awt.Color(204, 204, 204));
        totalMarks5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Total Marks", "  50", "  100" }));
        totalMarks5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMarks5ActionPerformed(evt);
            }
        });
        showCourse5.add(totalMarks5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 40));

        CreditHours5.setBackground(new java.awt.Color(51, 51, 51));
        CreditHours5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreditHours5.setForeground(new java.awt.Color(204, 204, 204));
        CreditHours5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Credit Hours", "  2+0", "  3+0", "  0+1" }));
        CreditHours5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditHours5ActionPerformed(evt);
            }
        });
        showCourse5.add(CreditHours5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 160, 40));

        dustbin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin5MouseClicked(evt);
            }
        });
        showCourse5.add(dustbin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 40, 40));

        gpaPanel.add(showCourse5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 940, 60));

        showCourse6.setOpaque(false);
        showCourse6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseName6.setBackground(new java.awt.Color(51, 51, 51));
        courseName6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        courseName6.setForeground(new java.awt.Color(204, 204, 204));
        courseName6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseName6.setText("Course Name");
        courseName6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        courseName6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                courseName6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                courseName6FocusLost(evt);
            }
        });
        showCourse6.add(courseName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        obtainedMarks6.setBackground(new java.awt.Color(51, 51, 51));
        obtainedMarks6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        obtainedMarks6.setForeground(new java.awt.Color(204, 204, 204));
        obtainedMarks6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        obtainedMarks6.setText("Obtained Marks");
        obtainedMarks6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        obtainedMarks6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                obtainedMarks6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                obtainedMarks6FocusLost(evt);
            }
        });
        showCourse6.add(obtainedMarks6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 150, 40));

        totalMarks6.setBackground(new java.awt.Color(51, 51, 51));
        totalMarks6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalMarks6.setForeground(new java.awt.Color(204, 204, 204));
        totalMarks6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Total Marks", "  50", "  100" }));
        totalMarks6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMarks6ActionPerformed(evt);
            }
        });
        showCourse6.add(totalMarks6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 140, 40));

        CreditHours6.setBackground(new java.awt.Color(51, 51, 51));
        CreditHours6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreditHours6.setForeground(new java.awt.Color(204, 204, 204));
        CreditHours6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Credit Hours", "  2+0", "  3+0", "  0+1" }));
        CreditHours6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditHours6ActionPerformed(evt);
            }
        });
        showCourse6.add(CreditHours6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 160, 40));

        dustbin6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin6MouseClicked(evt);
            }
        });
        showCourse6.add(dustbin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        gpaPanel.add(showCourse6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 940, 50));

        showCourse7.setOpaque(false);
        showCourse7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseName7.setBackground(new java.awt.Color(51, 51, 51));
        courseName7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        courseName7.setForeground(new java.awt.Color(204, 204, 204));
        courseName7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseName7.setText("Course Name");
        courseName7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        courseName7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                courseName7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                courseName7FocusLost(evt);
            }
        });
        showCourse7.add(courseName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 40));

        obtainedMarks7.setBackground(new java.awt.Color(51, 51, 51));
        obtainedMarks7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        obtainedMarks7.setForeground(new java.awt.Color(204, 204, 204));
        obtainedMarks7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        obtainedMarks7.setText("Obtained Marks");
        obtainedMarks7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        obtainedMarks7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                obtainedMarks7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                obtainedMarks7FocusLost(evt);
            }
        });
        showCourse7.add(obtainedMarks7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 150, 40));

        totalMarks7.setBackground(new java.awt.Color(51, 51, 51));
        totalMarks7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalMarks7.setForeground(new java.awt.Color(204, 204, 204));
        totalMarks7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Total Marks", "  50", "  100" }));
        totalMarks7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMarks7ActionPerformed(evt);
            }
        });
        showCourse7.add(totalMarks7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 140, 40));

        CreditHours7.setBackground(new java.awt.Color(51, 51, 51));
        CreditHours7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreditHours7.setForeground(new java.awt.Color(204, 204, 204));
        CreditHours7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Credit Hours", "  2+0", "  3+0", "  0+1" }));
        CreditHours7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditHours7ActionPerformed(evt);
            }
        });
        showCourse7.add(CreditHours7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 160, 40));

        dustbin7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin7MouseClicked(evt);
            }
        });
        showCourse7.add(dustbin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 40, 40));

        gpaPanel.add(showCourse7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 940, 60));

        showCourse8.setOpaque(false);
        showCourse8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseName8.setBackground(new java.awt.Color(51, 51, 51));
        courseName8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        courseName8.setForeground(new java.awt.Color(204, 204, 204));
        courseName8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseName8.setText("Course Name");
        courseName8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        courseName8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                courseName8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                courseName8FocusLost(evt);
            }
        });
        showCourse8.add(courseName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 40));

        obtainedMarks8.setBackground(new java.awt.Color(51, 51, 51));
        obtainedMarks8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        obtainedMarks8.setForeground(new java.awt.Color(204, 204, 204));
        obtainedMarks8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        obtainedMarks8.setText("Obtained Marks");
        obtainedMarks8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        obtainedMarks8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                obtainedMarks8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                obtainedMarks8FocusLost(evt);
            }
        });
        showCourse8.add(obtainedMarks8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, 40));

        totalMarks8.setBackground(new java.awt.Color(51, 51, 51));
        totalMarks8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        totalMarks8.setForeground(new java.awt.Color(204, 204, 204));
        totalMarks8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Total Marks", "  50", "  100" }));
        totalMarks8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMarks8ActionPerformed(evt);
            }
        });
        showCourse8.add(totalMarks8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 140, 40));

        CreditHours8.setBackground(new java.awt.Color(51, 51, 51));
        CreditHours8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        CreditHours8.setForeground(new java.awt.Color(204, 204, 204));
        CreditHours8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Credit Hours", "  2+0", "  3+0", "  0+1" }));
        CreditHours8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditHours8ActionPerformed(evt);
            }
        });
        showCourse8.add(CreditHours8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 160, 40));

        dustbin8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash-solid (2).png"))); // NOI18N
        dustbin8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dustbin8MouseClicked(evt);
            }
        });
        showCourse8.add(dustbin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 40, 40));

        gpaPanel.add(showCourse8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 950, 60));

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
        gpaPanel.add(calculateButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 170, -1));

        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1) resized.png"))); // NOI18N
        calculateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateButtonMouseExited(evt);
            }
        });
        gpaPanel.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, -1, -1));

        backButtonText.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        backButtonText.setForeground(new java.awt.Color(51, 51, 51));
        backButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButtonText.setText("Back");
        backButtonText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonTextMouseExited(evt);
            }
        });
        gpaPanel.add(backButtonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 170, -1));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1) resized.png"))); // NOI18N
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
        gpaPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        backgroundOpacity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background50Opacity 1280x720.png"))); // NOI18N
        gpaPanel.add(backgroundOpacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mediamodifier-I3HPUolh5hA-unsplash (1) (1).jpg"))); // NOI18N
        gpaPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(gpaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void courseName1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName1FocusGained
        if (courseName1.getText().equals("Course Name")) {
            courseName1.setText("");
        }
    }//GEN-LAST:event_courseName1FocusGained

    private void courseName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName1FocusLost
        if (courseName1.getText().equals("")) {
            courseName1.setText("Course Name");
        }
    }//GEN-LAST:event_courseName1FocusLost

    private void courseName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseName1MouseClicked
        courseName1.setFocusable(true);
        courseName1.requestFocus();

    }//GEN-LAST:event_courseName1MouseClicked

    private void totalMarks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMarks1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMarks1ActionPerformed

    private void totalMarks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMarks2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMarks2ActionPerformed

    private void totalMarks3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMarks3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMarks3ActionPerformed

    private void totalMarks4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMarks4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMarks4ActionPerformed

    private void totalMarks5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMarks5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMarks5ActionPerformed

    private void totalMarks6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMarks6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMarks6ActionPerformed

    private void totalMarks7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMarks7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMarks7ActionPerformed

    private void totalMarks8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMarks8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMarks8ActionPerformed

    private void CreditHours1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditHours1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditHours1ActionPerformed

    private void CreditHours2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditHours2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditHours2ActionPerformed

    private void CreditHours3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditHours3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditHours3ActionPerformed

    private void CreditHours4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditHours4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditHours4ActionPerformed

    private void CreditHours5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditHours5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditHours5ActionPerformed

    private void CreditHours6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditHours6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditHours6ActionPerformed

    private void CreditHours7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditHours7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditHours7ActionPerformed

    private void CreditHours8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditHours8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditHours8ActionPerformed

    private void courseName2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseName2MouseClicked
        courseName2.setFocusable(true);
        courseName2.requestFocus();
    }//GEN-LAST:event_courseName2MouseClicked

    private void obtainedMarks1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obtainedMarks1MouseClicked
        obtainedMarks1.setFocusable(true);
        obtainedMarks1.requestFocus();
    }//GEN-LAST:event_obtainedMarks1MouseClicked

    private void obtainedMarks2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obtainedMarks2MouseClicked
        obtainedMarks2.setFocusable(true);
        obtainedMarks2.requestFocus();
    }//GEN-LAST:event_obtainedMarks2MouseClicked

    private void totalMarks1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMarks1MouseClicked
        totalMarks1.setFocusable(true);
        totalMarks1.requestFocus();
    }//GEN-LAST:event_totalMarks1MouseClicked

    private void totalMarks2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMarks2MouseClicked
        totalMarks2.setFocusable(true);
        totalMarks2.requestFocus();
    }//GEN-LAST:event_totalMarks2MouseClicked

    private void CreditHours1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreditHours1MouseClicked
        CreditHours1.setFocusable(true);
        CreditHours1.requestFocus();
    }//GEN-LAST:event_CreditHours1MouseClicked

    private void CreditHours2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreditHours2MouseClicked
        CreditHours2.setFocusable(true);
        CreditHours2.requestFocus();
    }//GEN-LAST:event_CreditHours2MouseClicked

    private void obtainedMarks1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks1FocusGained
        if (obtainedMarks1.getText().equals("Obtained Marks")) {
            obtainedMarks1.setText("");
        }
    }//GEN-LAST:event_obtainedMarks1FocusGained

    private void courseName2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName2FocusGained
        if (courseName2.getText().equals("Course Name")) {
            courseName2.setText("");
        }
    }//GEN-LAST:event_courseName2FocusGained

    private void obtainedMarks2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks2FocusGained
        if (obtainedMarks2.getText().equals("Obtained Marks")) {
            obtainedMarks2.setText("");
        }
    }//GEN-LAST:event_obtainedMarks2FocusGained

    private void courseName3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName3FocusGained
        if (courseName3.getText().equals("Course Name")) {
            courseName3.setText("");
        }
    }//GEN-LAST:event_courseName3FocusGained

    private void obtainedMarks3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks3FocusGained
        if (obtainedMarks3.getText().equals("Obtained Marks")) {
            obtainedMarks3.setText("");
        }
    }//GEN-LAST:event_obtainedMarks3FocusGained

    private void courseName4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName4FocusGained
        if (courseName4.getText().equals("Course Name")) {
            courseName4.setText("");
        }
    }//GEN-LAST:event_courseName4FocusGained

    private void obtainedMarks4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks4FocusGained
        if (obtainedMarks4.getText().equals("Obtained Marks")) {
            obtainedMarks4.setText("");
        }
    }//GEN-LAST:event_obtainedMarks4FocusGained

    private void courseName5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName5FocusGained
        if (courseName5.getText().equals("Course Name")) {
            courseName5.setText("");
        }
    }//GEN-LAST:event_courseName5FocusGained

    private void obtainedMarks5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks5FocusGained
        if (obtainedMarks5.getText().equals("Obtained Marks")) {
            obtainedMarks5.setText("");
        }
    }//GEN-LAST:event_obtainedMarks5FocusGained

    private void courseName6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName6FocusGained
        if (courseName6.getText().equals("Course Name")) {
            courseName6.setText("");
        }
    }//GEN-LAST:event_courseName6FocusGained

    private void obtainedMarks6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks6FocusGained
        if (obtainedMarks6.getText().equals("Obtained Marks")) {
            obtainedMarks6.setText("");
        }
    }//GEN-LAST:event_obtainedMarks6FocusGained

    private void courseName7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName7FocusGained
        if (courseName7.getText().equals("Course Name")) {
            courseName7.setText("");
        }
    }//GEN-LAST:event_courseName7FocusGained

    private void obtainedMarks7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks7FocusGained
        if (obtainedMarks7.getText().equals("Obtained Marks")) {
            obtainedMarks7.setText("");
        }
    }//GEN-LAST:event_obtainedMarks7FocusGained

    private void courseName8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName8FocusGained
        if (courseName8.getText().equals("Course Name")) {
            courseName8.setText("");
        }
    }//GEN-LAST:event_courseName8FocusGained

    private void obtainedMarks8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks8FocusGained
        if (obtainedMarks8.getText().equals("Obtained Marks")) {
            obtainedMarks8.setText("");
        }
    }//GEN-LAST:event_obtainedMarks8FocusGained

    private void obtainedMarks1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks1FocusLost
        if (obtainedMarks1.getText().equals("")) {
            obtainedMarks1.setText("Obtained Marks");
        }
    }//GEN-LAST:event_obtainedMarks1FocusLost

    private void courseName2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName2FocusLost
        if (courseName2.getText().equals("")) {
            courseName2.setText("Course Name");
        }
    }//GEN-LAST:event_courseName2FocusLost

    private void obtainedMarks2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks2FocusLost
        if (obtainedMarks2.getText().equals("")) {
            obtainedMarks2.setText("Obtained Marks");
        }
    }//GEN-LAST:event_obtainedMarks2FocusLost

    private void courseName3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName3FocusLost
        if (courseName3.getText().equals("")) {
            courseName3.setText("Course Name");
        }
    }//GEN-LAST:event_courseName3FocusLost

    private void obtainedMarks3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks3FocusLost
        if (obtainedMarks3.getText().equals("")) {
            obtainedMarks3.setText("Obtained Marks");
        }
    }//GEN-LAST:event_obtainedMarks3FocusLost

    private void courseName4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName4FocusLost
        if (courseName4.getText().equals("")) {
            courseName4.setText("Course Name");
        }
    }//GEN-LAST:event_courseName4FocusLost

    private void obtainedMarks4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks4FocusLost
        if (obtainedMarks4.getText().equals("")) {
            obtainedMarks4.setText("Obtained Marks");
        }
    }//GEN-LAST:event_obtainedMarks4FocusLost

    private void courseName5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName5FocusLost
        if (courseName5.getText().equals("")) {
            courseName5.setText("Course Name");
        }
    }//GEN-LAST:event_courseName5FocusLost

    private void obtainedMarks5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks5FocusLost
        if (obtainedMarks5.getText().equals("")) {
            obtainedMarks5.setText("Obtained Marks");
        }
    }//GEN-LAST:event_obtainedMarks5FocusLost

    private void courseName6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName6FocusLost
        if (courseName6.getText().equals("")) {
            courseName6.setText("Course Name");
        }
    }//GEN-LAST:event_courseName6FocusLost

    private void obtainedMarks6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks6FocusLost
        if (obtainedMarks6.getText().equals("")) {
            obtainedMarks6.setText("Obtained Marks");
        }
    }//GEN-LAST:event_obtainedMarks6FocusLost

    private void courseName7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName7FocusLost
        if (courseName7.getText().equals("")) {
            courseName7.setText("Course Name");
        }
    }//GEN-LAST:event_courseName7FocusLost

    private void obtainedMarks7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks7FocusLost
        if (obtainedMarks7.getText().equals("")) {
            obtainedMarks7.setText("Obtained Marks");
        }
    }//GEN-LAST:event_obtainedMarks7FocusLost

    private void courseName8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_courseName8FocusLost
        if (courseName8.getText().equals("")) {
            courseName8.setText("Course Name");
        }
    }//GEN-LAST:event_courseName8FocusLost

    private void obtainedMarks8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_obtainedMarks8FocusLost
        if (obtainedMarks8.getText().equals("")) {
            obtainedMarks8.setText("Obtained Marks");
        }
    }//GEN-LAST:event_obtainedMarks8FocusLost

    private void dustbin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin3MouseClicked
        showPanel3(false);
    }//GEN-LAST:event_dustbin3MouseClicked

    private void dustbin4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin4MouseClicked
        showPanel4(false);
    }//GEN-LAST:event_dustbin4MouseClicked

    private void dustbin5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin5MouseClicked
        showPanel5(false);
    }//GEN-LAST:event_dustbin5MouseClicked

    private void dustbin6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin6MouseClicked
        showPanel6(false);
    }//GEN-LAST:event_dustbin6MouseClicked

    private void dustbin7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin7MouseClicked
        showPanel7(false);
    }//GEN-LAST:event_dustbin7MouseClicked

    private void dustbin8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dustbin8MouseClicked
        showPanel8(false);
    }//GEN-LAST:event_dustbin8MouseClicked

    private void showButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButton3MouseClicked
        showPanel3(true);
    }//GEN-LAST:event_showButton3MouseClicked

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

    private void calculateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseEntered
        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_hover (1) resized.png")));
    }//GEN-LAST:event_calculateButtonMouseEntered

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_hover (1) resized.png")));
    }//GEN-LAST:event_backButtonMouseEntered

    private void calculateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseExited
        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1) resized.png")));
    }//GEN-LAST:event_calculateButtonMouseExited

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1) resized.png")));
    }//GEN-LAST:event_backButtonMouseExited

    private void backButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonTextMouseClicked
        dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_backButtonTextMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    private void backButtonTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonTextMouseEntered
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_hover (1) resized.png")));
    }//GEN-LAST:event_backButtonTextMouseEntered

    private void backButtonTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonTextMouseExited
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1) resized.png")));
    }//GEN-LAST:event_backButtonTextMouseExited

    private void calculateButtonTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonTextMouseEntered
        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_hover (1) resized.png")));
    }//GEN-LAST:event_calculateButtonTextMouseEntered

    private void calculateButtonTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonTextMouseExited
        calculateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (1) resized.png")));
    }//GEN-LAST:event_calculateButtonTextMouseExited

    private void calculateButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonTextMouseClicked

        if (checkFields()) {
            reportData data = reportData.getInstance();

            data.courseNames[0] = courseName1.getText();
            data.courseNames[1] = courseName2.getText();

            data.obtainedMarks[0] = Integer.parseInt(obtainedMarks1.getText());
            data.obtainedMarks[1] = Integer.parseInt(obtainedMarks2.getText());

            data.totalMarks[0] = getMarks(totalMarks1.getSelectedItem());
            data.totalMarks[1] = getMarks(totalMarks2.getSelectedItem());

            data.creditHours[0] = getCreditHours(CreditHours1.getSelectedItem());
            data.creditHours[1] = getCreditHours(CreditHours2.getSelectedItem());

            if (panel3) {
                data.courseNames[2] = courseName3.getText();
                data.obtainedMarks[2] = Integer.parseInt(obtainedMarks3.getText());
                data.totalMarks[2] = getMarks(totalMarks3.getSelectedItem());
                data.creditHours[2] = getCreditHours(CreditHours3.getSelectedItem());
            }

            if (panel4) {
                data.courseNames[3] = courseName4.getText();
                data.obtainedMarks[3] = Integer.parseInt(obtainedMarks4.getText());
                data.totalMarks[3] = getMarks(totalMarks4.getSelectedItem());
                data.creditHours[3] = getCreditHours(CreditHours4.getSelectedItem());
            }
            if (panel5) {
                data.courseNames[4] = courseName5.getText();
                data.obtainedMarks[4] = Integer.parseInt(obtainedMarks5.getText());
                data.totalMarks[4] = getMarks(totalMarks5.getSelectedItem());
                data.creditHours[4] = getCreditHours(CreditHours5.getSelectedItem());
            }
            if (panel6) {
                data.courseNames[5] = courseName6.getText();
                data.obtainedMarks[5] = Integer.parseInt(obtainedMarks6.getText());
                data.totalMarks[5] = getMarks(totalMarks6.getSelectedItem());
                data.creditHours[5] = getCreditHours(CreditHours6.getSelectedItem());
            }
            if (panel7) {
                data.courseNames[6] = courseName7.getText();
                data.obtainedMarks[6] = Integer.parseInt(obtainedMarks7.getText());
                data.totalMarks[6] = getMarks(totalMarks7.getSelectedItem());
                data.creditHours[6] = getCreditHours(CreditHours7.getSelectedItem());
            }
            if (panel8) {
                data.courseNames[7] = courseName8.getText();
                data.obtainedMarks[7] = Integer.parseInt(obtainedMarks8.getText());
                data.totalMarks[7] = getMarks(totalMarks8.getSelectedItem());
                data.creditHours[7] = getCreditHours(CreditHours8.getSelectedItem());
            }

            new gpaReport().setVisible(true);
            dispose();

        } else {
            prompt.setText("Field(s) Empty");
        }

    }//GEN-LAST:event_calculateButtonTextMouseClicked

    private boolean checkFields() {
        if (courseName1.getText().equals("Course Name") || courseName1.getText().equals("")) {
            return false;
        }
        if (courseName2.getText().equals("Course Name") || courseName2.getText().equals("")) {
            return false;
        }
        if ((panel3) && (courseName3.getText().equals("Course Name") || courseName3.getText().equals(""))) {
            return false;
        }
        if ((panel4) && (courseName4.getText().equals("Course Name") || courseName4.getText().equals(""))) {
            return false;
        }
        if ((panel5) && (courseName5.getText().equals("Course Name") || courseName5.getText().equals(""))) {
            return false;
        }
        if ((panel6) && (courseName6.getText().equals("Course Name") || courseName6.getText().equals(""))) {
            return false;
        }
        if ((panel7) && (courseName7.getText().equals("Course Name") || courseName7.getText().equals(""))) {
            return false;
        }
        if ((panel8) && (courseName8.getText().equals("Course Name") || courseName8.getText().equals(""))) {
            return false;
        }

        return true;
    }

    private int getCreditHours(Object ob) {
        String stringify = String.valueOf(ob);
        int num1 = Integer.parseInt(stringify.substring(2, 3));
        int num2 = Integer.parseInt(stringify.substring(4, 5));

        return num1 + num2;
    }

    private int getMarks(Object ob) {

        String stringify = String.valueOf(ob);
        int num = Integer.parseInt(stringify.substring(2));

        return num;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CreditHours1;
    private javax.swing.JComboBox<String> CreditHours2;
    private javax.swing.JComboBox<String> CreditHours3;
    private javax.swing.JComboBox<String> CreditHours4;
    private javax.swing.JComboBox<String> CreditHours5;
    private javax.swing.JComboBox<String> CreditHours6;
    private javax.swing.JComboBox<String> CreditHours7;
    private javax.swing.JComboBox<String> CreditHours8;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backButtonText;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel backgroundOpacity;
    private javax.swing.JLabel calculateButton;
    private javax.swing.JLabel calculateButtonText;
    private javax.swing.JTextField courseName1;
    private javax.swing.JTextField courseName2;
    private javax.swing.JTextField courseName3;
    private javax.swing.JTextField courseName4;
    private javax.swing.JTextField courseName5;
    private javax.swing.JTextField courseName6;
    private javax.swing.JTextField courseName7;
    private javax.swing.JTextField courseName8;
    private javax.swing.JLabel dustbin3;
    private javax.swing.JLabel dustbin4;
    private javax.swing.JLabel dustbin5;
    private javax.swing.JLabel dustbin6;
    private javax.swing.JLabel dustbin7;
    private javax.swing.JLabel dustbin8;
    private javax.swing.JPanel gpaPanel;
    private javax.swing.JTextField obtainedMarks1;
    private javax.swing.JTextField obtainedMarks2;
    private javax.swing.JTextField obtainedMarks3;
    private javax.swing.JTextField obtainedMarks4;
    private javax.swing.JTextField obtainedMarks5;
    private javax.swing.JTextField obtainedMarks6;
    private javax.swing.JTextField obtainedMarks7;
    private javax.swing.JTextField obtainedMarks8;
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
    private javax.swing.JComboBox<String> totalMarks1;
    private javax.swing.JComboBox<String> totalMarks2;
    private javax.swing.JComboBox<String> totalMarks3;
    private javax.swing.JComboBox<String> totalMarks4;
    private javax.swing.JComboBox<String> totalMarks5;
    private javax.swing.JComboBox<String> totalMarks6;
    private javax.swing.JComboBox<String> totalMarks7;
    private javax.swing.JComboBox<String> totalMarks8;
    // End of variables declaration//GEN-END:variables
}
