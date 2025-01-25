package L_Exception_Handling;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exception Handling: ");

        Main sampleObj = new Main();
//        sampleObj.method1();

        // Out of memory error
        // String[] arr = new String[999999999*999999999];

        // // Unchecked/Runtime Exceptions
        //  sampleObj.classCastException();
        //  sampleObj.arithmeticException();
        //  sampleObj.indexOutOfBoundException();
        //  sampleObj.nullPointerException();
        //  sampleObj.illegalArgumentException();

//        try {
//            method1("dummy");
//        } catch (ClassNotFoundException | InterruptedException ex) {
//            ex.printStackTrace();
//        } catch (Exception ex){
//            ex.printStackTrace();
//        } finally {
//            System.out.println("Hola");
//        }

        try {
            method2();
        } catch (MyCustomException ex){
            ex.printStackTrace();
        }

    }

    // // Checked/Compile Exceptions
    public static void method1(String name) throws ClassNotFoundException, InterruptedException{
        if(name.equals("dummy")){
            throw new InterruptedException();
        }
        else throw new ClassNotFoundException();
    }

    public static void method2() throws MyCustomException{
        throw new MyCustomException("So much error these days");
    }

    // // Unchecked/Runtime Exceptions
    private void classCastException(){
        Object val = 0;
        System.out.println((String) val);
    }
    private void arithmeticException(){
        int b = 5/0;
    }
    private void indexOutOfBoundException(){
        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
    private void nullPointerException(){
        String name = null;
        System.out.println(name.charAt(0));
    }
    private void illegalArgumentException(){
        int val = Integer.parseInt("abs");
    }
}

