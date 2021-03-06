/*
 * Copyright ©2015-2021 Jaemon. All Rights Reserved.
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
package com.github.jaemon.dinger.core;

import com.github.jaemon.dinger.core.entity.DingerProperties;

import java.lang.reflect.Proxy;

/**
 * DingerSession
 *
 * @author Jaemon
 * @since 1.0
 */
public class DingerSession {
    private DingerRobot dingerRobot;
    private DingerProperties dingerProperties;

    public DingerSession(DingerRobot dingerRobot, DingerProperties dingerProperties) {
        this.dingerRobot = dingerRobot;
        this.dingerProperties = dingerProperties;
    }

    public <T> T getDinger(Class<T> type) {
        return (T) Proxy.newProxyInstance(
                // bugfix gitee#I29N15
                Thread.currentThread().getContextClassLoader(),
                new Class[]{type},
                new DingerHandleProxy(dingerRobot, dingerProperties)
        );
    }

}