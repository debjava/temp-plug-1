package com.ddlab.rnd.setting1;

import com.ddlab.rnd.setting.MySettingsState;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.jetbrains.cef.remote.thrift.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

@State(
        name = "PluginSettings",
        storages = @Storage("PluginSettings.xml")
)
public class MyPluginSettingState implements PersistentStateComponent<MyPluginSettingState> {

//    public String selectedItem;
//    public String clientIdStr;

    private String clientIdStr = "";
    private String comboSelection = "";


    public static MyPluginSettingState getInstance() {
        return com.intellij.openapi.application.ApplicationManager.getApplication().getService(MyPluginSettingState.class);
    }

    @Nullable
    @Override
    public MyPluginSettingState getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull MyPluginSettingState state) {
        this.clientIdStr = state.clientIdStr;
//        this.comboSelection = state.comboSelection;
//        this.textFieldValue = state.textFieldValue;
//        this.comboSelection = state.comboSelection;
    }

    public String getComboSelection() {
        return comboSelection;
    }

    public void setComboSelection(String comboSelection) {
        this.comboSelection = comboSelection;
    }

    public String getClientIdStr() {
        return clientIdStr;
    }

    public void setClientIdStr(String clientIdStr) {
        this.clientIdStr = clientIdStr;
    }




}
