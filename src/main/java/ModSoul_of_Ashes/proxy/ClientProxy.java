package ModSoul_of_Ashes.proxy;

import ModSoul_of_Ashes.Config.ModConfig;
import ModSoul_of_Ashes.init.ModEntity;
import ModSoul_of_Ashes.init.ModItems;

public class ClientProxy implements CommonProxy{
	public void init(){
		ModConfig.register();
		ModItems.register();
		ModEntity.register();
	}
	
	@Override
	public boolean isServerSider() {
		return false;
	}
}
