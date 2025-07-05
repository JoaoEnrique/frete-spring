package br.com.fatec.frete.repository.client;

import br.com.fatec.frete.repository.orm.FreteOrm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface FreteRepositoryWithMongo extends MongoRepository<FreteOrm, String> {
    Optional<FreteOrm> findById(String id);
}
