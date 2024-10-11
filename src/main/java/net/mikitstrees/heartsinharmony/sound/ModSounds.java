package net.mikitstrees.heartsinharmony.sound;

import net.mikitstrees.heartsinharmony.HeartsinHarmony;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
//    public static final SoundEvent LOVEBIRD_AMBIENCE = registerSoundEvent("lovebird_ambience");
//    public static final SoundEvent LOVEBIRD_DEATH = registerSoundEvent("lovebird_death");

    private static RegistryKey<JukeboxSong> of(String name) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(HeartsinHarmony.MOD_ID, name));
    }

    public static void registerSounds() {
        HeartsinHarmony.LOGGER.info("Registering Mod Sounds for " + HeartsinHarmony.MOD_ID);
    }
}
