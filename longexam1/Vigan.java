public class Vigan implements Locations {

    int airFare = 63;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}