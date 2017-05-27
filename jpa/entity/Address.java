package cn.springlogic.address.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by admin on 2017/5/3.
 */
@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(targetEntity = Region.class)
    @JoinColumn(name = "province_region_id", referencedColumnName = "id")
    private Region province;

    @ManyToOne(targetEntity = Region.class)
    @JoinColumn(name = "province_city_id", referencedColumnName = "id")
    private Region city;

    @ManyToOne(targetEntity = Region.class)
    @JoinColumn(name = "province_district_id", referencedColumnName = "id")
   private Region district;

    //详细地址
   private String detail;


}
