package ir.amv.snippets.vaseline.server.module.city.impl;

import ir.amv.os.vaseline.base.architecture.impl.server.layers.base.crud.service.BaseCrudServiceImpl;
import ir.amv.snippets.vaseline.server.module.city.CityEntity;
import ir.amv.snippets.vaseline.server.module.city.ICityApi;
import ir.amv.snippets.vaseline.server.module.city.ICityService;
import ir.amv.snippets.vaseline.shared.CityDto;
import org.springframework.stereotype.Service;

/**
 * Created by AMV on 9/17/2016.
 */
@Service
public class CityServiceImpl
        extends BaseCrudServiceImpl<CityEntity, CityDto, Long, ICityApi>
        implements ICityService {
}
