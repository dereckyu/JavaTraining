package platform.persistence.mongo;

import com.mongodb.Mongo;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

public class StandardMongoTemplate extends MongoTemplate {

    public StandardMongoTemplate(MongoDbFactory mongoDbFactory) {
        super(mongoDbFactory);
    }

    public StandardMongoTemplate(Mongo mongo, String databaseName) {
        super(mongo, databaseName);
    }
}
