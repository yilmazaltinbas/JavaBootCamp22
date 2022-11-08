package kodlama.io.Devs.dataAccess.abstracts;

//LanguageDao olarak da oluşturabiliriz.

import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language,Integer> {

}
