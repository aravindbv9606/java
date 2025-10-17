class CyberDefense {
    float expertCount;
    String firewallSystem;
    String intrusionTool;
    String commandCenter;

    public CyberDefense(float expertCount, String firewallSystem, String intrusionTool, String commandCenter) {
        this.expertCount = expertCount;
        this.firewallSystem = firewallSystem;
        this.intrusionTool = intrusionTool;
        this.commandCenter = commandCenter;
    }

    public void displayDetails() {
        System.out.println("Cyber Defense Expert Count: " + expertCount);
        System.out.println("Firewall System: " + firewallSystem);
        System.out.println("Intrusion Tool: " + intrusionTool);
        System.out.println("Command Center: " + commandCenter);
    }
}


