package en.univercity.event.Repository;

import en.univercity.event.models.MemberModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<MemberModel,Long>{

    Optional<MemberModel> findByEmail(String email);
}
