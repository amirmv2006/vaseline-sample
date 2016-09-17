package ir.amv.snippets.vaseline.server.module.city;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.ent.BaseEntityImpl;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by AMV on 9/17/2016.
 */
@Entity
@Table(name = "SNP_CITY")
public class CityEntity extends BaseEntityImpl<Long> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
