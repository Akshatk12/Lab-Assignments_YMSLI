package day3;
/*
 *  An Employee Record System
You need to implement the Employee records of a company. The Company has 3 types of employee;
1) Salaried employee-> This type of employees are paid a fixed weekly salary regardless of the number of 
hours worked.
2) Hourly employee -> They are paid by the hour. They have an hourly rate and their payment will depend 
on how many hours they worked. The more they work, the more they will be paid. So, the salary will be 
[hour worked per week* hourly rate]. 
3) Commission employee-> They are paid a percentage of their sales. If their percentage is “a” and total 
weekly sale is ”b”, the total weekly salary will be [a*b/100];
 */
import java.util.*;
public class EmployeeRecordSystem{

	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<Employee>();

		Employee emp1 = new SalariedEmployee("Akshat", 332, 100000, 10);
		Employee emp2 = new CommisionedEmployee("Ram", 3332, 35000, 20, 1000000, 30);
		Employee emp3 = new HourlyEmployee("Shyam", 33332, 60000, 15, 48);

		Invoice inv = new Invoice("333332", "Gear", 5, 4000);

		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);

		System.out.println("Salary Of " + emp1.getName() + " is " + emp1.getPayment());
		System.out.println("Salary Of " + emp2.getName() + " is " + emp2.getPayment());
		System.out.println("Salary Of " + emp3.getName() + " is " + emp3.getPayment());
		System.out.println(inv);
		System.out.println("Total Cost: " + inv.getPayment());
	}
}