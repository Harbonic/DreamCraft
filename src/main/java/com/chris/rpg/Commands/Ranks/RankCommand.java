package com.chris.rpg.Commands.Ranks;

import com.chris.rpg.Messages.BotMessages;
import com.chris.rpg.Core;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import java.io.File;

/**
 * Created by Chris on 6/17/2015.
 */

public class RankCommand implements CommandExecutor
{
    //PlayerRanksInfo rankInfo;
    Core plugin;
    PlayerRanksInfo rankInfo;

    public RankCommand(Core plugin)
    {
        rankInfo = new PlayerRanksInfo(plugin);
        this.plugin = plugin;
    }

    BotMessages botMessage = new BotMessages(plugin);


    @Override
    @SuppressWarnings("deprecation")
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args)
    {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getMainScoreboard();

        if(sender instanceof Player || sender instanceof ConsoleCommandSender)
        {
                if (args.length != 2)
                {
                    botMessage.incorrectUse(sender);
                }
                if (args.length == 2)
                {
                    final Player target = Bukkit.getPlayerExact(args[0]);
                    File rankTargetFile = new File(this.plugin.getDataFolder() + File.separator + "players", target.getUniqueId() + ".yml");
                    FileConfiguration rankTarget = YamlConfiguration.loadConfiguration(rankTargetFile);
                    if (rankTarget.getString("rank").equals("president") || rankTarget.getString("rank").equals("dev") || (sender instanceof ConsoleCommandSender))
                    {

                    if (!target.isOnline())
                    {
                        botMessage.incorrectUse(sender);
                    }

                    if (args[1].equalsIgnoreCase("president") || args[1].equalsIgnoreCase("pres"))
                    {
                        botMessage.rankUp(sender, target, "PRESIDENT");
                        rankInfo.playerRankPresident(target);
                        Team pres = board.getTeam("pres");
                        pres.addEntry(target.getName());
                    }
                    if (args[1].equalsIgnoreCase("dev") || args[1].equalsIgnoreCase("developer"))
                    {
                        botMessage.rankUp(sender, target, "DEVELOPER");
                        rankInfo.playerRankDev(target);
                        Team dev = board.getTeam("dev");
                        dev.addEntry(target.getName());

                    }
                    if (args[1].equalsIgnoreCase("headexecutive") || args[1].equalsIgnoreCase("headexe") || args[1].equalsIgnoreCase("head"))
                    {
                        botMessage.rankUp(sender, target, "HEAD EXECUTIVE");
                        rankInfo.playerRankHeadExecutive(target);
                        Team headExe = board.getTeam("headExecutive");
                        headExe.addEntry(target.getName());
                    }
                    if (args[1].equalsIgnoreCase("executive"))
                    {
                        botMessage.rankUp(sender, target, "EXECUTIVE");
                        rankInfo.playerRankExecutive(target);
                        Team executive = board.getTeam("executive");
                        executive.addEntry(target.getName());
                    }
                    if (args[1].equalsIgnoreCase("architect"))
                    {
                        botMessage.rankUp(sender, target, "ARCHITECT");
                        rankInfo.playerRankArchitect(target);
                        Team architect = board.getTeam("architect");
                        architect.addEntry(target.getName());
                    }
                    if (args[1].equalsIgnoreCase("member"))
                    {
                        botMessage.rankUp(sender, target, "MEMBER");
                        rankInfo.playerRankMember(target);
                        Team member = board.getTeam("member");
                        member.addEntry(target.getName());

                    }
                }else
                    {
                        botMessage.incorrectPerms(sender);
                    }

            }
        }
        /*else{
            if (args.length != 2)
            {
                botMessage.incorrectUse(sender);
            }
            if (args.length == 2)
            {
                final Player target = Bukkit.getPlayerExact(args[0]);
                if (!target.isOnline())
                {
                    botMessage.incorrectUse(sender);
                }

                if (args[1].equalsIgnoreCase("president") || args[1].equalsIgnoreCase("pres"))
                {
                    botMessage.rankUp(sender, target, "PRESIDENT");
                    rankInfo.playerRankPresident(target);
                    Team pres = board.getTeam("pres");
                    pres.addEntry(target.getName());
                }
                if (args[1].equalsIgnoreCase("dev") || args[1].equalsIgnoreCase("developer"))
                {
                    botMessage.rankUp(sender, target, "DEVELOPER");
                    rankInfo.playerRankDev(target);
                    Team dev = board.getTeam("dev");
                    dev.addEntry(target.getName());

                }
                if (args[1].equalsIgnoreCase("headexecutive") || args[1].equalsIgnoreCase("headexe") || args[1].equalsIgnoreCase("head"))
                {
                    botMessage.rankUp(sender, target, "HEAD EXECUTIVE");
                    rankInfo.playerRankHeadExecutive(target);
                    Team headExe = board.getTeam("headExecutive");
                    headExe.addEntry(target.getName());
                }
                if (args[1].equalsIgnoreCase("executive"))
                {
                    botMessage.rankUp(sender, target, "EXECUTIVE");
                    rankInfo.playerRankExecutive(target);
                    Team executive = board.getTeam("executive");
                    executive.addEntry(target.getName());
                }
                if (args[1].equalsIgnoreCase("architect"))
                {
                    botMessage.rankUp(sender, target, "ARCHITECT");
                    rankInfo.playerRankArchitect(target);
                    Team architect = board.getTeam("architect");
                    architect.addEntry(target.getName());
                }
                if (args[1].equalsIgnoreCase("member"))
                {
                    botMessage.rankUp(sender, target, "MEMBER");
                    rankInfo.playerRankMember(target);
                    Team member = board.getTeam("member");
                    member.addEntry(target.getName());

                }
            }

        }*/


            return false;
        }
}
