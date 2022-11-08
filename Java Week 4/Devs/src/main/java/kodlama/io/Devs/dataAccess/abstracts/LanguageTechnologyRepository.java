package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.LanguageTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageTechnologyRepository extends JpaRepository<LanguageTechnology,Integer> {
}
