package MethodOverloading_Overriding;

public class MethodOverriding {
		class Animal
		{
		  public void displayMessage()
		  {
		    System.out.println("Animal is eating");
		  }
		  
		}
		class Dog extends Animal
		{
		  public void displayMessage()
		  {
		    System.out.println("Dog is eating");
		  }
		  public void main(String arg[])
		  {
		    Dog d=new Dog();
		    d.displayMessage();
		  }
		}

	}


