package com.github.teamhungry22.addcook.core.command;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

public class ItemCommand implements BaseCommand {
    public ItemCommand(AddCook plugin) {
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

    private boolean isList(String commandType, String id) {
        throw new AddCookNotFoundException();
    }

    private ItemStack getCommandItem(String commandType, String id) {
        throw new AddCookNotFoundException();
    }

    private Optional<Player> getPlayer(CommandSender sender, String playerName) {
        throw new AddCookNotFoundException();
    }

    private void itemCommandGuide(CommandSender sender) {
        throw new AddCookNotFoundException();
    }
}