/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.spring.boot.autoconfigure.properties.server;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static io.seata.common.DefaultValues.DEFAULT_ASYNC_COMMITTING_RETRY_PERIOD;
import static io.seata.common.DefaultValues.DEFAULT_COMMITING_RETRY_PERIOD;
import static io.seata.common.DefaultValues.DEFAULT_ROLLBACKING_RETRY_PERIOD;
import static io.seata.common.DefaultValues.DEFAULT_TIMEOUT_RETRY_PERIOD;
import static io.seata.spring.boot.autoconfigure.StarterConstants.SERVER_RECOVERY_PREFIX;

/**
 * @author spilledyear@outlook.com
 */
@Component
@ConfigurationProperties(prefix = SERVER_RECOVERY_PREFIX)
public class ServerRecoveryProperties {

    private int committingRetryPeriod = DEFAULT_COMMITING_RETRY_PERIOD;
    private int asyncCommittingRetryPeriod = DEFAULT_ASYNC_COMMITTING_RETRY_PERIOD;
    private int rollbackingRetryPeriod = DEFAULT_ROLLBACKING_RETRY_PERIOD;
    private int timeoutRetryPeriod = DEFAULT_TIMEOUT_RETRY_PERIOD;

    public int getCommittingRetryPeriod() {
        return committingRetryPeriod;
    }

    public ServerRecoveryProperties setCommittingRetryPeriod(int committingRetryPeriod) {
        this.committingRetryPeriod = committingRetryPeriod;
        return this;
    }

    public int getAsyncCommittingRetryPeriod() {
        return asyncCommittingRetryPeriod;
    }

    public ServerRecoveryProperties setAsyncCommittingRetryPeriod(int asyncCommittingRetryPeriod) {
        this.asyncCommittingRetryPeriod = asyncCommittingRetryPeriod;
        return this;
    }

    public int getRollbackingRetryPeriod() {
        return rollbackingRetryPeriod;
    }

    public ServerRecoveryProperties setRollbackingRetryPeriod(int rollbackingRetryPeriod) {
        this.rollbackingRetryPeriod = rollbackingRetryPeriod;
        return this;
    }

    public Integer getTimeoutRetryPeriod() {
        return timeoutRetryPeriod;
    }

    public ServerRecoveryProperties setTimeoutRetryPeriod(int timeoutRetryPeriod) {
        this.timeoutRetryPeriod = timeoutRetryPeriod;
        return this;
    }
}
