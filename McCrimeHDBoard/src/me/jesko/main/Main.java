package me.jesko.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.jesko.listener.McCrimeHDBoard;

public class Main extends JavaPlugin {
	
	
	
	@Override
	public void onEnable() {
		
	Bukkit.getConsoleSender().sendMessage("");	
	Bukkit.getConsoleSender().sendMessage("§bScoreboardPlugin by McCrimeHD erfolgreich");
	Bukkit.getConsoleSender().sendMessage("              §aAktiviert");
	Bukkit.getConsoleSender().sendMessage("");
	
	
	this.getServer().getPluginManager().registerEvents(new McCrimeHDBoard(this), this);
	}

	
	@Override
	public void onDisable() {
	Bukkit.getConsoleSender().sendMessage("");	
    Bukkit.getConsoleSender().sendMessage("§bScoreboardPlugin by McCrimeHD erfolgreich");
	Bukkit.getConsoleSender().sendMessage("              §cDeaktiviert");
	Bukkit.getConsoleSender().sendMessage("");	
		
	}
	
	
	
}
