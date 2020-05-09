package com.cyberdev.cyberplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class InfiltratorItemCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(sender instanceof Player){
            Player player = (Player) sender;

            ArrayList<String> lore = new ArrayList<>();
            lore.add("");
            lore.add(ChatColor.GREEN + "Unique Active:");
            lore.add(ChatColor.BLUE + "Turn invisible for a short duration.");
            InfiltratorItem infiltratorItem = new InfiltratorItem(new ItemStack(Material.REDSTONE), ChatColor.BLUE + "Infiltrator's Gadget", lore);

            player.getInventory().addItem(infiltratorItem.getItemStack());
        }

        return false;
    }
}
