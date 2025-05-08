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
    public LineDrop(String line, String itemName, String amount, double chance, String dropType) {
        throw new AddCookNotFoundException();
    }

    public static Optional<LineDrop> build(String line) {
        throw new AddCookNotFoundException();
    }

    public static Optional<LineDrop> build(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public void execute(Player player, Location location) {
        throw new AddCookNotFoundException();
    }

    private void dropItem(Location location) {
        throw new AddCookNotFoundException();
    }

    private void giveItem(Player player, Location location) {
        throw new AddCookNotFoundException();
    }

    public String getLine() {
        throw new AddCookNotFoundException();
    }

    public Double getChance() {
        throw new AddCookNotFoundException();
    }

    public void setChance(double chance) {
        throw new AddCookNotFoundException();
    }

    public LineType getType() {
        throw new AddCookNotFoundException();
    }

    public LineResult getResult() {
        throw new AddCookNotFoundException();
    }

    public void setResult(LineResult lineResult) {
        throw new AddCookNotFoundException();
    }

    public boolean isForce() {
        throw new AddCookNotFoundException();
    }

    public void setForce(boolean force) {
        throw new AddCookNotFoundException();
    }

    public String getItemName() {
        throw new AddCookNotFoundException();
    }

    public void setItemName(String itemName) {
        throw new AddCookNotFoundException();
    }

    public String getAmount() {
        throw new AddCookNotFoundException();
    }

    public void setAmount(String amount) {
        throw new AddCookNotFoundException();
    }

    public ItemStack getItemStack() {
        throw new AddCookNotFoundException();
    }

    public void setItemStack(ItemStack itemStack) {
        throw new AddCookNotFoundException();
    }

    public String getDropType() {
        throw new AddCookNotFoundException();
    }
}
