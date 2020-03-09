package VJIT.DesignPattersTask;
import java.util.LinkedList;
public class BuilderPatternEx {
	public static void main(String[] args)
	{
		System.out.println("Creational Pattern\n");
	System.out.println("Builder Pattern Example\n");
	Director director = new Director();
	IBuilder carBuilder = new Car();
	IBuilder motorBuilder = new MotorCycle();
	// Making Car
	director.Construct(carBuilder);
	Product p1 = carBuilder.GetVehicle();
	p1.Show();
	//Making MotorCycle
	director.Construct(motorBuilder);
	Product p2 = motorBuilder.GetVehicle();
	p2.Show();
}
}
	
	interface IBuilder
	{
	void BuildBody();
	void InsertWheels();
	void AddHeadlights();
	Product GetVehicle();
	}
	class Car implements IBuilder
	{
	private Product product = new Product();
	@Override
	public void BuildBody()
	{
	product.Add("This is a body of a Car");
	}
	@Override
	public void InsertWheels()
	{
	product.Add("4 wheels are added");
	}
	@Override
	public void AddHeadlights()
	{
	product.Add("2 Headlights are added");
	}
	@Override
	public Product GetVehicle()
	{
	return product;
	}
	}
	class MotorCycle implements IBuilder
	{
	private Product product = new Product();
	@Override
	public void BuildBody()
	{
	product.Add("This is a body of a Motorcycle");
	}
	@Override
	public void InsertWheels()
	{
	product.Add("2 wheels are added");
	}
	@Override
	public void AddHeadlights()
	{
	product.Add("1 Headlights are added");
	}
	@Override
	public Product GetVehicle()
	{
	return product;
	}
	}
	class Product
	{
	private LinkedList<String> parts;
	public Product()
	{
	parts = new LinkedList<String>();
	}
	public void Add(String part)
	{
	parts.addLast(part);
	}
	public void Show()
	{
	System.out.println("\n Product completed as below :");
	for(int i=0;i<parts.size();i++)
	{
	System.out.println(parts.get(i));
	}
	}
	}
	class Director
	{
	IBuilder myBuilder;
	public void Construct(IBuilder builder)
	{
	myBuilder=builder;
	myBuilder.BuildBody();
	myBuilder.InsertWheels();
	myBuilder.AddHeadlights();
	}
	}

