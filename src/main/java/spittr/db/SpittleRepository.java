package spittr.db;

import org.springframework.data.jpa.repository.JpaRepository;
import spittr.domain.Spittle;

import java.util.List;

/**
 * Created by shawnritchie on 18/04/15.
 */
public interface SpittleRepository extends JpaRepository<Spittle, Long>, SpittleRepositoryCustom {

    List<Spittle> findBySpitterId(long spitterId);
}
