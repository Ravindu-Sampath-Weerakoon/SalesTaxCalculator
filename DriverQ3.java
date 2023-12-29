public class DriverQ3 {
    public static void main(String[] args) {
        Tax taxForTelevision= new Tax(
                "Television",
                100000,
                true,
                true
        );

        taxForTelevision.printTheDetailsOfTaxObject();

    }
}
