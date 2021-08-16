package equality.check;

public class StaticClass {
	static int instancecount;
	int instancenum;
	
	static {
		instancecount = 0;
	}
	public StaticClass(int instancenum) {
		
		this.instancenum = instancenum;
		instancecount++;
	}

	public static int getinstancecount() {
		return instancecount;
	}

	public static void instancecount(int instancecount) {
		StaticClass.instancecount = instancecount;
	}

	public int getInstancenum() {
		
		instancecount = 0;
		return this.instancenum;
	}

	public void setInstancenum(int instancenum) {
		this.instancenum = instancenum;
	}

}
