package com.selflearning.architecture;

import com.selflearning.bookwitharchunit.entities.Book;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class InheritanceRuleTest extends ArchTestHelper{

    //Commented as current implementation do not have any interface inheritance to which these rules can be applied
    //Keeping them for understanding
    /*@Test
    void jobImplementedHaveDependentClass(){
        classes()
                .that()
                .implement(Job.class)
                .should()
                .onlyHaveDependentClassesThat()
                .resideInAnyPackage(ArchTestConstants.INHERITANCE_PACKAGE)
                .check(importedClasses);
    }

    @Test
    void classExtendWithDependentClass(){
        classes()
                .that()
                .areAssignableTo(AbstractStep.class)
                .should()
                .onlyHaveDependentClassesThat()
                .resideInAnyPackage(ArchTestConstants.INHERITANCE_PACKAGE)
                .check(importedClasses);
    }*/
}
