package chicktherm.fantasypack.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraftforge.client.MinecraftForgeClient;
import chicktherm.fantasypack.CommonProxy;
import chicktherm.fantasypack.client.model.ModelFairy;
import chicktherm.fantasypack.client.renderer.entity.RenderFairy;
import chicktherm.fantasypack.entity.passive.EntityFairy;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                MinecraftForgeClient.preloadTexture(ITEMS_PNG);
                MinecraftForgeClient.preloadTexture(BLOCK_PNG);
               RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class, new RenderFairy(new ModelFairy(), 0.3F));
        }
       
}
