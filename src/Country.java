/**
 * Created by Михаил on 04.12.2016.
 */
public class Country {

    private String Name;
    private int Population;
    private double Area;

    public Country(String n, int pop, double S) {
        Name = n;
        Population = pop;
        Area = S;
    }

    public String getName() {
        return Name;
    }

    public int getPopulation() {
        return Population;
    }

    public double getArea() {
        return Area;
    }
}
