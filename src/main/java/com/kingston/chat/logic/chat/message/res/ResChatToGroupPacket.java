package com.kingston.chat.logic.chat.message.res;

import com.kingston.chat.net.IoSession;
import com.kingston.chat.net.message.AbstractPacket;
import com.kingston.chat.net.message.PacketType;

import io.netty.buffer.ByteBuf;

public class ResChatToGroupPacket extends AbstractPacket {

	private String content;

	@Override
	public void writeBody(ByteBuf buf) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readBody(ByteBuf buf) {
		// TODO Auto-generated method stub

	}

	@Override
	public PacketType getPacketType() {
		return PacketType.ResChatToUser;
	}

	@Override
	public void execPacket() {
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
