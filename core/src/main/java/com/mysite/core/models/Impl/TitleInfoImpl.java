package com.mysite.core.models.Impl;

import com.mysite.core.models.TitleInfo;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,adapters = TitleInfo.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TitleInfoImpl implements TitleInfo {

    @Inject
    @Default(values = "My Offered Services")
    String title;

    @Inject
    @Default(values = "At about this time of year, some months after New Year’s resolutions have been made and kept, or made and neglected.")
    String info;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getInfo() {
        return info;
    }
}
