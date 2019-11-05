package DAO;

public interface DAO <T>{
    void store(T data);
    String get(String id);
    void delete(String id);
    void update(T data);
}


