package ch.bbw.cardgame;

/**
 * Car
 *    Fachklasse für ein Auto
 * @author Peter Rutschmann
 * @date 26.08.2021
 */
public class Car {
    private String imageUrl;
    private String tradeName;
    private String model;
    private double prize;
    private double PS;
    private double production;
    private double produced;

    public Car(String imageUrl, String tradeName, String model, double prize, double PS, double production, double produced) {
        this.imageUrl = imageUrl;
        this.tradeName = tradeName;
        this.model = model;
        this.prize = prize;
        this.PS = PS;
        this.production = production;
        this.produced = produced;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public double getPS(){
        return PS;
    }

    public void setPS(double PS){this.PS = PS;}

    public double getProduction(){
        return production;
    }

    public void setProduction(double production){
        this.production = production;
    }

    public double getProduced(){
        return produced;
    }

    public void setProduced(double produced){this.produced = produced;}
}
