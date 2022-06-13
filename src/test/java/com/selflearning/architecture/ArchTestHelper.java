package com.selflearning.architecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"arch-tests"})
public class ArchTestHelper extends ArchTestConstants{
    public final JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages(IMPORT_PACKAGE);
}
