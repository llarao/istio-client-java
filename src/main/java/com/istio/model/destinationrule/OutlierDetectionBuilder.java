package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class OutlierDetectionBuilder extends OutlierDetectionFluentImpl<OutlierDetectionBuilder> implements VisitableBuilder<OutlierDetection, OutlierDetectionBuilder>{

    OutlierDetectionFluent<?> fluent;
    Boolean validationEnabled;

    public OutlierDetectionBuilder(){
            this(true);
    }
    public OutlierDetectionBuilder(Boolean validationEnabled){
        this(new OutlierDetection(), validationEnabled);
    }
    public OutlierDetectionBuilder(OutlierDetectionFluent<?> fluent){
            this(fluent, true);
    }
    public OutlierDetectionBuilder(OutlierDetectionFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new OutlierDetection(), validationEnabled);
    }
    public OutlierDetectionBuilder(OutlierDetectionFluent<?> fluent, OutlierDetection instance){
            this(fluent, instance, true);
    }
    public OutlierDetectionBuilder(OutlierDetectionFluent<?> fluent, OutlierDetection instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withConsecutiveErrors(instance.getConsecutiveErrors());
            fluent.withInterval(instance.getInterval());
            fluent.withBaseEjectionTime(instance.getBaseEjectionTime());
            fluent.withMaxEjectionPercent(instance.getMaxEjectionPercent());
            fluent.withMinHealthPercent(instance.getMinHealthPercent());
            this.validationEnabled = validationEnabled;
    }
    public OutlierDetectionBuilder(OutlierDetection instance){
            this(instance,true);
    }
    public OutlierDetectionBuilder(OutlierDetection instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withConsecutiveErrors(instance.getConsecutiveErrors());
            fluent.withInterval(instance.getInterval());
            fluent.withBaseEjectionTime(instance.getBaseEjectionTime());
            fluent.withMaxEjectionPercent(instance.getMaxEjectionPercent());
            fluent.withMinHealthPercent(instance.getMinHealthPercent());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public OutlierDetection build(){
        OutlierDetection buildable = new OutlierDetection(fluent.getConsecutiveErrors(),fluent.getInterval(),fluent.getBaseEjectionTime(),fluent.getMaxEjectionPercent(),fluent.getMinHealthPercent());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OutlierDetectionBuilder that = (OutlierDetectionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
