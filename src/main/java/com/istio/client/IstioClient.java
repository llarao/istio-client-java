package com.istio.client;

import com.istio.client.dsl.IstioAPIGroupExtensionAdapter;
import com.istio.client.dsl.IstiosAPIGroupClient;
import com.istio.client.dsl.IstiosAPIGroupDSL;
import io.fabric8.kubernetes.client.Adapters;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.ExtensionAdapter;

/**
 * @Classname PaasKubernetesClient
 * @Description TODO
 * @Date 2020/10/20 0020 18:38
 * @Create by llarao
 */
public class IstioClient extends DefaultKubernetesClient implements IstioClientInterface {
    public IstioClient(Config build) {
        super(build);
        IstioAPIGroupExtensionAdapter istioAPIGroupExtensionAdapter = new IstioAPIGroupExtensionAdapter();
        Adapters.register(istioAPIGroupExtensionAdapter);
    }

    @Override
    public IstiosAPIGroupDSL istios() {

        return adapt(IstiosAPIGroupClient.class);
    }

    public void bindExtensionAdapter(ExtensionAdapter adapter) {
        Adapters.register(adapter);
    }
}
