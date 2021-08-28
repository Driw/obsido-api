package br.com.driw.obsido.modules.core.repository;

import br.com.driw.obsido.modules.core.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
