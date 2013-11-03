package me.michaelkrauty.CommandBlocks;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandBlocks extends JavaPlugin implements Listener{
	
	private static String blockname = null;
	public ArrayList<String> creating = new ArrayList<String>();
	public ArrayList<String> editing = new ArrayList<String>();
	public ArrayList<String> editingblock = new ArrayList<String>();
	public ArrayList<String> reading = new ArrayList<String>();
	public ArrayList<String> removing = new ArrayList<String>();
	
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
		saveDefaultConfig();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]){
		
		if(commandLabel.equalsIgnoreCase("commandblocks") || commandLabel.equalsIgnoreCase("cmdb") || commandLabel.equalsIgnoreCase("cb")){
			if(sender.hasPermission("commandblocks.use")){
				Player player = (Player) sender;
				
				if(args[0].equalsIgnoreCase("help") || args == null){
					sender.sendMessage("##_CommandBlocks help menu_##");
					sender.sendMessage("In commands, <player> will be replaced by the player who clicked the block's name.");
					sender.sendMessage("Commands:");
					sender.sendMessage("/cb create: After running this command, click a block.");
					sender.sendMessage("/cb cancelcreate: Cancel commandblock creation");
					sender.sendMessage("/cb edit: After running this command, click a CommandBlock block.");
					sender.sendMessage("/cb canceledit: If you do /cmdb edit, but don't want to edit a block, do this command.");
					sender.sendMessage("/cb done: Exit cmdb editing mode");
					sender.sendMessage("/cb <line number> <command>: After entering editing mode, add command lines to a CommandBlock block.");
					sender.sendMessage("/cb read: After running this command, click a CommandBlock block.");
				}
				
				if(args[0].equalsIgnoreCase("create")){
					creating.add(player.getName());
					sender.sendMessage("Now, click your commandblock (any block will do)");
					return true;
				}
				
				if(args[0].equalsIgnoreCase("remove")){
					removing.add(player.getName());
					sender.sendMessage("Now, click the commandblock you want to remove.");
					return true;
				}
				
				if(args[0].equalsIgnoreCase("edit")){
					editing.add(player.getName());
					sender.sendMessage("Entered CommandBlocks editing mode.");
					sender.sendMessage("Click the commandblock you want to edit.");
					return true;
				}
				
				if(args[0].equals("1") || args[0].equals("2") || args[0].equals("3") || args[0].equals("4") || args[0].equals("5") || args[0].equals("6") || args[0].equals("7") || args[0].equals("8") || args[0].equals("9") || args[0].equals("10") || args[0].equals("11") || args[0].equals("12") || args[0].equals("13") || args[0].equals("14") || args[0].equals("15") || args[0].equals("16") || args[0].equals("17") || args[0].equals("18") || args[0].equals("19") || args[0].equals("20")){
					if(editingblock.contains(player.getName())){
						
						if(args.length == 1){
							sender.sendMessage("You didn't put a command in there!");
							return true;
						}
						if(args.length == 2){
							getConfig().set("signs." + blockname + "." + args[0], args[1]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 3){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 4){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 5){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 6){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 7){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 8){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 9){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 10){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 11){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 12){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 13){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 14){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 15){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 16){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 17){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15] + " " + args[16]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 18){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15] + " " + args[16] + " " + args[17]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 19){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15] + " " + args[16] + " " + args[17] + " " + args[18]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length == 20){
							getConfig().set("signs." + blockname + "." + args[0], args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10] + " " + args[11] + " " + args[12] + " " + args[13] + " " + args[14] + " " + args[15] + " " + args[16] + " " + args[17] + " " + args[18] + " " + args[19]);
							sender.sendMessage("Added line.");
							saveConfig();
							reloadConfig();
						}
						if(args.length > 20){
							sender.sendMessage("You can only put 20 words in a single line!");
							return true;
						}
						sender.sendMessage("If you're done editing the sign, do /cmdb done");
						sender.sendMessage("If you want to add more lines, do /cmdb <line number> <command>");
					}
				}
				if(args[0].equalsIgnoreCase("done")){
					if(editingblock.contains(player.getName())){
						editingblock.remove(player.getName());
						sender.sendMessage("No longer editing sign!");
						return true;
					}
					if(!editingblock.contains(player.getName())){
						sender.sendMessage("You aren't editing a sign!");
						return true;
					}
				}
				if(args[0].equalsIgnoreCase("read")){
					reading.add(player.getName());
					return true;
				}
				if(args[0].equalsIgnoreCase("canceledit")){
					if(editing.contains(player.getName())){
						editing.remove(player.getName());
						sender.sendMessage("Canceled sign edit");
						return true;
					}else{
						sender.sendMessage("You aren't editing a commandblock!");
						return true;
					}
				}
				if(args[0].equalsIgnoreCase("cancelcreate")){
					if(creating.contains(player.getName())){
						creating.remove(player.getName());
						sender.sendMessage("Cancelled creation.");
						return true;
					}else{
						sender.sendMessage("You aren't creating a commandblock!");
						return true;
					}
				}
				if(args[0].equalsIgnoreCase("cancelread")){
					if(reading.contains(player.getName())){
						reading.remove(player.getName());
						sender.sendMessage("Cancelled reading.");
						return true;
					}else{
						sender.sendMessage("You aren't creating a commandblock!");
						return true;
					}
				}
			}else{
				sender.sendMessage(ChatColor.RED + "You don't have permission to do that!");
				return true;
			}
		}
		return true;
	}
	
	@EventHandler
	public void onPlayerClick(PlayerInteractEvent event){
		if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
			Player player = event.getPlayer();
			int x = event.getClickedBlock().getLocation().getBlockX();
			int y = event.getClickedBlock().getLocation().getBlockY();
			int z = event.getClickedBlock().getLocation().getBlockZ();
			String world = event.getClickedBlock().getLocation().getWorld().getName();
			
			blockname = x + "-" + y + "-" + z + "-" + world;
			
			if(creating.contains(player.getName())){
				creating.remove(player.getName());
				
				getConfig().set("signs." + blockname + ".owner", player.getName());
				getConfig().set("signs." + blockname + ".1", "say Default CommandBlocks Command.");
				player.sendMessage("Sign made: " + x + "-" + y + "-" + z + "-" + world);
				player.sendMessage("Entered editing mode. Use /cmdb <line number> <command> to edit this command sign. Use /cmdb done when finished.");
				saveConfig();
				reloadConfig();
				editingblock.add(player.getName());
			}
			if(removing.contains(player.getName())){
				removing.remove(player.getName());
				getConfig().set("signs." + blockname, "deleted.");
				player.sendMessage("CommandBlock deleted.");
				saveConfig();
				reloadConfig();
			}
			if(editing.contains(player.getName())){
				editing.remove(player.getName());
				editingblock.add(player.getName());
				player.sendMessage("Now do: /cmdb <line number> <command>");
			}
			if(reading.contains(player.getName())){
				reading.remove(player.getName());
				if(getConfig().getString("signs." + blockname + ".1") != null){
					player.sendMessage(getConfig().getString("1: " + "signs." + blockname + ".1"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".2") != null){
					player.sendMessage(getConfig().getString("2: " + "signs." + blockname + ".2"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".3") != null){
					player.sendMessage(getConfig().getString("3: " + "signs." + blockname + ".3"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".4") != null){
					player.sendMessage(getConfig().getString("4: " + "signs." + blockname + ".4"));
					return;
				}	
				if(getConfig().getString("signs." + blockname + ".5") != null){
					player.sendMessage(getConfig().getString("5: " + "signs." + blockname + ".5"));
					return;
				}	
				if(getConfig().getString("signs." + blockname + ".6") != null){
					player.sendMessage(getConfig().getString("6: " + "signs." + blockname + ".6"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".7") != null){
					player.sendMessage(getConfig().getString("7: " + "signs." + blockname + ".7"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".8") != null){
					player.sendMessage(getConfig().getString("8: " + "signs." + blockname + ".8"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".9") != null){
					player.sendMessage(getConfig().getString("9: " + "signs." + blockname + ".9"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".10") != null){
					player.sendMessage(getConfig().getString("10: " + "signs." + blockname + ".10"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".11") != null){
					player.sendMessage(getConfig().getString("11: " + "signs." + blockname + ".11"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".12") != null){
					player.sendMessage(getConfig().getString("12: " + "signs." + blockname + ".12"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".13") != null){
					player.sendMessage(getConfig().getString("13: " + "signs." + blockname + ".13"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".14") != null){
					player.sendMessage(getConfig().getString("14: " + "signs." + blockname + ".14"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".15") != null){
					player.sendMessage(getConfig().getString("15: " + "signs." + blockname + ".15"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".16") != null){
					player.sendMessage(getConfig().getString("16: " + "signs." + blockname + ".16"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".17") != null){
					player.sendMessage(getConfig().getString("17: " + "signs." + blockname + ".17"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".18") != null){
					player.sendMessage(getConfig().getString("18: " + "signs." + blockname + ".18"));
					return;
				}	
				if(getConfig().getString("signs." + blockname + ".19") != null){
					player.sendMessage(getConfig().getString("19: " + "signs." + blockname + ".19"));
					return;
				}
				if(getConfig().getString("signs." + blockname + ".20") != null){
					player.sendMessage(getConfig().getString("20: " + "signs." + blockname + ".20"));
					return;
				}
				player.sendMessage("Selected block is not a commandblock!");
				return;
			}
			if(getConfig().getString("signs." + blockname + ".1") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".1").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".2") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".2").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".3") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".3").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".4") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".4").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".5") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".5").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".6") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".6").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".7") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".7").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".8") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".8").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".9") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".9").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".10") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".10").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".11") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".11").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".12") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".12").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".13") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".13").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".14") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".14").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".15") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".15").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".16") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".16").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".17") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".17").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".18") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".18").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".19") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".19").replace("<player>", player.getName()));
			}
			if(getConfig().getString("signs." + blockname + ".20") != null){
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), getConfig().getString("signs." + blockname + ".20").replace("<player>", player.getName()));
			}
		}
	}
}