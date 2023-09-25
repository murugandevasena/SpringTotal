package com.transactional;

public class Transaction {

	private SenderEntity senderEntity;
	private ReceiverEntity receiverEntity;

	public SenderEntity getSenderEntity() {
		return senderEntity;
	}

	public void setSenderEntity(SenderEntity senderEntity) {
		this.senderEntity = senderEntity;
	}

	public ReceiverEntity getReceiverEntity() {
		return receiverEntity;
	}

	public void setReceiverEntity(ReceiverEntity receiverEntity) {
		this.receiverEntity = receiverEntity;
	}
}
