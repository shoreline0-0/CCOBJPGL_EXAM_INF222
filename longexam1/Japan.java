public class Japan implements Locations {

    int airFare = 191;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}