package com.chris.rpg.Messages;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Chris on 9/5/2016.
 */
public class ConsoleError
{
    public void errorConsole(CommandSender p)
    {
        p.sendMessage(ChatColor.RED + "This command cannot be run using the console.");
    }
}
