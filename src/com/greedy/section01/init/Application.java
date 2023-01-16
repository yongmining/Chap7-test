package com.greedy.section01.init;

public class Application {

	public static void main(String[] args) {
		
		Car car1 = new Car("페라리", 300);
		Car car2 = new Car("람보르기니", 350);
		Car car3 = new Car("롤스로이스", 250);
		Car car4 = new Car("부가티베이론", 400);
		Car car5 = new Car("포터", 500);
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		
		Car[] carArray = new Car[5];
		
		for(int i = 0; i < carArray.length; i++) {
			System.out.println("carArray[" + i + "] : " + carArray[i]);
		
		}
		
//		carArray[0].driveMaxSpeed();
		
		carArray[0] = new Car("페라리", 300);
		carArray[1] = new Car("람보르기니", 350);
		carArray[2] = new Car("롤스로이스", 250);
		carArray[3] = new Car("부가티베이론", 400);
		carArray[4] = new Car("포티", 500);
//		carArray[5] = new Car("해리포터", 1000);
		
		for(int i = 0; i < carArray.length; i++) {
			carArray[i].driveMaxSpeed();
			
			
		}
		
		Car[] carArray2 = {
							new Car("페라리",300),
							new Car("람보르기니", 350), 
							new Car("롤스로이스",250),
							new Car("부가티베이론", 400),
							new Car("포터", 500)
							};
				for(Car c : carArray2) {
					c.driveMaxSpeed();
		}
	
	}
	
	

}
