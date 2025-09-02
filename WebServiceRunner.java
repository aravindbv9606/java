class WebServiceRunner {
    public static void main(String[] args) {

        WebService.serviceInfo(); // Static method call

        WebService w1 = new WebService();
        WebService w2 = new WebService("CloudHost", 500);
        WebService w3 = new WebService(300, "DataAPI", 99.5f);
        WebService w4 = new WebService(4.8, "AuthService", 97.3f, 250);
        WebService w5 = new WebService(100000L, 4.6, "MediaStream", 95.0f, 600);
        WebService w6 = new WebService('A', 200000L, 4.9, "MapService", 99.9f, 800);
        WebService w7 = new WebService(true, 'B', 300000L, 4.5, "PaymentGateway", 98.1f, 1000);
    }
}



