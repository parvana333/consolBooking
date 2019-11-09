package DAO;

import java.io.File;
import java.io.IOException;

public interface DAO <T>{
    void store(T data);
    String get(String id);
    void delete(String id);
    void update(T data);
    void close() throws IOException;
}


