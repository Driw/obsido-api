package br.com.driw.obsido.modules.core.repository;

import br.com.driw.obsido.modules.core.model.StockSale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockSaleRepository extends JpaRepository<StockSale, Long> {
}
