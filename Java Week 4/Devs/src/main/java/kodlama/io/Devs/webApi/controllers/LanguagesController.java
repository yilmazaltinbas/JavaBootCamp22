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




}
