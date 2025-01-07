package H_Interfaces;

public class Crocodile implements WaterAnimal, LandAnimal{

    @Override
    public boolean canBreathe() {
        return true;
    }
}
