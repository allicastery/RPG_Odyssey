package me.dna.rpgodyssey.creativetabs;

import me.dna.rpgodyssey.RPG_Odyssey;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.CreativeModeTab.*;

@Mod.EventBusSubscriber(modid = RPG_Odyssey.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RPG_Odyssey.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_BLOCKS = TABS.register("modblocks",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("RPG-Odyssey Blocks"))
                    .build()

    );

@SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {

}

public static void register(IEventBus eventBus) {
    TABS.register(eventBus);
}

}
