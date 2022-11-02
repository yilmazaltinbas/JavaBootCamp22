package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abtracts.LanguageService;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // anatasyon, bilgilendirme ifadesidir.
@RequestMapping("/api/languages")

public class LanguagesController {  // Api isimlendirmeleri çoğul 's' ekiyle yapılır.
    private LanguageService languageService;


    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();
    }
    @PostMapping("/create")
    public void create(Language language) throws Exception{
        languageService.create(language);
    }

    @PutMapping("/update")
    public void update(Language language, int id) throws  Exception{
        languageService.update(language,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable (name="id")int id) throws Exception{
        languageService.delete(id);
    }
    @GetMapping("/{id}")
    public Language getById(@PathVariable() int id) throws Exception{
        return languageService.getById(id);
    }


}
