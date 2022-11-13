/**
 * App
 */
public class Employee extends Person{
    
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }    
    public static void main(String[] args) {
        var employee = new Employee("Diogo Paza");
        System.out.println("Employee's Name " + employee.getName());
        var person = new Employee("Pedro Paza");
        System.out.println("Employee-Person's Name " + person.getName());

    }
}