package kodlama.io.Devs.business.request.languageTechnologyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateLanguageTechnologyRequest {
    private String name;
    private int programmingLanguageId;
}
