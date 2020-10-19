package com.paas.istio.model.virtualservice;

/**
 * @Classname VirtualServiceSpecHttpRewriteFluent
 * @Description TODO
 * @Date 2020/10/20 0020 16:02
 * @Create by llarao
 */
public class SpecHttpRetriesFluentImpl<A extends SpecHttpRetriesFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SpecHttpRetriesFluent<A> {

    private String attempts;
    private String perTryTimeout;
    private String retryOn;

    public SpecHttpRetriesFluentImpl(){}

    public SpecHttpRetriesFluentImpl(SpecHttpRetries instence) {
        this.setAttempts(instence.getAttempts());
        this.setPerTryTimeout(instence.getPerTryTimeout());
        this.setRetryOn(this.getRetryOn());
    }

    @Override
    public String getAttempts() {
        return null;
    }

    @Override
    public A setAttempts(String item) {
        return null;
    }

    @Override
    public String getPerTryTimeout() {
        return null;
    }

    @Override
    public A setPerTryTimeout(String item) {
        return null;
    }

    @Override
    public String getRetryOn() {
        return null;
    }

    @Override
    public A setRetryOn(String item) {
        return null;
    }
}
