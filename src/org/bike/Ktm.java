package org.bike;

public class Ktm  implements Bike{
	public void cost() {
		System.out.println("cost=70%");
	}
public void speed() {
	System.out.println("speed=60%");
}
public static void main(String[]args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}
}
