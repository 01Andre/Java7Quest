public class Hangar {

	public static void main(String[] args) {
		String [] boats = {"le Titanic", "le Radeau de la méduse", "le Costa Concordia", "le Queen Mary 2"};
		String [] cars = {"la batmobile", "la papamobile", "la playmobile"};

		for (String boat: boats)
		{
			Boat newBoat = new Boat(boat, (int) (Math.random() * 10000000 ));
			System.out.println(newBoat.doStuff());
		}

		for (String car: cars)
		{
			Car newCar = new Car(car, (int) (Math.random() * 100000000));
			System.out.println(newCar.doStuff());
		}
	}
}

