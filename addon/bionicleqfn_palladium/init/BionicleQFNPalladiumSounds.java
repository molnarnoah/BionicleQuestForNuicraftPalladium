package addonpacks.BionicleQuestForNuicraftPalladium.addon.bionicleqfn_palladium.init;

import java.rmi.registry.Registry;

public class BionicleQFNPalladiumSounds {
    public static final Deferredregister<SoundEvent> REGISTRY;
    public static final RegistryObject<SoundEvent> BIONICLETHEGAMEMAINTHEME;
    public static final RegistryObject<SoundEvent> MATORANTALKS;
    public static final RegistryObject<SoundEvent> MASK_POWER;
    public static final RegistryObject<SoundEvent> BIONCILEMUSIC;
    public static final RegistryObject<SoundEvent> POWER;

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "bionicleqfn_palladium");
        BIONICLETHEGAMEMAINTHEME = REGISTRY.register("bioniclethegamemaintheme", () -> SoundEvent.m_262824_(new ResourceLocation("bionicleqfn_palladium", "bioniclethegamemaintheme")));
        MATORANTALKS = REGISTRY.register("matorantalks", () -> SoundEvent.m_262824_(new ResourceLocation("bionicleqfn_palladium", "matorantalks")));
        MASK_POWER = REGISTRY.register("mask_power", () -> SoundEvent.m_262824_(new ResourceLocation("bionicleqfn_palladium", "mask_power")));
        BIONCILEMUSIC = REGISTRY.register("bioncilemusic", () -> SoundEvent.m_262824_(new ResourceLocation("bionicleqfn_palladium", "bioncilemusic")));
        POWER = REGISTRY.register("power", () -> SoundEvent.m_262824_(new ResourceLocation("bionicleqfn_palladium", "power")));
    }
}