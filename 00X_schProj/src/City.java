public enum City {
    GALATI,
    BRAILA,
    BUCURESTI,
    BRASOV,
    IASI;

    public static City parseString(String name) {
        switch (name.toLowerCase()) {
            case "Galati":
                return GALATI;
            case "Braila":
                return  BRAILA;
            case "Bucuresti":
                return BUCURESTI;
            case "Brasov":
                return BRASOV;
            case "Iasi":
                return IASI;
            default:
                return null;

        }
    }
}


