package dio.challenge.service.interfaces;

public interface CRUDInterface<T, ID> {
    Iterable<T> findAll();
    T findById(ID id);
    T save(T object);
    void update(ID id, T object);
    void deleteById(ID id);
}
