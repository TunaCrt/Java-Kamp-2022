package Kodlamaİo.dataAccess.Hibernate;

import Kodlamaİo.dataAccess.InstructorDao;
import Kodlamaİo.entities.Instructor;

public class InstructorHibernateDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen Hibernate ile veritabanına eklendi");
    }
}
