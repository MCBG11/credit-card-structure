public class Products implements Comparable<Products>{

    private String description;
    private double price;

    public Products(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product =  " + description +
                ", price =" + price;
    }

    @Override//Important to implements compareTo -- in this way Arraylist.sort can be used in ppal class
    public int compareTo(Products otherProducts) {
        return Double.valueOf(this.price).compareTo(Double.valueOf(otherProducts.getPrice()));//also is needed to cast price from double to Double
    }
}
