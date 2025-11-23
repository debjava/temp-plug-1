package com.ddlab.rnd.ui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.ddlab.rnd.group.AiPanel1;
import com.ddlab.rnd.group.SnykPanel2;

public class TempGroup1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public TempGroup1() {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JPanel aiDetailsPanel = new AiPanel1();
//		aiDetailsPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "AI Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_aiDetailsPanel = new GridBagConstraints();
		gbc_aiDetailsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_aiDetailsPanel.fill = GridBagConstraints.BOTH;
		gbc_aiDetailsPanel.gridx = 0;
		gbc_aiDetailsPanel.gridy = 0;
		add(aiDetailsPanel, gbc_aiDetailsPanel);

		JPanel snykDetailsPanel = new SnykPanel2();

//		snykDetailsPanel
//				.setBorder(new TitledBorder(null, "Panel2", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		GridBagConstraints gbc_snykDetailsPanel = new GridBagConstraints();
		gbc_snykDetailsPanel.fill = GridBagConstraints.BOTH;
		gbc_snykDetailsPanel.gridx = 0;
		gbc_snykDetailsPanel.gridy = 1;
		add(snykDetailsPanel, gbc_snykDetailsPanel);

	}

}
