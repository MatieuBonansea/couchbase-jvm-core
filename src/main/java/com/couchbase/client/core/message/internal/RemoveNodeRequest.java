/*
 * Copyright (c) 2016 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.couchbase.client.core.message.internal;

import com.couchbase.client.core.message.AbstractCouchbaseRequest;
import com.couchbase.client.core.utils.NetworkAddress;

public class RemoveNodeRequest extends AbstractCouchbaseRequest implements InternalRequest {

    private final NetworkAddress hostname;

    public RemoveNodeRequest(final NetworkAddress hostname) {
        super(null, null);
        this.hostname = hostname;
    }

    public NetworkAddress hostname() {
        return hostname;
    }
}
