package G_Special_Classes;

public class POJO { // Plain OLd Java Object
    // No annotations, not extends or implements any class
    // Public default constructor and public class
    // contains variables and its getters and setters

    int name;
    private int rollNumber;
    protected String address;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
