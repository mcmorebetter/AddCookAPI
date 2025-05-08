package com.github.teamhungry22.addcook.core.line.lines;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.line.Line;
import com.github.teamhungry22.addcook.core.line.LineResult;
import com.github.teamhungry22.addcook.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

public class LineList implements Line {
    public LineList(List<Line> lines) {
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

    public void setResult(LineResult lineResult) {}

    public boolean isForce() {
        throw new AddCookNotFoundException();
    }

    public void setForce(boolean force) {}

    public List<Line> getLines() {
        throw new AddCookNotFoundException();
    }

    public void setLines(List<Line> lines) {
        throw new AddCookNotFoundException();
    }

    public void execute(Player player, Location location) {
        throw new AddCookNotFoundException();
    }
}
