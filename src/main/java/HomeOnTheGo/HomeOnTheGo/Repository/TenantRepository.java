package com.jcode.hometogo.Repository;

import com.jcode.hometogo.Model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
