package seminar6.calc;

public class SubtractionOperation implements I_CalcOperation {
    @Override
    public double performOperation(double number1, double number2){
        return number1 - number2;
    }
}
