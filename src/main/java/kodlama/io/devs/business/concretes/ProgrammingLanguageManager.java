package kodlama.io.devs.business.concretes;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zehra.keles
 */
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    @Autowired
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        isProgrammingLanguageValid(programmingLanguage);
        this.programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguageRepository.update(programmingLanguage);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguageRepository.delete(programmingLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.getById(id);
    }

    private void isProgrammingLanguageValid(ProgrammingLanguage programmingLanguage) throws Exception {
        if (programmingLanguage.getName().equals("")) {
            throw new Exception("Programlama dili boş olamaz.");
        }
        for (ProgrammingLanguage language : programmingLanguageRepository.getAll()) {
            if (language.getName().equals(programmingLanguage.getName())) {
                throw new Exception("Bu programlama dili zaten mevcut.");
            }
        }
    }

}
