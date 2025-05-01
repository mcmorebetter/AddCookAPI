package com.github.teamhungry22.addcook.core.command;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.command.CommandSender;

import java.util.List;

public class InfoCommand implements BaseCommand {
    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        throw new AddCookNotFoundException();
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        throw new AddCookNotFoundException();
    }

    private String getCustomItemPlugin() {
        throw new AddCookNotFoundException();
    }
}