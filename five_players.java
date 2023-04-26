import java.io.*;

public class five_players {
    public static void main(String[] args) {
        
        int n =  2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer[] sb = new StringBuffer[n];

        for(int i = 0; i < n; i++){
            try{
                String s = br.readLine();
                sb[i] = new StringBuffer(s);
            }
            catch(IOException e){
                System.out.println("ERROR");
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println("Starting with index 2: ");
            System.out.print(sb[i].substring(2) + " ");
        }
        System.out.println("\nafter replacing: ");
        for(int i = 0; i < n; i++){
            if(sb[i].charAt(0) == 's'){
                for(int j = 1; j < sb[i].length(); j++){
                    if(sb[i].charAt(j) == 'e'){
                        sb[i].replace(j, j+1, "a");
                    }
                }
            }
            System.out.println(sb[i]);
        }
    }
}
