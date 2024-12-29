package org.nimbus.kektorial.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import java.util.Objects;

public class EatEvents implements Listener {

    @EventHandler
    public void onCraft(PlayerItemConsumeEvent event) {
        if (event.getItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "Joel Apple") && event.getItem().getItemMeta().getCustomModelData() == 4201) {
            event.getPlayer().sendMessage("JoelApple Detected");
        }
        else {
            event.getPlayer().sendMessage("Nicht JoelApple Detected");
        }

    }

}
