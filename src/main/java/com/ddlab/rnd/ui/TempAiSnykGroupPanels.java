package com.ddlab.rnd.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TempAiSnykGroupPanels extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField clientIdTxt;
	private JTextField clientSecretTxt;

	/**
	 * Create the panel.
	 */
	public TempAiSnykGroupPanels() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Panel3 p3 = new Panel3();
		
		
		GridBagConstraints gbc_grp_panel1 = new GridBagConstraints();
		gbc_grp_panel1.gridheight = 4;
		gbc_grp_panel1.insets = new Insets(0, 0, 5, 0);
		gbc_grp_panel1.fill = GridBagConstraints.BOTH;
		gbc_grp_panel1.gridx = 0;
		gbc_grp_panel1.gridy = 0;
		add(p3, gbc_grp_panel1);
		
		
		
		GridBagLayout gbl_grp_panel1 = new GridBagLayout();
		gbl_grp_panel1.columnWidths = new int[]{0, 0, 0};
//		gbl_grp_panel1.rowHeights = new int[]{0, 0, 0,0,0,0,0,0,0};
//		gbl_grp_panel1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
		gbl_grp_panel1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
//		gbl_grp_panel1.rowWeights = new double[]{0, 0, 0,0,0,0,0,0,0};
		gbl_grp_panel1.rowWeights = new double[]{0.0, 0.0};
		p3.setLayout(gbl_grp_panel1);
		p3.setBorder(BorderFactory.createTitledBorder("User Information"));
		
		
//		p3.setLayout(gridBagLayout);
		
//		JPanel grp_panel1 = new JPanel();
//		grp_panel1.setBorder(BorderFactory.createTitledBorder("AI Information"));
//		GridBagConstraints gbc_grp_panel1 = new GridBagConstraints();
//		gbc_grp_panel1.gridheight = 4;
//		gbc_grp_panel1.insets = new Insets(0, 0, 5, 0);
//		gbc_grp_panel1.fill = GridBagConstraints.BOTH;
//		gbc_grp_panel1.gridx = 0;
//		gbc_grp_panel1.gridy = 0;
//		add(grp_panel1, gbc_grp_panel1);
//		
//		GridBagLayout gridBagLayoutP1 = new GridBagLayout();
//		gridBagLayoutP1.columnWidths = new int[]{0, 0};
//		gridBagLayoutP1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
//		gridBagLayoutP1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
//		gridBagLayoutP1.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		grp_panel1.setLayout(gridBagLayoutP1);
		
//		JLabel clientIdLbl = new JLabel("Client Id:");
//		GridBagConstraints gbc_clientIdLbl = new GridBagConstraints();
//		gbc_clientIdLbl.insets = new Insets(0, 0, 5, 5);
//		gbc_clientIdLbl.anchor = GridBagConstraints.EAST;
//		gbc_clientIdLbl.gridx = 0;
//		gbc_clientIdLbl.gridy = 0;
////		add(clientIdLbl, gbc_clientIdLbl);
//		grp_panel1.add(clientIdLbl, gbc_clientIdLbl);
//		
//		clientIdTxt = new JTextField();
//		GridBagConstraints gbc_clientIdTxt = new GridBagConstraints();
//		gbc_clientIdTxt.gridwidth = 3;
//		gbc_clientIdTxt.insets = new Insets(0, 0, 5, 0);
//		gbc_clientIdTxt.fill = GridBagConstraints.HORIZONTAL;
//		gbc_clientIdTxt.gridx = 1;
//		gbc_clientIdTxt.gridy = 0;
//		grp_panel1.add(clientIdTxt, gbc_clientIdTxt);
//		clientIdTxt.setColumns(10);
//		
//		JLabel clientSecretLbl = new JLabel("Client Secret:");
//		GridBagConstraints gbc_clientSecretLbl = new GridBagConstraints();
//		gbc_clientSecretLbl.anchor = GridBagConstraints.EAST;
//		gbc_clientSecretLbl.insets = new Insets(0, 0, 5, 5);
//		gbc_clientSecretLbl.gridx = 0;
//		gbc_clientSecretLbl.gridy = 1;
//		grp_panel1.add(clientSecretLbl, gbc_clientSecretLbl);
//		
//		clientSecretTxt = new JTextField();
//		GridBagConstraints gbc_clientSecretTxt = new GridBagConstraints();
//		gbc_clientSecretTxt.gridwidth = 3;
//		gbc_clientSecretTxt.anchor = GridBagConstraints.BELOW_BASELINE;
//		gbc_clientSecretTxt.insets = new Insets(0, 0, 5, 0);
//		gbc_clientSecretTxt.fill = GridBagConstraints.HORIZONTAL;
//		gbc_clientSecretTxt.gridx = 1;
//		gbc_clientSecretTxt.gridy = 1;
//		grp_panel1.add(clientSecretTxt, gbc_clientSecretTxt);
//		clientSecretTxt.setColumns(10);
		
		
		
		
//		GridBagLayout gbl_grp_panel1 = new GridBagLayout();
//		gbl_grp_panel1.columnWidths = new int[]{0, 0, 0};
////		gbl_grp_panel1.rowHeights = new int[]{0, 0, 0,0,0,0,0,0,0};
////		gbl_grp_panel1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
//		gbl_grp_panel1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
////		gbl_grp_panel1.rowWeights = new double[]{0, 0, 0,0,0,0,0,0,0};
//		gbl_grp_panel1.rowWeights = new double[]{0.0, 0.0};
//		grp_panel1.setLayout(gbl_grp_panel1);
////		grp_panel1.setBorder(BorderFactory.createTitledBorder("User Information"));
		
		
		JPanel grPanel2 = new JPanel();
		grPanel2.setBorder(new TitledBorder(null, "Snyk Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_grPanel2 = new GridBagConstraints();
		gbc_grPanel2.gridheight = 4;
		gbc_grPanel2.insets = new Insets(0, 0, 5, 0);
		gbc_grPanel2.fill = GridBagConstraints.BOTH;
		gbc_grPanel2.gridx = 0;
		gbc_grPanel2.gridy = 4;
		add(grPanel2, gbc_grPanel2);

	}

}
