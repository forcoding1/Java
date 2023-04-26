public class check_aurg_exc {
    public static void main(String[] a) {
        int[] arr = new int[10];
        int f = 0, sum = 0;
        try{
            try{
                for(int i=0;i<4;i++){
                    arr[i] = Integer.parseInt(a[i]);
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                f = 1;
                throw new check_aurgument_exception();
            }
        }
        catch(check_aurgument_exception c){
            System.out.println("number of args less than 4");
        }
        if(f == 0){
            for(int i=0;i<4;i++){
                sum += arr[i] * arr[i]; 
            }
            System.out.println(sum);
        }
    }
}

class check_aurgument_exception extends Exception{

}
