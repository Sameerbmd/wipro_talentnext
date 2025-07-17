package abstraction;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import java.util.*; 

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero=new Hero();
		System.out.println("Hero Bike");
		System.out.println("Model Name: " + hero.getModelName());
        System.out.println("Registration Number: " + hero.getRegistrationNumber());
        System.out.println("Owner Name: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed() + " km/hr");
        hero.radio();
        System.out.println("Honda Vehicle");
        Honda honda = new Honda();
        System.out.println("Model Name: " + honda.getModelName());
        System.out.println("Registration Number: " + honda.getRegistrationNumber());
        System.out.println("Owner Name: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed() + " km/hr");
        honda.cdPlayer();
	}

}