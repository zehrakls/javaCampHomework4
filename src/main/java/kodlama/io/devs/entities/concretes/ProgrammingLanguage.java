package kodlama.io.devs.entities.concretes;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author zehra.keles
 */
@Getter
@Setter
public class ProgrammingLanguage {
    private int id;
    private  String name;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
