public class Car {
    private String make;
    private String model;
    private double mpg;
    private double gasTankSize;
    private double gasTankLevel;

    public Car(String make, String model, double mpg, double gasTankSize) {
        this.make = make;
        this.model = model;
        this.mpg = mpg;
        this.gasTankSize = gasTankSize;
        this.gasTankLevel = gasTankSize;
    }

    public void drive(double distanceDriven) {
        double gasUsed = distanceDriven / mpg;
        this.setGasTankLevel(this.gasTankLevel - gasUsed);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getGasTankSize() {
        return gasTankSize;
    }

    public void setGasTankSize(double gasTankSize) {
        this.gasTankSize = gasTankSize;
    }

    public double getGasTankLevel() {
        return gasTankLevel;
    }

    public void setGasTankLevel(double gasTankLevel) {
        this.gasTankLevel = gasTankLevel;
    }
}
