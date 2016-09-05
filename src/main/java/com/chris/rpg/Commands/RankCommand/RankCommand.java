package com.chris.rpg.Commands.RankCommand;

import com.chris.rpg.UdderCore;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Chris on 6/17/2015.
 */

public class RankCommand implements CommandExecutor
{
    //PlayerRanksInfo rankInfo;
    UdderCore plugin;
    PlayerRanksInfo rankInfo;
    public RankCommand(UdderCore plugin)
    {
        rankInfo = new PlayerRanksInfo(plugin);
        this.plugin = plugin;
    }


    @Override
    @SuppressWarnings("deprecation")
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args)
    {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getMainScoreboard();
        if (args.length != 2)
        {
            sender.sendMessage(ChatColor.DARK_PURPLE + "BOT" + ChatColor.WHITE + " | " + ChatColor.GRAY + "Joe" + ChatColor.WHITE + ": Tsk tsk tsk!");
        }
        if (args.length == 2)
        {
            final Player target = Bukkit.getPlayerExact(args[0]);
            final Player p = (Player) sender;
            //target's file
            File commandTargetFile = new File(this.plugin.getDataFolder() + File.separator + "players", target.getUniqueId() + ".yml"); //Has to be unique id
            if (!commandTargetFile.exists())
            {
                try
                {
                    commandTargetFile.createNewFile();
                } catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
            FileConfiguration commandTarget = YamlConfiguration.loadConfiguration(commandTargetFile);

            //players file
            File commandPlayerFile = new File(this.plugin.getDataFolder() + File.separator + "players", p.getUniqueId() + ".yml"); //Has to be unique id
            if (!commandPlayerFile.exists())
            {
                try
                {
                    commandPlayerFile.createNewFile();
                } catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
            FileConfiguration commandPlayer = YamlConfiguration.loadConfiguration(commandPlayerFile);

            if(commandPlayer.getString("rank").equals("president") || commandPlayer.getString("rank").equals("dev") || !(sender instanceof Player))
            {

                if (!target.isOnline())
                {
                    sender.sendMessage(ChatColor.DARK_RED + "You either didn't execute the command correctly, or the player isn't online.");
                }

                File playersDir = new File(this.plugin.getDataFolder() + File.separator + "players");
                if (!playersDir.exists())
                {
                    playersDir.mkdir();
                }

                //Creating the file for each individual player.
                File targetPlayerFile = new File(this.plugin.getDataFolder() + File.separator + "players", target.getUniqueId() + ".yml"); //Has to be unique id
                if (!targetPlayerFile.exists())
                {
                    try
                    {
                        targetPlayerFile.createNewFile();
                    } catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                }
                FileConfiguration players = YamlConfiguration.loadConfiguration(targetPlayerFile);

                try
                {
                    players.save(targetPlayerFile);
                } catch (IOException ex)
                {
                    ex.printStackTrace();
                }

                //-------------------------------------------------------------------------------------------------------------------------------------------------------------//

                if (args[1].equalsIgnoreCase("president") || args[1].equalsIgnoreCase("pres"))
                {
                    players.set("rank", "president");
                    try
                    {
                        players.save(targetPlayerFile);
                    } catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                    sender.sendMessage(ChatColor.DARK_PURPLE + "BOT" + ChatColor.WHITE + " | " + ChatColor.GRAY + "Joe" + ChatColor.WHITE + ": You have set " + target.getName() + "'s rank to President.");
                    rankInfo.playerRankPresident(target);
                    Team pres = board.getTeam("pres");
                    pres.addEntry(target.getName());
                }
                if (args[1].equalsIgnoreCase("dev") || args[1].equalsIgnoreCase("developer"))
                {
                    players.set("rank", "dev");
                    try
                    {
                        players.save(targetPlayerFile);
                    } catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                    sender.sendMessage(ChatColor.DARK_PURPLE + "BOT" + ChatColor.WHITE + " | " + ChatColor.GRAY + "Joe" + ChatColor.WHITE + ": You have set " + target.getName() + "'s rank to Developer.");
                    rankInfo.playerRankDev(target);
                    Team dev = board.getTeam("dev");
                    dev.addEntry(target.getName());

                }
                if (args[1].equalsIgnoreCase("headexecutive") || args[1].equalsIgnoreCase("headexe") || args[1].equalsIgnoreCase("head"))
                {
                    players.set("rank", "headexecutive");
                    try
                    {
                        players.save(targetPlayerFile);
                    } catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                    sender.sendMessage(ChatColor.DARK_PURPLE + "BOT" + ChatColor.WHITE + " | " + ChatColor.GRAY + "Joe" + ChatColor.WHITE + ": You have set " + target.getName() + "'s rank to Head Executive.");
                    rankInfo.playerRankHeadExecutive(target);
                    Team headExe = board.getTeam("headExecutive");
                    headExe.addEntry(target.getName());
                }
                if (args[1].equalsIgnoreCase("executive"))
                {
                    players.set("rank", "executive");
                    try
                    {
                        players.save(targetPlayerFile);
                    } catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                    sender.sendMessage(ChatColor.DARK_PURPLE + "BOT" + ChatColor.WHITE + " | " + ChatColor.GRAY + "Joe" + ChatColor.WHITE + ": You have set " + target.getName() + "'s rank to Executive.");
                    rankInfo.playerRankExecutive(target);
                    Team executive = board.getTeam("executive");
                    executive.addEntry(target.getName());
                }
                if (args[1].equalsIgnoreCase("architect"))
                {
                    players.set("rank", "architect");
                    try
                    {
                        players.save(targetPlayerFile);
                    } catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                    sender.sendMessage(ChatColor.DARK_PURPLE + "BOT" + ChatColor.WHITE + " | " + ChatColor.GRAY + "Joe" + ChatColor.WHITE + ": You have set " + target.getName() + "'s rank to Architect.");
                    rankInfo.playerRankArchitect(target);
                    Team architect = board.getTeam("architect");
                    architect.addEntry(target.getName());
                }
                if (args[1].equalsIgnoreCase("member"))
                {
                    players.set("rank", "member");
                    try
                    {
                        players.save(targetPlayerFile);
                    } catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                    sender.sendMessage(ChatColor.DARK_PURPLE + "BOT" + ChatColor.WHITE + " | " + ChatColor.GRAY + "Joe" + ChatColor.WHITE + ": You have set " + target.getName() + "'s rank to Member.");
                    rankInfo.playerRankMember(target);
                    Team member = board.getTeam("member");
                    member.addEntry(target.getName());

                }
            }else
            {
                    sender.sendMessage(ChatColor.DARK_PURPLE + "BOT" + ChatColor.WHITE + " | " + ChatColor.GRAY + "Joe" + ChatColor.WHITE + ": Tsk tsk tsk!");
            }

        }


            return false;

        }
}
