package Kodlama.io.Kodlama.io.Devs.webApi;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.PLanguageService;
import Kodlama.io.Kodlama.io.Devs.business.concretes.PLanguageManager;
import Kodlama.io.Kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
    private PLanguageService pLanguageService;
    @Autowired
    public ProgrammingLanguagesController(PLanguageService pLanguageService) {
        this.pLanguageService = pLanguageService;
    }

    @RequestMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return pLanguageService.getAll();
    }
    @DeleteMapping("/delete")
    public void delete(int id){
        pLanguageService.delete(id);
    }
    @PostMapping("update")
    public void update(ProgrammingLanguage programmingLanguage){
        pLanguageService.update(programmingLanguage);
    }
    @PostMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        pLanguageService.add(programmingLanguage);
    }
    @GetMapping("/getById")
    public ProgrammingLanguage getById(int id){
        return pLanguageService.getById(id);
    }


}
