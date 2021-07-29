
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

//Interface For Common Methods
interface Formulas{
    //defining abstract methods and defining global Scanner class object for using in all the abstract methods
    Scanner input=new Scanner(System.in);
    void Diameter();
    void Area();
    void Curved_Surface_Area();
    void Surface_Area();
    void Circumference();
    void Perimeter();
    void Diagonal();
    void Volume();
}
//Circle Class
class Circle implements Formulas{

    public void Diameter(){
        System.out.println("Enter Radius");
        float Circle_Radius=input.nextFloat();
        float Circle_Diameter=2*Circle_Radius;
        System.out.println("Diameter of Circle is "+String.format("%.2f",Circle_Diameter));
    }
    public void Area() {
        System.out.println("Enter Radius");
        float Circle_Radius=input.nextFloat();
        double Circle_Area=3.14*Math.pow(Circle_Radius,2);
        System.out.println("Area of Circle is "+String.format("%.2f",Circle_Area));
    }
    public void Circumference(){
        System.out.println("Enter Radius");
        float Circle_Radius=input.nextFloat();
        double Circle_circumference=2*3.14*Circle_Radius;
        System.out.println("Circumference of Circle is "+String.format("%.2f",Circle_circumference));
    }
    //Override Empty Methods
        public void Perimeter(){}
        public void Diagonal(){}
        public void Volume(){}
        public void Curved_Surface_Area(){}
        public void Surface_Area(){}
}

//Rectangle Class
class Rectangle implements Formulas{

    public void Area(){
        System.out.println("Enter Length and Breadth");
        float Rectangle_Length=input.nextFloat();
        float Rectangle_Breadth=input.nextFloat();
        float Rectangle_Area= Rectangle_Breadth*Rectangle_Length;
        System.out.println("Area of Rectangle is "+String.format("%.2f",Rectangle_Area));
    }
    public void Perimeter() {
        System.out.println("Enter Length and Breadth");
        float Rectangle_Length=input.nextFloat();
        float Rectangle_Breadth=input.nextFloat();
        float Rectangle_Perimeter= 2*(Rectangle_Breadth+Rectangle_Length);
        System.out.println("Area of Rectangle is "+String.format("%.2f",Rectangle_Perimeter));
    }
    public void Diagonal(){
        System.out.println("Enter Length and Breadth");
        float Rectangle_Length=input.nextFloat();
        float Rectangle_Breadth=input.nextFloat();
        double Rectangle_Diagonal=Math.sqrt(Math.pow(Rectangle_Length,2)+Math.pow(Rectangle_Breadth,2));
        System.out.println("Diagonal of Rectangle is "+String.format("%.2f",Rectangle_Diagonal));
    }

    //Override Empty Methods
        public void Diameter() {}
        public void Circumference() {}
        public void Volume(){}
        public void Curved_Surface_Area(){}
        public void Surface_Area(){}
}

//Triangle Class
class Triangle implements Formulas{

    public void Area(){
        System.out.println("Enter Height of Triangle");
        float Triangle_Height=input.nextFloat();
        System.out.println("Enter Base of Triangle");
        float Triangle_Base=input.nextFloat();
        double Triangle_area=(Triangle_Base*Triangle_Height)/2;
        System.out.println("Area of Triangle is "+String.format("%.2f",Triangle_area));
    }
    public void Perimeter(){
        System.out.println("Enter Value of Each Side");
        float Triangle_Side_1=input.nextFloat();
        float Triangle_Side_2=input.nextFloat();
        float Triangle_Side_3=input.nextFloat();
        double Triangle_Perimeter=Triangle_Side_1+Triangle_Side_2+Triangle_Side_3;
        System.out.println("Perimeter of Triangle is "+String.format("%.2f",Triangle_Perimeter));
    }
    //override Methods
        public void Diameter(){}
        public void Circumference(){}
        public void Diagonal(){}
        public void Volume(){}
        public void Curved_Surface_Area(){}
        public void Surface_Area(){}
}

//Square Class
class Square implements Formulas{
    public void Area(){
        System.out.println("Enter side of Square");
        float Square_Side=input.nextFloat();
        double Square_area=Square_Side*Square_Side;
        System.out.println("Area of Square is "+String.format("%.2f",Square_area));
    }
    public void Perimeter(){
        System.out.println("Enter side of Square");
        float Square_Side=input.nextFloat();
        double Square_Perimeter=4*Square_Side;
        System.out.println("Perimeter of Square is "+String.format("%.2f",Square_Perimeter));
    }
    //override Methods
        public void Diameter(){}
        public void Circumference(){}
        public void Diagonal(){}
        public void Volume(){}
        public void Curved_Surface_Area(){}
        public void Surface_Area(){}
}

//Sphere Class
class Sphere implements Formulas{
    public void Surface_Area(){
        System.out.println("Enter Radius of Sphere");
        float Sphere_radius=input.nextFloat();
        Double Sphere_Area=4*3.14*(Sphere_radius*Sphere_radius);
        System.out.println("Surface Area of Sphere is "+String.format("%.2f",Sphere_Area));
    }
    public void Diameter(){
        System.out.println("Enter Radius of Sphere");
        float Sphere_radius=input.nextFloat();
        float Sphere_Diameter=2*Sphere_radius;
        System.out.println("Diameter of Sphere is "+String.format("%.2f",Sphere_Diameter));
    }
    public void Volume(){
        System.out.println("Enter Radius of Sphere");
        float Sphere_radius=input.nextFloat();
        Double Sphere_Volume=(4*(3.14*Math.pow(Sphere_radius,3)))/3;
        System.out.println("Diameter of Sphere is "+String.format("%.2f",Sphere_Volume));
    }

    //override Methods
        public void Circumference(){}
        public void Diagonal(){}
        public void Perimeter(){}
        public void Curved_Surface_Area(){}
        public void Area(){}
}

//Cylinder Class
class Cylinder implements Formulas{
    public void Surface_Area(){
        System.out.println("Enter Height of Cylinder");
        float Cylinder_Height=input.nextFloat();
        System.out.println("Enter Radius of Cylinder");
        float Cylinder_Radius=input.nextFloat();
        double Cylinder_Surface_Area=2*3.14*Cylinder_Radius*(Cylinder_Radius+Cylinder_Height);
        System.out.println("Surface Area of Sphere is "+String.format("%.2f",Cylinder_Surface_Area));
    }
    public void Curved_Surface_Area(){
        System.out.println("Enter Height of Cylinder");
        float Cylinder_Height=input.nextFloat();
        System.out.println("Enter Radius of Cylinder");
        float Cylinder_Radius=input.nextFloat();
        Double Cylinder_Curved_Surface_area=2*3.14*Cylinder_Radius*Cylinder_Height;
        System.out.println("Surface Area of Sphere is "+String.format("%.2f",Cylinder_Curved_Surface_area));
    }
    public void Volume(){
        System.out.println("Enter Height of Cylinder");
        float Cylinder_Height=input.nextFloat();
        System.out.println("Enter Radius of Cylinder");
        float Cylinder_Radius=input.nextFloat();
        double Cylinder_volume=3.14*Math.pow(Cylinder_Radius,2)*Cylinder_Height;
        System.out.println("Diameter of Sphere is "+String.format("%.2f",Cylinder_volume));
    }

    //override Methods
        public void Circumference(){}
        public void Diagonal(){}
        public void Perimeter(){}
        public void Area(){}
        public void Diameter(){}
}

//Main Program Class
public class question2 {

    public static void main(String[] args){

        //Define Object of classes
        Formulas for_Circle=new Circle();
        Formulas for_Rectangle=new Rectangle();
        Formulas for_Triangle=new Triangle();
        Formulas for_Square=new Square();
        Formulas for_Sphere=new Sphere();
        Formulas for_Cylinder=new Cylinder();

        Scanner sc=new Scanner(System.in);
        //variable defined for shape selection and Method Selection
        int shape_option=0,formula_option;

        //using of Do-While loop for showing options repetitive
        do{
            System.out.println("********************");
            System.out.println("Pick Shape from list");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Sphere");
            System.out.println("6. Cylinder");
            System.out.println("7. Exit");

            try {
                shape_option = sc.nextInt();
                if (shape_option <= 0 || shape_option >= 8) {
                    System.out.println("Invalid Option");
                } else {
                    switch (shape_option) {
                        case 1:
                            // Circle Options
                            System.out.println("1. Diameter");
                            System.out.println("2. Circumference");
                            System.out.println("3. Area");
                            formula_option = sc.nextInt();
                            if (formula_option <= 0 || formula_option >= 4) {
                                System.out.println("Invalid Option");
                            } else {
                                switch (formula_option) {
                                    case 1:
                                        for_Circle.Diameter();
                                        break;
                                    case 2:
                                        for_Circle.Circumference();
                                        break;
                                    case 3:
                                        for_Circle.Area();
                                        break;
                                    default:
                                        System.out.println("Invalid Option");
                                }
                            }
                            break;
                        case 2:
                            // Rectangle Options
                            System.out.println("1. Perimeter");
                            System.out.println("2. Area");
                            System.out.println("3. Diagonal");
                            formula_option = sc.nextInt();
                            if (formula_option <= 0 || formula_option >= 4) {
                                System.out.println("Invalid Option");
                            } else {
                                switch (formula_option) {
                                    case 1:
                                        for_Rectangle.Perimeter();
                                        break;
                                    case 2:
                                        for_Rectangle.Area();
                                        break;
                                    case 3:
                                        for_Rectangle.Diagonal();
                                        break;
                                    default:
                                        System.out.println("Invalid Option");
                                }
                            }
                            break;
                        case 3:
                            // Triangle Options
                            System.out.println("1. Area");
                            System.out.println("2. Perimeter");
                            formula_option = sc.nextInt();
                            if (formula_option <= 0 || formula_option >= 3) {
                                System.out.println("Invalid Option");
                            } else {
                                switch (formula_option) {
                                    case 1:
                                        for_Triangle.Area();
                                        break;
                                    case 2:
                                        for_Triangle.Perimeter();
                                        break;
                                    default:
                                        System.out.println("Invalid Option");
                                }
                            }
                            break;
                        case 4:
                            // Square Options
                            System.out.println("1. Area");
                            System.out.println("2. Perimeter");
                            formula_option = sc.nextInt();
                            if (formula_option <= 0 || formula_option >= 3) {
                                System.out.println("Invalid Option");
                            } else {
                                switch (formula_option) {
                                    case 1:
                                        for_Square.Area();
                                        break;
                                    case 2:
                                        for_Square.Perimeter();
                                        break;
                                    default:
                                        System.out.println("Invalid Option");
                                }
                            }
                            break;
                        case 5:
                            // Sphere Options
                            System.out.println("1. Diameter");
                            System.out.println("2. Area");
                            System.out.println("3. Volume");
                            formula_option = sc.nextInt();
                            if (formula_option <= 0 || formula_option >= 4) {
                                System.out.println("Invalid Option");
                            } else {
                                switch (formula_option) {
                                    case 1:
                                        for_Sphere.Diameter();
                                        break;
                                    case 2:
                                        for_Sphere.Surface_Area();
                                        break;
                                    case 3:
                                        for_Sphere.Volume();
                                        break;
                                    default:
                                        System.out.println("Invalid Option");
                                }
                            }
                            break;
                        case 6:
                            // Cylinder Options
                            System.out.println("1. Total Surface Area");
                            System.out.println("2. Curved Surface Area");
                            System.out.println("3. Volume");
                            formula_option = sc.nextInt();
                            if (formula_option <= 0 || formula_option >= 4) {
                                System.out.println("Invalid Option");
                            } else {
                                switch (formula_option) {
                                    case 1:
                                        for_Cylinder.Surface_Area();
                                        break;
                                    case 2:
                                        for_Cylinder.Curved_Surface_Area();
                                        break;
                                    case 3:
                                        for_Cylinder.Volume();
                                        break;
                                    default:
                                        System.out.println("Invalid Option");
                                }
                            }
                            break;
                        case 7:
                            break;
                        default:
                            System.err.println("Invalid Option");
                    }
                }
            }catch(InputMismatchException e){
                System.err.println("Incorrect Input");
                break;
            }
        }while(shape_option!=7);
    }
}