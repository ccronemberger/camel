package sample.camel;

import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class PulsarConfig {

    @Bean("appPulsarClient")
    public PulsarClient pulsarClient() throws PulsarClientException {
        Map<String, Object> map = new HashMap<>();
        //map.put("numListenerThreads", 10);

        return PulsarClient.builder()
                .serviceUrl("pulsar://gft-btb:6650")
                .listenerThreads(10)
                .loadConf(map)  // ClientConfigurationData
                .build();
    }
}
