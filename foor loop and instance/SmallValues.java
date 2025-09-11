class SmallValues {
    short[] values = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

    void display() {
        for (int digit = 0; digit < values.length; digit++) {
            System.out.println(values[digit]);
        }
    }
}
