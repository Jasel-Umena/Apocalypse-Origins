package net.apocalypseorigins;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class apocalypse implements ModInitializer {
	
	public static final Item SYRINGE = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item SYRINGE_LIVING = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item SYRINGE_AQUATIC = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item SYRINGE_ARTHROPOD = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item SYRINGE_CREEPER = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item SYRINGE_END = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item SYRINGE_NETHER = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item SYRINGE_UNDEAD = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item APOCALYPSE_WOODEN_SWORD = new Item(new Item.Settings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "syringe"), SYRINGE);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "syringe_living"), SYRINGE_LIVING);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "syringe_aquatic"), SYRINGE_AQUATIC);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "syringe_arthropod"), SYRINGE_ARTHROPOD);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "syringe_creeper"), SYRINGE_CREEPER);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "syringe_end"), SYRINGE_END);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "syringe_nether"), SYRINGE_NETHER);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "syringe_undead"), SYRINGE_UNDEAD);
	}
	
}