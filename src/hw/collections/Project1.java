package hw.collections;

public class Project1{

    public static void main(String[] args) {

//        Employee sam = new Employee("Sam", "Leman Brothers", "female", 22);
//        sam.display();
//        Client bob = new Client("Bob", "Leman Brothers", "male", 34);
//        bob.display();
        Employee sam = new Employee("Sam", "Monobank", "female", 22, "2 months" ,
                "manager");
        sam.summary();
        Client bob = new Client("Bob", "PrivatBank", "male", 34, "Problems with website",
                "huge text........");
        bob.complaint();

    }
}

interface ForEmployee{
    private void summary(){
    }
}

interface ForClient{
    private void complaint(){
    }
}
abstract class Person {

    private String name;
    private String bank;
    private String gender;
    private int age;

    public String getName() { return name; }
    public String getBank() { return bank; }
    public String getGender() { return gender; }
    public int getAge() {return age; }

    public Person(String name, String bank, String gender, int age){

        this.name=name;
        this.bank=bank;
        this.gender=gender;
        this.age=age;
    }

    public abstract void display();
}

class Employee extends Person implements ForEmployee{

    private String workExperience;
    private String jobTitle;

    public Employee(String name, String bank, String gender, int age) {

        super(name, bank, gender, age);
    }

    public Employee(String name, String bank, String gender, int age, String workExperience, String jobTitle) {
        super(name, bank, gender, age);
        this.workExperience = workExperience;
        this.jobTitle = jobTitle;
    }

    public void display(){

        System.out.printf("Employee Name: %s \n Bank: %s \n Gender: %s \n Age: %s \n", super.getName(), super.getBank(),
                super.getGender(), super.getAge());
    }

    public void summary(){
        System.out.printf("Employee Name: %s \n Bank: %s \n Gender: %s \n Age: %s \n Work Experience: %s \n Job Title: %s \n",
                super.getName(), super.getBank(), super.getGender(), super.getAge(), workExperience, jobTitle);
    }
}

class Client extends Person implements ForClient{

    private String reasonOfProblem;
    private String details;

    public Client(String name, String bank, String gender, int age) {

        super(name, bank, gender, age);
    }

    public Client(String name, String bank, String gender, int age, String reasonOfProblem, String details) {
        super(name, bank, gender, age);
        this.reasonOfProblem = reasonOfProblem;
        this.details = details;
    }

    public void display(){
        System.out.printf("Client Name: %s \n Bank: %s \n Gender: %s \n Age: %s \n", super.getName(), super.getBank(),
                super.getGender(), super.getAge());
    }

    public void complaint(){
        System.out.printf("Client Name: %s \n Bank: %s \n Gender: %s \n Age: %s \n Reason Of Problem: %s \n Details: %s \n",
                super.getName(), super.getBank(), super.getGender(), super.getAge(), reasonOfProblem, details);
    }
}
