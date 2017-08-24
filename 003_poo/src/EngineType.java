public enum EngineType {
    GAS,
    PETROL,
    DIESEL;

    public static EngineType parseString(String value) {
        switch (value.toLowerCase()) {
            case "gas":
                return GAS;
            case "petrol":
                return PETROL;
            case "diesel":
                return DIESEL;
            default:
                return null;
        }
    }
}
