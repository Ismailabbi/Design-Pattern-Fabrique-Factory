import Fabirque.FabriquePizza;
import Pizzas.Pizza;

public class Pizzeria {
	private FabriquePizza fabrique ;
	public Pizzeria(FabriquePizza fabrique) {
		this.fabrique=fabrique;
	}
	
	public Pizza comanderPizza(String type) {
		
		Pizza p =fabrique.CreerPizza(type);
		
		return p;
		
	}

}
