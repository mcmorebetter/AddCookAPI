package com.github.teamhungry22.addcook.core.line;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Line {
    String getLine();
    Double getChance();
    LineType getType();
    LineResult getResult();
    void setResult(LineResult lineResult);
    boolean isForce();
    void setForce(boolean force);
    void execute(Player player, Location location);
}
