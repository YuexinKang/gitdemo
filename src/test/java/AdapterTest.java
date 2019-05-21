import com.soft1841.Demo9.Student;

public class AdapterTest {


    public static void main(String[] args) {
        System.out.println("特长生招募中");
        Student student1=new Student(){
            @Override
            public void javaStudy() {
                System.out.println("我是一名Java大神");
            }
        };
        student1.javaStudy();
        Student student2=new Student() {
            @Override
            public void playBasketball() {
               System.out.println("篮球也踢得好");
            }

            @Override
            public void palyFootball() {
                super.palyFootball();
                System.out.println("足球也踢得好");
            }
        };
        student2.palyFootball();
        student2.playBasketball();

    }
}
