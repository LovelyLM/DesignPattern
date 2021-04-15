package simplefactorypattern;

/**
 * @Author LovelyLM
 * @Date 2021/4/15 015 20:41
 */
public class Factory {

    public static void main(String[] args) {

    }



    public static Operation createOperation(String name){
        Operation operation;
        switch (name){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                return null;

        }
        return operation;
    }


}
