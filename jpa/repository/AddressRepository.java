package cn.springlogic.address.jpa.repository;

import cn.springlogic.address.jpa.entity.Address;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by admin on 2017/5/3.
 */
@Configuration
@RepositoryRestResource(path="address:address")
public interface AddressRepository extends JpaRepository<Address,Integer>{
}
