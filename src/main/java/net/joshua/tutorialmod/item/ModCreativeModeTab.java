package net.joshua.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


//Cette classe permet de définir un onglet de l'inventaire
public class ModCreativeModeTab {


    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") { // Ici nous définissons le nom de l'onglet
        @Override
        public ItemStack makeIcon() { // Ici nous définissons l'icône de l'onglet
            return new ItemStack(ModItems.ZIRCON.get()); // Ici nous définissons l'objet qui sera affiché comme icône, donc le png de zircon
        }
    };



}
