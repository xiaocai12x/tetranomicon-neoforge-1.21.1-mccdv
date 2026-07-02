package com.syric.tetranomicon.compat;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import static com.syric.tetranomicon.registry.TetranomiconItems.*;

public class OresAboveDiamondsCompat {

    public static void buildOresAboveDiamondsCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab.location().getNamespace().equals("oresabovediamonds")) {
            event.accept(new ItemStack(NETHERITE_OPAL.get()));
        }
    }

}

