package me.ringwormgo.helloworld

import org.bukkit.plugin.java.JavaPlugin

class HelloWorldKtKt : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("This is a test plugin")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}