import java.util.Scanner;

/**
 * Created by Михаил on 28.11.2016.
 */
public class Geometry {
    public static void main(String[] args) {
        new Geometry().run();
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input radius: ");
        Double r = input.nextDouble();
        System.out.print("Input height: ");
        Double h = input.nextDouble();
        System.out.println();
        System.out.println(sphereSurface(r));
        System.out.println(sphereVolume(r));
        System.out.println(cylinderSurface(r, h));
        System.out.println(cylinderVolume(r, h));
        System.out.println(coneVolume(r, h));
        System.out.println(coneSurface(r, h));
    }

    public static double sphereVolume(double r) {
        return 4 * 3.14 * r * r * r;
    }

    public static double sphereSurface(double r) {
        return  4 * 3.14 * r * r;
    }

    public static double cylinderVolume(double r, double h) {
        return 3.14 * r * r * h;
    }

    public static double cylinderSurface(double r, double h) {
        return  2 * 3.14 * r * h;
    }

    public static double coneVolume(double r, double h) {
        return 3.14 * r * r * h / 3;
    }

    public static double coneSurface(double r, double h) {
        return 3.14 * r * Math.sqrt(r * r + h * h);
    }
}
