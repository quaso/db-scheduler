/**
 * Copyright (C) Gustav Karlsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.kagkarlsson.scheduler.boot.config.startup;

import com.github.kagkarlsson.scheduler.Scheduler;
import org.springframework.beans.factory.InitializingBean;

public class ImmediateStart extends AbstractSchedulerStarter implements InitializingBean {
  public ImmediateStart(final Scheduler scheduler) {
    super(scheduler);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    doStart();
  }
}
