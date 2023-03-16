package com.dre.brewery.integration.item;

import com.dre.brewery.P;
import com.dre.brewery.filedata.BConfig;
import com.dre.brewery.recipe.PluginItem;
import dev.lone.itemsadder.api.CustomStack;
import org.bukkit.inventory.ItemStack;

public class ItemsAdderPluginItem extends PluginItem {

	@Override
	public boolean matches(ItemStack item) {
		if(BConfig.hasItemsAdder == null){
			BConfig.hasItemsAdder = P.p.getServer().getPluginManager().isPluginEnabled("ItemsAdder");
		}

		if(!BConfig.hasItemsAdder) return false;

		CustomStack cs = CustomStack.byItemStack(item);
		if(cs == null) return false;

		return cs.getId().equals(getItemId());
	}
}
