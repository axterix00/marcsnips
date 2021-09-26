package marcsnips.com.example.marcsnips.service.language;

import marcsnips.com.example.marcsnips.model.language.Language;
import marcsnips.com.example.marcsnips.repository.language.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    private final LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Autowired
    public List<Language> getLanguage() {
        return languageRepository.findAll();
    }

}
