package com.istio.model.destinationrule;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class PortSettingFluentImpl<A extends PortSettingFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PortSettingFluent<A> {

    private Integer number;

    public PortSettingFluentImpl(){
    }
    public PortSettingFluentImpl(PortSetting instance){
        this.withNumber(instance.getNumber());
    }

    @Override
    public A withNumber(Integer number) {
        return null;
    }

    @Override
    public Integer getNumber() {
        return null;
    }
}
