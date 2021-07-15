package com.istio.model.gateway;


import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

/**
 * @Classname DoneableGateway
 * @Description TODO
 * @Date 2020/10/17 0017 10:20
 * @Create by llarao
 */
public class DoneableGateway extends GatewayFluentImpl<DoneableGateway> implements Doneable<Gateway> {


    private final GatewayBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Gateway,Gateway> function;

    public DoneableGateway(io.fabric8.kubernetes.api.builder.Function<Gateway,Gateway> function){
        super();this.builder=new GatewayBuilder(this);this.function=function;
    }
    public DoneableGateway(Gateway item,io.fabric8.kubernetes.api.builder.Function<Gateway,Gateway> function){
        super(item);this.builder=new GatewayBuilder(this, item);this.function=function;
    }
    public DoneableGateway(Gateway item){
        super(item);this.builder=new GatewayBuilder(this, item);this.function=new Function<Gateway, Gateway>() {
            @Override
            public Gateway apply(Gateway item) {
                return item;
            }
        }
        ;
    }

    @Override
    public Gateway done(){
        return function.apply(builder.build());
    }

}
