package com.kingston.chat.logic.user.message.res;

import com.kingston.chat.logic.user.UserManager;
import com.kingston.chat.net.message.AbstractPacket;
import com.kingston.chat.net.message.PacketType;

import io.netty.buffer.ByteBuf;

public class ResUserRegisterPacket extends AbstractPacket {
	
	private byte resultCode;
	
	private String message;
	
	public byte getResultCode() {
		return resultCode;
	}

	public void setResultCode(byte resultCode) {
		this.resultCode = resultCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void writeBody(ByteBuf buf) {
		buf.writeByte(resultCode);
		writeUTF8(buf, message);
		
	}

	@Override
	public void readBody(ByteBuf buf) {
		this.resultCode = buf.readByte();
		this.message = readUTF8(buf);
		
	}

	@Override
	public PacketType getPacketType() {
		return PacketType.ResUserRegister;
	}

	@Override
	public void execPacket() {
		UserManager.getInstance().handleRegisterResponse(getResultCode(), getMessage());
	}

	@Override
	public String toString() {
		return "ResUserRegisterPacket [resultCode=" + resultCode + ", message=" + message + "]";
	}
	
}
