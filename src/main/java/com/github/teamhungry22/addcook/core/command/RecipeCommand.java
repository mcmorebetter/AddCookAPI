package com.github.teamhungry22.addcook.core.command;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.command.CommandSender;

import java.util.List;

public class RecipeCommand implements BaseCommand {
    public RecipeCommand(AddCook plugin) {
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

    private boolean hasId(CommandSender sender, String id) {
        throw new AddCookNotFoundException();
    }

    private void recipeCommandGuide(CommandSender sender) {
        throw new AddCookNotFoundException();
    }
}