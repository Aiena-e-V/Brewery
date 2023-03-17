package com.dre.brewery.listeners;

import com.dre.brewery.P;
import com.dre.brewery.filedata.BConfig;
import dev.lone.itemsadder.api.Events.ItemsAdderLoadDataEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ItemsAdderListener implements Listener {

	@EventHandler
	public void onItemsAdderEnable(ItemsAdderLoadDataEvent event) {
		BConfig.hasItemsAdder = true;
		P.p.reload(Bukkit.getConsoleSender());
	}
}
