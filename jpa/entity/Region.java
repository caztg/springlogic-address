package cn.springlogic.address.jpa.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 2017/5/3.
 */

@Data
@Entity
public class Region {

    public final static String TYPE_PROVINCE;
    public final static String TYPE_CITY;
    public final static String TYPE_DISTRICT;
    public final static int STATUS_NONE;
    public final static int STATUS_ENABLE;
    public final static int STATUS_DISABLE;

    static {
        TYPE_PROVINCE = "province";
        TYPE_CITY = "city";
        TYPE_DISTRICT = "district";
        STATUS_NONE = 1;
        STATUS_ENABLE = 2;
        STATUS_DISABLE = 3;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //位置代码
    private String code;

    private String name;

    private String type;

    @OneToMany(targetEntity = Region.class, mappedBy = "parent")
    private List<Region> childrens;

    @ManyToOne(targetEntity = Region.class)
    @JoinColumn(name = "region_id", referencedColumnName = "id",columnDefinition = "int default 0")
    private Region parent;


    private int status;

}
