import java.io.*;

public class five_films {
        public static void main(String[] args) throws IOException{
        int n = 3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[n];

        System.out.println("Enter the names of films");

        for(int i = 0; i < n; i++){
            s[i] = br.readLine();
        }

        System.out.println("Starting with k or ending with a");
        for(String a: s){
            if(a.charAt(0) == 'k' || a.charAt(a.length()-1) == 'a'){
                System.out.print(a + " ");
            }        }

        System.out.println("Substrings");
        for(String a: s){
            if(a.length() > 4){
                System.out.print(a.substring(1, 3)  + " ");
            }
        }

        System.out.println("Last occurence of e");
        for(String a: s){
            System.out.print(a.lastIndexOf('e') + " ");
            
        }
    }
}

