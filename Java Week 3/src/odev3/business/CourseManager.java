package odev3.business;

import odev3.dataAccess.CourseDao;
import odev3.entities.Course;
import oopWithNLayeredApp.core.logging.Logger;

public class CourseManager {
    public CourseDao courseDao;
    public Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{
        Course[] courses = {new Course(1,"Java","Java ile Programlama","Engin Demiroğ",100),
        new Course(2,"C#","C# İle Programlama","Engin Demiroğ",500),
        new Course(3,"Spring","İleri Seviye Java","Engin Demiroğ",10),
        new Course(4,"C++","C++ İle Programlama","Engin Demiroğ",999)};

        for(Course course5 : courses){
            if(course.getName() == course5.getName()){
                throw new Exception("Kurs ismi tekrar edemez");
            }else if(course.getCourseUnitPrice()<0){
                throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
            }
        }

        courseDao.add(course);
        for(Logger logger:loggers){
            logger.log(course.getName());
        }
    }
}
