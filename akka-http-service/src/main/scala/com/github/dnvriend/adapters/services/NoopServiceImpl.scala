/*
 * Copyright 2016 Dennis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.dnvriend.adapters.services

import akka.NotUsed
import com.github.dnvriend.adapters.api.NoopService
import com.lightbend.lagom.scaladsl.api.ServiceCall

import scala.concurrent.Future

class NoopServiceImpl extends NoopService {
  override def noop: ServiceCall[NotUsed, NotUsed] = {
    ServiceCall(_ => Future.successful(NotUsed))
  }
}
