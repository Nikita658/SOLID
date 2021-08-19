package entity.electronics;

import entity.manufacturer.Manufacturer;



public class Telephone implements Electronics {
    private double price;
    private Manufacturer manufacturer;

    private Telephone(double price, Manufacturer manufacturer) {
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public void doWork() {
        System.out.println("you can phone to someone");
    }

    public Electronics clone() {
        return new Telephone.Builder()
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

        public Telephone build() {
            if (price <= 0) {
                price = 300;
            }
            return new Telephone(price, manufacturer);
        }
    }
}