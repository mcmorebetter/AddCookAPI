package com.github.teamhungry22.addcook.core.command;

import com.github.teamhungry22.addcook.core.util.MessageUtils;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.List;

public class RemoveCommand implements BaseCommand {
    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        if (args.length == 0) {
            removeCommandGuide(sender);
            return true;
        }

        if (sender instanceof Player player) {
            Location point = player.getLocation();
            double radius = Double.parseDouble(args[0]);
            List<Entity> addCookEntityList = point.getNearbyEntities(radius, radius, radius).stream().toList();

            int count = 0;
            for (Entity entity : addCookEntityList) {
                if (!entity.getScoreboardTags().contains("addcook_mob")) {
                    continue;
                }

                entity.remove();
                count++;
            }

            MessageUtils.send(sender, "<green><b>■ AddCook 엔티티 총 " + count + "개를 삭제했습니다!");
            return true;
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        if (args.length == 1) {
            return List.of("1", "2", "3", "5", "10");
        }
        return null;
    }

    private void removeCommandGuide(CommandSender sender) {
        MessageUtils.send(sender, new String[]{
                "<aqua><b>■ AddCook 삭제 명령어 가이드</b>",
                "<gray><b>| </b><gray>/addcook remove [범위]",
                "<gray><b>| </b><gray>범위: 자신을 기준으로 지울 범위"
        });
    }
}