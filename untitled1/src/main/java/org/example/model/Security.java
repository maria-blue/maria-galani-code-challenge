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
@Table(name = "security")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Security {

  @Id
  @GeneratedValue()
  private long id;

  @Column()
  private String name;

  public Security(String name) {
    this.name = name;
  }
}
