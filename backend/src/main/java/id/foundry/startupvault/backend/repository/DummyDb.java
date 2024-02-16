package id.foundry.startupvault.backend.repository;

import org.springframework.stereotype.Repository;
import id.foundry.startupvault.backend.model.*;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DummyDb extends JpaRepository<Dummy, Long>{
    List<Dummy> findAll();
}
