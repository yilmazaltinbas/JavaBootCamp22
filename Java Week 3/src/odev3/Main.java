package odev3;

import odev3.business.CategoryManager;
import odev3.business.CourseManager;
import odev3.business.InstructorManager;
import odev3.dataAccess.HibernateCategoryDao;
import odev3.dataAccess.HibernateCourseDao;
import odev3.dataAccess.HibernateInstructorDao;
import odev3.entities.Category;
import odev3.entities.Course;
import odev3.entities.Instructor;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception{

        Logger[] loggers = {new FileLogger(), new DatabaseLogger(),new MailLogger()};

        Category category1 = new Category(111,"Robotik Kodlama");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
        categoryManager.add(category1);

        Course course1 = new Course(222,"Flutter",
        "Spring Yazılım geliştirici bla bla","Engin Demiroğ",500);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1);

        Instructor instructor1 = new Instructor(333, "Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor1);



    }
}
