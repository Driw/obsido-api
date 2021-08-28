package br.com.driw.obsido.modules.core.model;

import br.com.driw.obsido.modules.core.CoreConstants;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(catalog = CoreConstants.CATALOG, name = "stock_purchases", indexes = {
	@Index(name = "stock_purchases_idx_buy", columnList = "id_company,buyDate")
})
@Accessors(chain = true)
public class StockPurchase implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_company", foreignKey = @ForeignKey(name = "stock_purchases_fk_company"))
	private Company company;

	@NotNull
	private LocalDate buyDate;

	@NotNull
	private BigDecimal price;

	@NotNull
	private Integer amount;
}
