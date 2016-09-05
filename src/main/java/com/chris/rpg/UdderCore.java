package com.chris.rpg;

import com.chris.rpg.Commands.RankCommand.RankCommand;
import com.chris.rpg.Commands.RankCommand.RankScoreboard;
import com.chris.rpg.Listeners.JoinListener;

import com.chris.rpg.Listeners.PlayerListener;
import com.chris.rpg.Methods.MonsterTitleScreen;
import net.minecraft.server.v1_8_R3.CommandHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

/**
 * Created by Chris on 6/11/2015.

 */
public class UdderCore extends JavaPlugin implements Listener
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

        System.out.println("Saving default config...");
        if(getConfig() == null)
        {
            saveDefaultConfig();
        }
        System.out.println("Saved default config.");

        System.out.println("Registering events...");
        Bukkit.getPluginManager().registerEvents(this, this);
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new JoinListener(this), this);
        pm.registerEvents(new PlayerListener(this), this);
        System.out.println("Registered events.");

        System.out.println("Initializing scoreboard...");
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getMainScoreboard();


        if(board.getTeam("pres") == null){
            RankScoreboard rankBoard = new RankScoreboard();
            rankBoard.rBoard();
        }
        System.out.println("Initialized scoreboard.");

        System.out.println("Finishing commands...");
        this.getCommand("rank").setExecutor(new RankCommand(this));
        System.out.println("Done.");

        instance = this;

    }

    public Plugin getInstance(){
        return instance;
    }
}
