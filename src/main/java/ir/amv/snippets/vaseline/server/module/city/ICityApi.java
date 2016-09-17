package ir.amv.snippets.vaseline.server.module.city;

import ir.amv.os.vaseline.base.architecture.server.layers.base.crud.api.IBaseCrudApi;
import ir.amv.snippets.vaseline.shared.CityDto;

/**
 * Created by AMV on 9/17/2016.
 */
public interface ICityApi extends IBaseCrudApi<CityEntity, CityDto, Long> {
}
