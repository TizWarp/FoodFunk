package com.wumple.foodfunk.capabilities.preserving;

import com.wumple.foodfunk.RotHandler;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventHandler
{
    /**
     * Attach the {@link IPreserving} capability to relevant items.
     *
     * @param event The event
     */
    @SubscribeEvent
    public static void attachCapabilities(AttachCapabilitiesEvent<TileEntity> event) {
        TileEntity entity = event.getObject();

        if (RotHandler.doesPreserve(entity)) {
            PreservingProvider provider = new PreservingProvider(PreservingProvider.CAPABILITY, PreservingProvider.DEFAULT_FACING, entity);
            event.addCapability(PreservingProvider.ID, provider);
        }
    }
}
