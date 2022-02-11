public class Equals {
    public String name;

    public Equals(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        boolean value;
        if (this.name == obj) {
            value = true;
        } else {
            value = false;
        }
        return value;
    }
}
