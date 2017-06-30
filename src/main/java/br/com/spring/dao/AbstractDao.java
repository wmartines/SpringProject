package br.com.spring.dao;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author Rodrigo G. Tavares de Souza
 */
public abstract class AbstractDao {

    @PersistenceContext
    protected EntityManager em;


    protected Query createQuery(StringBuilder qry) {
        return em.createQuery(qry.toString());
    }

    @SuppressWarnings("unchecked")
    protected <T extends Serializable> List<T> resultList(Query qry) {
        List<T> result = (List<T>) qry.getResultList();
        if (result == null) {
            result = new ArrayList<>();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    protected <T extends Serializable> T singleResult(Query qry) {

        T result;
        try {
            result = (T) qry.getSingleResult();
        } catch (Exception e) {
            result = null;
        }

        return result;
    }

}
