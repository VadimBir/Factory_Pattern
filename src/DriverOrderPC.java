public class DriverOrderPC {

	public static void main(String[] args) 
	{
		FactoryComputer factory = new FactoryComputer();
		Computer computer = factory.assemblePC("Macbook");
		computer.manufacture();
		System.out.println("\nDone.");	
	}
	public void manufacture() {
	}
}
