
public class FactoryComputer {
	public Computer assemblePC(String type)
	{
		Computer pc = null;
		
		if (type.equals("Macbook")) {
			pc = new Macbook();
		} else if (type.equals("Surface")) {
			//pc = new Surface();
			System.out.println("Not done yet, Surface PC");
		}

		return pc;
	}
}
