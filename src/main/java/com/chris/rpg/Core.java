package com.chris.rpg;

import com.chris.rpg.Commands.Ranks.RankCommand;
import com.chris.rpg.Commands.Ranks.RankLeave;
import com.chris.rpg.Commands.Ranks.RankScoreboard;
import com.chris.rpg.Commands.Ranks.RankJoin;

import com.chris.rpg.Listeners.DamageListener;
import com.chris.rpg.Listeners.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import java.io.File;

/**
 * Created by Chris on 6/11/2015.

 */
public class Core extends JavaPlugin implements Listener
{

    private Plugin instance;


    @Override
    public void onEnable()
    {

        if(!getDataFolder().exists())
        {
            //noinspection ResultOfMethodCallIgnored
            getDataFolder().mkdir();
        }

        System.out.println("[MonsterNetwork] Saving default config...");
        if(getConfig() == null)
        {
            saveDefaultConfig();
        }
        File playersDir = new File(this.getDataFolder() + File.separator + "players");
        if (!playersDir.exists())
        {
            playersDir.mkdir();
        }
        System.out.println("[MonsterNetwork] Saved default config.");

        System.out.println("[MonsterNetwork] Registering events...");
        Bukkit.getPluginManager().registerEvents(this, this);
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new RankJoin(this), this);
        pm.registerEvents(new PlayerListener(this), this);
        pm.registerEvents(new RankLeave(this), this);
        pm.registerEvents(new DamageListener(this), this);
        System.out.println("[MonsterNetwork] Registered events.");

        System.out.println("[MonsterNetwork] Initializing scoreboard...");
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getMainScoreboard();

        if(board.getTeam("pres") == null){
            RankScoreboard rankBoard = new RankScoreboard();
            rankBoard.rBoard();
        }
        System.out.println("[MonsterNetwork] Initialized scoreboard.");

        System.out.println("[MonsterNetwork] Finishing commands...");
        this.getCommand("rank").setExecutor(new RankCommand(this));
        System.out.println("[MonsterNetwork] Done. Server now starting...");

        instance = this;

    }

    public Plugin getInstance(){
        return instance;
    }
}
