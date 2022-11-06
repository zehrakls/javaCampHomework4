package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

/**
 *
 * @author zehra.keles
 */
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    private List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<>();
        programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(3, "C++"));
        programmingLanguages.add(new ProgrammingLanguage(4, "PHP"));
        programmingLanguages.add(new ProgrammingLanguage(5, "Python"));
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage language=getById(programmingLanguage.getId());
        language.setName(programmingLanguage.getName());
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.remove(programmingLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage language : programmingLanguages) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }

}
