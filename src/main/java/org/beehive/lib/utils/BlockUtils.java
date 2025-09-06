package org.beehive.lib.utils;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.Door;
import org.bukkit.block.data.type.Switch;
import org.bukkit.inventory.BlockInventoryHolder;
import org.bukkit.material.PressurePlate;
import org.bukkit.material.PressureSensor;

import java.awt.*;
import java.util.Set;

public class BlockUtils {

    public static final Set<Material> INVENTORY_OPENING_BLOCKS = Set.of(
            // Кнопки
            Material.OAK_BUTTON,
            Material.SPRUCE_BUTTON,
            Material.BIRCH_BUTTON,
            Material.JUNGLE_BUTTON,
            Material.ACACIA_BUTTON,
            Material.DARK_OAK_BUTTON,
            Material.CRIMSON_BUTTON,
            Material.WARPED_BUTTON,
            Material.STONE_BUTTON,
            Material.LEVER,

            // Двери
            Material.OAK_DOOR,
            Material.SPRUCE_DOOR,
            Material.BIRCH_DOOR,
            Material.JUNGLE_DOOR,
            Material.ACACIA_DOOR,
            Material.DARK_OAK_DOOR,
            Material.CRIMSON_DOOR,
            Material.WARPED_DOOR,
            Material.IRON_DOOR,
            Material.MANGROVE_DOOR,

            Material.CHEST,
            Material.ENDER_CHEST,
            Material.TRAPPED_CHEST,
            Material.SHULKER_BOX,
            Material.BLACK_SHULKER_BOX,
            Material.BLUE_SHULKER_BOX,
            Material.BROWN_SHULKER_BOX,
            Material.CYAN_SHULKER_BOX,
            Material.GRAY_SHULKER_BOX,
            Material.GREEN_SHULKER_BOX,
            Material.LIGHT_BLUE_SHULKER_BOX,
            Material.LIGHT_GRAY_SHULKER_BOX,
            Material.LIME_SHULKER_BOX,
            Material.MAGENTA_SHULKER_BOX,
            Material.ORANGE_SHULKER_BOX,
            Material.PINK_SHULKER_BOX,
            Material.PURPLE_SHULKER_BOX,
            Material.RED_SHULKER_BOX,
            Material.WHITE_SHULKER_BOX,
            Material.YELLOW_SHULKER_BOX,
            Material.CRAFTING_TABLE,
            Material.ANVIL,
            Material.CHIPPED_ANVIL,
            Material.DAMAGED_ANVIL,
            Material.BARREL,
            Material.BLAST_FURNACE,
            Material.SMOKER,
            Material.HOPPER,
            Material.DISPENSER,
            Material.DROPPER,
            Material.NOTE_BLOCK,
            Material.DAYLIGHT_DETECTOR,
            Material.ENCHANTING_TABLE
    );

    public static boolean isInteractableBlock(Block block) {
        if (block == null) return false;
        BlockData data = block.getBlockData();
        return data instanceof Door
                || data instanceof Button
                || data instanceof Switch
                || data instanceof BlockInventoryHolder
                || data instanceof PressureSensor;
    }

    public static Location centerBlock(Location loc) {
        return new Location(
                loc.getWorld(),
                loc.getBlockX() + 0.5,
                loc.getBlockY() + 0.5,
                loc.getBlockZ() + 0.5
        );
    }
}
