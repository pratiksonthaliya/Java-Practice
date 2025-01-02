package G_Special_Classes;

public enum EnumImplementsInterface implements MyInterface{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
