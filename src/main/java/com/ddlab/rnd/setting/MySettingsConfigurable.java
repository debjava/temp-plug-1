//// src/main/java/com/example/settings/MySettingsConfigurable.java
//package com.ddlab.rnd.setting;
//
//import com.intellij.openapi.options.SearchableConfigurable;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//import javax.swing.*;
//import java.util.List;
//
//public class MySettingsConfigurable implements SearchableConfigurable {
//
//    private MySettingsComponent component;
//
//    @Override
//    public @NotNull String getId() {
//        return "com.example.settings";
//    }
//
//    @Override
//    public String getDisplayName() {
//        return "My Plugin Settings(Enter the values)";
//    }
//
//    @Override
//    public @Nullable JComponent createComponent() {
//        component = new MySettingsComponent();
//        return component.getPanel();
//    }
//
////    private boolean isComboBoxModified(JComboBox comboBox) {
////        boolean checkFlag = false;
////        MySettingsState settings = MySettingsState.getInstance();
////        List<String> stored = settings.getState().comboItems;
////        if (comboBox.getItemCount() != stored.size())
////            checkFlag = true;
//////            return true;
////
////        for (int i = 0; i < stored.size(); i++) {
////            if (!stored.get(i).equals(comboBox.getItemAt(i)))
////                checkFlag = true;
//////                return true;
////        }
//////        return false;
//////        return checkFlag;
////        return true;
////    }
//
//    @Override
//    public boolean isModified() {
//        MySettingsState settings = MySettingsState.getInstance();
//
////        JComboBox comboBox = component.getLlmModelComboBox();
////        List<String> stored = settings.getState().comboItems;
//
////        if (comboBox.getItemCount() != stored.size())
////            return true;
////
////        for (int i = 0; i < stored.size(); i++) {
////            if (!stored.get(i).equals(comboBox.getItemAt(i)))
////                return true;
////        }
////
////        // Compare selected item
////        String sel = (String) comboBox.getSelectedItem();
////        return sel != null && !sel.equals(settings.getState().selectedItem);
////        boolean check = isComboBoxModified(comboBox);
////        System.out.println("What is the value of check: "+check);
////        return check;
//
//        return true;
//
////        return !component.getClientIdStr().equals(settings.clientIdStr)
////                || !component.getClientSecretStr().equals(settings.clientSecretStr)
////                || !component.getOauthEndPointUrlStr().equals(settings.oauthEndPointUrlStr)
//////                || !component.getSelectedLlmModelStr().equals(settings.selectedLlmModelStr)
////                || !component.getLlmEndPointUrlStr().equals(settings.llmEndPointUrlStr);
//
//
////        return component.getEnableFeature() != settings.enableFeature ||
////               !component.getApiEndpoint().equals(settings.apiEndpoint);
//    }
//
//    @Override
//    public void apply() {
//        MySettingsState settings = MySettingsState.getInstance();
//
//        MySettingsState.State state = MySettingsState.getInstance().getState();
//
//        String value = component.getClientIdStr();
//        System.out.println("Value: "+value);
//        state.clientIdStr = value;
//        System.out.println("state.clientIdStr====>"+state.clientIdStr);
//
//
//        JComboBox comboBox = component.getLlmModelComboBox();
//        // Save all items
//        settings.getState().comboItems.clear();
//        for (int i = 0; i < comboBox.getItemCount(); i++) {
//            System.out.println("Items: "+comboBox.getItemAt(i));
//            settings.getState().comboItems.add((String) comboBox.getItemAt(i));
//        }
//
//        // Save selected item
//        settings.getState().selectedItem = (String) comboBox.getSelectedItem();
//
//
////        settings.clientIdStr = component.getClientIdStr();
////        settings.clientSecretStr = component.getClientSecretStr();
////        settings.oauthEndPointUrlStr = component.getOauthEndPointUrlStr();
////        settings.selectedLlmModelStr = component.getSelectedLlmModelStr();
////        settings.llmEndPointUrlStr = component.getLlmEndPointUrlStr();
//
//
//
////        settings.enableFeature = component.getEnableFeature();
////        settings.apiEndpoint = component.getApiEndpoint();
//    }
//
//    @Override
//    public void reset() {
//        MySettingsState settings = MySettingsState.getInstance();
//
//
//
//        // Load items
////        comboBox.removeAllItems();
////        for (String item : settings.getState().comboItems) {
////            comboBox.addItem(item);
////        }
////
////        // Load selected item
////        comboBox.setSelectedItem(settings.getState().selectedItem);
//
//
//
////        component.setEnableFeature(settings.enableFeature);
////        component.setApiEndpoint(settings.apiEndpoint);
//
////        component.setClientIdStr(settings.clientIdStr);
////        component.setClientSecretStr(settings.clientSecretStr);
////        component.setOauthEndPointUrlStr(settings.oauthEndPointUrlStr);
//////        component.setSelectedLlmModelStr(settings.selectedLlmModelStr);
////        component.setLlmEndPointUrlStr(settings.llmEndPointUrlStr);
//
//        JComboBox comboBox = component.getLlmModelComboBox();
//
//        comboBox.removeAllItems();
//        for (String item : settings.getState().comboItems) {
//            comboBox.addItem(item);
//        }
//
//        // Load selected item
//        comboBox.setSelectedItem(settings.getState().selectedItem);
//    }
//}
