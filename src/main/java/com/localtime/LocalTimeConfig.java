package com.localtime;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("rl-local-time")
public interface LocalTimeConfig extends Config
{
	@ConfigItem(
		keyName = "rl-local-time",
		name = "Local Time",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}
}
