package org.nimbus.kektorial.events;

import org.bukkit.block.Beacon;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlaceEvents implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced().equals(new Block)) {
            event.getPlayer().sendMessage("Beacon detected");
        }
        else {
            event.getPlayer().sendMessage("Nicht Beacon detected");
        }
    }
}
