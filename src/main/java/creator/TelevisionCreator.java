package creator;

import entity.electronics.Electronics;
import entity.manufacturer.Manufacturer;
import entity.electronics.Television;

public class TelevisionCreator implements ElectronicsCreator {
    @Override
    public Electronics create(double price, Manufacturer manufacturer) {
        return new Television.Builder()
                .setManufacturer(manufacturer)
                .setPrice(price).build();
    }
}