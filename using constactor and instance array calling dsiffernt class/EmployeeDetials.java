class EmployeeDetials{
  public int employeIdNumber;
  public String employeName;

public EmployeeDetials(int employeIdNumber,String employeName){

this.employeIdNumber=employeIdNumber;
this.employeName=employeName;

}
public void displaydetials(){
System.out.println("employeIdNumber:"+ employeIdNumber + " " +"employeName:"+  employeName);
//System.out.println("employeName"+employeName);



}
}