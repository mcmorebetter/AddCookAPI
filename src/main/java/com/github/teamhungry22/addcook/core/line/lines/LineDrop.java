package com.github.teamhungry22.addcook.core.line.lines;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.line.Line;
import com.github.teamhungry22.addcook.core.line.LineResult;
import com.github.teamhungry22.addcook.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

public class LineDrop implements Line {
    public LineDrop(String line, String itemName, int amount, double chance, String dropType) {
        throw new AddCookNotFoundException();
    }

    public static Optional<LineDrop> build(String line) {
        throw new AddCookNotFoundException();
    }

    @Override
    public String getLine() {
        throw new AddCookNotFoundException();
    }

    @Override
    public Double getChance() {
        throw new AddCookNotFoundException();
    }

    @Override
    public LineType getType() {
        throw new AddCookNotFoundException();
    }

    @Override
    public LineResult getResult() {
        throw new AddCookNotFoundException();
    }

    @Override
    public void setResult(LineResult lineResult) {
        throw new AddCookNotFoundException();
    }

    @Override
    public void execute(Player player, Location location) {
        throw new AddCookNotFoundException();
    }

    private void dropItem(Player player, Location location) {
        throw new AddCookNotFoundException();
    }

    private void giveItem(Player player, Location location) {
        throw new AddCookNotFoundException();
    }

    public String getItemName() {
        throw new AddCookNotFoundException();
    }

    public int getAmount() {
        throw new AddCookNotFoundException();
    }

    public ItemStack getItemStack() {
        throw new AddCookNotFoundException();
    }

    public String getDropType() {
        throw new AddCookNotFoundException();
    }
}
