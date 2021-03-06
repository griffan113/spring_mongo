package com.example.mongo.spring_mongo.modules.account.infra.http

import com.example.mongo.spring_mongo.IAccountRepository
import com.example.mongo.spring_mongo.modules.account.infra.orm.entities.Account
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.lang.RuntimeException

@Controller
@RequestMapping("/account")
public class AccountController(val repository: IAccountRepository) {
  @PostMapping
  public fun create(@RequestBody account: Account): ResponseEntity<Account> {
    val saveAccount = repository.save(account);
    return ResponseEntity.ok(saveAccount);
  }

  @GetMapping
  public fun read(): ResponseEntity<List<Account>> {
    return ResponseEntity.ok(repository.findAll());
  }

  @GetMapping("{id}")
  public fun findById(@PathVariable id: String): ResponseEntity<Account> {
    val findAccount = repository.findById(id);
    val accountDB = findAccount.orElseThrow { ChangeSetPersister.NotFoundException() }
    return ResponseEntity.ok(accountDB);
  }

  @PutMapping("{document}")
  public fun update(
    @PathVariable document: String,
    @RequestBody account: Account
  ): ResponseEntity<Account> {
    val findDocument = repository.findByDocument(document);
    val accountDB = findDocument.orElseThrow { RuntimeException("Account document $document does not exists") };
    val save = repository.save(accountDB.copy(name = account.name, balance = account.balance));

    return ResponseEntity.ok(save);
  }

  @DeleteMapping("{id}")
  public fun deleteById(
    @PathVariable id: String,
  ): ResponseEntity<Account> {
    val findAccount = repository.findById(id);
    val accountDB = findAccount.orElseThrow { ChangeSetPersister.NotFoundException() };

    repository.delete(accountDB);

    return ResponseEntity.ok(accountDB);
  }
}
