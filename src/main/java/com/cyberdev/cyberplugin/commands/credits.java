package com.cyberdev.cyberplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class credits implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if(sender instanceof Player){
            sender.sendMessage(ChatColor.GREEN + "Plugin developed by: @sentosa, @icedjuro, @felípe.");
        }

        return false;
    }
}
