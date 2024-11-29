package day6;



public class Nirmaanorg {
	   int studid=0;
	   String studname="";
	   String studcourse="";
	    void checkIn(String sign) {
	    	System.out.println(sign);
	    }
	    void checkOut(String signed) {
	    	System.out.println(signed);
	    }
	public static void main(String args[]) {
		Nirmaanorg st=new Nirmaanorg();
		       st. studid=1;
				st.studname="abi";
				st.studcourse="java";
				
				st.checkIn("welcome");
				
				System.out.println(st.studid);
				System.out.println(st.studname);
				System.out.println(st.studcourse);
				st.checkOut("bye");
				
				
				Nirmaanorg std=new Nirmaanorg();
			       std. studid=2;
					std.studname="pri";
					std.studcourse="java";
					st.checkIn("welcome");
					System.out.println(std.studid);
					System.out.println(std.studname);
					System.out.println(std.studcourse);
					st.checkOut("bye");
					
					
	}

}
