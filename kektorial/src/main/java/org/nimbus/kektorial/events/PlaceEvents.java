package org.nimbus.kektorial.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlaceEvents implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced().getType().equals(Material.BEACON)) {
            event.getPlayer().sendMessage("Beacon detected");
        }
        else {
            event.getPlayer().sendMessage("Nicht Beacon detected");
        }
    }
}
