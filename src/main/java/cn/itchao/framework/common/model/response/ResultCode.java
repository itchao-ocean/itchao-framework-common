/**
 * Copyright (c) 2011-2030, author jinchao (370696614@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cn.itchao.framework.common.model.response;

/**
 * @author jinchao
 * @description TODO
 * @date 2019/12/11 15:52
 */
public interface ResultCode {

    /**
     * 操作是否成功,true为成功，false操作失败
     * @return
     */
    boolean success();

    /**
     * 操作代码
     * @return
     */
    int code();

    /**
     * 提示信息
     * @return
     */
    String message();
}
