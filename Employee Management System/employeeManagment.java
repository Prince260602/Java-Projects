import java.util.ArrayList;
import java.util.Scanner;

class Employee {
  private int id;
  private String name;
  private int age;
  private double salary;

  public Employee(int id, String name, int age, double salary) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
  }
}

class EmployeeManagementSystem {
  private ArrayList<Employee> employees = new ArrayList<Employee>();

  public void addEmployee(Employee e) {
    employees.add(e);
  }

  public void removeEmployee(int id) {
    for (int i = 0; i < employees.size(); i++) {
      Employee e = employees.get(i);
      if (e.getId() == id) {
        employees.remove(i);
        break;
      }
    }
  }

  public void displayEmployees() {
    for (Employee e : employees) {
      System.out.println(e);
    }
  }
}

public class employeeManagment {
  public static void main(String[] args) {
    EmployeeManagementSystem ems = new EmployeeManagementSystem();
    Scanner sc = new Scanner(System.in);
    int choice = 0;
    while (choice != 4) {
      System.out.println("1. Add Employee");
      System.out.println("2. Remove Employee");
      System.out.println("3. Display Employees");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1:
          System.out.print("Enter Employee ID: ");
          int id = sc.nextInt();
          sc.nextLine();
          System.out.print("Enter Employee Name: ");
          String name = sc.nextLine();
          System.out.print("Enter Employee Age: ");
          int age = sc.nextInt();
          sc.nextLine();
          System.out.print("Enter Employee Salary: ");
          double salary = sc.nextDouble();
          sc.nextLine();
          Employee e = new Employee(id, name, age, salary);
          ems.addEmployee(e);
          System.out.println("Employee added successfully!");
          break;
          case 2:
          System.out.print("Enter Employee ID to remove: ");
          int removeId = sc.nextInt();
          sc.nextLine();
          ems.removeEmployee(removeId);
          System.out.println("Employee removed successfully!");
          break;
          case 3:
          System.out.println("List of Employees:");
          ems.displayEmployees();
          break;
          case 4:
          System.out.println("Exiting Employee Management System...");
          break;
          default:
          System.out.println("Invalid choice. Try again.");
          break;
          }
          }
          sc.close();
          }
          }
