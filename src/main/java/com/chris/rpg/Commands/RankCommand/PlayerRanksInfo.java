package com.chris.rpg.Commands.RankCommand;

import com.chris.rpg.UdderCore;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

/**
 * Created by Chris on 6/17/2015.
 */
public class PlayerRanksInfo
{

    UdderCore plugin;
    public PlayerRanksInfo(UdderCore plugin)
    {
        this.plugin = plugin;
    }


    public void playerRankDev(Player p)
    {
        p.setAllowFlight(true);
        p.setLevel(5);
        p.setGameMode(GameMode.CREATIVE);
        p.setOp(true);
        p.setDisplayName(ChatColor.WHITE + "[" + ChatColor.RED + "Developer" + ChatColor.WHITE + "] " + ChatColor.GRAY + p.getName());
    }
    public void playerRankPresident(Player p)
    {
        p.setAllowFlight(true);
        p.setLevel(4);
        p.setGameMode(GameMode.CREATIVE);
        p.setOp(true);
        p.setDisplayName(ChatColor.WHITE + "[" + ChatColor.DARK_RED + "President" + ChatColor.WHITE + "] " + ChatColor.GRAY + p.getName());
    }
    public void playerRankHeadExecutive(Player p)
    {
        p.setAllowFlight(true);
        p.setLevel(3);
        p.setGameMode(GameMode.SURVIVAL);
        p.setOp(false);
        p.setDisplayName(ChatColor.WHITE + "[" + ChatColor.DARK_AQUA + "Head Exe." + ChatColor.WHITE + "] " + ChatColor.GRAY + p.getName());
    }
    public void playerRankExecutive(Player p)
    {
        p.setAllowFlight(false);
        p.setLevel(3);
        p.setGameMode(GameMode.SURVIVAL);
        p.setOp(false);
        p.setDisplayName(ChatColor.WHITE + "[" + ChatColor.AQUA + "Executive" + ChatColor.WHITE + "] " + ChatColor.GRAY + p.getName());
    }
    public void playerRankArchitect(Player p)
    {
        p.setAllowFlight(false);
        p.setLevel(3);
        p.setGameMode(GameMode.SURVIVAL);
        p.setOp(false);
        p.setDisplayName(ChatColor.WHITE + "[" + ChatColor.GREEN + "Architect" + ChatColor.WHITE + "] " + ChatColor.GRAY + p.getName());
    }
    public void playerRankMember(Player p)
    {
        p.setAllowFlight(false);
        p.setLevel(2);
        p.setGameMode(GameMode.SURVIVAL);
        p.setOp(false);
        p.setDisplayName(ChatColor.GRAY + p.getName());
    }
}
