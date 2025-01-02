package org.nimbus.kektorial.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.nimbus.kektorial.Kektorial;

public class StopBingoEvent implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        Kektorial.bingorunning = false;
        commandSender.sendMessage("set bingorunning to false");
        return true;
    }
}
