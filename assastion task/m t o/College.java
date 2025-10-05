class College{

public static void main(String [] args){
Admission admission=new Admission("2001");
Student student=new Student("aravind",2500);
Department department=new Department("mechanical",23);
University university=new University("bcu",35,department,student,admission);
university.displayUniversity();



}
}