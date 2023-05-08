public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod
    	
    	Locations boracay = new Boracay();
    	Locations vigan = new Vigan(); //additional location 1
    	Locations davao = new Davao(); //additional location 2
    	Locations japan = new Japan(); //additional location 3
    	Locations london = new London(); //additional location 4
    	Locations canada = new Canada(); //additional location 5
    	
    	Tourist sherlene = new Me();
    	
    	boracay.accept(sherlene);
    	vigan.accept(sherlene);
    	davao.accept(sherlene);
    	japan.accept(sherlene);
    	canada.accept(sherlene);
    	london.accept(sherlene);

    }
}