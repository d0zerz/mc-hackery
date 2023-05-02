package org.testmc.untitled;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlockScreen implements InventoryHolder {

    private Inventory inv;

    public BlockScreen() {
        this.inv = Bukkit.createInventory(this, 9, "Selection Screen");
        init();
    }

    private void init() {
        ItemStack item;
        for (int i=0; i<4;i++) {
            inv.setItem(i, createItem("Accept", Material.LIME_STAINED_GLASS_PANE, Collections.singletonList("Accepts the request")));
        }

        List<String> lore = new ArrayList<>();
        lore.add("Select the accept");
        lore.add("Select the deny");
        item = createItem("Accept", Material.BOOK,lore);
        inv.setItem(inv.firstEmpty(), item);

        for (int i=5; i<9;i++) {
            inv.setItem(i, createItem("Deny", Material.RED_STAINED_GLASS_PANE, Collections.singletonList("Accepts the request")));
        }
    }

    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
