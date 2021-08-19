package creator;

import entity.electronics.Electronics;
import entity.manufacturer.Manufacturer;
import entity.electronics.Laptop;

public class LaptopCreator implements ElectronicsCreator {



    @Override
    public  Electronics create(double price, Manufacturer manufacturer) {
        return new Laptop.Builder()
                .setManufacturer(manufacturer)
                .setPrice(price)
                .build();
    }
}