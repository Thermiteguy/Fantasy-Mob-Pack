package chicktherm.fantasypack;

import net.minecraft.world.biome.BiomeGenBase;
import chicktherm.fantasypack.entity.passive.EntityFairy;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid="FantasyPack", name="FantasyPack", version="0.0.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FantasyPack {

        // The instance of your mod that Forge uses.
        @Instance("FantasyPack")
        public static FantasyPack instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="chicktherm.fantasypack.client.ClientProxy", serverSide="chicktherm.fantasypack.CommonProxy")
        public static CommonProxy proxy;
        
        static int startEntityId = 300;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                EntityRegistry.registerModEntity(EntityFairy.class, "Fairy", 1, this, 80, 3, true);
                
                EntityRegistry.addSpawn(EntityFairy.class, 10, 2, 4, EnumCreatureType.creature, BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills);
                
                registerEntityEgg(EntityFairy.class, 0xffffff, 0x000000);
        }
        
        public static int getUniqueEntityId() 
        {
         do 
         {
          startEntityId++;
         } 
         while (EntityList.getStringFromID(startEntityId) != null);

          return startEntityId;
        }
        
        public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) 
        {
         int id = getUniqueEntityId();
         EntityList.IDtoClassMapping.put(id, entity);
         EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
        }
       
        
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
        
        
}