package me.spirit.antispam.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.io.IOException;

public class ChatEvent implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void onCommand(AsyncPlayerChatEvent e) throws IOException {
        if (e.getMessage().startsWith("/skill")){
            e.setCancelled(true);
        }
    }
}