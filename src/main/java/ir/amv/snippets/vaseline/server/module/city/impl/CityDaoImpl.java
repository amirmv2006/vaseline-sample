package ir.amv.snippets.vaseline.server.module.city.impl;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.server.layers.crud.dao.BaseCrudHibernateDaoImpl;
import ir.amv.snippets.vaseline.server.module.city.CityEntity;
import ir.amv.snippets.vaseline.server.module.city.ICityDao;
import ir.amv.snippets.vaseline.shared.CityDto;
import org.springframework.stereotype.Repository;

/**
 * Created by AMV on 9/17/2016.
 */
@Repository
public class CityDaoImpl
        extends BaseCrudHibernateDaoImpl<CityEntity, CityDto, Long>
        implements ICityDao {
}
