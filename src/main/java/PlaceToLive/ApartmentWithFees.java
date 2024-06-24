package PlaceToLive;

public class ApartmentWithFees extends Apartment{
    private double blocksPayment;

    public double getBlocksPayment() {
        return blocksPayment;
    }

    public void setBlocksPayment(double blocksPayment) {
        this.blocksPayment = blocksPayment;
    }

    @Override
    public double houseRentbill (double blocksPayment) {
        return blocksPayment * 3;
    }



}
