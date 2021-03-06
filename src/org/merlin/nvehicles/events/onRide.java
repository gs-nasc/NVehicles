package org.merlin.nvehicles.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.util.Vector;
public class onRide implements Listener {

    @EventHandler
    public void onRide(VehicleMoveEvent event) {
        Vehicle vehicle = event.getVehicle();
        if(vehicle.getPassenger() instanceof Player) {
            if(vehicle.getVehicle() != null) {
                Entity vehicle1 = vehicle.getVehicle();

                if(vehicle1.getType().equals(EntityType.ARMOR_STAND)) {
                    vehicle1.setVelocity(new Vector(vehicle.getVelocity().getX(), vehicle.getVelocity().getY(), vehicle.getVelocity().getZ()));
                    if(vehicle.getVelocity().getX() != 0) {

                        double vel = 0.4F;

                        if(vehicle.getVelocity().getX() < 0) {
                            vel = vel * -1;
                        }
                        vehicle1.setVelocity(new Vector(vehicle1.getVelocity().getX() + vel, vehicle1.getVelocity().getY(), vehicle1.getVelocity().getZ()));
                    }
                    if(vehicle.getVelocity().getZ() != 0) {
                        double vel = 0.4F;

                        if(vehicle.getVelocity().getZ() < 0) {
                            vel = vel * -1;
                        }
                        vehicle1.setVelocity(new Vector(vehicle1.getVelocity().getX(), vehicle1.getVelocity().getY(), vehicle1.getVelocity().getZ() + vel));
                    }
                }

            }
        }
    }

}
