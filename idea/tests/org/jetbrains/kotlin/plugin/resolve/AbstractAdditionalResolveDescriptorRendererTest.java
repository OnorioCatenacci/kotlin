/*
 * Copyright 2010-2015 JetBrains s.r.o.
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

package org.jetbrains.kotlin.plugin.resolve;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.psi.JetClassInitializer;
import org.jetbrains.kotlin.psi.JetDeclaration;
import org.jetbrains.kotlin.psi.JetPsiUtil;
import org.jetbrains.kotlin.resolve.BindingContext;
import org.jetbrains.kotlin.resolve.lazy.ResolveSession;
import org.jetbrains.jet.plugin.project.ResolveElementCache;
import org.jetbrains.kotlin.renderer.AbstractDescriptorRendererTest;

public abstract class AbstractAdditionalResolveDescriptorRendererTest extends AbstractDescriptorRendererTest {
    @NotNull
    @Override
    protected DeclarationDescriptor getDescriptor(@NotNull JetDeclaration declaration, @NotNull ResolveSession resolveSession) {
        if (declaration instanceof JetClassInitializer || JetPsiUtil.isLocal(declaration)) {
            ResolveElementCache resolveElementCache = new ResolveElementCache(resolveSession, getProject());
            //noinspection ConstantConditions
            return resolveElementCache.resolveToElement(declaration).get(BindingContext.DECLARATION_TO_DESCRIPTOR, declaration);
        }
        return resolveSession.resolveToDescriptor(declaration);
    }
}