package br.com.bead.delivery.dto;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderDTO {
    private Long id;

    private String customerName;

    private BigDecimal totalAmount;

    private LocalDateTime createAt;
}
