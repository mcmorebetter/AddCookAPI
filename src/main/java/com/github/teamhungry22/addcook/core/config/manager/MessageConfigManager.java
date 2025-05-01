package com.github.teamhungry22.addcook.core.config.manager;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.data.MessageData;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class MessageConfigManager {
    public MessageConfigManager() {}

    public void load(YamlConfiguration config) {
        throw new AddCookNotFoundException();
    }

    public void clear() {
        throw new AddCookNotFoundException();
    }

    public Map<String, MessageData> getMessageMap() {
        throw new AddCookNotFoundException();
    }
}
