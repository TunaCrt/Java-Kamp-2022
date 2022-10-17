package Kodlamaİo.business;

import Kodlamaİo.core.loging.Logger;
import Kodlamaİo.dataAccess.CoruseDao;
import Kodlamaİo.entities.Category;
import Kodlamaİo.entities.Coruse;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private CoruseDao coruseDao;
    private Logger[] loggers;
    private List<Coruse> coruses = new ArrayList<Coruse>();

    public CourseManager(CoruseDao coruseDao, Logger[] loggers) {
        this.coruseDao = coruseDao;
        this.loggers = loggers;
    }

    public void add(Coruse coruse) throws Exception {
        for (Coruse coruse1 : coruses) {
            if (coruse1.getCoruseName().equals(coruse.getCoruseName())) {
                throw new Exception(
                        "Girdğiniz kurs adında bir kurs mevcut. Lütfen farklı bir kurs giriniz");
            }
        }
        coruses.add(coruse);

        coruseDao.add(coruse);

    }



}
