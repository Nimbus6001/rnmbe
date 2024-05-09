package org.nimbus.kektorial.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class LegendaryWoodenSword {
    public static ItemStack get() {
        ItemStack Item = new ItemStack(Material.WOODEN_SWORD, 1);
        ItemMeta meta = Item.getItemMeta();

        meta.setDisplayName(ChatColor.GOLD + "Legendary Wooden Sword");
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 3, AttributeModifier.Operation.ADD_NUMBER));

        ArrayList<String> lore = new ArrayList<>();
        lore.add("This is Legendary");
        meta.setLore(lore);

        Item.setItemMeta(meta);

        return Item;
    }
}
