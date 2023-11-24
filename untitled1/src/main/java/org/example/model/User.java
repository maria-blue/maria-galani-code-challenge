package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Entity
@Table(name = "user")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class User {

  @Id
  @GeneratedValue()
  private long id;

  @Column()
  private String username;

  @Column()
  private byte[] password;

  public User(String username, byte[] password) {
    this.username = username;
    this.password = password;
  }
}
