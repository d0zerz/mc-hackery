package org.testmc.untitled;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryEvents implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) { return; }
        if (event.getClickedInventory().getHolder() instanceof BlockScreen) {
            event.setCancelled(true);
            if (event.isLeftClick()) {
                Player player = (Player)event.getWhoClicked();
                if (event.getCurrentItem() == null) { return; }

            }
        }

    }
}
