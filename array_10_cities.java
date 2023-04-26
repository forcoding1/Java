import java.io.*;

public class array_10_cities{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
        meth sb = new meth();
        sb.display();
        System.out.println("\nAny two equal: " + sb.checkequal()); 
        sb.display_f_char();

    }

}

class meth{

    int n = 5;

    String[] s = new String[n];

    meth(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      

        System.out.println("Enter the names of n cities");
        try{
            for(int i = 0; i < n ; i++){
                s[i] = br.readLine();
                s[i].toLowerCase();
            }
        }

        catch(IOException e){
            System.out.println("ERROR");
        }
    }

    boolean checkequal(){
        for(int i = 0; i < n ; i++){
        
            for(int j = i+1; j < n ; j++){
        
                if(s[i].equals(s[j])){
                    System.out.println("Printing locations: " + i + " " + j);
                    return true;
                }

            }
        }
        return false;
    }
    void display(){
        System.out.println("\nPrinting the strings");
        for(int i = 0; i < n ; i++){
            System.out.print(s[i] + " ");
        }
    }

    void display_f_char(){
        for(int i = 0; i < n ; i++){
            System.out.println(s[i].charAt(0));
        }
    }
}