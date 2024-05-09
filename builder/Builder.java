public class Builder {
    private String atribute1;
    private int atribute2;
    private boolean atribute3;

    private Builder() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Builder withAtribute1(String atribute1) {
        this.atribute1 = atribute1;
        return this;
    }

    public Builder withAtribute2(int atribute2) {
        this.atribute2 = atribute2;
        return this;
    }

    public Builder withAtribute3(boolean atribute3) {
        this.atribute3 = atribute3;
        return this;
    }

    public Product build() {
        return new Product(this);
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
