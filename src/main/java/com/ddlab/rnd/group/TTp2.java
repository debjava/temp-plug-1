package com.ddlab.rnd.group;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

public class TTp2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField clientIdTxt;
	private JTextField clientSecretTxt;
	private JTextField oauthEndPointTxt;
	private JTextField llmApiEndPointTxt;
	private JTextField snykEndPointTxt;
	private JTextField snykTonenTxt;

	/**
	 * Create the panel.
	 */
	public TTp2() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0};
		gridBagLayout.rowHeights = new int[] {0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel aiDetailsPanel = new JPanel();
		
		aiDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "AI Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_aiDetailsPanel = new GridBagConstraints();
		gbc_aiDetailsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_aiDetailsPanel.fill = GridBagConstraints.BOTH;
		gbc_aiDetailsPanel.gridx = 0;
		gbc_aiDetailsPanel.gridy = 0;
		add(aiDetailsPanel, gbc_aiDetailsPanel);
		
		GridBagLayout gbl_aiDetailsPanel = new GridBagLayout();
		gbl_aiDetailsPanel.columnWidths = new int[]{0, 0, 0};
		gbl_aiDetailsPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_aiDetailsPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_aiDetailsPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		aiDetailsPanel.setLayout(gbl_aiDetailsPanel);
		
		JLabel clienIdLbl = new JLabel("Client Id:");
		GridBagConstraints gbc_clienIdLbl = new GridBagConstraints();
		gbc_clienIdLbl.insets = new Insets(0, 0, 5, 5);
		gbc_clienIdLbl.anchor = GridBagConstraints.EAST;
		gbc_clienIdLbl.gridx = 0;
		gbc_clienIdLbl.gridy = 0;
		aiDetailsPanel.add(clienIdLbl, gbc_clienIdLbl);
		
		clientIdTxt = new JTextField();
		GridBagConstraints gbc_clientIdTxt = new GridBagConstraints();
		gbc_clientIdTxt.insets = new Insets(0, 0, 5, 5);
		gbc_clientIdTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_clientIdTxt.gridx = 1;
		gbc_clientIdTxt.gridy = 0;
		aiDetailsPanel.add(clientIdTxt, gbc_clientIdTxt);
		clientIdTxt.setColumns(10);
		
		JLabel clientSecretLbl = new JLabel("Client Secret:");
		GridBagConstraints gbc_clientSecretLbl = new GridBagConstraints();
		gbc_clientSecretLbl.anchor = GridBagConstraints.EAST;
		gbc_clientSecretLbl.insets = new Insets(0, 0, 5, 5);
		gbc_clientSecretLbl.gridx = 0;
		gbc_clientSecretLbl.gridy = 1;
		aiDetailsPanel.add(clientSecretLbl, gbc_clientSecretLbl);
		
		clientSecretTxt = new JTextField();
		GridBagConstraints gbc_clientSecretTxt = new GridBagConstraints();
		gbc_clientSecretTxt.insets = new Insets(0, 0, 5, 5);
		gbc_clientSecretTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_clientSecretTxt.gridx = 1;
		gbc_clientSecretTxt.gridy = 1;
		aiDetailsPanel.add(clientSecretTxt, gbc_clientSecretTxt);
		clientSecretTxt.setColumns(10);
		
		JLabel oauthLbl = new JLabel("OAuth End Point:");
		GridBagConstraints gbc_oauthLbl = new GridBagConstraints();
		gbc_oauthLbl.anchor = GridBagConstraints.EAST;
		gbc_oauthLbl.insets = new Insets(0, 0, 5, 5);
		gbc_oauthLbl.gridx = 0;
		gbc_oauthLbl.gridy = 2;
		aiDetailsPanel.add(oauthLbl, gbc_oauthLbl);
		
		oauthEndPointTxt = new JTextField();
		GridBagConstraints gbc_oauthEndPointTxt = new GridBagConstraints();
		gbc_oauthEndPointTxt.insets = new Insets(0, 0, 5, 5);
		gbc_oauthEndPointTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_oauthEndPointTxt.gridx = 1;
		gbc_oauthEndPointTxt.gridy = 2;
		aiDetailsPanel.add(oauthEndPointTxt, gbc_oauthEndPointTxt);
		oauthEndPointTxt.setColumns(10);
		
		JLabel llmModelLbl = new JLabel("LLM Models:");
		GridBagConstraints gbc_llmModelLbl = new GridBagConstraints();
		gbc_llmModelLbl.anchor = GridBagConstraints.EAST;
		gbc_llmModelLbl.insets = new Insets(0, 0, 5, 5);
		gbc_llmModelLbl.gridx = 0;
		gbc_llmModelLbl.gridy = 3;
		aiDetailsPanel.add(llmModelLbl, gbc_llmModelLbl);
		
		JComboBox<String> llmModelcomboBox = new JComboBox<String>();
		GridBagConstraints gbc_llmModelcomboBox = new GridBagConstraints();
		gbc_llmModelcomboBox.insets = new Insets(0, 0, 5, 5);
		gbc_llmModelcomboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_llmModelcomboBox.gridx = 1;
		gbc_llmModelcomboBox.gridy = 3;
		aiDetailsPanel.add(llmModelcomboBox, gbc_llmModelcomboBox);
		
		JButton btnNewButton = new JButton("Get Models");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 3;
		aiDetailsPanel.add(btnNewButton, gbc_btnNewButton);
		
		JLabel llmApiEndPointLbl = new JLabel("LLM Api EndPoint:");
		GridBagConstraints gbc_llmApiEndPointLbl = new GridBagConstraints();
		gbc_llmApiEndPointLbl.anchor = GridBagConstraints.EAST;
		gbc_llmApiEndPointLbl.insets = new Insets(0, 0, 5, 5);
		gbc_llmApiEndPointLbl.gridx = 0;
		gbc_llmApiEndPointLbl.gridy = 4;
		aiDetailsPanel.add(llmApiEndPointLbl, gbc_llmApiEndPointLbl);
		
		llmApiEndPointTxt = new JTextField();
		GridBagConstraints gbc_llmApiEndPointTxt = new GridBagConstraints();
		gbc_llmApiEndPointTxt.gridwidth = 2;
		gbc_llmApiEndPointTxt.insets = new Insets(0, 0, 5, 5);
		gbc_llmApiEndPointTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_llmApiEndPointTxt.gridx = 1;
		gbc_llmApiEndPointTxt.gridy = 4;
		aiDetailsPanel.add(llmApiEndPointTxt, gbc_llmApiEndPointTxt);
		llmApiEndPointTxt.setColumns(10);
		
		JButton testBtn = new JButton("Test");
		GridBagConstraints gbc_testBtn = new GridBagConstraints();
		gbc_testBtn.insets = new Insets(0, 0, 5, 0);
		gbc_testBtn.gridx = 3;
		gbc_testBtn.gridy = 4;
		aiDetailsPanel.add(testBtn, gbc_testBtn);
		
		JLabel aiInfoLbl = new JLabel("* mark fields are required to fill");
		aiInfoLbl.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_aiInfoLbl = new GridBagConstraints();
		gbc_aiInfoLbl.insets = new Insets(0, 0, 0, 5);
		gbc_aiInfoLbl.gridx = 1;
		gbc_aiInfoLbl.gridy = 5;
		aiDetailsPanel.add(aiInfoLbl, gbc_aiInfoLbl);
		
		
		
		
		JPanel snykDetailsPanel = new JPanel();
		
		snykDetailsPanel.setBorder(new TitledBorder(null, "Panel2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		GridBagConstraints gbc_snykDetailsPanel = new GridBagConstraints();
		gbc_snykDetailsPanel.fill = GridBagConstraints.BOTH;
		gbc_snykDetailsPanel.gridx = 0;
		gbc_snykDetailsPanel.gridy = 1;
		add(snykDetailsPanel, gbc_snykDetailsPanel);
		
		
		
		
		GridBagLayout gbl_snykDetailsPanel = new GridBagLayout();
		gbl_snykDetailsPanel.columnWidths = new int[]{0, 0, 0};
		gbl_snykDetailsPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_snykDetailsPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_snykDetailsPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		snykDetailsPanel.setLayout(gbl_snykDetailsPanel);
		
		

		
		JLabel snykEndPointLbl = new JLabel("Snyk End Point:");
		GridBagConstraints gbc_snykEndPointLbl = new GridBagConstraints();
		gbc_snykEndPointLbl.insets = new Insets(0, 0, 5, 5);
		gbc_snykEndPointLbl.anchor = GridBagConstraints.EAST;
		gbc_snykEndPointLbl.gridx = 0;
		gbc_snykEndPointLbl.gridy = 0;
		snykDetailsPanel.add(snykEndPointLbl, gbc_snykEndPointLbl);
		
		snykEndPointTxt = new JTextField();
		GridBagConstraints gbc_snykEndPointTxt = new GridBagConstraints();
		gbc_snykEndPointTxt.insets = new Insets(0, 0, 5, 5);
		gbc_snykEndPointTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_snykEndPointTxt.gridx = 1;
		gbc_snykEndPointTxt.gridy = 0;
		snykDetailsPanel.add(snykEndPointTxt, gbc_snykEndPointTxt);
		snykEndPointTxt.setColumns(10);
		
		JLabel snykTokenLbl = new JLabel("Snyk Token:");
		GridBagConstraints gbc_snykTokenLbl = new GridBagConstraints();
		gbc_snykTokenLbl.anchor = GridBagConstraints.EAST;
		gbc_snykTokenLbl.insets = new Insets(0, 0, 5, 5);
		gbc_snykTokenLbl.gridx = 0;
		gbc_snykTokenLbl.gridy = 1;
		snykDetailsPanel.add(snykTokenLbl, gbc_snykTokenLbl);
		
		snykTonenTxt = new JTextField();
		GridBagConstraints gbc_snykTonenTxt = new GridBagConstraints();
		gbc_snykTonenTxt.insets = new Insets(0, 0, 5, 5);
		gbc_snykTonenTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_snykTonenTxt.gridx = 1;
		gbc_snykTonenTxt.gridy = 1;
		snykDetailsPanel.add(snykTonenTxt, gbc_snykTonenTxt);
		snykTonenTxt.setColumns(10);
		
		JButton snykTestBtn = new JButton("Test");
		GridBagConstraints snyk_gbc_testBtn = new GridBagConstraints();
		snyk_gbc_testBtn.insets = new Insets(0, 0, 5, 0);
		snyk_gbc_testBtn.gridx = 2;
		snyk_gbc_testBtn.gridy = 1;
		snykDetailsPanel.add(snykTestBtn, snyk_gbc_testBtn);
		
		JLabel snykInfoLbl = new JLabel("* mark fields are required to fill");
		snykInfoLbl.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_snykInfoLbl = new GridBagConstraints();
		gbc_snykInfoLbl.insets = new Insets(0, 0, 0, 5);
		gbc_snykInfoLbl.gridx = 1;
		gbc_snykInfoLbl.gridy = 4;
		snykDetailsPanel.add(snykInfoLbl, gbc_snykInfoLbl);
		
		


	}

}
