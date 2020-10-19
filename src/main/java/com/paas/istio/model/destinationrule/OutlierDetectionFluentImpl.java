package com.paas.istio.model.destinationrule;

import com.paas.istio.model.virtualservice.SpecHttp;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class OutlierDetectionFluentImpl<A extends OutlierDetectionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements OutlierDetectionFluent<A> {

    private Integer consecutiveErrors;
    private String interval;
    private String baseEjectionTime;
    private Integer maxEjectionPercent;
    private Integer minHealthPercent;

    public OutlierDetectionFluentImpl(){
    }
    public OutlierDetectionFluentImpl(OutlierDetection instance){
        this.withConsecutiveErrors(instance.getConsecutiveErrors());
        this.withInterval(instance.getInterval());
        this.withBaseEjectionTime(instance.getBaseEjectionTime());
        this.withMaxEjectionPercent(instance.getMaxEjectionPercent());
        this.withMinHealthPercent(instance.getMinHealthPercent());
    }

    @Override
    public A withConsecutiveErrors(Integer item) {
        this.consecutiveErrors = item;
        return (A) this;
    }

    @Override
    public Integer getConsecutiveErrors() {
        return this.consecutiveErrors;
    }

    @Override
    public A withInterval(String item) {
        this.interval = item;
        return (A) this;

    }

    @Override
    public String getInterval() {
        return this.interval;
    }

    @Override
    public A withBaseEjectionTime(String item) {
        this.baseEjectionTime = item;
        return (A) this;

    }

    @Override
    public String getBaseEjectionTime() {
        return this.baseEjectionTime;
    }

    @Override
    public A withMaxEjectionPercent(Integer item) {
        this.maxEjectionPercent = item;
        return (A) this;

    }

    @Override
    public Integer getMaxEjectionPercent() {
        return this.maxEjectionPercent;
    }

    @Override
    public A withMinHealthPercent(Integer item) {
        this.minHealthPercent = item;
        return (A) this;

    }

    @Override
    public Integer getMinHealthPercent() {
        return this.minHealthPercent;
    }
}
