package com.example.exammodul4.service;

import com.example.exammodul4.model.OrderDto;
import com.example.exammodul4.model.Orders;

import java.util.List;

public interface IOderService {
    public void update(Orders orderDto);
    public Orders selectById(Long id);
    public List<OrderDto> getAllOrders();
}
