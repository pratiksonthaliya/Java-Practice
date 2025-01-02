package G_Special_Classes;

public enum EnumWithOverrideByConstant {
    MONDAY {
        @Override
        public void dummyMethod(){
            System.out.println("Monday: 1st day in a week");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod(){
        System.out.println("Random day in a Week");
    }
}


