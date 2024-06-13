package main;

public class BMICalc {
    

public double calculateBMI(double height, double weight)  {
    if (height <= 0 || weight <= 0) {
        return -1;
    }

    double BMI = weight / (height*height);

    BMI = Math.round(BMI *10.0) / 10.0;

    return BMI;

}

public String getBMICategoryString(double height, double weight) {
    double BMI = calculateBMI(height, weight);
    if (BMI == -1) {
        return "Invalid input";
    } else if (BMI < 18.5) {
        return "Underweight";
    } else if (BMI >= 18.5 && BMI <= 24.9) {
        return "Normal weight";
    } else if (BMI >= 25 && BMI < 29.9) {
        return "Overweight";
    } else {
        return "Obese";

    }

}


}
