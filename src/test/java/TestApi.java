import com.istio.client.IstioClient;
import com.istio.client.dsl.internal.VirtualServiceOperationsImpl;
import com.istio.model.destinationrule.DestinationRule;
import com.istio.model.destinationrule.DestinationRuleBuilder;
import com.istio.model.gateway.Gateway;
import com.istio.model.gateway.GatewayBuilder;
import com.istio.model.virtualservice.VirtualService;
import com.istio.model.virtualservice.VirtualServiceBuilder;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.utils.Serialization;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/10/20 0020 14:36
 * @Create by llarao
 */
public class TestApi {
    VirtualServiceOperationsImpl virtualServiceOperations;

    public IstioClient buildSimpleKubernetesClient() throws IOException {
        final ConfigBuilder builder = new ConfigBuilder();
        builder.withMasterUrl("https://localhost:6443")
                /*TODO 如果client上有server的证书，就不需要配置trustCert了*/
                .withTrustCerts(true)
                .withUsername("admin")
                .withPassword("admin");
        return new IstioClient(builder.build());

    }

    @Test
    public void test1() throws IOException {
        ConfigBuilder builder = new ConfigBuilder();
        builder.withMasterUrl("https://localhost:6443")
                /*TODO 如果client上有server的证书，就不需要配置trustCert了*/
                .withTrustCerts(true)
                .withUsername("admin")
                .withPassword("admin");
        IstioClient istioClient = new IstioClient(builder.build());
        List<VirtualService> bookinfo = istioClient.istios().virtualServices().inNamespace("bookinfo").list().getItems();
        for (VirtualService virtualService : bookinfo) {
            System.out.println(virtualService);
        }
        VirtualService virtualService = istioClient.istios().virtualServices().inNamespace("bookinfo").withName("aaxaxaxax").get();
        System.out.println(virtualService);
    }

    @Test
    public void test2() throws IOException {


        VirtualService a = new VirtualServiceBuilder()
                .withNewMetadata()
                .withName("bookinfo-vs")
                .withNamespace("bookinfo")
                .endMetadata()
                .withNewSpec()
                .addNewGateway("gateway")
                .addNewHost("test-host")
                .addNewHttps()
                .addNewRoutes()
                    .withWeight(100)
                    .withNewDestination()
                    .withHost("testhost")
                    .withSubset("v1")
                    .withNewPort()
                    .withNumber(8080)
                    .endPort()
                    .endDestination()
                .endRoute()

                .addNewMatch()
                .withNewUri()
                .withExact("xxx").endUri()
                .withNewMethods()
                .withExact("xxxx")
                .endMethod()
                .addNewHeader("tom")
                .withExact("xxxxxxx")
                .endHeader()
                .addNewHeader("jak")
                .withExact("aaaaa")
                .endHeader()
                .endMatch()
                .endHttp()
                .endSpec()
                .build();

        IstioClient kubernetesClient =  buildSimpleKubernetesClient();
        kubernetesClient.istios().virtualServices().inNamespace("bookinfo").load(new ByteArrayInputStream(Serialization.asJson(a).getBytes())).createOrReplace();

        System.out.println(a);

    }

    @Test
    public void test3() {
        DestinationRule destinationRule = new DestinationRuleBuilder()
                .withNewSpec()
                .withHost("testhost")
                .withNewTrafficPolicy()
                .withNewConnectionPool()
                .withNewHttp()
                .withHttp1MaxPendingRequests(11111)
                .withHttp2MaxRequests(22222)
                .withIdleTimeout("id")
                .withMaxRequestsPerConnection(333)
                .withMaxRetries(444)
                .endHttp()
                .endConnectionPool()
                .withNewLoadBalancer()
                .withSimple("loadb")
                .endLoadBalancer()
                .withNewOutlierDetection()
                .withBaseEjectionTime("44")
                .withConsecutiveErrors(66)
                .withInterval("int")
                .withMaxEjectionPercent(333333333)
                .endOutlierDetection()
                .endTrafficPolicy()
                .addNewSubset()
                .addNewLabels("key", "values")
                .withName("namemmmmm")
                .withNewTrafficPolicy()
                .withNewConnectionPool()
                .withNewHttp()
                .withHttp1MaxPendingRequests(11111)
                .withHttp2MaxRequests(22222)
                .withIdleTimeout("id")
                .withMaxRequestsPerConnection(333)
                .withMaxRetries(444)
                .endHttp()
                .endConnectionPool()
                .withNewLoadBalancer()
                .withSimple("loadb")
                .endLoadBalancer()
                .withNewOutlierDetection()
                .withBaseEjectionTime("44")
                .withConsecutiveErrors(66)
                .withInterval("int")
                .withMaxEjectionPercent(333333333)
                .endOutlierDetection()
                .endTrafficPolicy()
                .endSubset()
                .endSpec().build();

        System.out.println(destinationRule);


    }


    @Test
    public void test4() {
        Gateway gateway = new GatewayBuilder()
                .withNewSpec()
                .addNewSelector("aaaaaa", "bbbbb")
                .addNewServer()
                .withDefaultEndpoint("default")
                .withHosts("xxxxx", "xxxxx")
                .withNewPort()
                .withName("xxxxx")
                .withNumber(11)
                .withProtocol("orrrr")
                .endPort()
                .withNewTls()
                .withCaCertificates("1111")
                .withCipherSuites("1111")
                .withCredentialName("xxxxx")
                .withHttpsRedirect(true)
                .withMinProtocolVersion("xxxxxx")
                .withMaxProtocolVersion("gggggg")
                .withMode("XXXXXXX")
                .withPrivateKey("xxxxxxxx")
                .endTls()
                .endServer()
                .endSpec()
                .build();

        System.out.println(gateway);

    }
}
