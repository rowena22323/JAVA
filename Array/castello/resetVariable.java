package castello;

class resetVariable{
	static {
		System.out.println("static {}");
	}
	{
		System.out.println("{}");
	}
	public resetVariable() {
		System.out.println("»ý¼ºÀÚ");
	}
	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest();");
		resetVariable bt = new resetVariable();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		resetVariable bt2 = new resetVariable();
	}
}
