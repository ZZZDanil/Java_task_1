package task_6;

import javax.ejb.Stateless;

@Stateless
public class CalculatorBean implements ICalculator {
    @Override
    public float addition(float itemOne, float itemTwo) {

        return itemOne + itemTwo;

    }

    @Override
    public float substraction(float itemOne, float itemTwo) {

        return itemOne - itemTwo;

    }

    @Override
    public float multiplication(float itemOne, float itemTwo) {

        return itemOne * itemTwo;

    }

    @Override
    public float division(float itemOne, float itemTwo) {

        if (itemTwo != 0) {

            return itemOne / itemTwo;

        } else {

            return 0;

        }

    }
}
