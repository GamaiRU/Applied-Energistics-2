package com.gamerforea.ae;

import com.gamerforea.eventhelper.nexus.ModNexus;
import com.gamerforea.eventhelper.nexus.ModNexusFactory;
import com.gamerforea.eventhelper.nexus.NexusUtils;

@ModNexus(name = "AppEng")
public final class ModUtils
{
	public static final ModNexusFactory NEXUS_FACTORY = NexusUtils.getFactory();
}
