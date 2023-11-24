package org.example.service.impl;

import static java.util.Objects.requireNonNull;

import org.example.model.Order;
import org.example.service.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  private final OrderRepository orderRepository;

  @Autowired
  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = requireNonNull(orderRepository);
  }

  public Order createOrder(Order order) {
    return orderRepository.save(order);
  }

  public Order findById(long id) {
    return orderRepository.findById(id).orElseThrow();
  }

  public void deleteOrder(Order order) {
    orderRepository.delete(order);
  }
}
