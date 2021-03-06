package org.merlin.nvehicles.commands;

import net.minecraft.server.v1_8_R3.EntityBoat;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntity;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Car implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        Boat boat = player.getWorld().spawn(player.getLocation(), Boat.class);

        ArmorStand armorStand = player.getWorld().spawn(player.getLocation(), ArmorStand.class);

        boat.setCustomName("vehicle");
        boat.setCustomNameVisible(false);

        armorStand.setHelmet(new ItemStack(Material.GOLD_ORE));
        armorStand.setVisible(false);

        armorStand.setPassenger(boat);
        armorStand.setCustomName("car");
        armorStand.setCustomNameVisible(false);
        boat.setPassenger(player);

        return false;
    }
}
