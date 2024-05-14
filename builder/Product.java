public class Product {
    private String name;
    private int price;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    public static class Builder {
        private String name;
        private int price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }

    public static void main(String[] args) {
        Product product = new Product.Builder()
            .setName("Laptop")
            .setPrice(1500)
            .build();

        System.out.println(product);
    }
}