package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.ProgrammingLanguage;

import java.util.List;

public interface PLanguageService {
     List<ProgrammingLanguage> getAll();
     ProgrammingLanguage getById(int id);
     void add(ProgrammingLanguage language) throws Exception;
     void delete(int id);
     void update(ProgrammingLanguage language);

}
