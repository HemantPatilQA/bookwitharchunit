package com.selflearning.architecture;

import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

public class InterfaceRuleTest extends ArchTestHelper{

    @Test
    void interfaceShouldNotEndWithInterfaceName(){
        noClasses()
                .that()
                .areInterfaces()
                .should()
                .haveNameMatching(".*" + INTERFCE)
                .check(importedClasses);
    }

    @Test
    void interfaceShouldNotWithSimpleClassNmeLikeInterface(){
        noClasses()
                .that()
                .areInterfaces()
                .should()
                .haveSimpleNameContaining(INTERFCE)
                .check(importedClasses);
    }
}
