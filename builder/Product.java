public class Product {
    private final String atribute1;
    private final int atribute2;
    private final boolean atribute3;

    public Product(Builder builder) {
        this.atribute1 = builder.getAtribute1();
        this.atribute2 = builder.getAtribute2();
        this.atribute3 = builder.isAtribute3();
    }

    public String getAtribute1() {
        return atribute1;
    }

    public int getAtribute2() {
        return atribute2;
    }

    public boolean isAtribute3() {
        return atribute3;
    }
}