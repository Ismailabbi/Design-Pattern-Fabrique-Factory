package Fabirque;

import Pizzas.Pizza;
import Pizzas.PizzaFromage;
import Pizzas.PizzaFruitdeMer;

public  class FabriqueCasa implements FabriquePizza {

	@Override
	public Pizza CreerPizza(String type) {
		Pizza p=null;
		if(type.equals("Fromage"))
			p=new PizzaFromage();
		else if (type.equals("Fruits"))
		     p=new PizzaFruitdeMer();
		return p;
	}

}
