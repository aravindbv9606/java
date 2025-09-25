class Device extends ElectronicDevice{
   public byte usbPorts;               
   public short voltage;              
   public int serialNumber;           
   public long deviceId;               
   public float batteryLevel;          
   public double price;               
   public char energyRating;           
   public boolean isPoweredOn;         

   
    public Device(byte usbPorts, short voltage, int serialNumber, long deviceId,
                  float batteryLevel, double price, char energyRating, boolean isPoweredOn) {
		super();
        this.usbPorts = usbPorts;
        this.voltage = voltage;
        this.serialNumber = serialNumber;
        this.deviceId = deviceId;
        this.batteryLevel = batteryLevel;
        this.price = price;
        this.energyRating = energyRating;
        this.isPoweredOn = isPoweredOn;
    }

    
    public void display() {
        System.out.println("Device Details:");
        System.out.println("USB Ports: " + this.usbPorts);
        System.out.println("Voltage: " + this.voltage );
        System.out.println("Serial Number: " + this.serialNumber);
        System.out.println("Device ID: " + this.deviceId);
        System.out.println("Battery Level: " + this.batteryLevel + "%");
        System.out.println("Price: ₹" + this.price);
        System.out.println("Energy Rating: " + this.energyRating);
        System.out.println("Powered On: " + this.isPoweredOn);
		System.out.println("powerRating"+ super.powerRating);
		System.out.println("voltage"+ super.voltage);
		System.out.println("serialNumber"+ super.serialNumber);
		System.out.println("deviceId"+ super.deviceId);
		System.out.println("batteryLevel"+ super.batteryLevel);
		System.out.println("price"+ super.price);
		System.out.println("energyGrade"+ super.energyGrade);
		System.out.println("isOn"+ super.isOn);
		
		
	}
    }