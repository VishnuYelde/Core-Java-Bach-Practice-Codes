public class Election {
    public static void main(String[] args) {
        
        Person p1 = new Person("Champaklal", 75, 'M');
        Student s1 = new Student("Tapu", 20, 'M', 45, 80, "Abc college");
        Employee e1 = new Employee("Baga", 30, 'M', "GadaE101", 100000, 1);

        Government g1 = new Government();

        //! Generalization methods
        g1.adhaarCard(p1);
        g1.adhaarCard(s1);
        g1.adhaarCard(e1);
        g1.adhaarCard(new Person("Abdul", 35, 'M'));

        System.out.println("--------------------------------------------------------");

        //! Specialized Methods
        // g1.Scholarship(p1); //CTE
        g1.Scholarship(s1);
        // g1.Scholarship(e1); //CTE


        // g1.taxPayment(p1); //CTE
        // g1.taxPayment(s1); //CTE
        g1.taxPayment(e1);

        System.out.println("----------------------------------------------------------");
        e1.jankari();
        s1.jankari();
        p1.jankari();

    }
}
