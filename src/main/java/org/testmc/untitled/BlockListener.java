package org.testmc.untitled;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class BlockListener implements Listener {

    @EventHandler
    public void onPlayerInteractBlock(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Block clickedBlock = event.getClickedBlock();
            Bukkit.getLogger().info("Player " + player.getDisplayName() + " touched block" );

            BlockScreen screen = new BlockScreen();
            player.openInventory(screen.getInventory());
            player.sendMessage("Here's your inv kek");
        }

        //if (clickedBlock.getType() == Material.SPAWNER) {

        //}
    }
}
