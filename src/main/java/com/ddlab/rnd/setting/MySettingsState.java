// src/main/java/com/example/settings/MySettingsState.java
package com.ddlab.rnd.setting;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(name = "MyPluginSettings",
//        storages = @Storage("MyPluginSettings.xml")
        storages = @Storage("myplugin/custom/MyCustomSettings.xml")
//        storages = @Storage(StoragePathMacros.APP_CONFIG + "/myplugin/MyPluginSettings.xml")
)
public class MySettingsState implements PersistentStateComponent<MySettingsState> {

//    public boolean enableFeature = false;
//    public String apiEndpoint = "";

    public String clientIdStr;
    public String clientSecretStr;
    public String oauthEndPointUrlStr;
    private String defaultModel = null;
    public String selectedLlmModelStr = defaultModel;
    public String llmEndPointUrlStr;

    @Override
    public @Nullable MySettingsState getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull MySettingsState state) {
//        this.enableFeature = state.enableFeature;
//        this.apiEndpoint = state.apiEndpoint;
        this.clientIdStr = state.clientIdStr;
        this.clientSecretStr = state.clientSecretStr;
        this.oauthEndPointUrlStr = state.llmEndPointUrlStr;
        this.selectedLlmModelStr = state.selectedLlmModelStr;
        this.llmEndPointUrlStr = llmEndPointUrlStr;

    }

    public static MySettingsState getInstance() {
        return com.intellij.openapi.application.ApplicationManager
                .getApplication()
                .getService(MySettingsState.class);
    }
}
