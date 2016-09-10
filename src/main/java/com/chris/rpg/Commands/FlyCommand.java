package com.chris.rpg.Commands;

import com.chris.rpg.Messages.ConsoleError;
import com.chris.rpg.Core;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

/**
 * Created by Chris on 9/5/2016.
 */
public class FlyCommand implements CommandExecutor
{

    Core plugin;
    public FlyCommand(Core plugin)
    {
        this.plugin = plugin;
    }

    ConsoleError cE = new ConsoleError();

    @Override
    @SuppressWarnings("deprecation")
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args)
    {
        if(args.length == 0)
        {
            if(sender instanceof Player)
            {
                Player p = (Player) sender;
                File commandPlayerFile = new File(this.plugin.getDataFolder() + File.separator + "players", p.getUniqueId() + ".yml"); //Has to be unique id
                FileConfiguration commandPlayer = YamlConfiguration.loadConfiguration(commandPlayerFile);


            }else{
                cE.errorConsole(sender);
            }
        }

        return false;
    }
}
