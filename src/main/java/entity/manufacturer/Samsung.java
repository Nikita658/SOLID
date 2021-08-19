package entity.manufacturer;

import lombok.Getter;

@Getter
public class Samsung implements Manufacturer {
    private final String name = "Samsung";

    @Override
    public Manufacturer clone(){
        return new Samsung();
    }
}