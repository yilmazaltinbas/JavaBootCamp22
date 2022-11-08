package kodlama.io.Devs.business.abtracts;

import kodlama.io.Devs.business.request.languageRequests.CreateLanguageRequest;
import kodlama.io.Devs.business.request.languageRequests.DeleteLanguageRequest;
import kodlama.io.Devs.business.request.languageRequests.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.languageResponses.GetAllLanguageResponse;
import kodlama.io.Devs.business.responses.languageResponses.GetByIdLanguageResponse;

import java.util.List;

public interface LanguageService {

    List<GetAllLanguageResponse> getAll();
    GetByIdLanguageResponse getById(int id);

    void save(CreateLanguageRequest createLanguageRequest);

    void delete(DeleteLanguageRequest deleteLanguageRequest);

    void update(UpdateLanguageRequest updateLanguageRequest);


}
