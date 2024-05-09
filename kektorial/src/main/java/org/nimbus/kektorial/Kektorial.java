package org.nimbus.kektorial;

import org.bukkit.plugin.java.JavaPlugin;

public final class Kektorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Kektorial running");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Kektorial stopped");

    }
}
