// Encapsulation:
//! It is the process of binding or wrapping up of data members along with its’s data handler methods i.e.., getters & setters

public class Demo {

    static class Student{
        private int age;
        private double percentage;

        // for age
        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return age;
        }

        // for percentage
        public void setPercentage(double percentage){
            this.percentage = percentage;
        }
        public double getPercentage(){
            return percentage;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(22);
        s.setPercentage(90);

        System.out.println(s.getAge());
        System.out.println(s.getPercentage() + "%");
    }
}