package org.nimbus.kektorial.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.jetbrains.annotations.NotNull;

public class Info implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof ConsoleCommandSender) {
            commandSender.sendMessage("info für konsole kp");
            return true;
        }

        if (commandSender.hasPermission("info")) {
            commandSender.sendMessage(ChatColor.GOLD + (ChatColor.BOLD + "Plugin info kp"));
            return true;
        }
        commandSender.sendMessage(ChatColor.RED + "Maul");
        return true;
    }
}
