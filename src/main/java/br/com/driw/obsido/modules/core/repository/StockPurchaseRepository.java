package br.com.driw.obsido.modules.core.repository;

import br.com.driw.obsido.modules.core.model.StockPurchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockPurchaseRepository extends JpaRepository<StockPurchase, Long> {
}
