package org.merlin.nvehicles;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.merlin.nvehicles.commands.Car;
import org.merlin.nvehicles.events.onRide;

public class NVehicles extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new onRide(), this);
        getCommand("vehicle").setExecutor(new Car());
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
