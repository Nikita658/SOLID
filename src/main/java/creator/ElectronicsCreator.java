package creator;

import entity.electronics.Electronics;
import entity.manufacturer.Manufacturer;

public interface ElectronicsCreator {
    Electronics create(double price, Manufacturer manufacturer);
}