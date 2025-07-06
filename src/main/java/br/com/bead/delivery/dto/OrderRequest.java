package br.com.bead.delivery.dto;
import lombok.Data;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data

public class OrderRequest {
    @NotBlank
    private String customerName;

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal totalAmount;
}
