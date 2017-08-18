package de.jesko.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import de.NeonnBukkit.CoinsAPI.CoinsAPI;
import me.jesko.main.Main;



public class McCrimeHDBoard implements Listener {
	
	private Main plugin;
	int sched;
	
	public McCrimeHDBoard(Main main) {
		this.plugin = main;
	}
	

	
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		this.updateScoreboard(p);
		
		
		
		sched = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {

			@Override
			public void run() {
				updateScoreboard(p);
				
			}
			
		}, 20, 20);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void updateScoreboard(Player p) {
		
	Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();	
	   Objective o = board.registerNewObjective("aaa", "bbb"); 
	    
	    o.setDisplaySlot(DisplaySlot.SIDEBAR);
	    o.setDisplayName("§7» §6§lDeinServer.de §7«");
	    
	    o.getScore("§f§lRang: ").setScore(12);
	    o.getScore("§b").setScore(11);
	    if (p.hasPermission("prefix.Owner")) {
	      o.getScore("§7» §4Owner").setScore(11);
	    } else if (p.hasPermission("prefix.Developer")) {
	      o.getScore("§7» §BDeveloper").setScore(11);
	    } else if (p.hasPermission("prefix.Supporter")) {
	      o.getScore("§7» §2Supporter").setScore(11);
	    } else if (p.hasPermission("prefix.Architeckt")) {
	      o.getScore("§7» §bArchiteckt").setScore(11);
	    } else if (p.hasPermission("prefix.premium")) {
	      o.getScore("§7» §6Premium").setScore(11);
	    } else if (p.hasPermission("prefix.premium+")) {
	      o.getScore("§7» §ePremium+").setScore(11);
	    } else if (p.hasPermission("prefix.YouTuber")) {
	      o.getScore("§7» §5YouTuber").setScore(11);
	    } else if (p.hasPermission("prefix.admin")) {
	      o.getScore("§7» §4Admin").setScore(11);
	    } else if (p.hasPermission("prefix.dünnschiss")) {
	      o.getScore("§7» §0Dünschiss").setScore(11);
	    } else {
	      o.getScore("§7» §7Spieler").setScore(11);
	    }
	    o.getScore("§f§lShop: ").setScore(9);
	    o.getScore("§7» §6shop.deinserver.de").setScore(8);
	    o.getScore("§1").setScore(7);
	    o.getScore("§f§lTeamSpeak:").setScore(7);
	    o.getScore("§7» §6ts.deinserver.de").setScore(6);
	    o.getScore("§a").setScore(5);
	    o.getScore("§6§lDeine Coins:").setScore(4);
	    o.getScore("§7» " + CoinsAPI.getCoins(p.getUniqueId().toString())).setScore(3);
	    o.getScore("§0").setScore(2);
	    o.getScore("§f§lServer:").setScore(1);
	    o.getScore("§7» §6Lobby").setScore(0);	
	    
	    
	    p.setScoreboard(board);
	}
	
	
	
	
	
	
	
	
	
	
	
}
