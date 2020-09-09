
public class FactoryComputer {
	public Computer assemblePC(String string)
	{
		Computer pc = null;
		if (string.equals("Macbook")) {
			pc = new Macbook();
		} else if (string.equals("Surface")) {
			//pc = new Surface();
			System.out.println("Not done yet, Surface PC");
		} else {
			System.out.println("Sorry we cant manufacture " + string);
		}

		return pc;
	}
}
