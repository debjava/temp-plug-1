//package com.ddlab.rnd.setting;
//
//import com.intellij.openapi.components.PersistentStateComponent;
//import com.intellij.openapi.components.State;
//import com.intellij.openapi.components.Storage;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//
//@State(
//    name = "MyPluginSettings",
//    storages = @Storage("MyPluginSettings.xml")
//)
//public class MyPluginSettings implements PersistentStateComponent<MyPluginSettings.State> {
//
//    static class State {
//        public String mySettingValue = "Default Value";
//        public boolean myBooleanSetting = false;
//    }
//
//    private State myState = new State();
//
//    @Nullable
//    @Override
//    public State getState() {
//        return myState;
//    }
//
//    @Override
//    public void loadState(@NotNull State state) {
//        this.myState = state;
//    }
//
//    public String getMySettingValue() {
//        return myState.mySettingValue;
//    }
//
//    public void setMySettingValue(String mySettingValue) {
//        this.myState.mySettingValue = mySettingValue;
//    }
//
//    public boolean isMyBooleanSetting() {
//        return myState.myBooleanSetting;
//    }
//
//    public void setMyBooleanSetting(boolean myBooleanSetting) {
//        this.myState.myBooleanSetting = myBooleanSetting;
//    }
//}