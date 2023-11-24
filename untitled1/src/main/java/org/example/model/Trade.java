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
@Table(name = "trade")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Trade {

  @Id
  @GeneratedValue()
  private long id;

  @Column()
  private long sellOrderid;

  @Column()
  private long buyOrderId;

  @Column()
  private BigDecimal price;

  @Column()
  private BigDecimal quantity;

  public Trade(long sellOrderid, long buyOrderId, BigDecimal price, BigDecimal quantity) {
    this.sellOrderid = sellOrderid;
    this.buyOrderId = buyOrderId;
    this.price = price;
    this.quantity = quantity;
  }
}
