package clinicproject.domain;

public class Utils {

    public interface Crud<MODEL> {
        <CONN> void create(MODEL model, Repository<CONN, MODEL> repository);

        <CONN> MODEL read(int id, Repository<CONN, MODEL> repository);

        <CONN> void update(MODEL model, Repository<CONN, MODEL> repository);

        <CONN> void delete(int id, Repository<CONN, MODEL> repository);
    }

    public interface Repository<CONN, MODEL> {
        void save(CONN conn, MODEL model);

        MODEL find(CONN conn, int id);

        void update(CONN conn, MODEL model);

        void delete(CONN conn, int id);
    }

}
