package com.educandoweb.course.entites.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus od : OrderStatus.values()) {
			if (od.getCode() == code) {
				return od;
			}
		}
		
		throw new IllegalArgumentException("Ivalid OrderStatus code");
	}
}
