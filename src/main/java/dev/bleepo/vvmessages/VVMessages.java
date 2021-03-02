package dev.bleepo.vvmessages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public final class VVMessages extends JavaPlugin {
    public void onEnable() {
        BukkitScheduler scheduler = getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                String message = getConfig().getString("message1");
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', message));
            }
        }, 0L, 1800L);

        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                String messagee = getConfig().getString("message2");
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', messagee));
            }
        }, 0L, 22800L);

        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                String messageee = getConfig().getString("message3");
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', messageee));
            }
        }, 0L, 34800L);

        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                String messageeee = getConfig().getString("message4");
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', messageeee));
            }
        }, 0L, 44400L);
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.DARK_GREEN + "Goodbye!");
        getLogger().info(ChatColor.DARK_GREEN + "VV-Messages by Bleepo has been unloaded and disabled!");
    }
}
