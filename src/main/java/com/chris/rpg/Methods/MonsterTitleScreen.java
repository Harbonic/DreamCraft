package com.chris.rpg.Methods;

import com.chris.rpg.Commands.RankCommand.PlayerRanksInfo;
import com.chris.rpg.Listeners.JoinListener;
import com.chris.rpg.Listeners.Title;
import com.chris.rpg.UdderCore;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Chris on 6/19/2015.
 */
public class MonsterTitleScreen implements Listener
{
    private final UdderCore plugin;
    public MonsterTitleScreen(UdderCore plugin)
    {
        this.plugin = plugin;
    }

    public void titleScreenWelcome(final Player p){
        Title title = new Title("MonsterNetwork", "You are currently on: " + ChatColor.GREEN + "Lobby 1!",1,3,0);
        title.setTitleColor(ChatColor.AQUA);
        title.setSubtitleColor(ChatColor.BLUE);

        title.send(p);


        plugin.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable(){
            @Override
            public void run(){
                Title title = new Title("MonsterNetwork", "Beta Games " + ChatColor.BLUE + "CounterBlock",0,3,1);
                title.setTitleColor(ChatColor.AQUA);
                title.setSubtitleColor(ChatColor.GRAY);
                title.send(p);
            }
        },10 * 5);

        plugin.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
        {
            @Override
            public void run()
            {
                Title title = new Title("MonsterNetwork", "Beta Games " + ChatColor.RED + "PacMan", 0, 3, 1);
                title.setTitleColor(ChatColor.AQUA);
                title.setSubtitleColor(ChatColor.GRAY);
                title.send(p);
            }
        }, 20 * 5);

        plugin.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
        {
            @Override
            public void run()
            {
                Title title = new Title("MonsterNetwork", "Beta Games " + ChatColor.RED + "[game #3]", 0, 3, 1);
                title.setTitleColor(ChatColor.AQUA);
                title.setSubtitleColor(ChatColor.GRAY);
                title.send(p);
            }
        }, 30 * 5);

        plugin.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
        {
            @Override
            public void run()
            {
                Title title = new Title("MonsterNetwork", "Beta Games " + ChatColor.RED + "[game #4]", 0, 3, 3);
                title.setTitleColor(ChatColor.AQUA);
                title.setSubtitleColor(ChatColor.GRAY);
                title.send(p);
            }
        }, 40 * 5);
    }
}
