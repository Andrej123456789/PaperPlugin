package me.ringwormgo.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

public final class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getLogger().info("This is a test plugin");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}