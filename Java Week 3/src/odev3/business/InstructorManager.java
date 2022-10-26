package odev3.business;

import odev3.dataAccess.InstructorDao;
import odev3.entities.Instructor;
import oopWithNLayeredApp.core.logging.Logger;


public class InstructorManager {
    public InstructorDao instructorDao;
    public Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(Logger logger:loggers){
            logger.log(instructor.getFirstName()+" "+instructor.getLastName());
        }
    }

}
