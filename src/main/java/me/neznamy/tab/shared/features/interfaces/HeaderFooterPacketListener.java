package me.neznamy.tab.shared.features.interfaces;

import me.neznamy.tab.api.TabPlayer;
import me.neznamy.tab.shared.packets.PacketPlayOutPlayerListHeaderFooter;

public interface HeaderFooterPacketListener {

	public boolean onPacketSend(TabPlayer packetReciver, PacketPlayOutPlayerListHeaderFooter packet);
}