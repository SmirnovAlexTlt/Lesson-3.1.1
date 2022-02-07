package web.model;


public class CarModel {
    public String model;
    public String color;
    public int dataRelease;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDataRelease() {
        return dataRelease;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDataRelease(int dataRelease) {
        this.dataRelease = dataRelease;
    }

    public CarModel(String model, String color, int dataRelease) {
        this.model = model;
        this.color = color;
        this.dataRelease = dataRelease;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", dataRelease=" + dataRelease +
                '}';
    }
}

