package com.example.lobby;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbyCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("LobbyCommand enabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;

        player.sendMessage("§aSending you to lobby...");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "server 2 " + player.getName());

        return true;
    }
}
