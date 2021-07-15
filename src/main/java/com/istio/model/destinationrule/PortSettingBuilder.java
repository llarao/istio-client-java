package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class PortSettingBuilder extends PortSettingFluentImpl<PortSettingBuilder> implements VisitableBuilder<PortSetting, PortSettingBuilder>{

    PortSettingFluent<?> fluent;
    Boolean validationEnabled;

    public PortSettingBuilder(){
            this(true);
    }
    public PortSettingBuilder(Boolean validationEnabled){
        this(new PortSetting(), validationEnabled);
    }
    public PortSettingBuilder(PortSettingFluent<?> fluent){
            this(fluent, true);
    }
    public PortSettingBuilder(PortSettingFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new PortSetting(), validationEnabled);
    }
    public PortSettingBuilder(PortSettingFluent<?> fluent, PortSetting instance){
            this(fluent, instance, true);
    }
    public PortSettingBuilder(PortSettingFluent<?> fluent, PortSetting instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withNumber(instance.getNumber());
        this.validationEnabled = validationEnabled;
    }
    public PortSettingBuilder(PortSetting instance){
            this(instance,true);
    }
    public PortSettingBuilder(PortSetting instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withNumber(instance.getNumber());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public PortSetting build(){
        PortSetting buildable = new PortSetting(fluent.getNumber());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PortLevelSettingBuilder that = (PortLevelSettingBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }




}
