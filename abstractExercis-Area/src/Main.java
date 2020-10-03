import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Circle createCircle(Scanner keyboard) {
        Circle circle = new Circle();
        System.out.println("Ingrese el radio del circulo");
        Double radio = keyboard.nextDouble();
        circle.setRadio(radio);
        circle.calculateArea();
        return circle;
    }

    public static Rectangle createRectangle(Scanner keyboard) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Ingrese la base del Rectangulo");
        Double base = keyboard.nextDouble();
        System.out.println("Ingrese la altura del Rectangulo");
        Double height = keyboard.nextDouble();
        rectangle.setHeight(height);
        rectangle.setBase(base);
        rectangle.calculateArea();
        return rectangle;
    }

    public static Triangle createTriangle(Scanner keyboard) {
        Triangle triangle = new Triangle();
        System.out.println("Ingrese la base del Triangulo");
        Double base = keyboard.nextDouble();
        System.out.println("Ingrese la altura del Rectangulo");
        Double height = keyboard.nextDouble();
        triangle.setHeight(height);
        triangle.setBase(base);
        triangle.calculateArea();
        return triangle;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Figure> figures = new ArrayList<Figure>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el numero indicando que tipo de figura es: \n\t" +
                    "1. si es Triangulo\n\t" +
                    "2. si es Cirgulo\n\t" +
                    "3. si es Rectangulo\n\t ");
            int type = keyboard.nextInt();
            switch (type) {
                case 1:
                    Triangle triangle = createTriangle(keyboard);
                    figures.add(triangle);
                    break;
                case 2:
                    Circle circle = createCircle(keyboard);
                    figures.add(circle);
                    break;
                case 3:
                    Rectangle rectangle = createRectangle(keyboard);
                    figures.add(rectangle);
                    break;
            }
        }
        // Print areas
        System.out.println(" ---- Informacion ------ ");
        for (Figure figure : figures) {
            System.out.println(figure.toString());
            System.out.println("");
        }
        if (areEquals(figures)) {
            System.out.println("Existen figuras iguales");
        } else {
            System.out.println("No existen figuras iguales");
        }


    }
    //print equals
    public static Boolean areEquals(ArrayList<Figure> figures){
        boolean result = false;
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            for (int j = i+1; j< figures.size(); j++) {
                result = figure.equals(figures.get(j));
                if (result = true) {return result;}
            }
        }
        return result;
    }
}






