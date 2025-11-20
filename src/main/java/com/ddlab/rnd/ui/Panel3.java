package com.ddlab.rnd.ui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Panel3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField clientIdTxt;
	private JTextField clientSecretTxt;
	private JTextField oauthEndPointTxt;
	private JTextField llmApiEndPointTxt;

	/**
	 * Create the panel.
	 */
	public Panel3() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0,};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel clientIdLbl = new JLabel("Client Id:");
		GridBagConstraints gbc_clientIdLbl = new GridBagConstraints();
		gbc_clientIdLbl.insets = new Insets(0, 0, 5, 5);
		gbc_clientIdLbl.anchor = GridBagConstraints.EAST;
		gbc_clientIdLbl.gridx = 0;
		gbc_clientIdLbl.gridy = 0;
		add(clientIdLbl, gbc_clientIdLbl);
		
		clientIdTxt = new JTextField();
		GridBagConstraints gbc_clientIdTxt = new GridBagConstraints();
		gbc_clientIdTxt.gridwidth = 3;
		gbc_clientIdTxt.insets = new Insets(0, 0, 5, 5);
		gbc_clientIdTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_clientIdTxt.gridx = 1;
		gbc_clientIdTxt.gridy = 0;
		add(clientIdTxt, gbc_clientIdTxt);
		clientIdTxt.setColumns(10);
		
		JLabel clientSecretLbl = new JLabel("Client Secret:");
		GridBagConstraints gbc_clientSecretLbl = new GridBagConstraints();
		gbc_clientSecretLbl.anchor = GridBagConstraints.EAST;
		gbc_clientSecretLbl.insets = new Insets(0, 0, 5, 5);
		gbc_clientSecretLbl.gridx = 0;
		gbc_clientSecretLbl.gridy = 1;
		add(clientSecretLbl, gbc_clientSecretLbl);
		
		clientSecretTxt = new JTextField();
		GridBagConstraints gbc_clientSecretTxt = new GridBagConstraints();
		gbc_clientSecretTxt.gridwidth = 3;
		gbc_clientSecretTxt.anchor = GridBagConstraints.BELOW_BASELINE;
		gbc_clientSecretTxt.insets = new Insets(0, 0, 5, 0);
		gbc_clientSecretTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_clientSecretTxt.gridx = 1;
		gbc_clientSecretTxt.gridy = 1;
		add(clientSecretTxt, gbc_clientSecretTxt);
		clientSecretTxt.setColumns(10);
		
		JLabel oauthEndPointLbl = new JLabel("OAuth End Point:");
		GridBagConstraints gbc_oauthEndPointLbl = new GridBagConstraints();
		gbc_oauthEndPointLbl.anchor = GridBagConstraints.EAST;
		gbc_oauthEndPointLbl.insets = new Insets(0, 0, 5, 5);
		gbc_oauthEndPointLbl.gridx = 0;
		gbc_oauthEndPointLbl.gridy = 2;
		add(oauthEndPointLbl, gbc_oauthEndPointLbl);
		
		oauthEndPointTxt = new JTextField();
		GridBagConstraints gbc_oauthEndPointTxt = new GridBagConstraints();
		gbc_oauthEndPointTxt.gridwidth = 3;
		gbc_oauthEndPointTxt.insets = new Insets(0, 0, 5, 5);
		gbc_oauthEndPointTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_oauthEndPointTxt.gridx = 1;
		gbc_oauthEndPointTxt.gridy = 2;
		add(oauthEndPointTxt, gbc_oauthEndPointTxt);
		oauthEndPointTxt.setColumns(10);
		
		JLabel llmModelLbl = new JLabel("LLM Models:");
		GridBagConstraints gbc_llmModelLbl = new GridBagConstraints();
		gbc_llmModelLbl.anchor = GridBagConstraints.BASELINE_TRAILING;
		gbc_llmModelLbl.insets = new Insets(0, 0, 5, 5);
		gbc_llmModelLbl.gridx = 0;
		gbc_llmModelLbl.gridy = 3;
		add(llmModelLbl, gbc_llmModelLbl);
		
		JComboBox llmModelComboBox = new JComboBox();
		GridBagConstraints gbc_llmModelComboBox = new GridBagConstraints();
		gbc_llmModelComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_llmModelComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_llmModelComboBox.gridx = 1;
		gbc_llmModelComboBox.gridy = 3;
		add(llmModelComboBox, gbc_llmModelComboBox);
		
		JButton btnNewButton = new JButton("Get Models");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 3;
		add(btnNewButton, gbc_btnNewButton);
		
		JLabel llmApiEndPointLbl = new JLabel("LLM Api EndPoint:");
		GridBagConstraints gbc_llmApiEndPointLbl = new GridBagConstraints();
		gbc_llmApiEndPointLbl.anchor = GridBagConstraints.EAST;
		gbc_llmApiEndPointLbl.insets = new Insets(0, 0, 5, 5);
		gbc_llmApiEndPointLbl.gridx = 0;
		gbc_llmApiEndPointLbl.gridy = 4;
		add(llmApiEndPointLbl, gbc_llmApiEndPointLbl);
		
		llmApiEndPointTxt = new JTextField();
		GridBagConstraints gbc_llmApiEndPointTxt = new GridBagConstraints();
		gbc_llmApiEndPointTxt.gridwidth = 3;
		gbc_llmApiEndPointTxt.insets = new Insets(0, 0, 5, 0);
		gbc_llmApiEndPointTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_llmApiEndPointTxt.gridx = 1;
		gbc_llmApiEndPointTxt.gridy = 4;
		add(llmApiEndPointTxt, gbc_llmApiEndPointTxt);
		llmApiEndPointTxt.setColumns(10);

	}

}
