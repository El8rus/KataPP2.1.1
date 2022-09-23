import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Comparison result for 'helloworld'-beans: " + (bean == bean2));

        Cat murzik = (Cat) applicationContext.getBean("cat");
        Cat barsik = (Cat) applicationContext.getBean("cat");
        System.out.println("Comparison result for 'cat'-beans: " + (murzik == barsik));
    }
}