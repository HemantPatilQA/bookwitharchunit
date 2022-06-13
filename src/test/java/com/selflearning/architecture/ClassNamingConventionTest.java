package com.selflearning.architecture;

import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ClassNamingConventionTest extends ArchTestHelper{

    @Test
    void constantClassesShouldBeNamedXConstants(){
        classes()
                .that()
                .resideInAPackage(ArchTestConstants.CONSTANT_PACKAGE)
                .should()
                .haveSimpleNameEndingWith(ArchTestConstants.CONSTANT)
                .allowEmptyShould(true)//Clause that allows the Test to pass if there are no Constant classes or constants Package itself
                .check(importedClasses);
    }

    @Test
    void serviceClassesShouldBeNamedXServiceOrXComponentOrXServiceImpl(){
        classes()
                .that()
                .resideInAPackage(ArchTestConstants.SERVICE_PACKAGE)
                .should()
                .haveSimpleNameEndingWith(ArchTestConstants.SERVICE)
                .allowEmptyShould(true)
                .check(importedClasses);
    }

    @Test
    void mapperClassesShouldBeNamedXMapper(){
        classes()
                .that()
                .resideInAPackage(ArchTestConstants.MAPPER_PACKAGE)
                .should()
                .haveSimpleNameEndingWith(ArchTestConstants.MAPPER)
                .allowEmptyShould(true)//Clause that allows the Test to pass if there are no Mapper classes or Mapper Package itself
                .check(importedClasses);
    }

    @Test
    void dtoClassesShouldBeNamedXDTO(){
        classes()
                .that()
                .resideInAPackage(ArchTestConstants.DTO_PACKAGE)
                .should()
                .haveSimpleNameEndingWith(ArchTestConstants.DTO)
                .allowEmptyShould(true)
                .check(importedClasses);
    }
}
