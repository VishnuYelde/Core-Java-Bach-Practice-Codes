public class GradingSystem {
    public static void main(String[] args) {
        int sub1 = 20;
        int sub2 = 30;
        int sub3 = 40;
        int sub4 = 50;
        int sub5 = 98;

        if (sub1 >= 0 && sub1 <= 100 &&
            sub2 >= 0 && sub2 <= 100 &&
            sub3 >= 0 && sub3 <= 100 &&
            sub4 >= 0 && sub4 <= 100 &&
            sub5 >= 0 && sub5 <= 100) {

            int totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
            System.out.println("Total Marks: " + totalmarks);

            int percentage = (totalmarks * 100) / 500;

            if (percentage < 30) {
                System.out.println("Grade: Failed");
            } else if (percentage >= 30 && percentage < 40) {
                System.out.println("Grade: Passed C2");
            } else if (percentage >= 40 && percentage < 50) {
                System.out.println("Grade: Passed C1");
            } else if (percentage >= 50 && percentage < 60) {
                System.out.println("Grade: Passed B1");
            } else if (percentage >= 60 && percentage < 70) {
                System.out.println("Grade: Passed B2");
            } else if (percentage >= 70 && percentage < 80) {
                System.out.println("Grade: Passed A2");
            } else if (percentage >= 80 && percentage < 90) {
                System.out.println("Grade: Passed A1");
            } else if (percentage >= 90 && percentage <= 100) {
                System.out.println("Grade: Distinction");
            }
        } else {
            System.out.println("Error: Subject marks must be between 0 and 100.");
        }
    }
}
