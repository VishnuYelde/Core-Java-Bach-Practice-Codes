// package Interface;

public interface BhimUpi {
    void transfer(int amt);

    public static void main(String[] args) {
        BhimUpi upi = new ICICI();
        upi.transfer(50000);

        BhimUpi upi2 = new SBI();
        upi2.transfer(80000);
    }
}

class ICICI implements BhimUpi{
    public void transfer(int amt){
        System.out.println("ICICI transfered Money " + amt);
    }
}

class SBI implements BhimUpi{
    public void transfer(int amt){
        System.out.println("SBI transfered Money "+ amt);
    }
}
