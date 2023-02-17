package service;

import model.Medcin;

import java.util.List;

public interface IMedcin {
    Medcin add(Medcin entity) throws Exception;
    List<Medcin> findAll() throws Exception;
    Medcin find(long id) throws Exception;
    void remove(Medcin entity) throws Exception;
    long count() throws Exception;
}
