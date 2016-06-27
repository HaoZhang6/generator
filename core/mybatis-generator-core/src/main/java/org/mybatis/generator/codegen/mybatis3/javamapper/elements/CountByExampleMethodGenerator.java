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
package org.mybatis.generator.codegen.mybatis3.javamapper.elements;

import java.util.Set;
import java.util.TreeSet;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * 
 * @author Jeff Butler
 * 
 */
public class CountByExampleMethodGenerator extends
        AbstractJavaMapperMethodGenerator {

    public CountByExampleMethodGenerator() {
        super();
    }

    @Override
    public void addInterfaceElements(Interface interfaze) {
        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType(
                introspectedTable.getExampleType());

        Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
        importedTypes.add(fqjt);

        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(FullyQualifiedJavaType.getIntInstance());
        method.setName(introspectedTable.getCountByExampleStatementId());
        method.addParameter(new Parameter(fqjt, "example")); //$NON-NLS-1$
        context.getCommentGenerator().addGeneralMethodComment(method,
                introspectedTable);

        addMapperAnnotations(interfaze, method);
        
        if (context.getPlugins().clientCountByExampleMethodGenerated(method,
                interfaze, introspectedTable)) {
            interfaze.addImportedTypes(importedTypes);
            interfaze.addMethod(method);
        }
    }

    @Override
    public void addClassElements(TopLevelClass topLevelClass) {
        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType(
                introspectedTable.getExampleType());

        Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
        importedTypes.add(fqjt);

        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(FullyQualifiedJavaType.getIntInstance());
        method.setName(introspectedTable.getCountByExampleStatementId());
        method.addParameter(new Parameter(fqjt, "example")); //$NON-NLS-1$
        
        method.addBodyLine("return getReadSqlSession().selectOne(namespace+\""+introspectedTable.getCountByExampleStatementId()+"\",example);");
        
        context.getCommentGenerator().addGeneralMethodComment(method,
                introspectedTable);

        addMapperAnnotations(topLevelClass, method);
        
        if (context.getPlugins().clientCountByExampleMethodGenerated(method,
        		topLevelClass, introspectedTable)) {
        	topLevelClass.addImportedTypes(importedTypes);
        	topLevelClass.addMethod(method);
        }
    }
    
    public void addMapperAnnotations(Interface interfaze, Method method) {
        return;
    }
    
    public void addMapperAnnotations(TopLevelClass topLevelClass, Method method) {
        return;
    }
    
}
