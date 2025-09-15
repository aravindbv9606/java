class EmployeeInfo{

public static void main(String [] args){

EmployeeDetials employeeDetials1=new EmployeeDetials(1,"Aravind");
EmployeeDetials employeeDetials2=new EmployeeDetials(2,"daya");
EmployeeDetials employeeDetials3=new EmployeeDetials(3,"rani");

EmployeeDetials [] employeeDetials={employeeDetials1,employeeDetials2,employeeDetials3};

EmployeSalary employeSalary=new EmployeSalary();
employeSalary.displaySalary(employeeDetials);

}
}