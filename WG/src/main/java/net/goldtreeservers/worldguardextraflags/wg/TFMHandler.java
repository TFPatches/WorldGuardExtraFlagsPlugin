package net.goldtreeservers.worldguardextraflags.wg;

import me.totalfreedom.totalfreedommod.TotalFreedomMod;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class TFMHandler
{
    private static TotalFreedomMod totalFreedomMod = null;

    public static TotalFreedomMod getTFM()
    {
        if (totalFreedomMod != null)
        {
            return totalFreedomMod;
        }
        Plugin plugin = Bukkit.getPluginManager().getPlugin("TotalFreedomMod");
        if (plugin != null && plugin.isEnabled())
        {
            TotalFreedomMod tfm = (TotalFreedomMod)plugin;
            totalFreedomMod = tfm;
            return totalFreedomMod;
        }

        return null;
    }

    public static boolean isStaff(CommandSender sender)
    {
        return getTFM().sl.isStaff(sender);
    }
}