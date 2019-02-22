package Pizzas;

public abstract class Pizza {
 String description;
 public abstract void affichage();
 public abstract void cuire();
 public abstract void emballer();
 public abstract void preparer();
 public abstract void couper();
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}	 	
	
}
