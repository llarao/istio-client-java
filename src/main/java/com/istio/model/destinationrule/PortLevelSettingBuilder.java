package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class PortLevelSettingBuilder extends PortLevelSettingFluentImpl<PortLevelSettingBuilder> implements VisitableBuilder<PortLevelSetting, PortLevelSettingBuilder>{

    PortLevelSettingFluent<?> fluent;
    Boolean validationEnabled;

    public PortLevelSettingBuilder(){
            this(true);
    }
    public PortLevelSettingBuilder(Boolean validationEnabled){
        this(new PortLevelSetting(), validationEnabled);
    }
    public PortLevelSettingBuilder(PortLevelSettingFluent<?> fluent){
            this(fluent, true);
    }
    public PortLevelSettingBuilder(PortLevelSettingFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new PortLevelSetting(), validationEnabled);
    }
    public PortLevelSettingBuilder(PortLevelSettingFluent<?> fluent, PortLevelSetting instance){
            this(fluent, instance, true);
    }
    public PortLevelSettingBuilder(PortLevelSettingFluent<?> fluent, PortLevelSetting instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withPort(instance.getPort());
            fluent.withConnectionPool(instance.getConnectionPool());
            this.validationEnabled = validationEnabled;
    }
    public PortLevelSettingBuilder(PortLevelSetting instance){
            this(instance,true);
    }
    public PortLevelSettingBuilder(PortLevelSetting instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withPort(instance.getPort());
            fluent.withConnectionPool(instance.getConnectionPool());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public PortLevelSetting build(){
        PortLevelSetting buildable = new PortLevelSetting(fluent.getPort(),fluent.getConnectionPool());
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
