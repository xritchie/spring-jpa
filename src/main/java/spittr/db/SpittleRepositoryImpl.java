package spittr.db;

import spittr.domain.Spittle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by shawnritchie on 18/04/15.
 */
public class SpittleRepositoryImpl implements SpittleRepositoryCustom  {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Spittle> findRecent() {
        return findRecent(10);
    }

    public List<Spittle> findRecent(int count) {
        return (List<Spittle>) entityManager.createQuery("select s from Spittle s order by s.postedTime desc")
                .setMaxResults(count)
                .getResultList();
    }

}
