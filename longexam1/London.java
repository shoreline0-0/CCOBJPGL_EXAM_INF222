public class London implements Locations {

    int airFare = 356;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}