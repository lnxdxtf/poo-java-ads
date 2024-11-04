package clinicproject.domain;

import clinicproject.domain.Utils.Crud;
import clinicproject.domain.Utils.Repository;

public class Patient implements Crud<Patient> {

    private String uid;
    private String name;
    private String email;
    private Diagnosis diagnosis;
    private int created_at;
    private int updated_at;

    public class Diagnosis {
        private String name;
        private String description;
        private String treatment;
        private int created_at;
    }

    @Override
    public <CONN> void create(Patient model, Repository<CONN, Patient> repository) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public <CONN> Patient read(int id, Repository<CONN, Patient> repository) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
    
    @Override
    public <CONN> void update(Patient model, Repository<CONN, Patient> repository) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public <CONN> void delete(int id, Repository<CONN, Patient> repository) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}