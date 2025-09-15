class Staff {
    int staffId;
    String staffName;

  public Staff(int id, String name) {
        this.staffId = id;
        this.staffName = name;
    }

    void displayStaff() {
        System.out.println("Staff ID: " + staffId + ", Name: " + staffName);
    }
}
