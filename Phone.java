package Myjava;
//标准的单例模式
public class Phone {
    private static Phone ourInstance = new Phone();
    //2.在对象本身new自己 而且是一个static修饰的
    public static Phone getInstance() {

        return ourInstance;
    }
//1.无参构造方法私有化
    private Phone() {

    }
}
