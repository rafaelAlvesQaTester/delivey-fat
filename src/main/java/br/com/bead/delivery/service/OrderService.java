package br.com.bead.delivery.service;
import org.springframework.stereotype.Service;
import br.com.bead.delivery.repository.OrderRepository;
import br.com.bead.delivery.model.Order;

import br.com.bead.delivery.dto.OrderDTO;
import br.com.bead.delivery.dto.OrderRequest;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;

@Service
public class OrderService {
    private final OrderRepository repo;
    public OrderService(OrderRepository repo, ModelMapper mapper){
        this.repo = repo;
        this.mapper = mapper;
    }
        public OrderDTO createOrder( OrderRequest req) {
            Order order = new Order();
            order.setCustomerName(req.getCustomerName());
            order.setTotalAmount(req.getTotalAmount());
            order.setCreatAt(LocalDateTime.now());

            Order saved = repo.save(order);

            return mapper.map(saved, OrderDTO.class);
        }
}
