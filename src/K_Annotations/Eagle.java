package K_Annotations;

@Category(name = "Bird")
@Category(name = "LivingBeing")
public class Eagle implements Bird {
    @Override
    public boolean fly() {
        return true;
    }
}
