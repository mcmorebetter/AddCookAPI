package com.github.teamhungry22.addcook.core.config.data;


import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class MessageData {
    public String getMessage() {
        throw new AddCookNotFoundException();
    }
    public void setMessage(String text) {
        throw new AddCookNotFoundException();
    }

    public boolean isEnabled() {
        throw new AddCookNotFoundException();
    }
    public void setEnabled(boolean enabled) {
        throw new AddCookNotFoundException();
    }

    public String getSound() {
        throw new AddCookNotFoundException();
    }
    public void setSound(String sound) {
        throw new AddCookNotFoundException();
    }
}
