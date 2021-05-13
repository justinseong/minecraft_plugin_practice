//package javaplugin;
//
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//
//import org.bukkit.plugin.java.JavaPlugin;
//
//import org.bukkit.entity.Player;
//import org.bukkit.Location;
//import org.bukkit.World;
//
//public class Main extends JavaPlugin implements CommandExecutor{
//    @Override
//    public void onEnable() {
//        System.out.println("플러그인이 활성화 되었습니다!");
//        getCommand("tp").setExecutor(this);
//    }
//
//    @Override
//    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
//        if(cmd.getName().equalsIgnoreCase("tp")) {
//            Player player = (Player)sender;
//            World world = player.getWorld();
//            player.teleport(new Location(world, 0, 64, 5));
//        }
//        return true;
//    }
//}

package javaplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.World;

public class Main extends JavaPlugin implements CommandExecutor{
    @Override
    public void onEnable() {
        System.out.println("플러그인이 활성화 되었습니다!");
        getCommand("tpend").setExecutor(this);
        getCommand("tpsea").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if(cmd.getName().equalsIgnoreCase("tpend")) {
            Player player = (Player)sender;
            World world = player.getWorld();
            player.teleport(new Location(world, 1662, 44, -811));
        }
        if(cmd.getName().equalsIgnoreCase("tpsea")) {
            Player player = (Player)sender;
            World world = player.getWorld();
            player.teleport(new Location(world, 622, 40, -327));
        }
        return true;
    }
}
