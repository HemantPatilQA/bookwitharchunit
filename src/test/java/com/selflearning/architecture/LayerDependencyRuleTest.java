package com.selflearning.architecture;

import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class LayerDependencyRuleTest extends ArchTestHelper{

    @Test
    void controllers_should_only_be_dependent_on_services(){
        classes()
                .that()
                .resideInAPackage(ArchTestConstants.CONTROLLER_PACKAGE)
                .should()
                .onlyHaveDependentClassesThat()
                .resideInAnyPackage(ArchTestConstants.SERVICE_PACKAGE)
                .check(importedClasses);
    }
}
