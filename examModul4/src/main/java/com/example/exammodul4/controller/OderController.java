package com.example.exammodul4.controller;

import com.example.exammodul4.model.OrderDto;
import com.example.exammodul4.model.Orders;
import com.example.exammodul4.service.IOderService;
import com.example.exammodul4.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class OderController {
    @Autowired
    private IOderService orderService;

    @GetMapping("/orders")
    public String listOrders(Model model) {
        List<OrderDto> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "list"; // Tên template HTML
    }
    @GetMapping("/update/{id}")
    public String updateOrder(@PathVariable Long id, Model model) {
        Orders orders = orderService.selectById(id);
        model.addAttribute("orders", orders);
        return "update";
    }
    @PostMapping("/update/{id}")
    public String update(@Valid @ModelAttribute("product") OrderDto orderDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model ){
        new OrderDto().validate(orderDto,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("listProductDetail",orderService.getAllOrders());
            return "update";
        }
        Orders orders = new Orders();
        BeanUtils.copyProperties(orderDto,orders );
        orderService.update(orders);
        return "redirect:/orders";
    }
}
