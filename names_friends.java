import java.io.*;

public class names_friends {
    public static void main(String[] args) {
        int n = 6;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer[] frnds = new StringBuffer[n];


        System.out.println("Enter names");
        for(int i = 0; i < n; i++){
            try{
                String r = br.readLine();
                frnds[i] = new StringBuffer(r);
            }
            catch(IOException e){
                System.out.println("ERROR");
            }
        }

        System.out.println("Enter surnames: ");
        for(int i = 0; i < n; i++){
            try{
                String r = br.readLine();
                frnds[i].append(" " + r );
            }
            catch(IOException e){
                System.out.println("ERROR");
            }
        }

        for(int i = 0; i < n; i++){
            frnds[i].reverse();
            System.out.print(frnds[i] +  " ") ;
        }

    }
}
