package com.sebi.shops.service.order;

import com.sebi.shops.dto.OrderDto;
import com.sebi.shops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);


    OrderDto convertToDto(Order order);
}
