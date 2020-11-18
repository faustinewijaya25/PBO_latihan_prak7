class parent{
	int x= 5;
public void Info() {
	System.out.println("Ini class Parent");
}
}
class child extends parent{
	int x= 10;
public void Info(){
System.out.println("Ini class Child");
}	
}
public class tess{
	public static void main(String args[]){
		parent tes = new child();
		System.out.println("Nilai x= "+tes.x); tes.Info();
	}
}