package com.cyberdev.cyberplugin;

import com.cyberdev.cyberplugin.commands.*; // import all commands
import org.bukkit.plugin.java.JavaPlugin;

public final class CyberPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Enabling Cyber... ensure that Vault/Economy APIs are accessible...");

        // handle commands
        getCommand("credits").setExecutor(new credits());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Disabling Cyber...");
    }
}
