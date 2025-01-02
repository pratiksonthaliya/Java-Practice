package G_Special_Classes;

public enum EnumWithCustomValues {
    MONDAY(101, "1st Day of Week"),
    TUESDAY(102, "2nd Day of Week"),
    WEDNESDAY(103, "3rd Day of Week"),
    THRUSDAY(104, "4th Day of Week"),
    FRIDAY(105, "5th Day of Week"),
    SATURDAY(106, "6th Day of Week"),
    SUNDAY(107, "7th Day of Week");

    private int value;
    private String comment;

    EnumWithCustomValues(int value, String comment){
        this.value = value;
        this.comment = comment;
    }

    private int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment(){
        return comment;
    }

    public static EnumWithCustomValues getEnumValue(int value){
        for(EnumWithCustomValues enumWithCustomValues : EnumWithCustomValues.values()){
            if(enumWithCustomValues.value == value){
                return enumWithCustomValues;
            }
        }
        return null;
    }
}
