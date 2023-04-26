import java.io.*;

public class copy_chr {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        FileWriter fr= new FileWriter("b.txt");
        int c;

        while((c = br.read()) != -1){
            fr.write(c);
        }

        fr.close();
        br.close();

    }
}
