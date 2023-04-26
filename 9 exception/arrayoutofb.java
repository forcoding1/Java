public class arrayoutofb {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        try{
            System.out.println(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception caught");
        }
    }
}
