package com.ddlab.rnd.group;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class TP1 extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TP1() {
//		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0,0,0,0};
		
		gridBagLayout.rowHeights = new int[]{0, 0,0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0,0,0,Double.MIN_VALUE};
		
		setLayout(gridBagLayout);
		
		
		AiPanel1 p1 = new AiPanel1();
		GridBagConstraints gbc_panel1 = new GridBagConstraints();
		gbc_panel1.insets = new Insets(0, 0, 5, 0);
		gbc_panel1.fill = GridBagConstraints.BOTH;
		gbc_panel1.gridx = 0;
		gbc_panel1.gridy = 0;
		add(p1, gbc_panel1);
//		add(p1);
		
		
//		SnykPanel2 p2 = new SnykPanel2();
//		GridBagConstraints gbc_panel2 = new GridBagConstraints();
//		gbc_panel2.insets = new Insets(0, 0, 5, 0);
//		gbc_panel2.fill = GridBagConstraints.BOTH;
//		gbc_panel2.gridx = 0;
//		gbc_panel2.gridy = 1;
//		add(p2, gbc_panel2);
		
		
		
//		JPanel panel1 = new JPanel();
//		GridBagConstraints gbc_panel1 = new GridBagConstraints();
//		gbc_panel1.insets = new Insets(0, 0, 5, 0);
//		gbc_panel1.fill = GridBagConstraints.BOTH;
//		gbc_panel1.gridx = 0;
//		gbc_panel1.gridy = 0;
//		add(panel1, gbc_panel1);
//		
//		JPanel panel2 = new JPanel();
//		GridBagConstraints gbc_panel2 = new GridBagConstraints();
//		gbc_panel2.insets = new Insets(0, 0, 5, 0);
//		gbc_panel2.fill = GridBagConstraints.BOTH;
//		gbc_panel2.gridx = 0;
//		gbc_panel2.gridy = 1;
//		add(panel2, gbc_panel2);

	}

}
