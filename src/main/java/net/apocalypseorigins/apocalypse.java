package net.apocalypseorigins;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class apocalypse implements ModInitializer {
	
	public static final Item SYRINGE = new SwordItem(Syringe.INSTANCE, 0,0,new Item.Settings().group(ItemGroup.MISC).maxDamage(2));
	public static final Item SYRINGE_LIVING = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item SYRINGE_AQUATIC = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item SYRINGE_ARTHROPOD = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item SYRINGE_CREEPER = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item SYRINGE_END = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item SYRINGE_NETHER = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item SYRINGE_UNDEAD = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item SYRINGE_ACTIVE = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item STABILIZER = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item ANALYZER = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item MUTAGENS = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item RNABACKUP = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));

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
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "syringe_active"), SYRINGE_ACTIVE);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "stabilizer"), STABILIZER);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "analyzer"), ANALYZER);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "mutagens"), MUTAGENS);
		Registry.register(Registry.ITEM, new Identifier("apocalypse", "rnabackup"), RNABACKUP);
	}
	
}