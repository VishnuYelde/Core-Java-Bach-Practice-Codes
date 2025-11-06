public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void jankari(){
        System.out.println("Person name is " + name + ", Age is " + age + ", Gender is "+ gender);
    }
}
