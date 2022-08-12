package constructorsprg;

public class StudentInfo {
	String name;
	int rollNo;
	int feesPend;
	StudentInfo(String x ,int y,int z){
		name=x;
		rollNo=y;
		feesPend=z;
	}
	public void print() {
		System.out.println(name+ " " +rollNo+ " " +feesPend);
		
	}

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo("amin",1155,45000);
		s1.print();
		StudentInfo s2 = new StudentInfo("muhhamud",1157,45085);
		s2.print();
		StudentInfo s3 = new StudentInfo("mustafa",1257,49085);
		s3.print();
		StudentInfo s4 = new StudentInfo("altamash",1357,50085);
		s4.print();
		

	}

}
