public class SmartPhone extends Product{
    private boolean has5G;

    private SmartPhone() {
    }

    public SmartPhone(int id, String name, String description, double price, boolean has5G) {
        super(id, name, description, price);
        this.has5G = has5G;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public String getInfo() {
        return "SMARTPHONE" + super.getInfo() + "Ho tro 5G: " + (isHas5G() ? "Yes" : "No");
    }
}
