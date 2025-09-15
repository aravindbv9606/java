class School {
    public void displayschool(Staff[] staffList) {
        System.out.println("Staff Members:");
        for (int num = 0; num < staffList.length; num++) {
            System.out.print(num);
            staffList[num].displayStaff();
        }
    }
}

