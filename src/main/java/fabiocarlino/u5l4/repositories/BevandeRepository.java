package fabiocarlino.u5l4.repositories;

import fabiocarlino.u5l4.entities.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BevandeRepository extends JpaRepository<Bevanda, UUID> {
}
