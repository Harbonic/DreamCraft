package com.chris.rpg.Listeners;

import com.chris.rpg.Commands.RankCommand.PlayerRanksInfo;
import com.chris.rpg.Commands.RankCommand.RankScoreboard;
import com.chris.rpg.Methods.MonsterTitleScreen;
import com.chris.rpg.UdderCore;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import java.io.File;
import java.io.IOException;

/**
 * Created by Chris on 6/15/2015.
 */
public class JoinListener implements Listener
{
    PlayerRanksInfo rankInfo;
    private final UdderCore plugin;
    public JoinListener(UdderCore plugin)
    {
        rankInfo = new PlayerRanksInfo(plugin);
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e)
    {
        final Player p = e.getPlayer();

        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getMainScoreboard();

        e.setJoinMessage(null);
        p.teleport(new Location(p.getWorld(), 100, 100, 100));
        File playersDir = new File(this.plugin.getDataFolder() + File.separator + "players");
        if(!playersDir.exists())
        {
            playersDir.mkdir();
        }

        //Creating the file for each individual player.
        File playerFile = new File(this.plugin.getDataFolder() + File.separator + "players", p.getUniqueId() + ".yml"); //Has to be unique id
        if(!playerFile.exists())
        {
            try
            {
                playerFile.createNewFile();
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
        FileConfiguration players = YamlConfiguration.loadConfiguration(playerFile);
        try
        {
            players.save(playerFile);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }


            if (p.hasPlayedBefore())
            {

                if (players.getString("rank").equalsIgnoreCase("president"))
                {
                    rankInfo.playerRankPresident(p);
                    Team pres = board.getTeam("pres");
                    pres.addEntry(p.getName());
                }
                else if (players.getString("rank").equalsIgnoreCase("dev"))
                {
                    rankInfo.playerRankDev(p);
                    Team dev = board.getTeam("dev");
                    dev.addEntry(p.getName());
                }
                else if (players.getString("rank").equalsIgnoreCase("headexecutive"))
                {
                    rankInfo.playerRankHeadExecutive(p);
                    Team headExe = board.getTeam("headExecutive");
                    headExe.addEntry(p.getName());
                }
                else if (players.getString("rank").equalsIgnoreCase("executive"))
                {
                    rankInfo.playerRankExecutive(p);
                    Team executive = board.getTeam("executive");
                    executive.addEntry(p.getName());
                }
                else if (players.getString("rank").equalsIgnoreCase("architect"))
                {
                    rankInfo.playerRankArchitect(p);
                    Team architect = board.getTeam("architect");
                    architect.addEntry(p.getName());
                }
                else if (players.getString("rank").equalsIgnoreCase("member"))
                {
                    rankInfo.playerRankMember(p);
                    Team member = board.getTeam("member");
                    member.addEntry(p.getName());
                }
            }
            else
            {
                rankInfo.playerRankMember(p);
                players.set("rank", "member");
                try
                {
                    players.save(playerFile);
                } catch (IOException ex)
                {
                    ex.printStackTrace();
                }
                Team member = board.getTeam("member");
                member.addEntry(p.getName());
            }
        /*
        * Titles - very useful
         */

        //MonsterTitleScreen titleObject = new MonsterTitleScreen();
        //titleObject.titleScreenWelcome(p);

    }
}
