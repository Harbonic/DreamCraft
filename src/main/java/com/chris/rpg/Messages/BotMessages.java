package com.chris.rpg.Messages;

import com.chris.rpg.Core;
import com.connorlinfoot.titleapi.TitleAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitScheduler;

import java.awt.*;

/**
 * Created by Chris on 9/5/2016.
 */
public class BotMessages
{

    public final Core plugin;
    public BotMessages(Core plugin)
    {
        this.plugin = plugin;
    }

    String bot = (ChatColor.DARK_PURPLE + "[BOT] CYL: " + ChatColor.WHITE);

    public void incorrectUse(CommandSender sender)
    {
        sender.sendMessage(bot + "Something went wrong while trying to execute this command!");
    }

    public void incorrectPerms(CommandSender sender)
    {
        sender.sendMessage(bot + "You do not have the correct permissions to execute this command.");
    }

    public void rankUp(CommandSender sender, Player target, String rank)
    {
        sender.sendMessage(bot + "You have set " + target.getName() + "'s rank to " + ChatColor.YELLOW + rank);
    }

    public void presJoin(Player p, PlayerJoinEvent e)
    {
        p.sendMessage(ChatColor.GRAY + "<--------------------------------------->");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage(ChatColor.GRAY + "=------ " +ChatColor.WHITE + "Welcome back " + ChatColor.DARK_RED + p.getName() + ChatColor.GRAY + " ------=");
        p.sendMessage(ChatColor.GRAY + "=--- " +ChatColor.WHITE + "You currently have " + "" + ChatColor.WHITE + "coins!" + ChatColor.GRAY + " ---=");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage(ChatColor.GRAY + "<--------------------------------------->");
        Bukkit.getServer().broadcastMessage(bot + ChatColor.DARK_RED + p.getName() + ChatColor.WHITE + " has entered the server!");
    }

    public void devJoin(Player p)
    {
        p.sendMessage(ChatColor.GRAY + "<--------------------------------------->");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage(ChatColor.GRAY + "=------ " +ChatColor.WHITE + "Welcome back " + ChatColor.RED + p.getName() + ChatColor.GRAY + " ------=");
        p.sendMessage(ChatColor.GRAY + "=--- " +ChatColor.WHITE + "This server is currently on version: " + ChatColor.GOLD + "0.0.7" + ChatColor.GRAY + "---=");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage(ChatColor.GRAY + "<--------------------------------------->");
    }
    public void memberJoin(Player p)
    {
        p.sendMessage(ChatColor.GRAY + "<--------------------------------------->");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage(ChatColor.GRAY + "=------ " +ChatColor.WHITE + "Welcome back " + ChatColor.RED + p.getName() + ChatColor.GRAY + " ------=");
        p.sendMessage(ChatColor.GRAY + "=--- " +ChatColor.WHITE + "Coins still need to be worked on!" + ChatColor.GRAY + "---=");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage(ChatColor.GRAY + "<--------------------------------------->");
    }
    public void firstTimeJoiner(final Player p)
    {
        //TitleAPI.sendTitle(p, 3,6,0,ChatColor.WHITE + "Welcome to the server " + ChatColor.GOLD + p.getName() + "!", ChatColor.WHITE + "I'm your personal assistant, Cyl!");
        /*
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable(){
            @Override
            public void run(){

            }
        },10 * 5);

        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
        {
            @Override
            public void run()
            {

            }
        }, 20 * 5);*/

        p.sendMessage(ChatColor.GRAY + "<--------------------------------------->");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage(ChatColor.GRAY + "<--------------------------------------->");
    }
}
