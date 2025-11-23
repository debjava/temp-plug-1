package com.ddlab.rnd.group;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class SnykPanel2 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextField snykEndPointTxt;
	private JTextField snykTonenTxt;
	
	
	public SnykPanel2() {
		
		setBorder(new TitledBorder(null, "Snyk Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		GridBagLayout gbl_snykDetailsPanel = new GridBagLayout();
		gbl_snykDetailsPanel.columnWidths = new int[]{0, 0, 0};
		gbl_snykDetailsPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_snykDetailsPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_snykDetailsPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_snykDetailsPanel);
		
		
		JLabel snykEndPointLbl = new JLabel("Snyk End Point:");
		GridBagConstraints gbc_snykEndPointLbl = new GridBagConstraints();
		gbc_snykEndPointLbl.insets = new Insets(0, 0, 5, 5);
		gbc_snykEndPointLbl.anchor = GridBagConstraints.EAST;
		gbc_snykEndPointLbl.gridx = 0;
		gbc_snykEndPointLbl.gridy = 0;
		add(snykEndPointLbl, gbc_snykEndPointLbl);
		
		snykEndPointTxt = new JTextField();
		GridBagConstraints gbc_snykEndPointTxt = new GridBagConstraints();
		gbc_snykEndPointTxt.insets = new Insets(0, 0, 5, 5);
		gbc_snykEndPointTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_snykEndPointTxt.gridx = 1;
		gbc_snykEndPointTxt.gridy = 0;
		add(snykEndPointTxt, gbc_snykEndPointTxt);
		snykEndPointTxt.setColumns(10);
		
		
		JLabel snykTokenLbl = new JLabel("Snyk Token:");
		GridBagConstraints gbc_snykTokenLbl = new GridBagConstraints();
		gbc_snykTokenLbl.anchor = GridBagConstraints.EAST;
		gbc_snykTokenLbl.insets = new Insets(0, 0, 5, 5);
		gbc_snykTokenLbl.gridx = 0;
		gbc_snykTokenLbl.gridy = 1;
		add(snykTokenLbl, gbc_snykTokenLbl);
		
		snykTonenTxt = new JTextField();
		GridBagConstraints gbc_snykTonenTxt = new GridBagConstraints();
		gbc_snykTonenTxt.insets = new Insets(0, 0, 5, 5);
		gbc_snykTonenTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_snykTonenTxt.gridx = 1;
		gbc_snykTonenTxt.gridy = 1;
		add(snykTonenTxt, gbc_snykTonenTxt);
		snykTonenTxt.setColumns(10);
		
		JButton snykTestBtn = new JButton("Test");
		GridBagConstraints snyk_gbc_testBtn = new GridBagConstraints();
		snyk_gbc_testBtn.insets = new Insets(0, 0, 5, 0);
		snyk_gbc_testBtn.gridx = 2;
		snyk_gbc_testBtn.gridy = 1;
		add(snykTestBtn, snyk_gbc_testBtn);
		
		JLabel snykInfoLbl = new JLabel("* mark fields are required to fill");
		snykInfoLbl.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_snykInfoLbl = new GridBagConstraints();
		gbc_snykInfoLbl.insets = new Insets(0, 0, 0, 5);
		gbc_snykInfoLbl.gridx = 1;
		gbc_snykInfoLbl.gridy = 4;
		add(snykInfoLbl, gbc_snykInfoLbl);
		
		
	}

}
