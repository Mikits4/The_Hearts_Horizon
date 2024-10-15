package net.mikitstrees.loversbunch.sound;

import net.mikitstrees.loversbunch.LoversBunch;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModSounds {
//    public static final SoundEvent LOVEBIRD_AMBIENCE = registerSoundEvent("lovebird_ambience");
//    public static final SoundEvent LOVEBIRD_DEATH = registerSoundEvent("lovebird_death");

    private static RegistryKey<JukeboxSong> of(String name) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(LoversBunch.MOD_ID, name));
    }

    public static void registerSounds() {
        LoversBunch.LOGGER.info("Registering Mod Sounds for " + LoversBunch.MOD_ID);
    }
}
