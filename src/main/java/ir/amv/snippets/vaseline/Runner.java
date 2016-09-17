package ir.amv.snippets.vaseline;

import ir.amv.os.vaseline.base.core.shared.base.exc.BaseVaselineClientException;
import ir.amv.snippets.vaseline.config.SampleAppConfig;
import ir.amv.snippets.vaseline.server.module.city.ICityService;
import ir.amv.snippets.vaseline.shared.CityDto;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by AMV on 9/17/2016.
 */
public class Runner {

    public static void main(String[] args) throws BaseVaselineClientException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleAppConfig.class);
        ICityService cityService = applicationContext.getBean(ICityService.class);
        CityDto city = new CityDto();
        city.setName("Test");
        cityService.save(city);
    }
}
