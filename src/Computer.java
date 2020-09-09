
abstract public class Computer {
	String namePC;
	String nameOS;
	String nameCPU;
	String nameGPU;
	String sizeDisk;
	String sizeRAM;
	public void manufacture() {
		try {
		AssemblePC();
		InstallingOS();
		TestingPC();
		BoxingPC();
		System.out.println("\nDone.");
		}
		catch (Exception e) {
			System.out.println("Error Caught" + getNamePC() );
		}
	}
// getters -------------------
	public String getNamePC()
	{
		 return namePC;
	}
	public String getNameOS()
	{
		 return nameOS;
	}
	public String getNameCPU()
	{
		 return nameCPU;
	}
	public String getNameGPU()
	{
		 return nameGPU;
	}
	public String getSizeDisk()
	{
		 return sizeDisk;
	}
	public String getSizeRAM()
	{
		 return sizeRAM;
	}
//----------------------------
	
// Process
	public void AssemblePC()
	{
		System.out.println("Assembling computer parts for " + getNamePC());
	}
	public void InstallingOS()
	{
		System.out.println("Installing " + getNameOS());
	}
	public void TestingPC()
	{
		System.out.println("Testing " + getNamePC());
	}
	public void BoxingPC()
	{
		System.out.println("Boxing " + getNamePC());
	}
//-----------------------------
}
