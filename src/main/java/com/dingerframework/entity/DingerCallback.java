/*
 * Copyright ©2015-2020 Jaemon. All Rights Reserved.
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
package com.dingerframework.entity;

import com.dingerframework.exception.DingerException;

/**
 *  异常回调信息实体
 *
 * @author Jaemon
 * @since 1.0
 */
public class DingerCallback<T> {

    /**
     * 处理唯一id
     */
    private String dkid;
    /**
     * 检索关键字(方便日志查询)
     */
    private String keyword;
    /**
     * 通知信息
     */
    private T message;
    /**
     * 异常对象
     */
    private DingerException ex;

    public DingerCallback() {
    }

    public DingerCallback(String dkid, String keyword, T message, DingerException ex) {
        this.dkid = dkid;
        this.keyword = keyword;
        this.message = message;
        this.ex = ex;
    }

    public String getDkid() {
        return dkid;
    }

    public void setDkid(String dkid) {
        this.dkid = dkid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public DingerException getEx() {
        return ex;
    }

    public void setEx(DingerException ex) {
        this.ex = ex;
    }
}