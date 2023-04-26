import java.io.*;

public class seven_sports {
    public static void main(String[] args) {
        int n = 2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer[] sp = new StringBuffer[n];

        for(int i = 0; i < n; i ++){
            try{
                sp[i] = new StringBuffer(br.readLine());
            }
            catch(IOException e){
                System.out.println("ERROR");
            }
        }
    

        for(int i = 0; i < n; i ++){
            if(sp[i].charAt(0) == 't' || sp[i].charAt(sp[i].length() -1) == 't'){
                System.out.println(sp[i]);
            }
            if(sp[i].length() > 4){
                sp[i].insert(3, "m");
                sp[i].delete(4, 5);
            }
        }

        System.out.println("\nFinal Strings: ");

        for(int i = 0; i < n; i ++){
            System.out.print(sp[i] + " ");
        }
        
    }
}
