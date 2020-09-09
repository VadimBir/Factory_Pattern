public class DriverOrderPC {

	public static void main(String[] args) 
	{
		FactoryComputer factory = new FactoryComputer();
		
		Computer computer = factory.assemblePC("Macbook");
		computer.manufacture();
			
		Computer suface= factory.assemblePC("Surface");
		suface.manufacture();
		
		Computer somePC= factory.assemblePC("RandomName");
		somePC.manufacture();			
		
		
		
		
		
	}
}
