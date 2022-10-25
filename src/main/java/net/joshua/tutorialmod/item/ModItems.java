package net.joshua.tutorialmod.item;

import net.joshua.tutorialmod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// Cette classe est utilisée pour enregistrer tous les objets de notre mod
public class ModItems {
    //DeferredRegister est une classe qui permet d'enregistrer des objets
    //<Item> correspond au type d'objet que l'on veut enregistrer
    //ITEMS est une variable qui contient tous les objets enregistrés
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID); // Ici nous définissons le type d'objet que nous voulons enregistrer et le mod auquel il appartient
    //ForgeRegistries.ITEMS est une classe qui contient tous les objets du jeu, TutorialMod.MOD_ID est l'ID de notre mod


    //RegistryObject est une classe qui permet de définir un objet
    //ZIRCON est une variable qui contient l'objet enregistré
    //ITEMS.register permet d'enregistrer l'objet avec les paramètres suivants :

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB))); // Ici nous définissons le nom de l'objet, et ses propriétés,
    // tab(CreativeModeTab.TAB_MISC) permet de définir dans quel onglet de l'inventaire l'objet sera placé


    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static void register(IEventBus eventBus ) {
            ITEMS.register(eventBus); //Enregistre tous les objets de notre mod
    }
}
