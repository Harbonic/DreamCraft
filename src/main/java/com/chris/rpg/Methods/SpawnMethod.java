package com.chris.rpg.Methods;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Random;

/**
 * Created by Chris on 6/16/2015.
 */
public class SpawnMethod
{

    private static int randInt(int min, int max)
    {
        Random rand = new Random();
        //noinspection UnnecessaryLocalVariable
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public void teleportPlayers()
    {
        for (Player p : Bukkit.getOnlinePlayers())
        {
            p.teleport(new Location(p.getWorld(), randInt(1, 10), randInt(5, 5), randInt(1, 10)));
        }
    }
}
