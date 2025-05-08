package com.github.teamhungry22.addcook.core.line.lines;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.line.Line;
import com.github.teamhungry22.addcook.core.line.LineResult;
import com.github.teamhungry22.addcook.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Optional;

public class LineExp implements Line {
    public LineExp(String line, String amount, double chance) {
        throw new AddCookNotFoundException();
    }

    public static Optional<LineExp> build(String line) {
        throw new AddCookNotFoundException();
    }

    public void execute(Player player, Location location) {
        throw new AddCookNotFoundException();
    }

    public String getLine() {
        throw new AddCookNotFoundException();
    }

    public Double getChance() {
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

    public String getAmount() {
        throw new AddCookNotFoundException();
    }
}
