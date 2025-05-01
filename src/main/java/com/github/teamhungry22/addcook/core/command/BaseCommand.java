package com.github.teamhungry22.addcook.core.command;

import org.bukkit.command.CommandSender;

import java.util.List;

public interface BaseCommand {
    boolean onCommand(CommandSender sender, String[] args);

    List<String> onTabComplete(CommandSender sender, String[] args);
}