package spittr.db;

import spittr.domain.Spittle;

import java.util.List;

/**
 * Created by shawnritchie on 18/04/15.
 */
public interface SpittleRepositoryCustom {

    List<Spittle> findRecent();

    List<Spittle> findRecent(int count);

}
