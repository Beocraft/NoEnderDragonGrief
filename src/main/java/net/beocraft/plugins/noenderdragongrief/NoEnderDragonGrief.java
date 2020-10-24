package net.beocraft.plugins.noenderdragongrief;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class NoEnderDragonGrief extends JavaPlugin implements Listener {

    private final Logger logger;

    public NoEnderDragonGrief() {
        this.logger = getLogger();
    }

    @Override
    public void onEnable() {
        logger.info("Plugin enabled!");

    }

    @Override
    public void onDisable() {
        logger.info("Plugin disabled!");
    }

    @EventHandler
    public void onEntityChangeBlock(EntityExplodeEvent e) {
        if (e.getEntity().getType() == EntityType.ENDER_DRAGON) {
            e.setCancelled(true);
        }
    }
}
