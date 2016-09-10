package com.chris.rpg.Commands.Ranks;

import com.chris.rpg.Messages.BotMessages;
import com.chris.rpg.Core;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

/**
 * Created by Chris on 6/17/2015.
 */
public class PlayerRanksInfo
{

    Core plugin;
    public PlayerRanksInfo(Core plugin)
    {
        this.plugin = plugin;
    }

    //BotMessages botMessage = new BotMessages();

    public void playerRankDev(Player p)
    {
        File rankPlayerFile = new File(this.plugin.getDataFolder() + File.separator + "players", p.getUniqueId() + ".yml");
        FileConfiguration rankPlayer = YamlConfiguration.loadConfiguration(rankPlayerFile);
        rankPlayer.set("rank", "dev");
        try
        {
            rankPlayer.save(rankPlayerFile);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        p.setAllowFlight(true);
        p.setLevel(5);
        p.setGameMode(GameMode.CREATIVE);
        p.setOp(true);
        p.setDisplayName(ChatColor.RED + "Developer " + ChatColor.GRAY + p.getName());
    }
    public void playerRankPresident(Player p)
    {
        File rankPlayerFile = new File(this.plugin.getDataFolder() + File.separator + "players", p.getUniqueId() + ".yml");
        FileConfiguration rankPlayer = YamlConfiguration.loadConfiguration(rankPlayerFile);
        rankPlayer.set("rank", "president");
        try
        {
            rankPlayer.save(rankPlayerFile);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        p.setAllowFlight(true);
        p.setLevel(4);
        p.setGameMode(GameMode.CREATIVE);
        p.setOp(true);
        p.setDisplayName(ChatColor.DARK_RED + "President " + ChatColor.GRAY + p.getName());
    }
    public void playerRankHeadExecutive(Player p)
    {
        File rankPlayerFile = new File(this.plugin.getDataFolder() + File.separator + "players", p.getUniqueId() + ".yml");
        FileConfiguration rankPlayer = YamlConfiguration.loadConfiguration(rankPlayerFile);
        rankPlayer.set("rank", "headexecutive");
        try
        {
            rankPlayer.save(rankPlayerFile);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        p.setAllowFlight(true);
        p.setLevel(3);
        p.setGameMode(GameMode.SURVIVAL);
        p.setOp(false);
        p.setMaxHealth(10.0D);
        p.setDisplayName(ChatColor.DARK_AQUA + "Head Executive " + ChatColor.GRAY + p.getName());
    }
    public void playerRankExecutive(Player p)
    {
        File rankPlayerFile = new File(this.plugin.getDataFolder() + File.separator + "players", p.getUniqueId() + ".yml");
        FileConfiguration rankPlayer = YamlConfiguration.loadConfiguration(rankPlayerFile);
        rankPlayer.set("rank", "executive");
        try
        {
            rankPlayer.save(rankPlayerFile);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        p.setAllowFlight(false);
        p.setLevel(3);
        p.setGameMode(GameMode.SURVIVAL);
        p.setOp(false);
        p.setMaxHealth(10.0D);
        p.setDisplayName(ChatColor.AQUA + "Executive " + ChatColor.GRAY + p.getName());
    }
    public void playerRankArchitect(Player p)
    {
        File rankPlayerFile = new File(this.plugin.getDataFolder() + File.separator + "players", p.getUniqueId() + ".yml");
        FileConfiguration rankPlayer = YamlConfiguration.loadConfiguration(rankPlayerFile);
        rankPlayer.set("rank", "architect");
        try
        {
            rankPlayer.save(rankPlayerFile);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        p.setAllowFlight(false);
        p.setLevel(3);
        p.setGameMode(GameMode.SURVIVAL);
        p.setOp(false);
        p.setMaxHealth(10.0D);
        p.setDisplayName(ChatColor.GREEN + "Architect " + ChatColor.GRAY + p.getName());
    }
    public void playerRankMember(Player p)
    {
        File rankPlayerFile = new File(this.plugin.getDataFolder() + File.separator + "players", p.getUniqueId() + ".yml");
        FileConfiguration rankPlayer = YamlConfiguration.loadConfiguration(rankPlayerFile);
        rankPlayer.set("rank", "member");
        try
        {
            rankPlayer.save(rankPlayerFile);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        p.setAllowFlight(false);
        p.setLevel(2);
        p.setGameMode(GameMode.SURVIVAL);
        p.setOp(false);
        p.setMaxHealth(10.0D);
        p.setDisplayName(ChatColor.GRAY + p.getName());
    }
}
