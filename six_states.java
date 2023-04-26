import java.io.*;

public class six_states {
    public static void main(String[] args) throws IOException{
        int n = 2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer[] s = new StringBuffer[n];

        System.out.println("Enter names of states");
        for(int i = 0; i < n;i++){
            s[i] = new StringBuffer(br.readLine());
        }


        System.out.println("After Modifications: \n");
        for(int i = 0; i < n;i++){

            if(s[i].charAt(0) == 'm'){
                s[i].replace(0,1,"n");
            }

            s[i].append(" State");

            s[i].insert(4, "India");

            System.out.print(s[i] + " ");

        }
    }
}
