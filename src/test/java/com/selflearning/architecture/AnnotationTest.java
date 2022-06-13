package com.selflearning.architecture;

import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;

public class AnnotationTest extends ArchTestHelper{

    @Test
    void serviceClassesShouldHaveSpringServiceAnnotation(){
        ArchRuleDefinition.classes()
                .that()
                .resideInAPackage(ArchTestConstants.SERVICE_PACKAGE)
                .should()
                .beAnnotatedWith(Service.class)
                .check(importedClasses);
    }

    @Test
    void repoInterfaceShouldHaveSpringRepositoryAnnotation(){
        ArchRuleDefinition.classes()
                .that()
                .resideInAPackage(ArchTestConstants.REPOSITORY_PACKAGE)
                .should()
                .beAnnotatedWith(Repository.class)
                .check(importedClasses);
    }

    @Test
    void entityClassShouldHavePersistenceEntityAnnotation(){
        ArchRuleDefinition.classes()
                .that()
                .resideInAPackage(ArchTestConstants.ENTITY_PACKAGE)
                .should()
                .beAnnotatedWith(Entity.class)
                .check(importedClasses);
                /*.orShould()
                .beAnnotatedWith(MapperSuperclass.class)
                .check(importedClasses);*/
    }
}
