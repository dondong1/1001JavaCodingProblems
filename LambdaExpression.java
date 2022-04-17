package testing;

interface Addable{
	int addition(int a, int b);
}

class AddableImpl implements Addable{

	@Override
	public int addition(int a, int b) {
		return (a+b);
	}
	
}

interface Shape{
	void draw();
}

// polymorphism : several class implements same interface, in each class using method overriding to override the interface method
class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle class");
		
	}
}

class Square implements Shape{

	@Override
	public void draw() {
 		System.out.println("Square class");
	}
	
}

class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Circle class");
	}
}
public class LambdaExpression {
//Lamda expressions were introduced in Java 8
	//Lambda Expression is an anomymous funciton without name or belongs to any class
	//Lambda expression is mainly used to implement functional interfaces
	//Lambda expression in java has: 1. No name 2. parament list 3. body : the main part of the function. 4. no return type
	//lambdaAdd = (int a, int b) -> (a+b);
	// ()-> {} (Lambda Input Parmenter -> Lambda body)
	
	//Now look those classes up above they were wrtitten in normal way.
	// Now look down here we can write similar classes using much more simple lambda expression way: 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape eclipse = () -> {
			System.out.println("Eclipse class: ");
		};
		eclipse.draw();
		//if inside your curly bracket only one statement, you can remove the curly bracket in lambda expression
		Shape triangle = () -> System.out.println("triangle clases:");
		triangle.draw();
		
		Addable addition = (a, b) -> (a+b); 
	}

}
