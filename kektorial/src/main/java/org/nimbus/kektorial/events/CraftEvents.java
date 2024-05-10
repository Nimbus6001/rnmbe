package org.nimbus.kektorial.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class CraftEvents implements Listener {

    @EventHandler
    public void onCraft(PlayerItemConsumeEvent event) {
        if (event.getItem().displayName().equals()) {
            event.getPlayer().sendMessage("Detected");
        }
        else {
            event.getPlayer().sendMessage("Nicht Detected");
        }

    }

}
