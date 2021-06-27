package com.example.mongo.spring_mongo

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

public interface AccountRepository : MongoRepository<Account, String> {
    fun findByDocument(document: String): Optional<Account>;
}