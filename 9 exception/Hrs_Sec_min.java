public class Hrs_Sec_min{
    public static void main(String[] args) {
        time t = new time();
        t.read_data(90, 0, 0);
        time te = new time();
        te.read_data(-26, 100, 200);
    }
}

class time{
    int hrs, min, sec;
    void read_data(int h,int m,int s){
        try{
            if(h>24 && h<0){
                throw new Hrs_exception();
            }
            else{
                hrs = h;
            }
        }
        catch(Hrs_exception e){
            System.out.println("hrs exception caught");
        }
        try{
            if(m>60 && m<0){
                throw new min_exception();
            }
            else{
                min = m;
            }
        }
        catch(min_exception e){
            System.out.println("minutes exception caught");
        }
        try{
            if(s>60 && s<0){
                throw new Seconds_exception();
            }
            else{
                sec = s;
            }
        }
        catch(Seconds_exception e){
            System.out.println("Seconds exception caught");
        }

    }
}

class Hrs_exception extends Exception{

}

class min_exception extends Exception{
    
}

class Seconds_exception extends Exception{
    
}