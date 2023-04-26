import java.io.*;

public class five_subjects {
    public static void main(String[] args) throws IOException{
        int n = 2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer[] s = new StringBuffer[n];

        System.out.println("Enter subjects ");
        for(int i = 0; i <n; i++){
            s[i] = new StringBuffer(br.readLine());
        }

        System.out.println("Printing:");
        for(int i = 0; i <n; i++){
            s[i].insert(0, "Programming ");
            System.out.println(s[i]);
        }

        System.out.println("Printing in lower case:");
        for(int i = 0; i <n; i++){

            System.out.print(s[i].toString().toLowerCase().trim() + " ");

        }


        System.out.println("\nreverse");
        for(int i = 0; i <n; i++){

            s[i].reverse();

            System.out.print(s[i] + " ");

        }
        
    }
}
