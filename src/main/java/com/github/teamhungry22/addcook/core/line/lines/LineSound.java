package com.github.teamhungry22.addcook.core.line.lines;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.line.Line;
import com.github.teamhungry22.addcook.core.line.LineResult;
import com.github.teamhungry22.addcook.core.line.LineType;
import com.github.teamhungry22.addcook.core.util.MathUtils;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.Optional;

public class LineSound implements Line {
    public LineSound(String line, String sound, float volume, float pitch, double chance) {
        throw new AddCookNotFoundException();
    }

    public static Optional<LineSound> build(String line) {
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

    private void playSound(Player player, Location location) {
        throw new AddCookNotFoundException();
    }

    public String getSound() {
        throw new AddCookNotFoundException();
    }

    public float getVolume() {
        throw new AddCookNotFoundException();
    }

    public float getPitch() {
        throw new AddCookNotFoundException();
    }
}
