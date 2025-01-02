package org.nimbus.kektorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.nimbus.kektorial.Kektorial;
import org.nimbus.kektorial.items.JoelApple;
import org.nimbus.kektorial.items.LegendaryWoodenSword;

public class StartBingoEvent implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        String cantstart = "couldn't start bingo. define teams. arg[0] = amount of players in team1. arg[1] = amount of players in team2. then players in team1. then players in team2";
        if (Kektorial.bingorunning) {
            commandSender.sendMessage("already running.");
            return true;
        }
        try {
            if (args.length != Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + 2) {
                commandSender.sendMessage(cantstart);
                return true;
            }
        } catch (Exception e) {
            commandSender.sendMessage(cantstart);
            return true;
        }

        commandSender.sendMessage("Team 1:" + ChatColor.BOLD);
        for (int i = 2; i <= Integer.parseInt(args[0]) + 1; i++) {
            if (Bukkit.getPlayerExact(args[i]) == null) {
                commandSender.sendMessage("Player " + args[i] + "not online. cancelling.");
                Kektorial.Team1 = null;
                Kektorial.Team2 = null;
                commandSender.sendMessage(cantstart);
                return true;
            }
            commandSender.sendMessage(Bukkit.getPlayerExact(args[i]).getName());
            Kektorial.Team1[i - 2] = Bukkit.getPlayerExact(args[i]);
        }
        commandSender.sendMessage("Team 2:" + ChatColor.BOLD);
        for (int i = 2 + Integer.parseInt(args[0]); i <= Integer.parseInt(args[0]) + Integer.parseInt((args[1])) + 1; i++) {
            if (Bukkit.getPlayerExact(args[i]) == null) {
                commandSender.sendMessage("Player " + args[i] + "not online. cancelling.");
                Kektorial.Team1 = null;
                Kektorial.Team2 = null;
                commandSender.sendMessage(cantstart);
                return true;
            }
            commandSender.sendMessage(Bukkit.getPlayerExact(args[i]).getName());
            Kektorial.Team1[i - 2 - Integer.parseInt(args[0])] = Bukkit.getPlayerExact(args[i]);
        }

        Kektorial.bingorunning = true;
        return true;
    }
}

