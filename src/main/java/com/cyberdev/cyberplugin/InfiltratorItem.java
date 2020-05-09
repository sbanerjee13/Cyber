package com.cyberdev.cyberplugin;

import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class InfiltratorItem {
    public ItemStack itemStack;
    public String name;
    public ArrayList<String> lore;

    // CONSTRUCTOR

    public InfiltratorItem( ItemStack itemStack, String name, ArrayList<String> lore){
        this.name = name;
        this.itemStack = itemStack;
        this.lore = lore;

        ItemMeta im = this.itemStack.getItemMeta();
        im.setDisplayName(name);
        im.setLore(this.lore);
        this.itemStack.setItemMeta(im);
    }

    // GETTER

    public ItemStack getItemStack() {
        return itemStack;
    }

    // METHODS

}
