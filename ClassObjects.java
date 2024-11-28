package Day5;

public class ClassObjects {
    String studentname="";
    int studentage;
    String studentcourse="" ;
    int studentid;		

public static void main(String args[] )
{     
	ClassObjects st=new ClassObjects();
	 st.studentname=" kaviya";
	  st.studentage = 20;
	    st.studentcourse="java" ;
	    st.studentid= 11 ;


	System.out.println(st.studentname);
	System.out.println(st.studentage);
	System.out.println(st.studentcourse);
	System.out.println(st.studentid);
	ClassObjects st2=new ClassObjects();
	 st2.studentname=" diya";
	  st2.studentage = 20;
	    st2.studentcourse="java" ;
	    st2.studentid= 11 ;


	System.out.println(st2.studentname);
	System.out.println(st2.studentage);
	System.out.println(st2.studentcourse);
	System.out.println(st2.studentid);


	
         

}}
