package me.spirit.antispam;

import me.spirit.antispam.event.ChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiSpam extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Starting AntiSpam...");

        getLogger().info("Loading Events...");
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
        getLogger().info("Events Loaded!");

        getLogger().info("AntiSpam has been Enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("AntiSpam has been Disabled.");
    }
}
