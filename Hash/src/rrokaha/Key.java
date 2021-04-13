package rrokaha;

public class Key {

    private String name;

    public Key(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "("
                + this.hashCode() + ")";
    }
}
