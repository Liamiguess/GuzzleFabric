package net.kilowatts.guzzle;

import net.fabricmc.api.ModInitializer;
import net.kilowatts.guzzle.registries.RegisterItems;
//Logging packages
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Guzzle implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("guzzle");

	@Override
	public void onInitialize() {
		
		RegisterItems.RegisterAll();
		LOGGER.info("Items for Guzzle have been successfully loaded!");
		
	}
}
