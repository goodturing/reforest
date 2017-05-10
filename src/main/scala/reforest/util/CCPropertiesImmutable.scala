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

package reforest.util


class CCPropertiesImmutable(val loader: CCProperties,
                            val appName: String,
                            val dataset: String,
                            val outputFile: String,
                            val jarPath: String,
                            val sparkMaster: String,
                            val sparkPartition: Int,
                            val sparkExecutorMemory: String,
                            val sparkBlockManagerSlaveTimeoutMs: String,
                            val sparkCoresMax: Int,
                            val sparkShuffleManager: String,
                            val sparkCompressionCodec: String,
                            val sparkShuffleConsolidateFiles: String,
                            val sparkAkkaFrameSize: String,
                            val sparkDriverMaxResultSize: String,
                            val sparkExecutorInstances: Int,
                            val separator: String,
                            val instrumented: Boolean) extends Serializable {

  val util = new CCUtil(this)
  val uuid = java.util.UUID.randomUUID.toString

}