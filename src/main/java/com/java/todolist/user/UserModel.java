package com.java.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

// ? Decorator para definir os accessors (getters e setters) dos atributos da classe
@Data
@Entity(name = "td_users")
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  /*
   * ? Caso deseje somente o getter/setter de um atributo específico, coloque o
   * accessor acima dele, como está abaixo:
   * 
   * @Getter
   */
  @Column(unique = true)
  private String username;
  private String name;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
