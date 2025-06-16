import javax.swing.*;

public class BMIAnalyzerLab5$1 {
    private  double weight;
    private double height;

    public BMIAnalyzerLab5$1(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double calaulateBMI(){
        double bmi= (weight/(height*height))*703;
        return bmi;
        
    }
    public String findStatus(double bmi){
        bmi=calaulateBMI();
        if( bmi <=18.5){
            return "Underweight";
        } else if (bmi>18.5 && bmi <= 24.9) {
            return "Normal";
            
        } else if (bmi >=25 && bmi <= 29.9) {
            return "Overweight";
            
        } else if (bmi>= 30.0) {
            return "Obese";
            
        }
        return null;

    }

    public static void main(String[] args) {
        JFrame frame= new JFrame("lab 5 1");
        JLabel label = new JLabel("Weight");
        JLabel label1 = new JLabel("Height");




        

        frame.add(label1);
        frame.add(label);
        frame.setSize(0,0);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
