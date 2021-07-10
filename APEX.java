package Myjava;

import java.util.ArrayList;

public class APEX {
    public interface MyjavaDao {
        public static void main( String[] args) {
            System.out.println("输出的快捷键是 sout");
            String name = "小八";
            System.out.println("name = " + name);//soutv 可以输出变量
            System.out.println("MyjavaDao.main");//soupm输出方法名
            System.out.println("args = [" + args + "]");// soutp 是输出方法参数
            int age = 16;
            //如果小于17就显示未成年
            if (age < 17) {
                System.out.println("未成年");
            }
            ArrayList<String> strings = new ArrayList<>();//万能快捷键 alt=+enter
            strings.add("铁山靠");//ctrl+d 快速复制一行
            strings.add("铁山靠");//ctrl+y 快速删除一行
            strings.add("铁山靠");//多行编辑 alt+鼠标
            strings.add("铁山靠");
            //ctrl+z 是撤销一步 sctrl+shitf+z 是多步撤回
            for (String string : strings) { //遍历循环的快捷键 iter
                System.out.println("string = " + string);
            }
           
            LoL c1 = new LoL();
            c1.setColoe("黑色");
            c1.setPrice(5555.0D);
            c1.setTypeName("机械革命聪の555");
            System.out.println("c1 = " + c1);

            LoL c2 = new LoL();
            c2.setColoe("黑色");
            c2.setPrice(5555.0D);
            c2.setTypeName("机械革命聪の555");
            System.out.println("c2 = " + c2);

            System.out.println(c1==c2);

           // Phone p1 = new Phone();
            Phone p1 = Phone.getInstance();
            Phone p2 = Phone.getInstance();
            System.out.println(p1==p2);
            
        }
        
    }
}
