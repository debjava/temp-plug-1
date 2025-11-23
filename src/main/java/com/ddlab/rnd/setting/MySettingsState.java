// src/main/java/com/example/settings/MySettingsState.java
package com.ddlab.rnd.setting;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@State(name = "MyPluginSettings",
//        storages = @Storage("MyPluginSettings.xml")
        storages = @Storage("myplugin/custom/MyCustomSettings.xml")
//        storages = @Storage(StoragePathMacros.APP_CONFIG + "/myplugin/MyPluginSettings.xml")
)
//public class MySettingsState implements PersistentStateComponent<MySettingsState> {

public class MySettingsState implements PersistentStateComponent<MySettingsState.State> {

    public static class State {
        public List<String> comboItems = new ArrayList<>();
        public String selectedItem;

        public String clientIdStr;
        public String clientSecretStr;
        public String oauthEndPointUrlStr;
        private String defaultModel = null;
        public String selectedLlmModelStr = defaultModel;
        public String llmEndPointUrlStr;

//        public List<String> comboItems = new ArrayList<>();
//        public String selectedItem;
    }

    private State state = new State();

//    public boolean enableFeature = false;
//    public String apiEndpoint = "";

//    public String clientIdStr;
//    public String clientSecretStr;
//    public String oauthEndPointUrlStr;
//    private String defaultModel = null;
//    public String selectedLlmModelStr = defaultModel;
//    public String llmEndPointUrlStr;
//
//    public List<String> comboItems = new ArrayList<>();
//    public String selectedItem;

//    @Override
//    public @Nullable MySettingsState getState() {
//        return this;
//    }
//
//    @Override
//    public void loadState(@NotNull MySettingsState state) {
////        this.enableFeature = state.enableFeature;
////        this.apiEndpoint = state.apiEndpoint;
//        this.clientIdStr = state.clientIdStr;
//        this.clientSecretStr = state.clientSecretStr;
//        this.oauthEndPointUrlStr = state.llmEndPointUrlStr;
//        this.selectedLlmModelStr = state.selectedLlmModelStr;
//        this.llmEndPointUrlStr = state.llmEndPointUrlStr;
//        this.comboItems = state.comboItems;
//        System.out.println("All Combo Items: "+comboItems);
//
//    }
//
//    public static MySettingsState getInstance() {
//        return com.intellij.openapi.application.ApplicationManager
//                .getApplication()
//                .getService(MySettingsState.class);
//    }

    @Override
    public @Nullable State getState() {
        return state;
    }

    @Override
    public void loadState(@NotNull State state) {
        this.state = state;
        this.state.clientIdStr = state.clientIdStr;
    }

    // Singleton instance access
    public static MySettingsState getInstance() {
        return com.intellij.openapi.application.ApplicationManager.getApplication().getService(MySettingsState.class);
    }
}
