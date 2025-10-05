class OrganizationRunner {
    public static void main(String[] args) {
        Registration registration = new Registration("2021");
        Member member = new Member("Sneha", 15000);
        Division division = new Division("Tech Division", 300000);

        Organization organization = new Organization("Global Tech Forum", 500000, division, member, registration);
        organization.displayOrganization();
    }
}
