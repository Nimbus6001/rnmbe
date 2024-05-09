package org.nimbus.kektorial;

import org.bukkit.plugin.java.JavaPlugin;
import org.nimbus.kektorial.commands.Info;
import org.nimbus.kektorial.welcome.WelcomeEvents;

public final class Kektorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("info").setExecutor(new Info());

        getServer().getPluginManager().registerEvents(new WelcomeEvents(), this);

        getLogger().info("Kektorial started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Kektorial stopped");

    }
}
