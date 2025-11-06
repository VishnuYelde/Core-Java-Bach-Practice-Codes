public class child extends MethodOverriding{
    @Override
    public void Captaincy(){
        System.out.println("Virat was captain till 2021.");
    }
    public static void main(String[] args) {
        child c = new child();
        c.Captaincy();
    }
}
