package org.testmc.untitled;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Untitled extends JavaPlugin {

    private final Listener blockListener = new BlockListener();
    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("****************   Helloooo  *(********************");

        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(blockListener, this);

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("*(*********************   Shut this shit down *******************");
    }
}
