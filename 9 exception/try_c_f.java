public class try_c_f {
    public static void main(String[] args) {
        int a=5;
        try{
            int b = a/1;
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught");
        }
        finally{
            System.out.println("Completed execution");
        }
    }
}
