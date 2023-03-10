package com.jspider.builderdesignpattern.object;

public class Mobile {
	
	private String brand;
	private String model;
	private int ram;
	private int memory;
	private int front_cam;
	private int rear_cam;
	private double price;
	private int bettery;
	private String color;
	private double processor;
	
	

	public Mobile(String brand, String model, int ram, int memory, int front_cam, int rear_cam, double price,
			int bettery, String color, double processor) {
		super();
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.memory = memory;
		this.front_cam = front_cam;
		this.rear_cam = rear_cam;
		this.price = price;
		this.bettery = bettery;
		this.color = color;
		this.processor = processor;
	}



	@Override
	public String toString() {
		return "======MENU=====\n" + "Brand : " + this.brand +"\n"
				+ "Model : " + this.model + "\n"
				+ "Ram : " + this.ram + "\n"
				+ "memory : " + this.memory + "\n"
				+ "Front_cam :" + this.front_cam + "\n"
				+ "Rear_cam : " + this.rear_cam + "\n"
				+ "Price : " + this.price + "\n"
				+ "Bettery :" + this.bettery + "\n"
				+ "color : " + this.color + "\n"
				+ "Processot :" + this.processor + "\n";
	}
	
	

}
