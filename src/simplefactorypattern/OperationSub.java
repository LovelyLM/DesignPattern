package simplefactorypattern;

/**
 * @Author LovelyLM
 * @Date 2021/4/15 015 20:48
 */
public class OperationSub extends Operation{

    @Override
    double getResult(double a, double b) {
        return a - b;
    }
}
