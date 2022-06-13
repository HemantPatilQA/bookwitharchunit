package com.selflearning.architecture;

import com.tngtech.archunit.lang.CompositeArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.GeneralCodingRules.*;

public class CodingRuleTest extends ArchTestHelper{

    @Test
    void classes_should_not_access_standard_stream_defined_by_hand(){
        noClasses().should(ACCESS_STANDARD_STREAMS).check(importedClasses);
    }

    @Test
    void classes_should_not_access_standard_stream_from_library(){
        NO_CLASSES_SHOULD_ACCESS_STANDARD_STREAMS.check(importedClasses);
    }

    @Test
    void classes_should_not_throw_generic_exception(){
        NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS.check(importedClasses);
    }

    @Test
    void classes_should_not_use_java_util_logging(){
        NO_CLASSES_SHOULD_USE_JAVA_UTIL_LOGGING.check(importedClasses);
    }

    @Test
    void no_classes_should_access_standard_streams_or_throw_generic_exception(){
        CompositeArchRule.of(NO_CLASSES_SHOULD_ACCESS_STANDARD_STREAMS)
                .and(NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS)
                .check(importedClasses);
    }
}
