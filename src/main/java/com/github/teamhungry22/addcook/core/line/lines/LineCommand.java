package com.github.teamhungry22.addcook.core.line.lines;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.line.Line;
import com.github.teamhungry22.addcook.core.line.LineResult;
import com.github.teamhungry22.addcook.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Optional;

public class LineCommand implements Line {
    public LineCommand(String line, String command, double chance, boolean isPlayerCommand) {
        throw new AddCookNotFoundException();
    }

    public static Optional<LineCommand> build(String line) {
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

    private void executeCommand(Player player) {
        throw new AddCookNotFoundException();
    }

    public String getCommand() {
        throw new AddCookNotFoundException();
    }

    public boolean isPlayerCommand() {
        throw new AddCookNotFoundException();
    }
}
