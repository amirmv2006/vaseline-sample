package ir.amv.snippets.vaseline.server.module.city.impl;

import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.api.BaseCrudApiImpl;
import ir.amv.snippets.vaseline.server.module.city.CityEntity;
import ir.amv.snippets.vaseline.server.module.city.ICityApi;
import ir.amv.snippets.vaseline.server.module.city.ICityDao;
import ir.amv.snippets.vaseline.shared.CityDto;
import org.springframework.stereotype.Component;

/**
 * Created by AMV on 9/17/2016.
 */
@Component
public class CityApiImpl
        extends BaseCrudApiImpl<CityEntity, CityDto, Long, ICityDao>
        implements ICityApi {
}
