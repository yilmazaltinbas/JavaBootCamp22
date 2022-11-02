package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abtracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository; // veritabanını kullanacağımız için oluşturduk.

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll(); // InMemory veritabanımızı return yaptık.
    }

    @Override
    public Language getById(int id) throws Exception {
        return languageRepository.getById(id);
    }

    @Override
    public void create(Language language) throws Exception {
        if(language.getName().isEmpty()){
            throw new Exception("Programlama dili ismi boş bırakılamaz");
        }

        for(Language language1 : getAll()){
            if(language1.getId() == language.getId()){
                throw new Exception("Programlama isimleri tekrar edemez");
            }
        }
        languageRepository.create(language);

    }

    @Override
    public void update(Language language, int id) throws Exception {
        if(languageRepository.getById(id)==null){
            throw new Exception("Bu programlama dili mevcut değil");
        }
        languageRepository.update(language,id);
    }

    @Override
    public void delete(int id) throws Exception {
        languageRepository.delete(id);
    }

}
