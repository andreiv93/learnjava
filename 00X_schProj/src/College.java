public class College {
    private String name;
    private String profile;
    private boolean priv;
    private int maxStudents;
    private float minGrd;
    private char[] corps;
    private int nrStaff;
    private City city;


    public College() {
    }

    public College(String name, String profile, boolean priv, int maxStudents, float minGrd, char[] corps, int nrStaff, String city) {
        this.name = name;
        this.profile = profile;
        this.priv = priv;
        this.maxStudents = maxStudents;
        this.minGrd = minGrd;
        this.corps = corps;
        this.nrStaff = nrStaff;
        this.city = City.parseString(city);
    }

    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public boolean isPriv() {
        return this.priv;
    }

    public void setPriv(boolean priv) {
        this.priv = priv;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public float getMinGrd() {
        return this.minGrd;
    }

    public void setMinGrd(float minGrd) {
        this.minGrd = minGrd;
    }

    public char[] getCorps() {
        return this.corps;
    }

    public void setCorps(char[] corps) {
        this.corps = corps;
    }

    public int getNrStaff() {
        return this.nrStaff;
    }

    public void setNrStaff(int nrStaff) {
        this.nrStaff = nrStaff;
    }

    public boolean accepts(Student value) {
        return value.calculateAvg() >= this.minGrd;
    }

    public Class[] availableClasses (Class[] values) {
        int i = 0;
        Class[] result = new Class[values.length];

        for (Class temp : values) {
            for (char val : this.corps) {
                if (temp.getCorp() == val) {
                    result[i] = temp;
                    i++;
                }
            }
        }
        return result;
    }
}
