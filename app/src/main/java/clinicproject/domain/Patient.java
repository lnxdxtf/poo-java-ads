package clinicproject.domain;

import clinicproject.domain.Utils.Crud;

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
    public void create(Patient model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Patient read(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
    
    @Override
    public void update(Patient model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}