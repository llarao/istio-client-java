package com.istio.client.dsl.internal;

import com.istio.model.virtualservice.DoneableVirtualService;
import com.istio.model.virtualservice.VirtualService;
import com.istio.model.virtualservice.VirtualServiceList;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.base.HasMetadataOperation;
import io.fabric8.kubernetes.client.dsl.base.OperationContext;
import okhttp3.OkHttpClient;

/**
 * @Classname VirtualServiceOperationsImpl
 * @Description TODO
 * @Date 2020/10/17 0017 10:12
 * @Create by llarao
 */
public class VirtualServiceOperationsImpl extends HasMetadataOperation<VirtualService, VirtualServiceList, DoneableVirtualService, Resource<VirtualService, DoneableVirtualService>> {
    public VirtualServiceOperationsImpl(OkHttpClient client, Config config) {
        this(client, config, null);
    }

    public VirtualServiceOperationsImpl(OkHttpClient client, Config config, String namespace) {
        this(new OperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace));
    }

    public VirtualServiceOperationsImpl(OperationContext context) {
        super(context.withApiGroupName("networking.istio.io")
                .withApiGroupVersion("v1alpha3")
                .withPlural("virtualservices"));
        this.type = VirtualService.class;
        this.listType = VirtualServiceList.class;
        this.doneableType = DoneableVirtualService.class;
    }
    @Override
    public VirtualService replace(VirtualService item) {
        if (isCascading()) {
            return cascading(false).replace(item);
        }
        return super.replace(item);
    }

    @Override
    public VirtualServiceOperationsImpl newInstance(OperationContext context) {
        return new VirtualServiceOperationsImpl(context);
    }

}
