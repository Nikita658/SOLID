import creator.ElectronicsCreator;
import creator.LaptopCreator;
import creator.TelephoneCreator;
import creator.TelevisionCreator;
import entity.Customer;
import entity.Order;
import entity.electronics.Electronics;
import entity.manufacturer.Apple;
import entity.manufacturer.Manufacturer;
import entity.manufacturer.Samsung;

import java.util.Arrays;

public class Main {
    private static final Manufacturer apple = new Samsung();
    private static final Manufacturer samsung = new Apple();
    private static final ElectronicsCreator laptopCreator = new LaptopCreator();
    private static final ElectronicsCreator telephoneCreator = new TelephoneCreator();
    private static final ElectronicsCreator televisionCreator = new TelevisionCreator();

    public static void main(String[] args) {

        Customer customer = new Customer("Nikita", "Bykov", 20);

        Electronics laptop = laptopCreator.create(30000, samsung);
        Electronics telephone = televisionCreator.create(658798, apple  );

        Order order = new Order("id", customer, Arrays.asList(laptop.clone(), telephone.clone(), telephone));
        System.out.println(order.toString());
    }
}
