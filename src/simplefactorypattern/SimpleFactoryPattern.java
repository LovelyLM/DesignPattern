package simplefactorypattern;

/**
 * 简单工厂模式
 * @Author LovelyLM
 * @Date 2021/4/15 015 20:22
 */
public class SimpleFactoryPattern {

    /**
     *    简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建并且返回哪一个产品类（这些产品类继承自一个父类或接口）的实例。
     *
     *    那么也就是说：
     *
     *    1、有已知的产品类
     *
     *    2、你无法准确的知道编译哪个产品类
     *
     *    3、需要在运行时决定创建哪个产品类
     *
     *    4、产品类不多
     */
    public static void main(String[] args) {
        Operation operation = Factory.createOperation("/");

        System.out.println(operation.getResult(0.1, 0.2));

        System.out.println(0.1 * 0.2);
    }








}
