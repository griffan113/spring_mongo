package com.example.mongo.spring_mongo.modules.account.infra.orm.entities

public data class Account(
  val id: String? = null,
  val name: String,
  val document: String,
  val balance: Long? = 0,
) {}
