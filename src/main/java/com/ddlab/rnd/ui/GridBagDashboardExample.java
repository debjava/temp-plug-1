package com.ddlab.rnd.ui;

import javax.swing.*;
import java.awt.*;

public class GridBagDashboardExample extends JFrame {

    public GridBagDashboardExample() {
        setTitle("Dashboard Layout with GridBagLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;

        // Cell [0,0] spanning 2 columns
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(new JButton("Header"), gbc);

        // Cell [0,2] spanning 2 rows
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        panel.add(new JButton("Sidebar"), gbc);

        // Cell [1,0]
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel.add(new JButton("Chart"), gbc);

        // Cell [1,1]
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JButton("Stats"), gbc);

        // Cell [2,0] spanning 3 columns
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        panel.add(new JButton("Main Content"), gbc);

        // Cell [3,0] to [3,3]
        for (int i = 0; i < 4; i++) {
            gbc.gridx = i;
            gbc.gridy = 3;
            gbc.gridwidth = 1;
            panel.add(new JButton("Footer " + (i + 1)), gbc);
        }

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GridBagDashboardExample::new);
    }
}