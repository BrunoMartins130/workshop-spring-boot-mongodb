package com.mongod.workshopmongo.repositories;

import com.mongod.workshopmongo.domain.Post;
import com.mongod.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
