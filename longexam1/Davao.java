public class Davao implements Locations {

    int airFare = 125;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}