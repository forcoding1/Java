import java.io.*;

public class by_str {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        InputStream is = new FileInputStream("output.bin");
        InputStream is1 = new FileInputStream("output2.bin");

        int size = is.available();
        while(is.read() == is1.read()){}

        System.out.println(size - is.available());


    }
}
