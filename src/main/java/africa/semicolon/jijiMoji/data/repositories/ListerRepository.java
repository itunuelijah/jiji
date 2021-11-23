package africa.semicolon.jijiMoji.data.repositories;

import africa.semicolon.jijiMoji.data.models.Lister;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ListerRepository extends MongoRepository<Lister, String> {
}
