package hello.advanced;

import hello.advanced.config.AppV1Config;
import hello.advanced.config.AppV2Config;
import hello.advanced.config.v1_proxy.ConcreteProxyConfig;
import hello.advanced.config.v1_proxy.InterfaceProxyConfig;
import hello.advanced.config.v2_dynamicproxy.DynamicProxyBasicConfig;
import hello.advanced.config.v2_dynamicproxy.DynamicProxyFilterConfig;
import hello.advanced.config.v3_proxyfactory.ProxyFactoryConfigV1;
import hello.advanced.config.v3_proxyfactory.ProxyFactoryConfigV2;
import hello.advanced.config.v4_postprocessor.BeanPostProcessorConfig;
import hello.advanced.config.v5_autoproxy.AutoProxyConfig;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//@Import(AppV1Config.class)
//@Import({AppV1Config.class, AppV2Config.class})
//@Import({InterfaceProxyConfig.class})
//@Import({ConcreteProxyConfig.class})
//@Import({DynamicProxyBasicConfig.class})
//@Import({DynamicProxyFilterConfig.class})
//@Import({ProxyFactoryConfigV1.class})
//@Import({ProxyFactoryConfigV2.class})
//@Import({BeanPostProcessorConfig.class})
@Import({AutoProxyConfig.class})
@SpringBootApplication(scanBasePackages = "hello.advanced.app")
public class AdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedApplication.class, args);
	}

	@Bean
	public LogTrace logTrace() {
		return new ThreadLocalLogTrace();
	}

}
