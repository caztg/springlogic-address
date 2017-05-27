package cn.springlogic.address.jpa.entity.rest;

import cn.springlogic.address.jpa.entity.Region;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by admin on 2017/5/11.
 */
@Projection(name = "regioninfo", types = {Region.class})
public interface RegionProjection {

    int getId();

    String getName();

}
