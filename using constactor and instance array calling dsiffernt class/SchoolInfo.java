class SchoolInfo {
    public static void main(String[] args) {
        Staff s1 = new Staff(1, "Ravi");
        Staff s2 = new Staff(2, "Anita");
        Staff[] staffList = {s1, s2};

        School school = new School();
        school.displayschool(staffList);
		}
}

