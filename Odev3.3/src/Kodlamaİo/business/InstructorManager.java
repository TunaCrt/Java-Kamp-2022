package Kodlamaİo.business;

import Kodlamaİo.core.loging.Logger;
import Kodlamaİo.dataAccess.InstructorDao;
import Kodlamaİo.entities.Category;
import Kodlamaİo.entities.Coruse;
import Kodlamaİo.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getName());
        }

    }


}





