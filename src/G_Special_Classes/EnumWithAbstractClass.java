package G_Special_Classes;

public enum EnumWithAbstractClass {
    MONDAY{
        @Override
        public void dummyMethod() {
            System.out.println("In Monday");
        }
    },
    TUESDAY{
        @Override
        public void dummyMethod() {
            System.out.println("In Tuesday");
        }
    },
    WEDNESDAY{
        @Override
        public void dummyMethod() {
            System.out.println("In Wednesday");
        }
    };

    public abstract void dummyMethod();
}
