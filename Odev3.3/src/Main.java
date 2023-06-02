import Kodlamaİo.business.CategoryManager;
import Kodlamaİo.business.CourseManager;
import Kodlamaİo.core.loging.FileLogger;
import Kodlamaİo.core.loging.Logger;
import Kodlamaİo.core.loging.MailLogger;
import Kodlamaİo.dataAccess.Hibernate.CategoryHibernateDao;
import Kodlamaİo.dataAccess.Hibernate.CoruseHibernateDao;
import Kodlamaİo.entities.Category;
import Kodlamaİo.entities.Coruse;

public class Main {

    public static void main(String[] args) throws Exception{
        Category category1=new Category(1,"backand");
        Category category2=new Category(2,"fullsteack");
        Category category3=new Category(3,"frondand");

        Logger[] loggers={/*new FileLogger(),new MailLogger()*/};

        CategoryManager categoryManager=new CategoryManager(new CategoryHibernateDao(),loggers);
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);

        CourseManager courseManager=new CourseManager(new CoruseHibernateDao(),loggers);
        Coruse coruse=new Coruse(1,"java",1000);
        Coruse coruse1=new Coruse(2,"C#",1500);
        courseManager.add(coruse);
        courseManager.add(coruse1);




    }
}
