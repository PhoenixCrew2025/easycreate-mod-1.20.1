package net.phoenixcrew2025.easycreate.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phoenixcrew2025.easycreate.EasyCreate;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENtS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EasyCreate.MOD_ID);

    public static final RegistryObject<SoundEvent> DEMONS_SONG = registerSoundEvents("demons_song");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENtS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(EasyCreate.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENtS.register(eventBus);
    }
}
