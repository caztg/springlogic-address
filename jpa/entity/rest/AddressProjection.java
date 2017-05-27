package cn.springlogic.address.jpa.entity.rest;

import cn.springlogic.address.jpa.entity.Address;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by admin on 2017/5/11.
 */
@Projection(name = "addressinfo", types = {Address.class})
public interface AddressProjection {

    int getId();

    RegionProjection getProvince();

    RegionProjection getCity();

    RegionProjection getDistrict();

    String getDetail();

}
