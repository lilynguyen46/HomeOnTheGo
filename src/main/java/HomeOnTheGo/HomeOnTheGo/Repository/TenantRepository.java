package HomeOnTheGo.HomeOnTheGo.Repository;

import HomeOnTheGo.HomeOnTheGo.Model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
