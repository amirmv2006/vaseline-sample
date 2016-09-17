package ir.amv.snippets.vaseline.shared;

import ir.amv.os.vaseline.base.core.shared.base.dto.base.impl.BaseDtoImpl;

/**
 * Created by AMV on 9/17/2016.
 */
public class CityDto extends BaseDtoImpl<Long> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
