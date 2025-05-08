// 최적화된 MakerResultAnvilLoader
package com.github.teamhungry22.addcook.core.objects.gui.loader;

import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import com.github.teamhungry22.addcook.core.line.lines.LineDrop;
import com.github.teamhungry22.addcook.core.objects.gui.inventory.MakerInventory;
import org.bukkit.entity.Player;

public class MakerResultAnvilLoader {
    // 여기서 MakerResultLoader, MakerORItemLoader 들은 모두 직접 가져오게 변경
    // 로드 순서가 맞지 않기 때문에
    public MakerResultAnvilLoader(MakerInventory makerInventory) {
        throw new AddCookNotFoundException();
    }

    public void load(Player player, String type, int clickSlot) {
        throw new AddCookNotFoundException();
    }

    private LineDrop loadLineDrop(Player player, String menuType, int clickSlot, int orItemIndex) {
        throw new AddCookNotFoundException();
    }

    private void updateLineData(Player player, String menuType, int clickSlot, LineDrop lineDrop, int orItemIndex) {
        throw new AddCookNotFoundException();
    }

    private String getCurrentValue(String type, LineDrop lineDrop) {
        throw new AddCookNotFoundException();
    }

    private LineDrop applyValue(String type, String input, LineDrop lineDrop) {
        throw new AddCookNotFoundException();
    }
}
