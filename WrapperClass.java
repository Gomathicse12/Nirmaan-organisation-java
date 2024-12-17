package day17;

public class WrapperClass {
	public static void main (String args[]) {
	int num=16;
	Integer WrapInt=num;
	System.out.println(WrapInt);
	byte num1=127;
	Byte WrapByte=num1;
	System.out.println(WrapByte);
	long num2=100000l;
	Long WrapLong=num2;
	System.out.println(WrapLong);
	short num3=16;
	Short WrapShort=num3;
	System.out.println(WrapShort);
    double num4=77.89;
	Double WrapDouble=num4;
	System.out.println(WrapDouble);
	float num5=12.3f;
	Float WrapFloat=num5;
	System.out.println(WrapFloat);
	
	//uboxing
	
	int num6=WrapInt;
	System.out.println(num6);
	
	Byte num7=WrapByte;
	System.out.println(num7);
	
	long num8=WrapLong;
	System.out.println(num8);
	
	short num9=WrapShort;
	System.out.println(num9);
	
	double num10=WrapDouble;
	System.out.println(num10);
	
	float num11=WrapFloat;
	System.out.println(num11);
	}

}
