package H_Interfaces;

public class Penguin implements Bird.NonFlyingBird{

    @Override
    public boolean canRun() {
        return true;
    }
}
