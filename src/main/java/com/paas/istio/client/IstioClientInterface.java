package com.paas.istio.client;

import com.paas.istio.client.dsl.IstiosAPIGroupDSL;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

/**
 * @Classname PaasKubernetesClient
 * @Description TODO
 * @Date 2020/10/20 0020 18:38
 * @Create by llarao
 */
public interface IstioClientInterface extends KubernetesClient {

    IstiosAPIGroupDSL istios();
}
