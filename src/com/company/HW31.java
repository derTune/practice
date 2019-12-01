import java.util.Scanner;
public class HW31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AbleToDistinguishByWeight[] oceanarium = new Animal[15];
        System.out.println("\nOutput animals with WEIGHT of bigger than N\nEnter N: ");
        double N = sc.nextFloat();
        double[] sharkWeights = new double[5];
        for(int i = 0; i < 5; i++){
            sharkWeights[i] = Math.random() * 301 + 100;
        }
        double[] duckWeights = new double[5];
        for(int i = 0; i < 5; i++){
            duckWeights[i] = Math.random() * 2 + 10;
        }
        double[] turtleWeights = new double[5];
        for(int i = 0; i < 5; i++){
            turtleWeights[i] = Math.random() * 251 + 50;
        }
        for(int i = 0; i < 5; i++) {
            oceanarium[i] = new Shark(sharkWeights[i], 2.5, "tiger shark");
            oceanarium[i + 5] = new Duck(duckWeights[i], "Duck Peter");
            oceanarium[i + 10] = new Turtle(turtleWeights[i], "sea turtle");
        }
        for (AbleToDistinguishByWeight temp : oceanarium) {
            if(temp instanceof Animal) {
                System.out.println(temp);
                if (temp.distinguishByWeight(N)) {
                    System.out.println(temp);
                }
            }
        }
    }
}

interface AbleToDistinguishByWeight {
    boolean distinguishByWeight (double weight);
}

class Animal implements AbleToDistinguishByWeight{
    private double weight;

    public Animal(double weight) {
        setWeight(this.weight);
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal - " +
                " weight = " + weight;
    }

    @Override
    public boolean distinguishByWeight(double weight) {
        if(weight > this.weight) {
            return false;
        }
        else {
            return true;
        }
    }

    public void setWeight(double weight) {
        if(weight > 0) {
            this.weight = weight;
        }
    }

    public void Error() {
        System.out.println("Invalid input!");
    }
}

class Turtle  extends Animal {
    private String type;

    public Turtle(double weight, String type) {
        super(weight);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Duck extends Animal {
    private String name;

    public Duck(double weight, String name) {
        super(weight);
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Shark extends Animal {
    private double length;
    private String type;

    public Shark(double weight, double length, String type) {
        super(weight);
        this.length = length;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + length +
                ", " + type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}