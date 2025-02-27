/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Component for communicating with MQTT M2M message brokers using Eclipse Paho
 * MQTT Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PahoEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Paho component.
     */
    public interface PahoEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedPahoEndpointConsumerBuilder advanced() {
            return (AdvancedPahoEndpointConsumerBuilder) this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder autoReconnect(boolean autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder autoReconnect(String autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * The URL of the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder brokerUrl(String brokerUrl) {
            doSetProperty("brokerUrl", brokerUrl);
            return this;
        }
        /**
         * MQTT client identifier.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client connection options.
         * 
         * The option is a:
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder connectOptions(Object connectOptions) {
            doSetProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Client connection options.
         * 
         * The option will be converted to a
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder connectOptions(String connectOptions) {
            doSetProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Base directory used by file persistence. Will by default use user
         * directory.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder filePersistenceDirectory(
                String filePersistenceDirectory) {
            doSetProperty("filePersistenceDirectory", filePersistenceDirectory);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * 
         * The option is a:
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder persistence(
                PahoPersistence persistence) {
            doSetProperty("persistence", persistence);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder persistence(String persistence) {
            doSetProperty("persistence", persistence);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder qos(int qos) {
            doSetProperty("qos", qos);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder qos(String qos) {
            doSetProperty("qos", qos);
            return this;
        }
        /**
         * Retain option.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder retained(boolean retained) {
            doSetProperty("retained", retained);
            return this;
        }
        /**
         * Retain option.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointConsumerBuilder retained(String retained) {
            doSetProperty("retained", retained);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default PahoEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default PahoEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Password to be used for authentication against the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PahoEndpointConsumerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username to be used for authentication against the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PahoEndpointConsumerBuilder userName(String userName) {
            doSetProperty("userName", userName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Paho component.
     */
    public interface AdvancedPahoEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default PahoEndpointConsumerBuilder basic() {
            return (PahoEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedPahoEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedPahoEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedPahoEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedPahoEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointConsumerBuilder resolveMqttConnectOptions(
                boolean resolveMqttConnectOptions) {
            doSetProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointConsumerBuilder resolveMqttConnectOptions(
                String resolveMqttConnectOptions) {
            doSetProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Paho component.
     */
    public interface PahoEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedPahoEndpointProducerBuilder advanced() {
            return (AdvancedPahoEndpointProducerBuilder) this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder autoReconnect(boolean autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder autoReconnect(String autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * The URL of the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder brokerUrl(String brokerUrl) {
            doSetProperty("brokerUrl", brokerUrl);
            return this;
        }
        /**
         * MQTT client identifier.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client connection options.
         * 
         * The option is a:
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder connectOptions(Object connectOptions) {
            doSetProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Client connection options.
         * 
         * The option will be converted to a
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder connectOptions(String connectOptions) {
            doSetProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Base directory used by file persistence. Will by default use user
         * directory.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder filePersistenceDirectory(
                String filePersistenceDirectory) {
            doSetProperty("filePersistenceDirectory", filePersistenceDirectory);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * 
         * The option is a:
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder persistence(
                PahoPersistence persistence) {
            doSetProperty("persistence", persistence);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder persistence(String persistence) {
            doSetProperty("persistence", persistence);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder qos(int qos) {
            doSetProperty("qos", qos);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder qos(String qos) {
            doSetProperty("qos", qos);
            return this;
        }
        /**
         * Retain option.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder retained(boolean retained) {
            doSetProperty("retained", retained);
            return this;
        }
        /**
         * Retain option.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointProducerBuilder retained(String retained) {
            doSetProperty("retained", retained);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PahoEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default PahoEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Password to be used for authentication against the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PahoEndpointProducerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username to be used for authentication against the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PahoEndpointProducerBuilder userName(String userName) {
            doSetProperty("userName", userName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Paho component.
     */
    public interface AdvancedPahoEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default PahoEndpointProducerBuilder basic() {
            return (PahoEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointProducerBuilder resolveMqttConnectOptions(
                boolean resolveMqttConnectOptions) {
            doSetProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointProducerBuilder resolveMqttConnectOptions(
                String resolveMqttConnectOptions) {
            doSetProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Paho component.
     */
    public interface PahoEndpointBuilder
            extends
                PahoEndpointConsumerBuilder, PahoEndpointProducerBuilder {
        default AdvancedPahoEndpointBuilder advanced() {
            return (AdvancedPahoEndpointBuilder) this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder autoReconnect(boolean autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder autoReconnect(String autoReconnect) {
            doSetProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * The URL of the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder brokerUrl(String brokerUrl) {
            doSetProperty("brokerUrl", brokerUrl);
            return this;
        }
        /**
         * MQTT client identifier.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client connection options.
         * 
         * The option is a:
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder connectOptions(Object connectOptions) {
            doSetProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Client connection options.
         * 
         * The option will be converted to a
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder connectOptions(String connectOptions) {
            doSetProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Base directory used by file persistence. Will by default use user
         * directory.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder filePersistenceDirectory(
                String filePersistenceDirectory) {
            doSetProperty("filePersistenceDirectory", filePersistenceDirectory);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * 
         * The option is a:
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder persistence(PahoPersistence persistence) {
            doSetProperty("persistence", persistence);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder persistence(String persistence) {
            doSetProperty("persistence", persistence);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder qos(int qos) {
            doSetProperty("qos", qos);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder qos(String qos) {
            doSetProperty("qos", qos);
            return this;
        }
        /**
         * Retain option.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder retained(boolean retained) {
            doSetProperty("retained", retained);
            return this;
        }
        /**
         * Retain option.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default PahoEndpointBuilder retained(String retained) {
            doSetProperty("retained", retained);
            return this;
        }
        /**
         * Password to be used for authentication against the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PahoEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Username to be used for authentication against the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default PahoEndpointBuilder userName(String userName) {
            doSetProperty("userName", userName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Paho component.
     */
    public interface AdvancedPahoEndpointBuilder
            extends
                AdvancedPahoEndpointConsumerBuilder, AdvancedPahoEndpointProducerBuilder {
        default PahoEndpointBuilder basic() {
            return (PahoEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointBuilder resolveMqttConnectOptions(
                boolean resolveMqttConnectOptions) {
            doSetProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointBuilder resolveMqttConnectOptions(
                String resolveMqttConnectOptions) {
            doSetProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedPahoEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.paho.PahoPersistence</code> enum.
     */
    enum PahoPersistence {
        FILE,
        MEMORY;
    }
    /**
     * Paho (camel-paho)
     * Component for communicating with MQTT M2M message brokers using Eclipse
     * Paho MQTT Client.
     * 
     * Category: messaging,iot
     * Available as of version: 2.16
     * Maven coordinates: org.apache.camel:camel-paho
     * 
     * Syntax: <code>paho:topic</code>
     * 
     * Path parameter: topic (required)
     * Name of the topic
     */
    default PahoEndpointBuilder paho(String path) {
        class PahoEndpointBuilderImpl extends AbstractEndpointBuilder implements PahoEndpointBuilder, AdvancedPahoEndpointBuilder {
            public PahoEndpointBuilderImpl(String path) {
                super("paho", path);
            }
        }
        return new PahoEndpointBuilderImpl(path);
    }
}