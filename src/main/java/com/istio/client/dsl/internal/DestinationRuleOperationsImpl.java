package com.istio.client.dsl.internal;

import com.istio.model.destinationrule.DestinationRule;
import com.istio.model.destinationrule.DestinationRuleList;
import com.istio.model.destinationrule.DoneableDestinationRule;
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
public class DestinationRuleOperationsImpl extends HasMetadataOperation<DestinationRule, DestinationRuleList, DoneableDestinationRule, Resource<DestinationRule, DoneableDestinationRule>> {
    public DestinationRuleOperationsImpl(OkHttpClient client, Config config) {
        this(client, config, null);
    }

    public DestinationRuleOperationsImpl(OkHttpClient client, Config config, String namespace) {
        this(new OperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace));
    }

    public DestinationRuleOperationsImpl(OperationContext context) {
        super(context.withApiGroupName("networking.istio.io")
                .withApiGroupVersion("v1alpha3")
                .withPlural("destinationrules"));
        this.type = DestinationRule.class;
        this.listType = DestinationRuleList.class;
        this.doneableType = DoneableDestinationRule.class;
    }

    @Override
    public DestinationRule replace(DestinationRule item) {
        if (isCascading()) {
            return cascading(false).replace(item);
        }
        return super.replace(item);
    }

    @Override
    public DestinationRuleOperationsImpl newInstance(OperationContext context) {
        return new DestinationRuleOperationsImpl(context);
    }

}
