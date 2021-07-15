package com.istio.client.dsl.internal;

import com.istio.model.gateway.GatewayList;
import com.istio.model.gateway.DoneableGateway;
import com.istio.model.gateway.Gateway;
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
public class GatewayOperationsImpl extends HasMetadataOperation<Gateway, GatewayList, DoneableGateway, Resource<Gateway, DoneableGateway>> {
    public GatewayOperationsImpl(OkHttpClient client, Config config) {
        this(client, config, null);
    }

    public GatewayOperationsImpl(OkHttpClient client, Config config, String namespace) {
        this(new OperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace));
    }

    public GatewayOperationsImpl(OperationContext context) {
        super(context.withApiGroupName("networking.istio.io")
                .withApiGroupVersion("v1alpha3")
                .withPlural("gateways"));
        this.type = Gateway.class;
        this.listType = GatewayList.class;
        this.doneableType = DoneableGateway.class;
    }

    @Override
    public Gateway replace(Gateway item) {
        if (isCascading()) {
            return cascading(false).replace(item);
        }
        return super.replace(item);
    }

    @Override
    public GatewayOperationsImpl newInstance(OperationContext context) {
        return new GatewayOperationsImpl(context);
    }

}
