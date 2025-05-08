package com.github.teamhungry22.addcook.core.line;

import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Optional;

public class LineManager {
    public LineManager(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    public List<Line> line(Player player, String result) {
        throw new AddCookNotFoundException();
    }

    public List<Line> line(Player player, List<String> resultList) {
        throw new AddCookNotFoundException();
    }

    private Optional<Line> getLine(Player player, String line) {
        throw new AddCookNotFoundException();
    }
}
