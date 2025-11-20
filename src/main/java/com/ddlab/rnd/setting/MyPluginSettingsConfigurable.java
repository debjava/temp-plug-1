//package com.ddlab.rnd.setting;
//
//import com.intellij.openapi.options.Configurable;
//import org.jetbrains.annotations.Nls;
//import org.jetbrains.annotations.Nullable;
//
//import javax.swing.*;
//
//public class MyPluginSettingsConfigurable implements Configurable {
//    private MyPluginSettingsComponent mySettingsComponent;
//
//    @Nls(capitalization = Nls.Capitalization.Title)
//    @Override
//    public String getDisplayName() {
//        return "My Plugin Settings";
//    }
//
//    @Nullable
//    @Override
//    public JComponent createComponent() {
//        mySettingsComponent = new MyPluginSettingsComponent();
//        return mySettingsComponent.getPanel();
//    }
//
//    @Override
//    public boolean isModified() {
//        MyPluginSettings settings = MyPluginSettings.getInstance();
//        return !mySettingsComponent.getMySettingText().equals(settings.getMySettingValue()) ||
//               mySettingsComponent.isMyBooleanSettingSelected() != settings.isMyBooleanSetting();
//    }
//
//    @Override
//    public void apply() {
//        MyPluginSettings settings = MyPluginSettings.getInstance();
//        settings.setMySettingValue(mySettingsComponent.getMySettingText());
//        settings.setMyBooleanSetting(mySettingsComponent.isMyBooleanSettingSelected());
//    }
//
//    @Override
//    public void reset() {
//        MyPluginSettings settings = MyPluginSettings.getInstance();
//        mySettingsComponent.setMySettingText(settings.getMySettingValue());
//        mySettingsComponent.setMyBooleanSettingSelected(settings.isMyBooleanSetting());
//    }
//
//    @Override
//    public void disposeUIResources() {
//        mySettingsComponent = null;
//    }
//}