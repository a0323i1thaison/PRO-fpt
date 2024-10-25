package com.example.exammodul4.service;

import com.example.exammodul4.model.Orders;
import com.example.exammodul4.model.OrderDto;
import com.example.exammodul4.responsitory.OderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrderService implements IOderService{
    @Autowired
    private OderRepository orderRepository;

    public List<OrderDto> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private OrderDto convertToDto(Orders order) {
        OrderDto dto = new OrderDto();
        dto.setMa_don_hang(order.getMa_don_hang());
        dto.setNgay_mua(order.getNgay_mua());
        dto.setSo_luong(order.getSo_luong());
        dto.setTen_sp(order.getProduct().getTen_sp());
        dto.setGia_sp(order.getProduct().getGia_sp());
        dto.setTong_tien(order.getSo_luong() * order.getProduct().getGia_sp());
        dto.setTen_loai_sp(order.getProduct().getProductType().getTen_loai_sp());
        return dto;
    }
    public void update(Orders orders) {
        orderRepository.save(orders);
    }
    public Orders selectById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

}
