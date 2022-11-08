package kodlama.io.Devs.business.request.languageTechnologyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLanguageTechnologyRequest {

    private int languageId;
    private String name;
}
