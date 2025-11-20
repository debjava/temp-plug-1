//package com.ddlab.rnd.setting;
//
//import com.intellij.ui.components.JBCheckBox;
//import com.intellij.ui.components.JBLabel;
//import com.intellij.ui.components.JBTextField;
//import com.intellij.util.ui.FormBuilder;
//
//import javax.swing.*;
//
//public class MyPluginSettingsComponent {
//    private final JPanel myMainPanel;
//    private final JBTextField mySettingTextField = new JBTextField();
//    private final JBCheckBox myBooleanSettingCheckBox = new JBCheckBox("Enable Feature");
//
//    public MyPluginSettingsComponent() {
//        myMainPanel = FormBuilder.createFormBuilder()
//                .addLabeledComponent(new JBLabel("My Setting:"), mySettingTextField, 1, false)
//                .addComponent(myBooleanSettingCheckBox, 1)
//                .addComponentFillVertically(new JPanel(), 0) // Fill remaining space
//                .getPanel();
//    }
//
//    public JPanel getPanel() {
//        return myMainPanel;
//    }
//
//    public JComponent getPreferredFocusedComponent() {
//        return mySettingTextField;
//    }
//
//    public String getMySettingText() {
//        return mySettingTextField.getText();
//    }
//
//    public void setMySettingText(String text) {
//        mySettingTextField.setText(text);
//    }
//
//    public boolean isMyBooleanSettingSelected() {
//        return myBooleanSettingCheckBox.isSelected();
//    }
//
//    public void setMyBooleanSettingSelected(boolean selected) {
//        myBooleanSettingCheckBox.setSelected(selected);
//    }
//}