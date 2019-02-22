import Fabirque.FabriqueCasa;
import Pizzas.Pizza;

public class Test {

	public static void main(String[] args) {
		 Pizzeria pizzeria=new Pizzeria(new FabriqueCasa());
		 Pizza p1=pizzeria.comanderPizza("Fromage");
		 p1.affichage();
	}

}
