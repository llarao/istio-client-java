package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class SpecHttpBuilder extends SpecHttpFluentImpl<SpecHttpBuilder> implements VisitableBuilder<SpecHttp, SpecHttpBuilder>{

    SpecHttpFluent<?> fluent;
    Boolean validationEnabled;

    public SpecHttpBuilder(){
            this(true);
    }
    public SpecHttpBuilder(Boolean validationEnabled){
        this(new SpecHttp(), validationEnabled);
    }
    public SpecHttpBuilder(SpecHttpFluent<?> fluent){
            this(fluent, true);
    }
    public SpecHttpBuilder(SpecHttpFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new SpecHttp(), validationEnabled);
    }
    public SpecHttpBuilder(SpecHttpFluent<?> fluent, SpecHttp instance){
            this(fluent, instance, true);
    }
    public SpecHttpBuilder(SpecHttpFluent<?> fluent, SpecHttp instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withRoutes(instance.getRoute());
            fluent.withMatchs(instance.getMatch());
            fluent.withRewrite(instance.getRewrite());
            fluent.withRetries(instance.getRetries());
            fluent.withMirror(instance.getMirror());
            this.validationEnabled = validationEnabled;
    }
    public SpecHttpBuilder(SpecHttp instance){
            this(instance,true);
    }
    public SpecHttpBuilder(SpecHttp instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withRoutes(instance.getRoute());
            fluent.withMatchs(instance.getMatch());
            fluent.withRewrite(instance.getRewrite());
            fluent.withRetries(instance.getRetries());
            fluent.withMirror(instance.getMirror());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public SpecHttp build(){
        SpecHttp buildable = new SpecHttp(fluent.getRoutes(), fluent.getMatchs(), fluent.getRewrite(), fluent.getRetries(), fluent.getMirror());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SpecHttpBuilder that = (SpecHttpBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
