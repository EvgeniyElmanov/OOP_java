package Home_work;

  public class BottleOfMilk extends Product{

    private double volume;
    private int fatContent; 

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFatÑontent() {
        return fatContent;
    }

    public void setFatÑontent(int fatContent) {
        this.fatContent = fatContent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fatContent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    @Override
    public String displayInfo() {
        return String.format("[Bottle]%s - %s - %f - [volume: %f; fatcontent: %d]", brand, name, price, volume, fatContent);
    }
}

