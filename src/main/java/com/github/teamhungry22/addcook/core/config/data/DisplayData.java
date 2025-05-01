package com.github.teamhungry22.addcook.core.config.data;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;

import java.util.List;

public class DisplayData {
    public DisplayData(String id, Integer interval, List<String> texts) {
        throw new AddCookNotFoundException();
    }

    public String getId() {
        throw new AddCookNotFoundException();
    }

    public Integer getInterval() {
        throw new AddCookNotFoundException();
    }

    public List<String> getTexts() {
        throw new AddCookNotFoundException();
    }
}