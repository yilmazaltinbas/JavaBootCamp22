package kodlama.io.Devs.business.abtracts;

import kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();

    Language getById(int id) throws Exception;

    void create(Language language) throws Exception;

    void update(Language language, int id) throws Exception;

    void delete(int id) throws Exception;


}
