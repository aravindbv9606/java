 class ElectronicDeviceRunner{
public static void main(String[] args) {
        Device myDevice = new Device( (byte)4,(short) 220, 12345678, 9876543210123L,85.5f, 19999.99, 'A', true);
         myDevice.display();
    }
}