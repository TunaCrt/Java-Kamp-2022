package Kodlama.io.Kodlama.io.Devs.business.concretes;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.PLanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.PLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PLanguageManager implements PLanguageService {

    private PLanguageRepository pLanguageRepository;
    List<ProgrammingLanguage>languages;
    public PLanguageManager(PLanguageRepository pLanguageRepository) {
        this.pLanguageRepository = pLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return pLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return pLanguageRepository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage language)throws Exception{

        for (ProgrammingLanguage language1:languages){
            if (language1.getName().equals(language.getName())){
                throw new Exception(language.getName() + "Zaten kayıtlı.");
            }
            if (language1.getName().equals("") ||language1.getName()==null){
                throw new Exception("Dil ismi boş olamaz.");
            }
        }
        pLanguageRepository.add(language);
    }

    @Override
    public void delete(int id) {
        pLanguageRepository.delete(id);
    }

    @Override
    public void update(ProgrammingLanguage language) {
        pLanguageRepository.update(language);
    }

}
