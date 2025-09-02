class WebService {
    public static int totalRequests = 10000;

    public static void serviceInfo() {
        System.out.println("WebService total requests: " + totalRequests);
    }

    WebService() {
        System.out.println("No-arg constructor: WebService started");
    }

    WebService(String serviceName, int users) {
        System.out.println("Service: " + serviceName);
        System.out.println("Users: " + users);
    }

    WebService(int users, String serviceName, float uptime) {
        System.out.println("Service: " + serviceName);
        System.out.println("Users: " + users);
        System.out.println("Uptime: " + uptime);
    }

    WebService(double rating, String serviceName, float uptime, int users) {
        System.out.println("Service: " + serviceName);
        System.out.println("Users: " + users);
        System.out.println("Uptime: " + uptime);
        System.out.println("Rating: " + rating);
    }

    WebService(long requests, double rating, String serviceName, float uptime, int users) {
        System.out.println("Service: " + serviceName);
        System.out.println("Users: " + users);
        System.out.println("Uptime:"+uptime);
		System.out.println("Rating: " + rating);
        System.out.println("Requests: " + requests);
    }

    WebService(char category, long requests, double rating, String serviceName, float uptime, int users) {
        System.out.println("Service: " + serviceName);
        System.out.println("Users: " + users);
        System.out.println("Uptime: " + uptime);
        System.out.println("Rating: " + rating);
        System.out.println("Requests: " + requests);
        System.out.println("Category: " + category);
    }

    WebService(boolean isSecure, char category, long requests, double rating, String serviceName, float uptime, int users) {
        System.out.println("Service: " + serviceName);
        System.out.println("Users: " + users);
        System.out.println("Uptime: " + uptime);
        System.out.println("Rating: " + rating);
        System.out.println("Requests: " + requests);
        System.out.println("Category: " + category);
        System.out.println("Secure: " + isSecure);
    }
}
