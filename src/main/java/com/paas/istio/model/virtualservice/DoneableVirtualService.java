package com.paas.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

/**
 * @Classname DoneableVirtualService
 * @Description TODO
 * @Date 2020/10/17 0017 10:20
 * @Create by llarao
 */
public class DoneableVirtualService extends VirtualServiceFluentImpl<DoneableVirtualService> implements Doneable<VirtualService> {


    private final VirtualServiceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<VirtualService,VirtualService> function;

    public DoneableVirtualService(io.fabric8.kubernetes.api.builder.Function<VirtualService,VirtualService> function){
        super();this.builder=new VirtualServiceBuilder(this);this.function=function;
    }
    public DoneableVirtualService(VirtualService item,io.fabric8.kubernetes.api.builder.Function<VirtualService,VirtualService> function){
        super(item);this.builder=new VirtualServiceBuilder(this, item);this.function=function;
    }
    public DoneableVirtualService(VirtualService item){
        super(item);this.builder=new VirtualServiceBuilder(this, item);this.function=new Function<VirtualService, VirtualService>() {
            @Override
            public VirtualService apply(VirtualService item) {
                return item;
            }
        }
        ;
    }

    @Override
    public VirtualService done(){
        return function.apply(builder.build());
    }



}
