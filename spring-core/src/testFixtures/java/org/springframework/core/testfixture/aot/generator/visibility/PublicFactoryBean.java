/*
 * Copyright 2002-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core.testfixture.aot.generator.visibility;

import org.springframework.core.ResolvableType;

public class PublicFactoryBean<T> {

	PublicFactoryBean(Class<T> type) {
	}

	public static PublicFactoryBean<ProtectedType> protectedTypeFactoryBean() {
		return new PublicFactoryBean<>(ProtectedType.class);
	}

	public static ResolvableType resolveToProtectedGenericParameter() {
		return ResolvableType.forClassWithGenerics(PublicFactoryBean.class, ProtectedType.class);
	}

}
