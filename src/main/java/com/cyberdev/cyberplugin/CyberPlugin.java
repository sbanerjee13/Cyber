package com.cyberdev.cyberplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class CyberPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        // events
        getServer().getPluginManager().registerEvents(new InfiltratorItemEvent(), this);

        // commands
        getCommand("inf").setExecutor(new InfiltratorItemCommand());
    }
}
