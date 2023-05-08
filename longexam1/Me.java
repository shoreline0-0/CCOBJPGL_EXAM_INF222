public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
    	if (budget >= boracay.airFare) {
    		budget = budget - boracay.airFare;
    		System.out.println("\nAir Fare accepted! Visit approved. \nCurrent destination: Boracay. Don't forget to put on a sunblock!");
    		checkBudget();
    	} else {
    		System.out.println("\nInsufficient Air Fare! " + (boracay.airFare-budget) + " dollars more is required. Visit to Boracay cancelled.");
    	}
    }
    
    public void visit(Vigan vigan) {
    	if (budget >= vigan.airFare) {
    		budget = budget - vigan.airFare;
    		System.out.println("\nAir Fare accepted! Visit approved. \nCurrent destination: Vigan. Make sure you try the empanada and bagnet~");
    		checkBudget();
    	} else {
    		System.out.println("\nInsufficient Air Fare! " + (vigan.airFare-budget) + " dollars more is required.  Visit to Vigan cancelled.");
    	}
    }
    
    public void visit(Davao davao) {
    	if (budget >= davao.airFare) {
    		budget = budget - davao.airFare;
    		System.out.println("\nAir Fare accepted! Visit approved. \nCurrent destination: Davao. Take a picture of the eagles for us!");
    	checkBudget();
    	} else {
    		System.out.println("\nInsufficient Air Fare!  " + (davao.airFare-budget) + " dollars more is required. Visit to Davao cancelled.");
    	}
    }
    
    public void visit(Japan japan) {
    	if (budget >= japan.airFare) {
    		budget = budget - japan.airFare;
    	System.out.println("\nAir Fare accepted! Visit approved. \nCurrent destination: Japan. Have a translator ready!");
    	checkBudget();
	} else {
		System.out.println("\nInsufficient Air Fare!  " + (japan.airFare-budget) + " dollars more is required. Visit to Japan cancelled.");
	}
    }
    
    public void visit(Canada canada) {
    	if (budget >= canada.airFare) {
    		budget = budget - canada.airFare;
    	System.out.println("\nAir Fare accepted! Visit approved. \nCurrent destination: Canada. The land of the moose and maple syrup.");
    	checkBudget();
	} else {
		System.out.println("\nInsufficient Air Fare!  " + (canada.airFare-budget) + " dollars more is required. Visit to Canada cancelled.");
	}
    }
    
    public void visit(London london) {
    	if (budget >= london.airFare) {
    		budget = budget - london.airFare;
    	System.out.println("\nAir Fare accepted! Visit approved. \nCurrent destination: London. Weather's nice, innit?");
    	checkBudget();
	} else {
		System.out.println("\nInsufficient Air Fare!  " + (london.airFare-budget) + " dollars more is required. Visit to London cancelled.");
	}
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}