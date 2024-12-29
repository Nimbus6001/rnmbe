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
        meta.setCustomModelData(4201);

        Item.setItemMeta(meta);
        return Item;
    }
    public static ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey("joelapplerecipe", "joelapplerec");
        ShapedRecipe recipe = new ShapedRecipe(key, JoelApple.get());
        recipe.shape("AAA","AAA","AAA");
        recipe.setIngredient('A', Material.ENCHANTED_GOLDEN_APPLE);
        return recipe;
    }
}
