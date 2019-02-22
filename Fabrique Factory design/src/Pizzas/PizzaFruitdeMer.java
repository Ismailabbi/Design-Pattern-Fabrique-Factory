package Pizzas;

public class PizzaFruitdeMer extends Pizza {
	public void cuire() {
		   System.out.println("Cuire en 12 min");
		}

		@Override
		public void emballer() {
			 System.out.println("Emballage simple");
			
		}

		@Override
		public void preparer() {
			System.out.println("Préparation en 7 min");
			
		}

		

		public PizzaFruitdeMer() {
			 this.description="pizza fruit de mer";
		}

		@Override
		public void couper() {
			System.out.println("Découpe en 8 morceaux");
			
		}

		@Override
		public void affichage() {
			 System.out.println("Pizza Fruit de Mer");
			
		}

}
 