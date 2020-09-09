
public class FactoryComputer {
	public Computer assemblePC(String string)
	{
		Computer pc = null;
		if (string.equals("Macbook")) {
			pc = new Macbook();
		} else if (string.equals("Surface")) {
			pc = new Surface();
		} else {
			System.out.println("Sorry we cant manufacture " + string);
			
		}

		return pc;
	}
}
