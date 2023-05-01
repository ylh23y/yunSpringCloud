/*
 * Copyright (c) 2020 yun4cloud Authors. All Rights Reserved.
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

package com.yun4cloud.yun.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * @author lengleng
 * @date 2018年06月22日16:22:03 403 授权拒绝
 */
@NoArgsConstructor
public class YunDeniedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public YunDeniedException(String message) {
		super(message);
	}

	public YunDeniedException(Throwable cause) {
		super(cause);
	}

	public YunDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public YunDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
