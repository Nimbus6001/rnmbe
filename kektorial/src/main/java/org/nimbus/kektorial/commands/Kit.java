package org.nimbus.kektorial.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.nimbus.kektorial.items.LegendaryWoodenSword;

public class Kit implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof ConsoleCommandSender) {
            commandSender.sendMessage("Console can't hold items");
            return true;
        }

        Player player = (Player) commandSender;
        player.getInventory().addItem(LegendaryWoodenSword.get());
        player.sendMessage("item given");

        return true;
    }
}
