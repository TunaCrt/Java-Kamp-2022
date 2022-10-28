package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PLanguageRepository {
   // ProgrammingLanguage[] getAll(); bunun yerine list kullanmalıyız artık
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage language);
    void delete(int id);
    void update(ProgrammingLanguage language);
}
