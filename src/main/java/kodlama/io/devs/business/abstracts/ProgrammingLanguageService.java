package kodlama.io.devs.business.abstracts;

import java.util.List;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

/**
 *
 * @author zehra.keles
 */
public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
}
