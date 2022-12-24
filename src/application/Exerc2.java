package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.printf("\nEmployee #%d\n", i+1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(employees, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employees.stream().filter(x->x.getId() == id).findFirst().orElse(null);

        if(emp == null){
            System.out.println("This id does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.addSalary(percentage);
        }

        System.out.println("List of employees:");
        for(Employee x : employees){
            System.out.println(x);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
