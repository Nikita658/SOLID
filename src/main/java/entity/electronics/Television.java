package entity.electronics;

import entity.manufacturer.Manufacturer;


public class Television implements Electronics {
    private double price;
    private Manufacturer manufacturer;

    private Television(double price, Manufacturer manufacturer) {
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public void doWork() {
        System.out.println("You can watch TV");
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

        public Television build() {
            if (price <= 0) {
                price = 300;
            }
            return new Television(price, manufacturer);
        }
    }

    public Electronics clone() {
        return new Builder()
                .setPrice(price)
                .setManufacturer(manufacturer.clone()).
                        build();
    }

}