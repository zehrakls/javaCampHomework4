package kodlama.io.devs.webApi.controllers;

import java.util.List;
import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zehra.keles
 */
@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguageController {

    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.add(programmingLanguage);
    }

    @DeleteMapping("/delete")
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.delete(programmingLanguage);
    }

    @PutMapping("/update")
    public void update(ProgrammingLanguage language) throws Exception {

        programmingLanguageService.update(language);
    }

    public ProgrammingLanguage getById(int Id) {

        return programmingLanguageService.getById(Id);
    }
}
