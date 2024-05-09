public class Main {
    public static void main(String[] args) {
        Product product = Builder.newBuilder()
                                .withAtribute1("Atribute 1")
                                .withAtribute2(20)
                                .withAtribute3(true)
                                .build();

        System.out.println("Product created with:");
        System.out.println("Atribute 1: " + product.getAtribute1());
        System.out.println("Atribute 2: " + product.getAtribute2());
        System.out.println("Atribute 3: " + product.isAtribute3());
    }
}
