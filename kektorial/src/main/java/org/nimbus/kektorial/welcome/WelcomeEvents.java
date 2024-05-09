package org.nimbus.kektorial.welcome;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.nimbus.kektorial.Kektorial;

public class WelcomeEvents implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if (event.getPlayer().hasPermission("join.silent"))
            event.setJoinMessage("");
        event.getPlayer().sendMessage(ChatColor.GOLD + "Willkommen, " + event.getPlayer().getName() + ". Du " + Kektorial.config.getString("onPlayerJoin.slur") + ".");
    }
}
