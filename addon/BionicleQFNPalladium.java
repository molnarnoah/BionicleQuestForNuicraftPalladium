package addonpacks.BionicleQuestForNuicraftPalladium.addon;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.LogManager;

import addonpacks.BionicleQuestForNuicraftPalladium.addon.bionicleqfn_palladium.init.BionicleQFNPalladiumBlocks;
import addonpacks.BionicleQuestForNuicraftPalladium.addon.bionicleqfn_palladium.init.BionicleQFNPalladiumSounds;

@Mod("bionicleqfn_palladium")
public class BionicleQFNPalladium {
    public static final Logger LOGGER = LogManager.getLogger(BionicleQFNPalladium.class);
    public static final String MOD_ID = "bionicleqfn_palladium";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(
            new ResourceLocation("bionicleqfn_palladium", "bionicleqfn_palladium"), () -> "1", "1"::equals, "1"::equals);
    private static int messageID = 0;
    private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue();

    public BionicleQFNPalladium() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BionicleQFNPalladiumSounds.REGISTRY.register(bus);
        BionicleQFNPalladiumBlocks.REGISTRY.register(bus);
    
    }

}
