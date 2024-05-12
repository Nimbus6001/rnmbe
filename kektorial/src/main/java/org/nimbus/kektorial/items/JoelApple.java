package org.nimbus.kektorial.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class JoelApple {
    public static ItemStack get() {
        ItemStack Item = new ItemStack(Material.GOLDEN_APPLE, 1);
        ItemMeta meta = Item.getItemMeta();

        meta.setDisplayName(ChatColor.GOLD + "Joel Apple");

        Item.setItemMeta(meta);
        return Item;
    }
    NamespacedKey key = new NamespacedKey("joelapplerecipe", "joelapplerec");
    //ShapedRecipe recipe = new ShapedRecipe(key, item); //Ich hab das kommentiert weil ich stuff testen wollte und hier Fehlermeldungen kamen.
}
