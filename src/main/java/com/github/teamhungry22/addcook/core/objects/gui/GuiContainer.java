package com.github.teamhungry22.addcook.core.objects.gui;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

public class GuiContainer {
    public GuiContainer(int windowId, Object containerType) {
        throw new AddCookNotFoundException();
    }

    public int getWindowId() {
        throw new AddCookNotFoundException();
    }

    public Object getContainerType() {
        throw new AddCookNotFoundException();
    }
}

