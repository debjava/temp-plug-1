package com.ddlab.rnd.group.panel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AiSnykGroupPanel extends JPanel {

	private static final long serialVersionUID = -8102052263036463291L;

	public AiSnykGroupPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 ,0, 0};
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
//		gridBagLayout.rowHeights = new int[] { 0, 0, 0, };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };//TODO
//		gridBagLayout.rowWeights = new double[] { 0.0, 0.0,   Double.MIN_VALUE };//TODO
		setLayout(gridBagLayout);
		
		JPanel aiDetailsPanel = new AiDetailsPanel();
		GridBagConstraints gbc_aiDetailsPanel = new GridBagConstraints();
		gbc_aiDetailsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_aiDetailsPanel.fill = GridBagConstraints.BOTH;
		gbc_aiDetailsPanel.gridx = 0;
		gbc_aiDetailsPanel.gridy = 0;
		add(aiDetailsPanel, gbc_aiDetailsPanel);
		
		JLabel label = new JLabel("New label");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 4;
		aiDetailsPanel.add(label, gbc_label);
		
		
		
		JLabel commonInfoLbl = new JLabel("* mark fields are required to fill");
		commonInfoLbl.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_commonInfoLbl = new GridBagConstraints();
		gbc_commonInfoLbl.insets = new Insets(0, 0, 5, 0);
		gbc_commonInfoLbl.gridx = 0;
		gbc_commonInfoLbl.gridy = 1;
		add(commonInfoLbl, gbc_commonInfoLbl);
		
		
		JPanel snykPanel = new SnykDetailsPanel();
		GridBagConstraints gbc_snykPanel = new GridBagConstraints();
		gbc_snykPanel.fill = GridBagConstraints.BOTH;
		gbc_snykPanel.gridx = 0;
		gbc_snykPanel.gridy = 2;
		add(snykPanel, gbc_snykPanel);
		
		JLabel llmModelDetails = new JLabel("LLM Model Details:");
		GridBagConstraints gbc_llmModelDetails = new GridBagConstraints();
		gbc_llmModelDetails.insets = new Insets(0, 0, 0, 5);
		gbc_llmModelDetails.gridx = 0;
		gbc_llmModelDetails.gridy = 5;
		aiDetailsPanel.add(llmModelDetails, gbc_llmModelDetails);
		
		JLabel llmModelType = new JLabel("Model Type");
		GridBagConstraints gbc_llmModelType = new GridBagConstraints();
		gbc_llmModelType.anchor = GridBagConstraints.WEST;
		gbc_llmModelType.insets = new Insets(0, 0, 0, 5);
		gbc_llmModelType.gridx = 1;
		gbc_llmModelType.gridy = 5;
		aiDetailsPanel.add(llmModelType, gbc_llmModelType);
		
		
    }

}
