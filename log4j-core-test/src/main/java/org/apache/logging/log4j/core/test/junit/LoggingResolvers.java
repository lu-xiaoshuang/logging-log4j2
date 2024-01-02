/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
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
package org.apache.logging.log4j.core.test.junit;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Annotates a test annotation to include {@link org.junit.jupiter.api.extension.ParameterResolver} extensions for
 * {@link org.apache.logging.log4j.core.LoggerContext}, {@link org.apache.logging.log4j.core.config.Configuration},
 * {@link org.apache.logging.log4j.core.Appender}, {@link org.apache.logging.log4j.core.appender.AbstractManager},
 * and {@link org.apache.logging.log4j.core.Logger}.
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Log4jTest
@ExtendWith(LoggerContextResolver.class)
@ExtendWith(ConfigurationResolver.class)
@ExtendWith(AppenderResolver.class)
@ExtendWith(AppenderManagerResolver.class)
@ExtendWith(LoggerResolver.class)
public @interface LoggingResolvers {}
