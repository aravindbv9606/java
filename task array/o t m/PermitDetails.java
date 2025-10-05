class PermitDetails {
    int licenseId;
    String licenseNumber;
    GeoLocation location;

    public PermitDetails(int licenseId, String licenseNumber, GeoLocation location) {
        this.licenseId = licenseId;
        this.licenseNumber = licenseNumber;
        this.location = location;
    }

    public void displayPermitDetails() {
        System.out.println("Permit ID: " + licenseId + ", Number: " + licenseNumber);
		System.out.println("Location: " + location.locationName+location.isActive);
    }
}

