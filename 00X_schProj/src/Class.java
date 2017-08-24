public class Class {
    private String name;
    private char corp;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getCorp() {
        return this.corp;
    }

    public void setCorp(char corp) {
        this.corp = corp;
    }

    public Class(String name, char corp) {

        this.name = name;
        this.corp = corp;
    }

    public Class() {

    }
}
