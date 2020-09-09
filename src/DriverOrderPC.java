

public class DriverOrderPC {


	public static void main(String[] args) 
	{
		FactoryComputer factory = new FactoryComputer();
		Computer computer;
		computer = factory.assemblePC("Macbook");
		computer.AssemblePC();
		computer.InstallingOS();
		computer.TestingPC();
		computer.BoxingPC();
		System.out.println("Done");
		
		
	}
}
