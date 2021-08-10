package com.example.mongo.spring_mongo

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

public interface IAccountRepository : MongoRepository<Account, String> {
  fun findByDocument(document: String): Optional<Account>;
}
