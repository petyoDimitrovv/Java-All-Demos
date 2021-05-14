package calculator;

public class Extensions  implements Operation {


    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
         return new InputInterpreter(engine);
    }

    @Override
    public void addOperand(int operand) {

    }

    @Override
    public int getResult() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}
