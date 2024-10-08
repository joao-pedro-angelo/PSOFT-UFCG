package PITSa.src.main.java.com.ufcg.psoft.commerce.model.pagamento;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("D")
@JsonIdentityInfo(
        scope = CartaoDebito.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class CartaoDebito extends TipoPagamento {
    private static final Double DESCONTO = 0.975;

    public Double calculaTotal(Double valorPedido) {
        return valorPedido * DESCONTO;
    }

}