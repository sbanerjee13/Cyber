package com.cyberdev.cyberplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InfiltratorItemEvent implements Listener {

    @EventHandler
    public void gadgetInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        if ((a == Action.PHYSICAL) || (e.getItem() == null) || (e.getItem().getType() != Material.REDSTONE)) return;
        if(e.getItem().hasItemMeta() && e.getItem().getItemMeta().getDisplayName().equals(ChatColor.BLUE + "Infiltrator's Gadget")) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 2));

            ItemStack cooldownInf = new ItemStack(Material.GUNPOWDER);
            ItemMeta CDM = cooldownInf.getItemMeta();
            CDM.setDisplayName(ChatColor.BLUE + "Infiltrator's Gadget" + ChatColor.WHITE + " - " + ChatColor.RED + "BROKEN");
            cooldownInf.setItemMeta(CDM);

            p.getInventory().setItemInMainHand(cooldownInf);
            p.updateInventory();
        }
    }

    @EventHandler
    public void cancelPlace(BlockPlaceEvent e) {
        if(e.getItemInHand().getType() == Material.REDSTONE){
            System.out.println("block placed");
            if(e.getItemInHand().hasItemMeta() && e.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.BLUE + "Infiltrator's Gadget")){
                e.setCancelled(true);
            }
        }
    }
}
