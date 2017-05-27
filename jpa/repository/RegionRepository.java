package cn.springlogic.address.jpa.repository;

import cn.springlogic.address.jpa.entity.Region;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by admin on 2017/5/3.
 */
@Configuration
@RepositoryRestResource(path = "address:region")
public interface RegionRepository extends JpaRepository<Region, Integer> {


    @Query("select r from Region r where r.parent.id is null ")
    @RestResource(path = "all", rel = "all")
    Page<Region> findRegion(Pageable pageable);

    @Query("select r from Region r where r.parent IS NULL AND :id IS NULL or r.parent.id =:id ")
    @RestResource(path = "one", rel = "one")
    Page<Region> findRegionByParentId(@Param("id")Integer pid, Pageable pageable);
}
