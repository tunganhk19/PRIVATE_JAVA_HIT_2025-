package model;

public class Device {
    private String id;
    private String model;

    public Device(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public Device() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
