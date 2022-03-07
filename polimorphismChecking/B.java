package polimorphismChecking;

public class B extends A {
	B(){
		System.out.println("cunstructor B");
	}
	B(int a){
		super(2);
		System.out.println("argument cunstructor B");

}
	void display(){
		System.out.println("display b");

}
}
