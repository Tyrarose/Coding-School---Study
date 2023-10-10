package bike;

class MountainBike {
    int weight;
    String color;
    String brand;

    public void getInfo(int weight, String color, String brand) {
        this.weight = weight;
        this.color = color;
        this.brand = brand;

        System.out.println(
            "\n" +
            "Weight: " + this.weight + "\n"+
            "Color: " + this.color + "\n" +
            "Brand: " + this.brand
        );
    }
}
