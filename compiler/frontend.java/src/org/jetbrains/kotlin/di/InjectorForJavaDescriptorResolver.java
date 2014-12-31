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

package org.jetbrains.kotlin.di;

import com.intellij.openapi.project.Project;
import org.jetbrains.kotlin.resolve.BindingTrace;
import org.jetbrains.kotlin.context.GlobalContextImpl;
import org.jetbrains.kotlin.storage.LockBasedStorageManager;
import org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl;
import org.jetbrains.kotlin.resolve.jvm.JavaDescriptorResolver;
import org.jetbrains.kotlin.load.java.JavaClassFinderImpl;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.kotlin.load.java.components.TraceBasedExternalSignatureResolver;
import org.jetbrains.kotlin.load.java.components.TraceBasedJavaResolverCache;
import org.jetbrains.kotlin.load.java.components.TraceBasedErrorReporter;
import org.jetbrains.kotlin.load.java.components.PsiBasedMethodSignatureChecker;
import org.jetbrains.kotlin.load.java.components.PsiBasedExternalAnnotationResolver;
import org.jetbrains.kotlin.load.java.structure.impl.JavaPropertyInitializerEvaluatorImpl;
import org.jetbrains.kotlin.load.java.sam.SamConversionResolverImpl;
import org.jetbrains.kotlin.load.java.components.JavaSourceElementFactoryImpl;
import org.jetbrains.kotlin.load.java.lazy.SingleModuleClassResolver;
import org.jetbrains.kotlin.resolve.jvm.JavaDescriptorResolverPostConstruct;
import org.jetbrains.kotlin.load.kotlin.VirtualFileFinder;
import org.jetbrains.kotlin.load.java.lazy.LazyJavaPackageFragmentProvider;
import org.jetbrains.kotlin.load.java.lazy.GlobalJavaResolverContext;
import org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver;
import org.jetbrains.kotlin.load.kotlin.DeserializationComponentsForJava;
import org.jetbrains.kotlin.load.kotlin.JavaClassDataFinder;
import org.jetbrains.kotlin.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.kotlin.generators.injectors.InjectorsPackage. DO NOT EDIT! */
@SuppressWarnings("all")
public class InjectorForJavaDescriptorResolver {

    private final Project project;
    private final BindingTrace bindingTrace;
    private final GlobalContextImpl globalContext;
    private final LockBasedStorageManager lockBasedStorageManager;
    private final ModuleDescriptorImpl module;
    private final JavaDescriptorResolver javaDescriptorResolver;
    private final JavaClassFinderImpl javaClassFinder;
    private final GlobalSearchScope globalSearchScope;
    private final TraceBasedExternalSignatureResolver traceBasedExternalSignatureResolver;
    private final TraceBasedJavaResolverCache traceBasedJavaResolverCache;
    private final TraceBasedErrorReporter traceBasedErrorReporter;
    private final PsiBasedMethodSignatureChecker psiBasedMethodSignatureChecker;
    private final PsiBasedExternalAnnotationResolver psiBasedExternalAnnotationResolver;
    private final JavaPropertyInitializerEvaluatorImpl javaPropertyInitializerEvaluator;
    private final SamConversionResolverImpl samConversionResolver;
    private final JavaSourceElementFactoryImpl javaSourceElementFactory;
    private final SingleModuleClassResolver singleModuleClassResolver;
    private final JavaDescriptorResolverPostConstruct javaDescriptorResolverPostConstruct;
    private final VirtualFileFinder virtualFileFinder;
    private final LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider;
    private final GlobalJavaResolverContext globalJavaResolverContext;
    private final DeserializedDescriptorResolver deserializedDescriptorResolver;
    private final DeserializationComponentsForJava deserializationComponentsForJava;
    private final JavaClassDataFinder javaClassDataFinder;
    private final BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoader;

    public InjectorForJavaDescriptorResolver(
        @NotNull Project project,
        @NotNull BindingTrace bindingTrace
    ) {
        this.project = project;
        this.bindingTrace = bindingTrace;
        this.globalContext = org.jetbrains.kotlin.context.ContextPackage.GlobalContext();
        this.lockBasedStorageManager = globalContext.getStorageManager();
        this.module = org.jetbrains.kotlin.resolve.jvm.TopDownAnalyzerFacadeForJVM.createJavaModule("<fake-jdr-module>");
        this.javaClassFinder = new JavaClassFinderImpl();
        this.virtualFileFinder = org.jetbrains.kotlin.load.kotlin.VirtualFileFinder.SERVICE.getInstance(project);
        this.traceBasedErrorReporter = new TraceBasedErrorReporter();
        this.deserializedDescriptorResolver = new DeserializedDescriptorResolver(traceBasedErrorReporter);
        this.psiBasedExternalAnnotationResolver = new PsiBasedExternalAnnotationResolver();
        this.traceBasedExternalSignatureResolver = new TraceBasedExternalSignatureResolver();
        this.psiBasedMethodSignatureChecker = new PsiBasedMethodSignatureChecker();
        this.traceBasedJavaResolverCache = new TraceBasedJavaResolverCache();
        this.javaPropertyInitializerEvaluator = new JavaPropertyInitializerEvaluatorImpl();
        this.samConversionResolver = SamConversionResolverImpl.INSTANCE$;
        this.javaSourceElementFactory = new JavaSourceElementFactoryImpl();
        this.singleModuleClassResolver = new SingleModuleClassResolver();
        this.globalJavaResolverContext = new GlobalJavaResolverContext(lockBasedStorageManager, getJavaClassFinder(), virtualFileFinder, deserializedDescriptorResolver, psiBasedExternalAnnotationResolver, traceBasedExternalSignatureResolver, traceBasedErrorReporter, psiBasedMethodSignatureChecker, traceBasedJavaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, singleModuleClassResolver);
        this.lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(globalJavaResolverContext, getModule());
        this.javaDescriptorResolver = new JavaDescriptorResolver(lazyJavaPackageFragmentProvider, getModule());
        this.globalSearchScope = com.intellij.psi.search.GlobalSearchScope.allScope(project);
        this.javaDescriptorResolverPostConstruct = new JavaDescriptorResolverPostConstruct();
        this.javaClassDataFinder = new JavaClassDataFinder(virtualFileFinder, deserializedDescriptorResolver);
        this.binaryClassAnnotationAndConstantLoader = new BinaryClassAnnotationAndConstantLoaderImpl(getModule(), lockBasedStorageManager, virtualFileFinder, traceBasedErrorReporter);
        this.deserializationComponentsForJava = new DeserializationComponentsForJava(lockBasedStorageManager, getModule(), javaClassDataFinder, binaryClassAnnotationAndConstantLoader, lazyJavaPackageFragmentProvider);

        this.javaClassFinder.setComponentPostConstruct(javaDescriptorResolverPostConstruct);
        this.javaClassFinder.setProject(project);
        this.javaClassFinder.setScope(globalSearchScope);

        traceBasedExternalSignatureResolver.setExternalAnnotationResolver(psiBasedExternalAnnotationResolver);
        traceBasedExternalSignatureResolver.setProject(project);
        traceBasedExternalSignatureResolver.setTrace(bindingTrace);

        traceBasedJavaResolverCache.setTrace(bindingTrace);

        traceBasedErrorReporter.setTrace(bindingTrace);

        psiBasedMethodSignatureChecker.setExternalAnnotationResolver(psiBasedExternalAnnotationResolver);
        psiBasedMethodSignatureChecker.setExternalSignatureResolver(traceBasedExternalSignatureResolver);

        singleModuleClassResolver.setResolver(javaDescriptorResolver);

        javaDescriptorResolverPostConstruct.setModule(module);
        javaDescriptorResolverPostConstruct.setProject(project);
        javaDescriptorResolverPostConstruct.setTrace(bindingTrace);

        deserializedDescriptorResolver.setComponents(deserializationComponentsForJava);

        javaClassFinder.initialize();

        javaDescriptorResolverPostConstruct.postCreate();

    }

    @PreDestroy
    public void destroy() {
    }

    public GlobalContextImpl getGlobalContext() {
        return this.globalContext;
    }

    public ModuleDescriptorImpl getModule() {
        return this.module;
    }

    public JavaDescriptorResolver getJavaDescriptorResolver() {
        return this.javaDescriptorResolver;
    }

    public JavaClassFinderImpl getJavaClassFinder() {
        return this.javaClassFinder;
    }

}