package com.ddlab.rnd.setting1;

import com.ddlab.rnd.setting.MySettingsComponent;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MyPluginConfigurable implements Configurable {

    private MySettingsComponent component;

    @Override
    public @NlsContexts.ConfigurableName String getDisplayName() {
        return "";
    }

    @Override
    public @Nullable JComponent createComponent() {
        component = new MySettingsComponent();
        return component.getPanel();
    }

    @Override
    public boolean isModified() {
//        return false;
        return true;
    }

    @Override
    public void apply() throws ConfigurationException {

        MyPluginSettingState settings = MyPluginSettingState.getInstance();
        String clientIdSr = component.getClientIdStr();
        String selectComboItem = component.getSelectedLlmModelStr();

        settings.se

        settings.setClientIdStr(clientIdSr);
        settings.setComboSelection((String) selectComboItem);

    }
}
