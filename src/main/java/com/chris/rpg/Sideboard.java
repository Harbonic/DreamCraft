package com.chris.rpg;

import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

/**
 * Created by Chris on 9/6/2016.
 */
public class Sideboard
{
    /* for later use
    private final Scoreboard scoreboard;
    private final Objective objective;

    public Sideboard() {
        this.scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        this.objective = scoreboard.registerNewObjective("Board", "dummy");

        this.objective.setDisplaySlot(DisplaySlot.SIDEBAR);
    }

    public Sideboard(Player player) {
        this.scoreboard = player.getScoreboard();
        this.objective = scoreboard.getObjective(DisplaySlot.SIDEBAR);
    }

    public Scoreboard getScoreboard() {
        return scoreboard;
    }

    public String getTitle() {
        return objective.getDisplayName();
    }

    public void setTitle(String name) {
        this.objective.setDisplayName(name);
    }

    public void set(int row, String text) {
        Validate.isTrue(16 > row, "Row can't be higher than 16");
        if(text.length() > 32) { text = text.substring(0, 32); }

        for(String entry : this.scoreboard.getEntries()) {
            if(this.objective.getScore(entry).getScore() == row) {
                this.scoreboard.resetScores(entry);
                break;
            }
        }

        this.objective.getScore(text).setScore(row);
    }

    public void remove(int row) {
        for(String entry : this.scoreboard.getEntries()) {
            if(this.objective.getScore(entry).getScore() == row) {
                this.scoreboard.resetScores(entry);
                break;
            }
        }
    }
    */
}
