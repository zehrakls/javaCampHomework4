package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

/**
 *
 * @author zehra.keles
 */
public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    
}
