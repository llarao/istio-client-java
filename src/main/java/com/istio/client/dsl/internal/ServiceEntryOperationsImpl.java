package com.istio.client.dsl.internal;

import com.istio.model.serviceentry.DoneableServiceEntry;
import com.istio.model.serviceentry.ServiceEntryList;
import com.istio.model.serviceentry.ServiceEntry;
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
public class ServiceEntryOperationsImpl extends HasMetadataOperation<ServiceEntry, ServiceEntryList, DoneableServiceEntry, Resource<ServiceEntry, DoneableServiceEntry>> {
    public ServiceEntryOperationsImpl(OkHttpClient client, Config config) {
        this(client, config, null);
    }

    public ServiceEntryOperationsImpl(OkHttpClient client, Config config, String namespace) {
        this(new OperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace));
    }

    public ServiceEntryOperationsImpl(OperationContext context) {
        super(context.withApiGroupName("networking.istio.io")
                .withApiGroupVersion("v1alpha3")
                .withPlural("serviceentries"));
        this.type = ServiceEntry.class;
        this.listType = ServiceEntryList.class;
        this.doneableType = DoneableServiceEntry.class;
    }

    @Override
    public ServiceEntry replace(ServiceEntry item) {
        if (isCascading()) {
            return cascading(false).replace(item);
        }
        return super.replace(item);
    }

    @Override
    public ServiceEntryOperationsImpl newInstance(OperationContext context) {
        return new ServiceEntryOperationsImpl(context);
    }

}
