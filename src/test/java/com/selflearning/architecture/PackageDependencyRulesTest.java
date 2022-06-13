package com.selflearning.architecture;

import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class PackageDependencyRulesTest extends ArchTestHelper{

    //Commenting because this rule is not correctly implemented. Should be uncommented when correct implementation is understood and is ready
    /*@Test
    void services_should_only_be_dependent_on_other_services(){
        classes()
                .that()
                .resideInAPackage(ArchTestConstants.SERVICE_PACKAGE)
                .should()
                .onlyHaveDependentClassesThat()
                .resideInAnyPackage(ArchTestConstants.SERVICE_PACKAGE)
                .check(importedClasses);
    }*/
}
