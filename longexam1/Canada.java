public class Canada implements Locations {

    int airFare = 215;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}