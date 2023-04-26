public class process_input_p {
    public static void main(String[] args) {
        process a = new process();
        a.process_inp(-4);
    }
}

class process{
    void process_inp(int a){
        try{
            if(a < 0){
                throw new negative_exception();
            }
            else{
                System.out.println(2*a);
            }
        }        
        catch(negative_exception e){
            System.out.println("negative number exception");
        }   
    }
}

class negative_exception extends Exception{

}