package com.raidlogbook;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class RaidLogbookPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(RaidLogbookPlugin.class);
		RuneLite.main(args);
	}
}