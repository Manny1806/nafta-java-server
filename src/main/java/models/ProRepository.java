package models;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "pro", path = "pro")
public interface ProRepository extends MongoRepository<Pro, String> {

	List<Pro> findByTitle(@Param("id") String id);

}