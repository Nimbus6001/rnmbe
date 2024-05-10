package org.nimbus.kektorial;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.nimbus.kektorial.commands.Info;
import org.nimbus.kektorial.commands.Kit;
import org.nimbus.kektorial.events.WelcomeEvents;
import org.nimbus.kektorial.events.EatEvents;


public final class Kektorial extends JavaPlugin {

    public static FileConfiguration config;

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        config = getConfig();
        getCommand("info").setExecutor(new Info());
        getCommand("kit").setExecutor(new Kit());

        getServer().getPluginManager().registerEvents(new WelcomeEvents(), this);
        getServer().getPluginManager().registerEvents(new EatEvents(), this);

        getLogger().info("Kektorial started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Kektorial stopped");

    }
}
