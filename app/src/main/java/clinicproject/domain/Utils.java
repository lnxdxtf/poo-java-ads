package clinicproject.domain;

public class Utils {

    public interface Crud<MODEL> {
        void create(MODEL model);
        MODEL read(int id);
        void update(MODEL model);
        void delete(int id);
    }


}
