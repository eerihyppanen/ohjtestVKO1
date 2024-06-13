package main;

public class BMICalc {
    

public double calculateBMI(double height, double weight)  {

    double BMI = weight / (height*height);

    BMI = Math.round(BMI *10.0) / 10.0;

    return BMI;

}





}
