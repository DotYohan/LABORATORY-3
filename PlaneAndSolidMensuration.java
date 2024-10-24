/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plane.and.solid.mensuration;

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author yuanb
 */
public class PlaneAndSolidMensuration {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        // at this code the system will ask what type of function they want to use//
        boolean loop = true;
        while (loop == true) {
            String Fx = JOptionPane.showInputDialog("EMATH CALCULATOR"
                    + "\n What do you need to calculate?"
                    + "\n 1.Area of Circle"
                    + "\n 2.Area of Rectangle"
                    + "\n 3.Area of Triangle"
                    + "\n 4.Volume of Sphere"
                    + "\n 5.Area of Cylinder"
                    + "\n 6.Area of a Circle Segment"
                    + "\n 7.Missing side c of triangle"
                    + "\n 8.Sphere Surface Area");
            //Declare the objective properties//
            double result = 0;
            double r = 0;
            double length = 0;
            double width = 0;
            double base = 0;
            double height = 0;
            double angle = 0;
            double a = 0;
            double b = 0;
            double anglec = 0;
            String numb1 = "";
            String numb2 = "";
            String numb3 = "";
            int swit = Integer.parseInt(Fx);

            //the functions of objectives//
            switch (swit) {
                case 1:
                    numb1 = JOptionPane.showInputDialog("Input radiuus to calculate the area of the Circle.");
                    r = Double.parseDouble(numb1);
                    result = Math.PI * r * r;
                    JOptionPane.showMessageDialog(null, "Area of Circle = " + result);
                    break;
                case 2:
                    numb1 = JOptionPane.showInputDialog("Input Length to calculate the area of the rectangle.");
                    numb2 = JOptionPane.showInputDialog("Input Width to calculate the area of the rectangle.");
                    length = Double.parseDouble(numb1);
                    width = Double.parseDouble(numb2);
                    JOptionPane.showMessageDialog(null, "Area of Rectangle = " + length * width);
                    break;
                case 3:
                    numb1 = JOptionPane.showInputDialog("Input base to calculate the area of the triangle.");
                    numb2 = JOptionPane.showInputDialog("Input height to calculate the area of the triangle.");
                    base = Double.parseDouble(numb1);
                    height = Double.parseDouble(numb2);
                    JOptionPane.showMessageDialog(null, "Area of triangle = " + 0.5 * base * height);
                    break;
                case 4:
                    numb1 = JOptionPane.showInputDialog("Input radius to calculate the volume of the Sphere.");
                    r = Double.parseDouble(numb1);
                    JOptionPane.showMessageDialog(null, "Volume of Sphere = " + calculateSphereVolume(r));
                    break;
                case 5:
                    numb1 = JOptionPane.showInputDialog("Input radius to calculate the volume of the Cylinder.");
                    numb2 = JOptionPane.showInputDialog("Input height to calculate the volume of the Cylinder.");
                    r = Double.parseDouble(numb1);
                    height = Double.parseDouble(numb2);
                    result = Math.PI * r * r * height;
                    JOptionPane.showMessageDialog(null, "Volume of Cylinder = " + result);
                    break;
                case 6:
                    numb1 = JOptionPane.showInputDialog("Input radius to calculate the area of the segment of a circle.");
                    numb2 = JOptionPane.showInputDialog("Input angle to calculate the area of the segment of a circle");
                    r = Double.parseDouble(numb1);
                    angle = Double.parseDouble(numb2);
                    JOptionPane.showMessageDialog(null, "Area of Circle Segmen Area = " + calculateCircleSegmentArea(r, angle));
                    break;
                case 7:
                    numb1 = JOptionPane.showInputDialog("Input Side a to find the side c.");
                    numb2 = JOptionPane.showInputDialog("Input Side b to find the side c.");
                    numb3 = JOptionPane.showInputDialog("Input angle C to find the side c.");
                    a = Double.parseDouble(numb1);
                    b = Double.parseDouble(numb2);
                    anglec = Double.parseDouble(numb3);
                    JOptionPane.showMessageDialog(null, "Area of triangle = " + calculateTriangleSide(a, b, anglec));
                    break;
                case 8:
                    numb1 = JOptionPane.showInputDialog("Input radius to calculate Sphere Surface Area.");
                    r = Double.parseDouble(numb1);

                    JOptionPane.showMessageDialog(null, "Area of Sphere Surface = " + calculateSphereSurfaceArea(r));
                    break;

            }
        }
    }

    public static double calculateCircleSegmentArea(double radius, double angle) {
        if (radius <= 0 || angle <= 0) {
            JOptionPane.showMessageDialog(null, "Radius must be non-negative Intergers");
            return -1;
        }
        double Radangle = Math.toRadians(angle);
        return ((radius * radius) / 2) * (Radangle - Math.sin(Radangle));
    }

    public static double calculateTriangleSide(double a, double b, double AngleC) {
        if (a <= 0 && b <= 0 && AngleC <= 0 && AngleC >= 180) {
            JOptionPane.showMessageDialog(null, "a,b, and Angle C must be non-negative Intergers and the angle must not more than 180 degrees");
            return -1;
        }
        Double AngleCRadians = Math.toRadians(AngleC);
        double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(AngleCRadians));

        return c;
    }

    public static double calculateSphereVolume(double radius) {
        if (radius <= 0) {
            JOptionPane.showMessageDialog(null, "Angle must not less 0.");
            return -1;
        }
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

    }

    public static double calculateSphereSurfaceArea(double radius) {
        if (radius <= 0) {
            JOptionPane.showMessageDialog(null, "Angle must not less 0.");
            return -1;
        }
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
