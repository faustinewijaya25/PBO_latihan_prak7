class A {}
class B extends A {}
class C extends B {}
public class overload
{
	void myoverload(A a)
	{
		System.out.println("overload.myoverload(A a)");
	}
	void myoverload(B b)
	{
		System.out.println("overload.myoverload(B b)");
	}
	public static void main(String[] args)
	{
		overload o = new overload();
		C c = new C();
		o.myoverload(c);
	}
	
}