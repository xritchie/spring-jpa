package spittr.db;

import org.springframework.data.jpa.repository.JpaRepository;
import spittr.domain.Spitter;

import java.util.List;

/**
 * Created by shawnritchie on 18/04/15.
 */
public interface SpitterRepository extends JpaRepository<Spitter, Long>, SpitterSweeper {

    Spitter findByUsername(String username);

    List<Spitter> findByUsernameOrFullNameLike(String username, String fullName);

}
