package GroupProject;

public class MyCar {

        public static void main(String[] args) {
            Sedan sedan = new Sedan(25000, "black", 20);
            Truck truck=new Truck (30000, "white", 2000);
            System.out.println("Sedan is " + sedan.getSalePrice());
            System.out.println("Truck is "+truck.getSalePrice());
        }
    }

