package Pizzas;

public class PizzaFromage extends Pizza{

	@Override
	public void cuire() {
	   System.out.println("Cuire en 5 min");
	}

	@Override
	public void emballer() {
		 System.out.println("Emballage simple");
		
	}

	@Override
	public void preparer() {
		System.out.println("Pr�paration en 4 min");
		
	}

	public PizzaFromage() {
		 this.description="Pizza au fromage";
	}

	@Override
	public void couper() {
		System.out.println("D�coupe en 4 morceaux");
		
	}

	@Override
	public void affichage() {
	  System.out.println("Pizza Fromage");
		
	}

	
	
	

}
