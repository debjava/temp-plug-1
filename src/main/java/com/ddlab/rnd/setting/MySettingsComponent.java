// src/main/java/com/example/settings/MySettingsComponent.java
package com.ddlab.rnd.setting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySettingsComponent {

    private JPanel mainPanel;
    private JCheckBox enableFeatureCheckbox;
    private JTextField apiEndpointField;

    private JTextField clientIdTxt;
    private JTextField clientSecretTxt;
    private JTextField oauthEndPointTxt;
    private JComboBox llmModelComboBox;
    private JTextField llmApiEndPointTxt;

    private String clientIdStr;
    private String clientSecretStr;
    private String oauthEndPointUrlStr;
    private String selectedLlmModelStr;
    private String llmEndPointUrlStr;


    String[] fruits = {"Apple", "Banana", "Cherry", "Date"};



    public MySettingsComponent() {
        mainPanel = new JPanel();
//        mainPanel.setLayout(new GridLayout(3, 1));

        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 0, 0};
        gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0,};
        gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};

        mainPanel.setLayout(gridBagLayout);



        JLabel clientIdLbl = new JLabel("Client Id:");
        GridBagConstraints gbc_clientIdLbl = new GridBagConstraints();
        gbc_clientIdLbl.insets = new Insets(0, 0, 5, 5);
        gbc_clientIdLbl.anchor = GridBagConstraints.EAST;
        gbc_clientIdLbl.gridx = 0;
        gbc_clientIdLbl.gridy = 0;
        mainPanel.add(clientIdLbl, gbc_clientIdLbl);

        clientIdTxt = new JTextField();
        GridBagConstraints gbc_clientIdTxt = new GridBagConstraints();
        gbc_clientIdTxt.gridwidth = 3;
        gbc_clientIdTxt.insets = new Insets(0, 0, 5, 5);
        gbc_clientIdTxt.fill = GridBagConstraints.HORIZONTAL;
        gbc_clientIdTxt.gridx = 1;
        gbc_clientIdTxt.gridy = 0;
        mainPanel.add(clientIdTxt, gbc_clientIdTxt);
        clientIdTxt.setColumns(10);



        JLabel clientSecretLbl = new JLabel("Client Secret:");
        GridBagConstraints gbc_clientSecretLbl = new GridBagConstraints();
        gbc_clientSecretLbl.anchor = GridBagConstraints.EAST;
        gbc_clientSecretLbl.insets = new Insets(0, 0, 5, 5);
        gbc_clientSecretLbl.gridx = 0;
        gbc_clientSecretLbl.gridy = 1;
        mainPanel.add(clientSecretLbl, gbc_clientSecretLbl);

        clientSecretTxt = new JTextField();
        GridBagConstraints gbc_clientSecretTxt = new GridBagConstraints();
        gbc_clientSecretTxt.gridwidth = 3;
        gbc_clientSecretTxt.anchor = GridBagConstraints.BELOW_BASELINE;
        gbc_clientSecretTxt.insets = new Insets(0, 0, 5, 0);
        gbc_clientSecretTxt.fill = GridBagConstraints.HORIZONTAL;
        gbc_clientSecretTxt.gridx = 1;
        gbc_clientSecretTxt.gridy = 1;
        mainPanel.add(clientSecretTxt, gbc_clientSecretTxt);
        clientSecretTxt.setColumns(10);

        JLabel oauthEndPointLbl = new JLabel("OAuth End Point:");
        GridBagConstraints gbc_oauthEndPointLbl = new GridBagConstraints();
        gbc_oauthEndPointLbl.anchor = GridBagConstraints.EAST;
        gbc_oauthEndPointLbl.insets = new Insets(0, 0, 5, 5);
        gbc_oauthEndPointLbl.gridx = 0;
        gbc_oauthEndPointLbl.gridy = 2;
        mainPanel.add(oauthEndPointLbl, gbc_oauthEndPointLbl);

        oauthEndPointTxt = new JTextField();
        GridBagConstraints gbc_oauthEndPointTxt = new GridBagConstraints();
        gbc_oauthEndPointTxt.gridwidth = 3;
        gbc_oauthEndPointTxt.insets = new Insets(0, 0, 5, 5);
        gbc_oauthEndPointTxt.fill = GridBagConstraints.HORIZONTAL;
        gbc_oauthEndPointTxt.gridx = 1;
        gbc_oauthEndPointTxt.gridy = 2;
        mainPanel.add(oauthEndPointTxt, gbc_oauthEndPointTxt);
        oauthEndPointTxt.setColumns(10);

        JLabel llmModelLbl = new JLabel("LLM Models:");
        GridBagConstraints gbc_llmModelLbl = new GridBagConstraints();
        gbc_llmModelLbl.anchor = GridBagConstraints.BASELINE_TRAILING;
        gbc_llmModelLbl.insets = new Insets(0, 0, 5, 5);
        gbc_llmModelLbl.gridx = 0;
        gbc_llmModelLbl.gridy = 3;
        mainPanel.add(llmModelLbl, gbc_llmModelLbl);

        llmModelComboBox = new JComboBox();
        GridBagConstraints gbc_llmModelComboBox = new GridBagConstraints();
        gbc_llmModelComboBox.insets = new Insets(0, 0, 5, 5);
        gbc_llmModelComboBox.fill = GridBagConstraints.HORIZONTAL;
        gbc_llmModelComboBox.gridx = 1;
        gbc_llmModelComboBox.gridy = 3;
        mainPanel.add(llmModelComboBox, gbc_llmModelComboBox);

        JButton llmModelBtn = new JButton("Get Models");
        GridBagConstraints gbc_llmModelBtn = new GridBagConstraints();
        gbc_llmModelBtn.gridwidth = 2;
        gbc_llmModelBtn.insets = new Insets(0, 0, 5, 0);
        gbc_llmModelBtn.anchor = GridBagConstraints.EAST;
        gbc_llmModelBtn.gridx = 2;
        gbc_llmModelBtn.gridy = 3;
        mainPanel.add(llmModelBtn, gbc_llmModelBtn);

        llmModelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                label.setText("Button was pressed!");
                llmModelComboBox.removeAllItems(); // clear existing items
//                String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
                for (String fruit : fruits) {
                    llmModelComboBox.addItem(fruit);
                }

            }
        });


        JLabel llmApiEndPointLbl = new JLabel("LLM Api EndPoint:");
        GridBagConstraints gbc_llmApiEndPointLbl = new GridBagConstraints();
        gbc_llmApiEndPointLbl.anchor = GridBagConstraints.EAST;
        gbc_llmApiEndPointLbl.insets = new Insets(0, 0, 5, 5);
        gbc_llmApiEndPointLbl.gridx = 0;
        gbc_llmApiEndPointLbl.gridy = 4;
        mainPanel.add(llmApiEndPointLbl, gbc_llmApiEndPointLbl);

        llmApiEndPointTxt = new JTextField();
        GridBagConstraints gbc_llmApiEndPointTxt = new GridBagConstraints();
        gbc_llmApiEndPointTxt.gridwidth = 3;
        gbc_llmApiEndPointTxt.insets = new Insets(0, 0, 5, 0);
        gbc_llmApiEndPointTxt.fill = GridBagConstraints.HORIZONTAL;
        gbc_llmApiEndPointTxt.gridx = 1;
        gbc_llmApiEndPointTxt.gridy = 4;
        mainPanel.add(llmApiEndPointTxt, gbc_llmApiEndPointTxt);
        llmApiEndPointTxt.setColumns(10);


//        enableFeatureCheckbox = new JCheckBox("Enable Feature");
//        apiEndpointField = new JTextField();
//
//        mainPanel.add(enableFeatureCheckbox);
//        mainPanel.add(new JLabel("API Endpoint:"));
//        mainPanel.add(apiEndpointField);
    }

    public JPanel getPanel() {
        return mainPanel;
    }

    @Deprecated
    public boolean getEnableFeature() {
//        return enableFeatureCheckbox.isSelected();
        return true;
    }

    @Deprecated
    public void setEnableFeature(boolean value) {
//        enableFeatureCheckbox.setSelected(value);
    }

    @Deprecated
    public String getApiEndpoint() {
//        return apiEndpointField.getText();
        return "some value";
    }

    @Deprecated
    public void setApiEndpoint(String text) {
//        apiEndpointField.setText(text);
    }

    public String getClientIdStr() {
        return clientIdTxt.getText();
//        clientIdStr = clientIdTxt.getText();
//        return clientIdStr;
    }

    public void setClientIdStr(String clientIdStr) {
        clientIdTxt.setText(clientIdStr);
//        this.clientIdStr = clientIdStr;
    }

    public String getClientSecretStr() {
        return clientSecretTxt.getText();
//        clientSecretStr = clientSecretTxt.getText();
//        return clientSecretStr;
    }

    public void setClientSecretStr(String clientSecretStr) {
        clientSecretTxt.setText(clientSecretStr);
//        this.clientSecretStr = clientSecretStr;
    }

    public String getOauthEndPointUrlStr() {
        return oauthEndPointTxt.getText();
//        oauthEndPointUrlStr = oauthEndPointTxt.getText();
//        return oauthEndPointUrlStr;
    }

    public void setOauthEndPointUrlStr(String oauthEndPointUrlStr) {
        oauthEndPointTxt.setText(oauthEndPointUrlStr);
//        this.oauthEndPointUrlStr = oauthEndPointUrlStr;
    }

    public String getSelectedLlmModelStr() {
        // populate first
        for (String fruit : fruits) {
            llmModelComboBox.addItem(fruit);
        }
        selectedLlmModelStr = (String) llmModelComboBox.getSelectedItem();
        return selectedLlmModelStr;
    }

    public void setSelectedLlmModelStr(String selectedLlmModelStr) {
        // First populate and the make default selection
        for (String fruit : fruits) {
            llmModelComboBox.addItem(fruit);
        }
        llmModelComboBox.setSelectedItem(selectedLlmModelStr);
//        this.selectedLlmModelStr = selectedLlmModelStr;
    }

    public String getLlmEndPointUrlStr() {
        return llmApiEndPointTxt.getText();
//        llmEndPointUrlStr = llmApiEndPointTxt.getText();
//        return llmEndPointUrlStr;
    }

    public void setLlmEndPointUrlStr(String llmEndPointUrlStr) {
        llmApiEndPointTxt.setText(llmEndPointUrlStr);
//        this.llmEndPointUrlStr = llmEndPointUrlStr;
    }

}
