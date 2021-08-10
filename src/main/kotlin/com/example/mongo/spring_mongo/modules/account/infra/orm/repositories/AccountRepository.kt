package com.example.mongo.spring_mongo

import com.example.mongo.spring_mongo.modules.account.infra.orm.entities.Account
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

public interface IAccountRepository : MongoRepository<Account, String> {
  fun findByDocument(document: String): Optional<Account>;
}
