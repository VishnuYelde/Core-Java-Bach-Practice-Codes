// Constructor Overloading
// In a class having more than one Constructor with different parameters(like datatype of para, no. of para and order of para) (signature) is called Constructor Overloading.

public class AccDetail{
    long accno;
    double balance;
    String name;
    
    public AccDetail(long accno, double balance, String name){
        this.accno = accno;
        this.balance = balance;
        this.name = name;
    }
    
    public AccDetail(long accno){
        this.accno = accno;
    }
    
    public AccDetail(){
    }
    
    public static void main(String[] args){
        AccDetail a1 = new AccDetail();
        System.out.println(a1.name + " " + a1.accno + " " + a1.balance);
        
        AccDetail a2 = new AccDetail(9874563210L);
        System.out.println(a2.name + " " + a2.accno + " " + a2.balance);
        
        AccDetail a3 = new AccDetail(9874563210L, 50500, "Vishnu");
        System.out.println(a3.name + " " + a3.accno + " " + a3.balance);
    }
}