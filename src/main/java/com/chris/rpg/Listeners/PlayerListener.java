package com.chris.rpg.Listeners;

import com.chris.rpg.UdderCore;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * Created by Chris on 6/18/2015.
 */
public class PlayerListener implements Listener
{
    private final UdderCore plugin;
    public PlayerListener(UdderCore plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerChat(AsyncPlayerChatEvent e)
    {
        e.setFormat("%s:" + ChatColor.WHITE + " %s");
    }

}
