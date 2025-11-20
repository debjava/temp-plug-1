// src/main/java/com/example/settings/MySettingsConfigurable.java
package com.ddlab.rnd.setting;

import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MySettingsConfigurable implements SearchableConfigurable {

    private MySettingsComponent component;

    @Override
    public @NotNull String getId() {
        return "com.example.settings";
    }

    @Override
    public String getDisplayName() {
        return "My Plugin Settings(Enter the values)";
    }

    @Override
    public @Nullable JComponent createComponent() {
        component = new MySettingsComponent();
        return component.getPanel();
    }

    @Override
    public boolean isModified() {
        MySettingsState settings = MySettingsState.getInstance();

        return !component.getClientIdStr().equals(settings.clientIdStr)
                || !component.getClientSecretStr().equals(settings.clientSecretStr)
                || !component.getOauthEndPointUrlStr().equals(settings.oauthEndPointUrlStr)
//                || !component.getSelectedLlmModelStr().equals(settings.selectedLlmModelStr)
                || !component.getLlmEndPointUrlStr().equals(settings.llmEndPointUrlStr);


//        return component.getEnableFeature() != settings.enableFeature ||
//               !component.getApiEndpoint().equals(settings.apiEndpoint);
    }

    @Override
    public void apply() {
        MySettingsState settings = MySettingsState.getInstance();
        settings.clientIdStr = component.getClientIdStr();
        settings.clientSecretStr = component.getClientSecretStr();
        settings.oauthEndPointUrlStr = component.getOauthEndPointUrlStr();
        settings.selectedLlmModelStr = component.getSelectedLlmModelStr();
        settings.llmEndPointUrlStr = component.getLlmEndPointUrlStr();

//        settings.enableFeature = component.getEnableFeature();
//        settings.apiEndpoint = component.getApiEndpoint();
    }

    @Override
    public void reset() {
        MySettingsState settings = MySettingsState.getInstance();
//        component.setEnableFeature(settings.enableFeature);
//        component.setApiEndpoint(settings.apiEndpoint);

        component.setClientIdStr(settings.clientIdStr);
        component.setClientSecretStr(settings.clientSecretStr);
        component.setOauthEndPointUrlStr(settings.oauthEndPointUrlStr);
//        component.setSelectedLlmModelStr(settings.selectedLlmModelStr);
        component.setLlmEndPointUrlStr(settings.llmEndPointUrlStr);
    }
}
