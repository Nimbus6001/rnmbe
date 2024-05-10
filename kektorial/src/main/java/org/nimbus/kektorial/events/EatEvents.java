package org.nimbus.kektorial.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class EatEvents implements Listener {

    @EventHandler
    public void onCraft(PlayerItemConsumeEvent event) {
        if (event.getItem().getItemMeta().getDisplayName().equals("Joel Apple")) {
            event.getPlayer().sendMessage("Detected");
        }
        else {
            event.getPlayer().sendMessage("Nicht Detected");
        }

    }

}
