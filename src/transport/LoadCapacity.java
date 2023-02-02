package transport;

public enum LoadCapacity {
    N1 (0, 10),
    N2 (3.5, 12),
    N3 (13, 200);
    private double min;
    private double max;

    LoadCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

}
