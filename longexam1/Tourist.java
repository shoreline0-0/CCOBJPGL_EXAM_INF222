interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Vigan vigan);
    void visit(Davao davao);
    void visit(Japan japan);
    void visit(Canada canada);
    void visit(London london);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}