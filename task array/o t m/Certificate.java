class Certificate {
   public  String certificateName;
  public  Platform platform;

    public Certificate(String certificateName,  Platform platform ) {
        this.certificateName = certificateName;
        this.platform = platform;
    }

    public void displayCertificate() {
        System.out.println("Certificate: " + certificateName);
		System.out.println(platform.platformName+platform.isLive);
    }
}
