package com.github.teamhungry22.addcook.core.objects.gui;

import com.comphenix.protocol.events.PacketListener;
import com.github.teamhungry22.addcook.AddCook;
import com.github.teamhungry22.addcook.api.AddCookNotFoundException;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

/**
 * GUI의 이름을 패킷으로 변경하는 클래스
 */
public class GuiView {
    public GuiView(AddCook plugin) {
        throw new AddCookNotFoundException();
    }

    private PacketListener getOpenWindowPacketListener() {
        throw new AddCookNotFoundException();
    }

    private PacketListener getCloseWindowPacketListener() {
        throw new AddCookNotFoundException();
    }

    public void setPlayerInventoryTitle(Player player, Component text) {
        throw new AddCookNotFoundException();
    }

    private void sendOpenScreenPacket(Player player, int windowId, Object windowType, String title) {
        throw new AddCookNotFoundException();
    }
}