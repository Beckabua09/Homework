public class VectorCalculator extends AbstractCalculator{


    public VectorCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
        CalculationOperation co = ((x, y) -> {

            return x;
        });
    }

    @Override
    public Number add(Number a, Number b) {
        return null;
    }

    @Override
    public Number subtract(Number a, Number b) {
        return null;
    }

    @Override
    public Number multiply(Number a, Number b) {
        return null;
    }

    @Override
    public Number devide(Number a, Number b) {
        return null;
    }
}
