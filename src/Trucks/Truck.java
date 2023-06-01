package Trucks;

public enum Truck {
    SMALL(
            "Caminhão de pequeno porte",
            4.87),
    MEDIUM(
            "Caminhão de médio porte",
            11.92),
    LARGE(
            "Caminhão de grande porte",
            27.44);

    private final String SIZE_DESCRIPTION;
    private final double PRICE_PER_KM;

    Truck(String sizeDescription, double pricePerKm) {
        this.SIZE_DESCRIPTION = sizeDescription;
        this.PRICE_PER_KM = pricePerKm;
    }

    public String getSizeDescription() {
        return SIZE_DESCRIPTION;
    }

    public double getPricePerKm() {
        return PRICE_PER_KM;
    }

    public static Truck getTruckBySizeDescription(String sizeDescription) {
        for (Truck truck : Truck.values()) {
            if (truck.getSizeDescription().equals(sizeDescription)) {
                return truck;
            }
        }
        return null;
    }
}
