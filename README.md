# istio-client

istio-client是继承了 `fabric8-kubernetes-client` 的SDK包,包含对istio最基本的四种资源对象(Virtualservice,DestinationRule,Gateway,ServiceEntry)的链式拼装,暴露fabric一致的操作方法.

---
### 直接使用
如果不需要其他包装,可以直接使用IstioClient进行资源操作,操作方法如下

1. 基本操作
```
final ConfigBuilder builder = new ConfigBuilder();
builder.withMasterUrl("https://localhost:6443")
        /*TODO 如果client上有server的证书，就不需要配置trustCert了*/
        .withTrustCerts(true)
        .withUsername("admin")
        .withPassword("admin");
PaasKubernetesClient paasKubernetesClient = new PaasKubernetesClient(builder.build())
VirtualService vs = kubernetesClient.istios().virtualServices().inNamespace("bookinfo").withName("productpage").get();
```

2. 对象拼装

```
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
                .setNumber(8080)
                .endPort()
                .endDestination()
                .withWeight(100)
                .endRoute()
                .addNewRoutes()
                .withWeight(90)
                .endRoute()
                .addNewMatch()
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
```

### 集成使用
如果需要集成集群操作,需要您自己完成以下操作
1. 继承KubernetesClient对象自定义自己的client端,并在其中引入您自定义的对象操作,并额外引入IstiosAPIGroupDSL对象集成istio的操作器
2. 实现定义的client接口,在构造器中定义以下内容,将操作适配器集成到客户端中
```
    super(build);
    IstioAPIGroupExtensionAdapter istioAPIGroupExtensionAdapter = new IstioAPIGroupExtensionAdapter();
    Adapters.register(istioAPIGroupExtensionAdapter);
```
3. 对外提供您定义的客户端方法即可.



