package entity.electronics;

import entity.manufacturer.Manufacturer;


public class Laptop implements Electronics {
    private double price;
    private Manufacturer manufacturer;

    private Laptop(double price, Manufacturer manufacturer) {
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public void doWork() {
        System.out.println("You can use it everywhere");
    }

    public Electronics clone() {
        return new Laptop.Builder()
                .setPrice(price)
                .setManufacturer(manufacturer.clone()).
                        build();
    }

    public static class Builder {
        private double price;
        private Manufacturer manufacturer;

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setManufacturer(Manufacturer manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Laptop build() {
            if (price <= 0) {
                price = 300;
            }
            return new Laptop(price, manufacturer);
        }
    }
}