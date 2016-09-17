package ir.amv.snippets.vaseline.server.module.city;

import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.dao.IBaseCrudDao;
import ir.amv.snippets.vaseline.shared.CityDto;

/**
 * Created by AMV on 9/17/2016.
 */
public interface ICityDao extends IBaseCrudDao<CityEntity, CityDto, Long> {
}
