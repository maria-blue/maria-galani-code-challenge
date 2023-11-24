package org.example.model;

import java.math.BigDecimal;
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
@Table(name = "order")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Order {

  @Id
  @GeneratedValue()
  private long id;

  @Column()
  private long userId;

  @Column()
  private long securityId;

  @Column()
  private String type;

  @Column()
  private BigDecimal price;

  @Column()
  private BigDecimal quantity;

  @Column()
  private boolean fullfilled;

  public Order(long userId, long securityId, String type, BigDecimal price, BigDecimal quantity,
               boolean fullfilled) {
    this.userId = userId;
    this.securityId = securityId;
    this.type = type;
    this.quantity = quantity;
    this.price = price;
    this.fullfilled = fullfilled;
  }
}
