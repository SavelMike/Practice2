import java.util.ArrayList;
import java.util.Scanner;


public class CountryProgram {
    public static void main(String[] args) {

        ArrayList<Country> countries = new ArrayList<Country>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Input name of the country: ");
            String n = in.next();
            if (n.equals("quit")) {
                System.out.println(countries.size());
                break;
            }

            System.out.print("Input population of the country: ");
            int pop = in.nextInt();

            System.out.print("Input area of the country: ");
            double S = in.nextDouble();

            Country c = new Country(n, pop, S);
            countries.add(c);
        }
        int maxpopindex = 0;
        int maxareaindex = 0;
        int maxpopdenindex = 0;

        for (int i = 1; i < countries.size(); i++) {
            if (countries.get(maxareaindex).getArea() > countries.get(i).getArea()) {
                maxareaindex = i;
            }
            if (countries.get(maxpopindex).getPopulation() > countries.get(i).getPopulation()) {
                maxpopindex = i;
            }
            if (countries.get(maxpopindex).getPopulation() / countries.get(maxareaindex).getArea() > countries.get(i).getPopulation()/countries.get(i).getArea()) {
                maxpopdenindex = i;
            }
        }
        System.out.println("Max area " + countries.get(maxareaindex).getName());
        System.out.println("Max population " + countries.get(maxpopdenindex).getName());
        System.out.println("Max population density " + countries.get(maxpopdenindex).getName());
    }
}