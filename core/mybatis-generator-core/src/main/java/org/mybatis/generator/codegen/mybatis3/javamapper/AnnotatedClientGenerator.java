/**
 *    Copyright 2006-2016 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.generator.codegen.mybatis3.javamapper;

import java.util.List;

import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.codegen.AbstractXmlGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.AbstractJavaMapperMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedCountByExampleMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedDeleteByExampleMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedDeleteByPrimaryKeyMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedInsertMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedInsertSelectiveMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedSelectByExampleWithBLOBsMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedSelectByExampleWithoutBLOBsMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedSelectByPrimaryKeyMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedUpdateByExampleSelectiveMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedUpdateByExampleWithBLOBsMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedUpdateByExampleWithoutBLOBsMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedUpdateByPrimaryKeySelectiveMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedUpdateByPrimaryKeyWithBLOBsMethodGenerator;
import org.mybatis.generator.codegen.mybatis3.javamapper.elements.annotated.AnnotatedUpdateByPrimaryKeyWithoutBLOBsMethodGenerator;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.util.StringUtility;

public class AnnotatedClientGenerator extends JavaMapperGenerator {

    public AnnotatedClientGenerator() {
        super(false);
    }

    @Override
    protected void addCountByExampleMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateCountByExample()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedCountByExampleMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addDeleteByExampleMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateDeleteByExample()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedDeleteByExampleMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addDeleteByPrimaryKeyMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateDeleteByPrimaryKey()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedDeleteByPrimaryKeyMethodGenerator(false);
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addInsertMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateInsert()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedInsertMethodGenerator(false);
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addInsertSelectiveMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateInsertSelective()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedInsertSelectiveMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addSelectByExampleWithBLOBsMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateSelectByExampleWithBLOBs()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedSelectByExampleWithBLOBsMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addSelectByExampleWithoutBLOBsMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateSelectByExampleWithoutBLOBs()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedSelectByExampleWithoutBLOBsMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addSelectByPrimaryKeyMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateSelectByPrimaryKey()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedSelectByPrimaryKeyMethodGenerator(false, false);
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addUpdateByExampleSelectiveMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateUpdateByExampleSelective()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedUpdateByExampleSelectiveMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addUpdateByExampleWithBLOBsMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateUpdateByExampleWithBLOBs()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedUpdateByExampleWithBLOBsMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addUpdateByExampleWithoutBLOBsMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateUpdateByExampleWithoutBLOBs()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedUpdateByExampleWithoutBLOBsMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addUpdateByPrimaryKeySelectiveMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateUpdateByPrimaryKeySelective()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedUpdateByPrimaryKeySelectiveMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addUpdateByPrimaryKeyWithBLOBsMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules().generateUpdateByPrimaryKeyWithBLOBs()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedUpdateByPrimaryKeyWithBLOBsMethodGenerator();
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    protected void addUpdateByPrimaryKeyWithoutBLOBsMethod(TopLevelClass topLevelClass) {
        if (introspectedTable.getRules()
                .generateUpdateByPrimaryKeyWithoutBLOBs()) {
            AbstractJavaMapperMethodGenerator methodGenerator = new AnnotatedUpdateByPrimaryKeyWithoutBLOBsMethodGenerator(false);
            initializeAndExecuteGenerator(methodGenerator, topLevelClass);
        }
    }

    @Override
    public List<CompilationUnit> getExtraCompilationUnits() {
    	boolean useLegacyBuilder = false;
    	
    	String prop = context.getJavaClientGeneratorConfiguration().getProperty(PropertyRegistry.CLIENT_USE_LEGACY_BUILDER);
    	if (StringUtility.stringHasValue(prop)) {
    		useLegacyBuilder = Boolean.valueOf(prop);
    	}
        SqlProviderGenerator sqlProviderGenerator = new SqlProviderGenerator(useLegacyBuilder);
        sqlProviderGenerator.setContext(context);
        sqlProviderGenerator.setIntrospectedTable(introspectedTable);
        sqlProviderGenerator.setProgressCallback(progressCallback);
        sqlProviderGenerator.setWarnings(warnings);
        return sqlProviderGenerator.getCompilationUnits();
    }

    @Override
    public AbstractXmlGenerator getMatchedXMLGenerator() {
        // No XML required by the annotated client
        return null;
    }
}
