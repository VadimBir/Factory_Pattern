public class DriverOrderPC {

	public static void main(String[] args) 
	{
		FactoryComputer factory = new FactoryComputer();
		
		Computer computer = factory.assemblePC("Macbook");
		if (computer != null) {
		computer.manufacture();
		}
		
		Computer suface= factory.assemblePC("Surface");
		if (suface != null) {
			suface.manufacture();
		}
		
		Computer somePC= factory.assemblePC("RandomName");
		if (somePC != null) {
			somePC.manufacture();						
		}
	}
}
