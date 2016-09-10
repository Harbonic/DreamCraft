package com.chris.rpg.Listeners;

import com.chris.rpg.Core;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

/**
 * Created by Chris on 9/6/2016.
 */
public class DamageListener implements Listener
{
    private final Core plugin;
    public DamageListener(Core plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDamage(final EntityDamageEvent e)
    {
        if(!(e.getEntity() instanceof Player))
        {
            return;
        }
        Player p = (Player) e.getEntity();
        if(e.getCause() != EntityDamageEvent.DamageCause.STARVATION){
            e.setCancelled(true);
        }
    }
}
