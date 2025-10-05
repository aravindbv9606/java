 class University {
    public String universityName;
	public int universityfee;
	public Department department;
	public Student student;
	public Admission admission;

    public University(String universityName,int universityfee,Department department, Student student,Admission admission) {
        this.universityName = universityName;
		this.universityfee=universityfee;
		this.department=department;
		this.student=student;
		this.admission=admission;
	}
		
		public void displayUniversity(){
		
		System.out.println(universityName+universityfee);
		System.out.println(department.departmentName+department.deptfee);
		System.out.println(student.studentName+student.fees);
		System.out.println(admission.admissionYear);
		
    }
 }

