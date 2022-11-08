package kodlama.io.Devs.business.abtracts;

import kodlama.io.Devs.business.request.languageTechnologyRequests.CreateLanguageTechnologyRequest;
import kodlama.io.Devs.business.request.languageTechnologyRequests.DeleteLanguageTechnologyRequest;
import kodlama.io.Devs.business.request.languageTechnologyRequests.UpdateLanguageTechnologyRequest;
import kodlama.io.Devs.business.responses.languageTechnologyResponses.GetAllLanguageTechnologyResponse;

import java.util.List;

public interface LanguageTechnologyService {

    List<GetAllLanguageTechnologyResponse> getAll();
    void save(CreateLanguageTechnologyRequest createLanguageTechnologyRequest);
    void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest);
    void update(int id, UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest);
}
