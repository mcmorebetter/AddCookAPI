package com.github.teamhungry22.addcook.core.command;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.config.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class ReloadCommand implements BaseCommand {
    public ReloadCommand(ConfigManager configManager) {
        throw new AddCookNotFoundException();
    }

    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        throw new AddCookNotFoundException();
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        throw new AddCookNotFoundException();
    }
}