public class overload1 
{
void myMethod(short s)
{
	System.out.println("short");
}	

void myMethod(int i)
{
	System.out.println("int");
}

void myMethod(long l)
{
	System.out.println("long");
}
public static void main(String[] args)
{
	byte b=1;
	overload1 o = new overload1();
	o.myMethod(b);
}
}