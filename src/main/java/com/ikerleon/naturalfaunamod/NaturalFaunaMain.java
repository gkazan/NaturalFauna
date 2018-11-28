package com.ikerleon.naturalfaunamod;

import com.ikerleon.naturalfaunamod.init.ItemInit;
import com.ikerleon.naturalfaunamod.proxies.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = NFReference.MOD_ID, name = NFReference.NAME, version = NFReference.VERSION, acceptedMinecraftVersions = NFReference.MCVERSION,
		dependencies = NFReference.DENPEND)
public class NaturalFaunaMain {
	@SidedProxy(serverSide = NFReference.SERVER_PROXY_CLASS, clientSide = NFReference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance
	public static NaturalFaunaMain instance;
	
//	@SubscribeEvent
//	public static void onAddCollisionBoxes(GetCollisionBoxesEvent event) {
//		if (event.getEntity() instanceof EntityBasiliskLizard) {
//			Entity entity = event.getEntity();
//			AxisAlignedBB aabb = event.getAabb();
//			BlockPos pos = new BlockPos(entity.posX, aabb.minY - 1.0, entity.posZ);
//			/*if (entity.world.getBlockState(pos).getMaterial() == Material.WATER) {
//				//event.getCollisionBoxesList().add(new AxisAlignedBB(aabb.minX, aabb.minY - 1.0, aabb.minZ, aabb.maxX, aabb.minY, aabb.maxZ));
//			    entity.motionY=0;
//			}
//			else if(entity.world.getBlockState(pos.up()).getMaterial() == Material.WATER) {
//				entity.motionY=1;
//			}*/
//		}
//	}
	
	@EventHandler()
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		proxy.registerRenders();
	}
	
	@EventHandler()
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler()
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabFeathers = new CreativeTabs("natural_fauna_feathers_tab") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemInit.MALE_CAPERCAILLIE_FEATHER);
		}
	};
	
	public static CreativeTabs tabItems = new CreativeTabs("natural_fauna_items_tab") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemInit.CARNIVORE_TOOTH);
		}
	};
}
