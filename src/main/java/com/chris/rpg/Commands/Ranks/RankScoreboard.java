package com.chris.rpg.Commands.Ranks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.NameTagVisibility;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

/**
 * Created by Chris on 9/4/2016.
 */
public class RankScoreboard
{
    //Scoreboard board;
    public void rBoard(){
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getMainScoreboard();

        Team pres = board.registerNewTeam("pres");
        pres.setDisplayName(ChatColor.DARK_RED + "PRES");
        pres.setPrefix(ChatColor.DARK_RED + "PRES " + ChatColor.GRAY);
        pres.setNameTagVisibility(NameTagVisibility.ALWAYS);

        Team dev = board.registerNewTeam("dev");
        dev.setDisplayName(ChatColor.RED + "DEV");
        dev.setPrefix(ChatColor.RED + "DEV " + ChatColor.GRAY);
        dev.setNameTagVisibility(NameTagVisibility.ALWAYS);

        Team headExe = board.registerNewTeam("headExecutive");
        headExe.setDisplayName(ChatColor.DARK_AQUA + "Head Exe.");
        headExe.setPrefix(ChatColor.DARK_AQUA + "Head Exe. " + ChatColor.GRAY);
        headExe.setNameTagVisibility(NameTagVisibility.ALWAYS);

        Team executive = board.registerNewTeam("executive");
        executive.setDisplayName(ChatColor.AQUA + "Executive");
        executive.setPrefix(ChatColor.AQUA + "Executive " + ChatColor.GRAY);
        executive.setNameTagVisibility(NameTagVisibility.ALWAYS);

        Team designers = board.registerNewTeam("architect");
        designers.setDisplayName(ChatColor.GREEN + "Architect");
        designers.setPrefix(ChatColor.GREEN + "Architect " + ChatColor.GRAY);
        designers.setNameTagVisibility(NameTagVisibility.ALWAYS);

        Team member = board.registerNewTeam("member");
        member.setDisplayName(ChatColor.GRAY + "");
        member.setPrefix(ChatColor.GRAY + "" + ChatColor.GRAY);
        member.setNameTagVisibility(NameTagVisibility.ALWAYS);
    }
}
