package ba.edu.ibu.DigitalMarketplace.core.repository;

import ba.edu.ibu.DigitalMarketplace.core.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends MongoRepository<Comment,String> {

}
