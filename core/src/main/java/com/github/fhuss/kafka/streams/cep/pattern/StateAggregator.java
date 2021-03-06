/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.fhuss.kafka.streams.cep.pattern;


/**
 *
 * @param <K>   the record key type.
 * @param <V>   the record value type.
 * @param <T>   the aggregate value type.
 */
public class StateAggregator<K, V, T> {

    private final String name;
    private final Aggregator<K, V, T> aggregate;

    /**
     * Creates a new {@link StateAggregator} instance.
     * @param name          the name of the state.
     * @param aggregate     the aggregate function.
     */
    StateAggregator(final String name, final Aggregator<K, V, T> aggregate) {
        this.name = name;
        this.aggregate = aggregate;
    }

    public String getName() {
        return name;
    }

    public Aggregator<K, V, T> getAggregate() {
        return aggregate;
    }
}
