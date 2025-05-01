package com.github.teamhungry22.addcook.core.command;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecipeViewerCommand implements CommandExecutor, TabCompleter {
    public RecipeViewerCommand(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        throw new AddCookNotFoundException();
    }

    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        throw new AddCookNotFoundException();
    }

    private void recipeCommandGuide(CommandSender sender) {
        throw new AddCookNotFoundException();
    }
}
