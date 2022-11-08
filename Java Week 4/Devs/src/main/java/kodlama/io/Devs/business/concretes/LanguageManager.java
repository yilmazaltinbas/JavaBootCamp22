package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abtracts.LanguageService;
import kodlama.io.Devs.business.request.languageRequests.CreateLanguageRequest;
import kodlama.io.Devs.business.request.languageRequests.DeleteLanguageRequest;
import kodlama.io.Devs.business.request.languageRequests.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.languageResponses.GetAllLanguageResponse;
import kodlama.io.Devs.business.responses.languageResponses.GetByIdLanguageResponse;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<Language> Languages = LanguageRepository.findAll();
        List<GetAllPLanguageResponse> programmingLanguageResponses = new ArrayList<>();

        for(ProgrammingLanguage programmingLanguage : programmingLanguages){
            GetAllProgrammingLanguageResponse response = new GetAllProgrammingLanguageResponse();
            response.setName(programmingLanguage.getName());

            programmingLanguageResponses.add(response);
        }

        return programmingLanguageResponses;


    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        return null;
    }

    @Override
    public void save(CreateLanguageRequest createLanguageRequest) {

    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {

    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {

    }
}
