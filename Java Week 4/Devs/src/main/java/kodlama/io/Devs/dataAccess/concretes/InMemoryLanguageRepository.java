package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages; // veritabanımızı inmemory şeklinde oluşturduk.

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"C#"));
        languages.add(new Language(2,"Java"));
        languages.add(new Language(3,"Python"));
        languages.add(new Language(4,"Php"));
        languages.add(new Language(5,"JavaScript"));

    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getById(int id) throws Exception {
        return null;
    }

    @Override
    public void create(Language language) throws Exception {

    }

    @Override
    public void update(Language language, int id) throws Exception {

    }

    @Override
    public void delete(int id) throws Exception {

    }
}
