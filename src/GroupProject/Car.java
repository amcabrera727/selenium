package GroupProject;
public  class Car {

private int carPrice;
private String carColor;

public Car(int carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
        }

public double getSalePrice() {
        return carPrice;
        }
        }
class Sedan extends Car{
    int length;

    public Sedan(int carPrice, String carColor, int length) {
        super(carPrice, carColor);
        this.length=length;
    }

    public double getSalePrice() {
        return super.getSalePrice()*(length > 20 ? 0.9 : 0.85);
    }
}
class Truck extends Car{
    private int weight;

    public Truck(int carPrice, String carColor, int weight) {
        super(carPrice, carColor);
        this.weight=weight;
    }

    public double getSalePrice() {
        return super.getSalePrice()*(weight<2000 ? 0.85 : 0.75);
    }
}



