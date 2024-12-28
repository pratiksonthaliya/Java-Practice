package A_OOPs;

public class Student {
    int age;
    String name;
    String address;

    Student(int age, String name, String address){
        this.age = age;
        this.name = name;
        this.address = address;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }

    String getAddress(){
        return address;
    }
}
