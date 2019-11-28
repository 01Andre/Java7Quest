public abstract class Vehicle {

	private String brand;
	private int kilometers;

	public Vehicle(String brand, int kilometers)
	{
		this.brand = brand;
		this.kilometers = kilometers;
	}

	public abstract String doStuff();

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getBrand()
	{
		return this.brand;
	}

	public int getKilometers()
	{
		return this.kilometers;
	}
}


