package Kodlama.io.Kodlama.io.Devs.dataAccess.concrates;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.PLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryPLanguagerepository implements PLanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryPLanguagerepository() {
        programmingLanguages=new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"java"));
        programmingLanguages.add(new ProgrammingLanguage(2,"phyton"));
        programmingLanguages.add(new ProgrammingLanguage(3,"c#"));
        programmingLanguages.add(new ProgrammingLanguage(4,"javascript"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage:programmingLanguages){
            if (programmingLanguage.getId()==id){
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public void add(ProgrammingLanguage language) {
        programmingLanguages.add(language);
    }

    @Override
    public void delete(int id) {
        programmingLanguages.remove(id);

    }

    @Override
    public void update(ProgrammingLanguage language) {
        for (ProgrammingLanguage programmingLanguage:programmingLanguages){
            if (programmingLanguage.getId()==language.getId()){
                programmingLanguage.setName(language.getName());
            }
        }

    }
}
