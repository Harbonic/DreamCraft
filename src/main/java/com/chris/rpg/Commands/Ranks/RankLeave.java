package com.chris.rpg.Commands.Ranks;

import com.chris.rpg.Core;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by Chris on 9/6/2016.
 */
public class RankLeave implements Listener
{

    private final Core plugin;
    public RankLeave(Core plugin)
    {
        this.plugin = plugin;
    }

    public void onLeave(PlayerQuitEvent e)
    {
        e.setQuitMessage(null);
    }
}
