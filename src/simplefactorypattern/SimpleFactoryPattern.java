package simplefactorypattern;

/**
 * 简单工厂模式
 * @Author LovelyLM
 * @Date 2021/4/15 015 20:22
 */
public class SimpleFactoryPattern {

    public static void main(String[] args) {
        Operation operation = Factory.createOperation("/");
        
        System.out.println(operation.getResult(0.1, 0.2));

        System.out.println(0.1 * 0.2);
    }








}
