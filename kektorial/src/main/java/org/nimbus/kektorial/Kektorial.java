package org.nimbus.kektorial;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.nimbus.kektorial.commands.Info;
import org.nimbus.kektorial.commands.Kit;
import org.nimbus.kektorial.commands.StartBingoEvent;
import org.nimbus.kektorial.commands.StopBingoEvent;
import org.nimbus.kektorial.events.PlaceEvents;
import org.nimbus.kektorial.events.WelcomeEvents;
import org.nimbus.kektorial.events.EatEvents;
import org.nimbus.kektorial.items.JoelApple;


public final class Kektorial extends JavaPlugin {

    public static FileConfiguration config;
    public static boolean bingorunning = false;
    public static Player[] Team1 = new Player[64];
    public static Player[] Team2 = new Player[64];

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        config = getConfig();
        getCommand("info").setExecutor(new Info());
        getCommand("kit").setExecutor(new Kit());
        getCommand("startbingoevent").setExecutor(new StartBingoEvent());
        getCommand("stopbingoevent").setExecutor(new StopBingoEvent());

        getServer().getPluginManager().registerEvents(new WelcomeEvents(), this);
        getServer().getPluginManager().registerEvents(new EatEvents(), this);
        getServer().getPluginManager().registerEvents(new PlaceEvents(), this);

        getServer().addRecipe(JoelApple.getRecipe());

        getLogger().info("Kektorial started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Kektorial stopped");

    }
}
