/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslFactory
 * @model kind="package"
 * @generated
 */
public interface RslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.rsl.rslingo/Rsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RslPackage eINSTANCE = rslingo.rsl.rsl.impl.RslPackageImpl.init();

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ModelImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.PackageAbstractImpl <em>Package Abstract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.PackageAbstractImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageAbstract()
   * @generated
   */
  int PACKAGE_ABSTRACT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_ABSTRACT__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_ABSTRACT__IMPORTS = 1;

  /**
   * The number of structural features of the '<em>Package Abstract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_ABSTRACT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ImportImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.DateImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getDate()
   * @generated
   */
  int DATE = 3;

  /**
   * The feature id for the '<em><b>Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__DAY = 0;

  /**
   * The feature id for the '<em><b>Month</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__MONTH = 1;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__YEAR = 2;

  /**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.MonthImpl <em>Month</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.MonthImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getMonth()
   * @generated
   */
  int MONTH = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH__NAME = 0;

  /**
   * The number of structural features of the '<em>Month</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ProgressImpl <em>Progress</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ProgressImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getProgress()
   * @generated
   */
  int PROGRESS = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRESS__VALUE = 0;

  /**
   * The number of structural features of the '<em>Progress</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRESS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.PriorityImpl <em>Priority</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.PriorityImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Priority</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.PackageProjectImpl <em>Package Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.PackageProjectImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageProject()
   * @generated
   */
  int PACKAGE_PROJECT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__NAME = PACKAGE_ABSTRACT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__IMPORTS = PACKAGE_ABSTRACT__IMPORTS;

  /**
   * The feature id for the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__PROJECT = PACKAGE_ABSTRACT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Package Glossaries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__PACKAGE_GLOSSARIES = PACKAGE_ABSTRACT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Package Stakeholders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS = PACKAGE_ABSTRACT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Package Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__PACKAGE_SYSTEMS = PACKAGE_ABSTRACT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>System Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT__SYSTEM_RELATIONS = PACKAGE_ABSTRACT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Package Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_PROJECT_FEATURE_COUNT = PACKAGE_ABSTRACT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.PackageGlossaryImpl <em>Package Glossary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.PackageGlossaryImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageGlossary()
   * @generated
   */
  int PACKAGE_GLOSSARY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GLOSSARY__NAME = PACKAGE_ABSTRACT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GLOSSARY__IMPORTS = PACKAGE_ABSTRACT__IMPORTS;

  /**
   * The feature id for the '<em><b>Glossary Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GLOSSARY__GLOSSARY_TERMS = PACKAGE_ABSTRACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Glossary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_GLOSSARY_FEATURE_COUNT = PACKAGE_ABSTRACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.PackageStakeholderImpl <em>Package Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.PackageStakeholderImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageStakeholder()
   * @generated
   */
  int PACKAGE_STAKEHOLDER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STAKEHOLDER__NAME = PACKAGE_ABSTRACT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STAKEHOLDER__IMPORTS = PACKAGE_ABSTRACT__IMPORTS;

  /**
   * The feature id for the '<em><b>Stakeholders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STAKEHOLDER__STAKEHOLDERS = PACKAGE_ABSTRACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Stakeholder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STAKEHOLDER_FEATURE_COUNT = PACKAGE_ABSTRACT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.PackageSystemImpl <em>Package System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.PackageSystemImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageSystem()
   * @generated
   */
  int PACKAGE_SYSTEM = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__NAME = PACKAGE_ABSTRACT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__IMPORTS = PACKAGE_ABSTRACT__IMPORTS;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__SYSTEM = PACKAGE_ABSTRACT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__ENTITIES = PACKAGE_ABSTRACT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Business Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__BUSINESS_ENTITIES = PACKAGE_ABSTRACT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__ACTORS = PACKAGE_ABSTRACT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__REQUIREMENTS = PACKAGE_ABSTRACT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>State Machine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__STATE_MACHINE = PACKAGE_ABSTRACT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Requirement Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__REQUIREMENT_RELATIONS = PACKAGE_ABSTRACT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>System Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM__SYSTEM_RELATIONS = PACKAGE_ABSTRACT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Package System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SYSTEM_FEATURE_COUNT = PACKAGE_ABSTRACT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ProjectImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Domain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DOMAIN = 3;

  /**
   * The feature id for the '<em><b>Planned</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PLANNED = 4;

  /**
   * The feature id for the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ACTUAL = 5;

  /**
   * The feature id for the '<em><b>Organizations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__ORGANIZATIONS = 6;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROGRESS = 7;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__SUMMARY = 8;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DESCRIPTION = 9;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.PlannedScheduleImpl <em>Planned Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.PlannedScheduleImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPlannedSchedule()
   * @generated
   */
  int PLANNED_SCHEDULE = 12;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_SCHEDULE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_SCHEDULE__END = 1;

  /**
   * The number of structural features of the '<em>Planned Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLANNED_SCHEDULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ActualScheduleImpl <em>Actual Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ActualScheduleImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getActualSchedule()
   * @generated
   */
  int ACTUAL_SCHEDULE = 13;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_SCHEDULE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_SCHEDULE__END = 1;

  /**
   * The number of structural features of the '<em>Actual Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_SCHEDULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.OrganizationsImpl <em>Organizations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.OrganizationsImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getOrganizations()
   * @generated
   */
  int ORGANIZATIONS = 14;

  /**
   * The feature id for the '<em><b>Customer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONS__CUSTOMER = 0;

  /**
   * The feature id for the '<em><b>Supplier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONS__SUPPLIER = 1;

  /**
   * The feature id for the '<em><b>Partners</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONS__PARTNERS = 2;

  /**
   * The number of structural features of the '<em>Organizations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATIONS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.GlossaryTermImpl <em>Glossary Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.GlossaryTermImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getGlossaryTerm()
   * @generated
   */
  int GLOSSARY_TERM = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__NAME_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__ACRONYM = 3;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__REF = 4;

  /**
   * The feature id for the '<em><b>Synonym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__SYNONYM = 5;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__SUPER = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM__DESCRIPTION = 7;

  /**
   * The number of structural features of the '<em>Glossary Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOSSARY_TERM_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.TermApplicationImpl <em>Term Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.TermApplicationImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getTermApplication()
   * @generated
   */
  int TERM_APPLICATION = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_APPLICATION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Term Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_APPLICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.RefTermApplicationImpl <em>Ref Term Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.RefTermApplicationImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefTermApplication()
   * @generated
   */
  int REF_TERM_APPLICATION = 17;

  /**
   * The feature id for the '<em><b>Refs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM_APPLICATION__REFS = 0;

  /**
   * The number of structural features of the '<em>Ref Term Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TERM_APPLICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.StakeholderImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStakeholder()
   * @generated
   */
  int STAKEHOLDER = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__NAME_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__CATEGORY = 3;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__SUPER = 4;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__PART_OF = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__DESCRIPTION = 6;

  /**
   * The number of structural features of the '<em>Stakeholder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.SystemImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SCOPE = 3;

  /**
   * The feature id for the '<em><b>Sub Systems</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SUB_SYSTEMS = 4;

  /**
   * The feature id for the '<em><b>Reusable Systems</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__REUSABLE_SYSTEMS = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__DESCRIPTION = 6;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.RefSystemImpl <em>Ref System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.RefSystemImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefSystem()
   * @generated
   */
  int REF_SYSTEM = 20;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SYSTEM__REFS = 0;

  /**
   * The number of structural features of the '<em>Ref System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_SYSTEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.SystemRelationImpl <em>System Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.SystemRelationImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemRelation()
   * @generated
   */
  int SYSTEM_RELATION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__SOURCE = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__TARGET = 3;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__CATEGORY = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>System Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_RELATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.EntityImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 4;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PRIMARY_KEY = 5;

  /**
   * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FOREIGN_KEYS = 6;

  /**
   * The feature id for the '<em><b>Checks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CHECKS = 7;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DESCRIPTION = 8;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.AttributeImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__SIZE = 2;

  /**
   * The feature id for the '<em><b>Subsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__SUBSIZE = 3;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME_ALIAS = 4;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MULTIPLICITY = 5;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DEFAULT_VALUE = 6;

  /**
   * The feature id for the '<em><b>Not Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NOT_NULL = 7;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UNIQUE = 8;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DESCRIPTION = 9;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.MultiplicityImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getMultiplicity()
   * @generated
   */
  int MULTIPLICITY = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Multiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.PrimaryKeyImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPrimaryKey()
   * @generated
   */
  int PRIMARY_KEY = 25;

  /**
   * The feature id for the '<em><b>Ref To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY__REF_TO = 0;

  /**
   * The number of structural features of the '<em>Primary Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ForeignKeyImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getForeignKey()
   * @generated
   */
  int FOREIGN_KEY = 26;

  /**
   * The feature id for the '<em><b>Fentity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__FENTITY = 0;

  /**
   * The feature id for the '<em><b>Ref To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__REF_TO = 1;

  /**
   * The number of structural features of the '<em>Foreign Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.RefAttributeImpl <em>Ref Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.RefAttributeImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefAttribute()
   * @generated
   */
  int REF_ATTRIBUTE = 27;

  /**
   * The feature id for the '<em><b>Ref Attr</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ATTRIBUTE__REF_ATTR = 0;

  /**
   * The number of structural features of the '<em>Ref Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.CheckImpl <em>Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.CheckImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getCheck()
   * @generated
   */
  int CHECK = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__NAME = 0;

  /**
   * The feature id for the '<em><b>Check Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__CHECK_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.BusinessEntityImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getBusinessEntity()
   * @generated
   */
  int BUSINESS_ENTITY = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_ENTITY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_ENTITY__NAME_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Master</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_ENTITY__MASTER = 3;

  /**
   * The feature id for the '<em><b>Detail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_ENTITY__DETAIL = 4;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_ENTITY__REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_ENTITY__DESCRIPTION = 6;

  /**
   * The number of structural features of the '<em>Business Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_ENTITY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.MasterBEntityImpl <em>Master BEntity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.MasterBEntityImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getMasterBEntity()
   * @generated
   */
  int MASTER_BENTITY = 30;

  /**
   * The feature id for the '<em><b>Master Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASTER_BENTITY__MASTER_ENTITY = 0;

  /**
   * The number of structural features of the '<em>Master BEntity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASTER_BENTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.DetailBEntityImpl <em>Detail BEntity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.DetailBEntityImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getDetailBEntity()
   * @generated
   */
  int DETAIL_BENTITY = 31;

  /**
   * The feature id for the '<em><b>Entity Detail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_BENTITY__ENTITY_DETAIL = 0;

  /**
   * The feature id for the '<em><b>Ref Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_BENTITY__REF_ENTITY = 1;

  /**
   * The number of structural features of the '<em>Detail BEntity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_BENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ReferenceBEntityImpl <em>Reference BEntity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ReferenceBEntityImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getReferenceBEntity()
   * @generated
   */
  int REFERENCE_BENTITY = 32;

  /**
   * The feature id for the '<em><b>Ref Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_BENTITY__REF_ENTITY = 0;

  /**
   * The number of structural features of the '<em>Reference BEntity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_BENTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.RefEntityImpl <em>Ref Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.RefEntityImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefEntity()
   * @generated
   */
  int REF_ENTITY = 33;

  /**
   * The feature id for the '<em><b>Ref Entity</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ENTITY__REF_ENTITY = 0;

  /**
   * The number of structural features of the '<em>Ref Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ENTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ActorImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__STAKEHOLDER = 3;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__SUPER = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.RequirementImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME_ALIAS = 1;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__STAKEHOLDER = 2;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__PRIORITY = 3;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__PROGRESS = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.RequirementRelationImpl <em>Requirement Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.RequirementRelationImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRequirementRelation()
   * @generated
   */
  int REQUIREMENT_RELATION = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__SOURCE = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__TARGET = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION__DESCRIPTION = 4;

  /**
   * The number of structural features of the '<em>Requirement Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_RELATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.GoalImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = REQUIREMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME_ALIAS = REQUIREMENT__NAME_ALIAS;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER = REQUIREMENT__STAKEHOLDER;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PRIORITY = REQUIREMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PROGRESS = REQUIREMENT__PROGRESS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = REQUIREMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TYPE = REQUIREMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PART_OF = REQUIREMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.FRImpl <em>FR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.FRImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getFR()
   * @generated
   */
  int FR = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__NAME = REQUIREMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__NAME_ALIAS = REQUIREMENT__NAME_ALIAS;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__STAKEHOLDER = REQUIREMENT__STAKEHOLDER;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__PRIORITY = REQUIREMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__PROGRESS = REQUIREMENT__PROGRESS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__DESCRIPTION = REQUIREMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__TYPE = REQUIREMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR__PART_OF = REQUIREMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>FR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FR_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.QRImpl <em>QR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.QRImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getQR()
   * @generated
   */
  int QR = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__NAME = REQUIREMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__NAME_ALIAS = REQUIREMENT__NAME_ALIAS;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__STAKEHOLDER = REQUIREMENT__STAKEHOLDER;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__PRIORITY = REQUIREMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__PROGRESS = REQUIREMENT__PROGRESS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__DESCRIPTION = REQUIREMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__TYPE = REQUIREMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__SUB_TYPE = REQUIREMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Metric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__METRIC = REQUIREMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__VALUE = REQUIREMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR__PART_OF = REQUIREMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>QR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QR_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ConstraintImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NAME = REQUIREMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NAME_ALIAS = REQUIREMENT__NAME_ALIAS;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__STAKEHOLDER = REQUIREMENT__STAKEHOLDER;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__PRIORITY = REQUIREMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__PROGRESS = REQUIREMENT__PROGRESS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__TYPE = REQUIREMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__SUB_TYPE = REQUIREMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__PART_OF = REQUIREMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.UseCaseImpl <em>Use Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.UseCaseImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUseCase()
   * @generated
   */
  int USE_CASE = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__NAME = REQUIREMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__NAME_ALIAS = REQUIREMENT__NAME_ALIAS;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__STAKEHOLDER = REQUIREMENT__STAKEHOLDER;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__PRIORITY = REQUIREMENT__PRIORITY;

  /**
   * The feature id for the '<em><b>Progress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__PROGRESS = REQUIREMENT__PROGRESS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__DESCRIPTION = REQUIREMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__TYPE = REQUIREMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actor Initiates</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ACTOR_INITIATES = REQUIREMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Actor Participates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ACTOR_PARTICIPATES = REQUIREMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>BEntity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__BENTITY = REQUIREMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__PRECONDITION = REQUIREMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Postcondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__POSTCONDITION = REQUIREMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__ACTIONS = REQUIREMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Extension Points</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__EXTENSION_POINTS = REQUIREMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__INCLUDES = REQUIREMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__EXTENDS = REQUIREMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE__SCENARIOS = REQUIREMENT_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Use Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_CASE_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.RefActorImpl <em>Ref Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.RefActorImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefActor()
   * @generated
   */
  int REF_ACTOR = 42;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ACTOR__REFS = 0;

  /**
   * The number of structural features of the '<em>Ref Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_ACTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.UCActionsImpl <em>UC Actions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.UCActionsImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCActions()
   * @generated
   */
  int UC_ACTIONS = 43;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_ACTIONS__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>UC Actions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_ACTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.UCActionImpl <em>UC Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.UCActionImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCAction()
   * @generated
   */
  int UC_ACTION = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_ACTION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>UC Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.UCIncludesImpl <em>UC Includes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.UCIncludesImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCIncludes()
   * @generated
   */
  int UC_INCLUDES = 45;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_INCLUDES__INCLUDES = 0;

  /**
   * The number of structural features of the '<em>UC Includes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_INCLUDES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.UCExtendsImpl <em>UC Extends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.UCExtendsImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCExtends()
   * @generated
   */
  int UC_EXTENDS = 46;

  /**
   * The feature id for the '<em><b>Usecase</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_EXTENDS__USECASE = 0;

  /**
   * The feature id for the '<em><b>Extension Point</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_EXTENDS__EXTENSION_POINT = 1;

  /**
   * The number of structural features of the '<em>UC Extends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_EXTENDS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.UCExtensionPointsImpl <em>UC Extension Points</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.UCExtensionPointsImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCExtensionPoints()
   * @generated
   */
  int UC_EXTENSION_POINTS = 47;

  /**
   * The feature id for the '<em><b>Extension Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_EXTENSION_POINTS__EXTENSION_POINTS = 0;

  /**
   * The number of structural features of the '<em>UC Extension Points</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_EXTENSION_POINTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.UCExtensionPointImpl <em>UC Extension Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.UCExtensionPointImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCExtensionPoint()
   * @generated
   */
  int UC_EXTENSION_POINT = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_EXTENSION_POINT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_EXTENSION_POINT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>UC Extension Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UC_EXTENSION_POINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.RefUCImpl <em>Ref UC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.RefUCImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefUC()
   * @generated
   */
  int REF_UC = 49;

  /**
   * The feature id for the '<em><b>Refs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_UC__REFS = 0;

  /**
   * The number of structural features of the '<em>Ref UC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_UC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.ScenarioImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__MODE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__STEPS = 5;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.StepImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStep()
   * @generated
   */
  int STEP = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TYPE = 1;

  /**
   * The feature id for the '<em><b>Sub Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__SUB_TYPE = 2;

  /**
   * The feature id for the '<em><b>Simple Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__SIMPLE_STEP = 3;

  /**
   * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__SUB_STEPS = 4;

  /**
   * The feature id for the '<em><b>If Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__IF_STEPS = 5;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.SimpleStepImpl <em>Simple Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.SimpleStepImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSimpleStep()
   * @generated
   */
  int SIMPLE_STEP = 52;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STEP__NAME_ALIAS = 0;

  /**
   * The feature id for the '<em><b>Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STEP__ACTOR = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STEP__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STEP__PRECONDITION = 3;

  /**
   * The feature id for the '<em><b>Postcondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STEP__POSTCONDITION = 4;

  /**
   * The feature id for the '<em><b>Next</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STEP__NEXT = 5;

  /**
   * The number of structural features of the '<em>Simple Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STEP_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.IfStepImpl <em>If Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.IfStepImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getIfStep()
   * @generated
   */
  int IF_STEP = 53;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STEP__ACTION = 0;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STEP__STEPS = 1;

  /**
   * The number of structural features of the '<em>If Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STEP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.StateMachineImpl <em>State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.StateMachineImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStateMachine()
   * @generated
   */
  int STATE_MACHINE = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__NAME_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__ENTITY = 3;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__STATES = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__DESCRIPTION = 5;

  /**
   * The number of structural features of the '<em>State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.StatesImpl <em>States</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.StatesImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStates()
   * @generated
   */
  int STATES = 55;

  /**
   * The number of structural features of the '<em>States</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.StateImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getState()
   * @generated
   */
  int STATE = 56;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATES = STATES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = STATES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IS_INITIAL = STATES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IS_FINAL = STATES_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>On Entry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ON_ENTRY = STATES_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>On Exit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ON_EXIT = STATES_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = STATES_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = STATES_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.TransitionImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 57;

  /**
   * The feature id for the '<em><b>Uc Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__UC_ACTION = 0;

  /**
   * The feature id for the '<em><b>Nextstate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NEXTSTATE = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.impl.RefUCActionImpl <em>Ref UC Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.impl.RefUCActionImpl
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefUCAction()
   * @generated
   */
  int REF_UC_ACTION = 58;

  /**
   * The feature id for the '<em><b>Use Case</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_UC_ACTION__USE_CASE = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_UC_ACTION__ACTION = 1;

  /**
   * The number of structural features of the '<em>Ref UC Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_UC_ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.ProjectType <em>Project Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.ProjectType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getProjectType()
   * @generated
   */
  int PROJECT_TYPE = 59;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.ProjectDomain <em>Project Domain</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.ProjectDomain
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getProjectDomain()
   * @generated
   */
  int PROJECT_DOMAIN = 60;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.TermType <em>Term Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.TermType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getTermType()
   * @generated
   */
  int TERM_TYPE = 61;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.StakeholderType <em>Stakeholder Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.StakeholderType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStakeholderType()
   * @generated
   */
  int STAKEHOLDER_TYPE = 62;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.StakeholderCategory <em>Stakeholder Category</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.StakeholderCategory
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStakeholderCategory()
   * @generated
   */
  int STAKEHOLDER_CATEGORY = 63;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.SystemType <em>System Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.SystemType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemType()
   * @generated
   */
  int SYSTEM_TYPE = 64;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.SystemScope <em>System Scope</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.SystemScope
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemScope()
   * @generated
   */
  int SYSTEM_SCOPE = 65;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.SystemRelationType <em>System Relation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.SystemRelationType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemRelationType()
   * @generated
   */
  int SYSTEM_RELATION_TYPE = 66;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.SystemRelationCategory <em>System Relation Category</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.SystemRelationCategory
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemRelationCategory()
   * @generated
   */
  int SYSTEM_RELATION_CATEGORY = 67;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.EntityType <em>Entity Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.EntityType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 68;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.AttributeType <em>Attribute Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.AttributeType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 69;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.BusinessEntityType <em>Business Entity Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.BusinessEntityType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getBusinessEntityType()
   * @generated
   */
  int BUSINESS_ENTITY_TYPE = 70;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.ActorType <em>Actor Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.ActorType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getActorType()
   * @generated
   */
  int ACTOR_TYPE = 71;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.RequirementRelationType <em>Requirement Relation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.RequirementRelationType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRequirementRelationType()
   * @generated
   */
  int REQUIREMENT_RELATION_TYPE = 72;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.GoalType <em>Goal Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.GoalType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getGoalType()
   * @generated
   */
  int GOAL_TYPE = 73;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.FRType <em>FR Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.FRType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getFRType()
   * @generated
   */
  int FR_TYPE = 74;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.QRType <em>QR Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.QRType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getQRType()
   * @generated
   */
  int QR_TYPE = 75;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.QRSubType <em>QR Sub Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.QRSubType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getQRSubType()
   * @generated
   */
  int QR_SUB_TYPE = 76;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.Metric <em>Metric</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.Metric
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getMetric()
   * @generated
   */
  int METRIC = 77;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.ConstraintType <em>Constraint Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.ConstraintType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getConstraintType()
   * @generated
   */
  int CONSTRAINT_TYPE = 78;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.ConstraintSubType <em>Constraint Sub Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.ConstraintSubType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getConstraintSubType()
   * @generated
   */
  int CONSTRAINT_SUB_TYPE = 79;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.UseCaseType <em>Use Case Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.UseCaseType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUseCaseType()
   * @generated
   */
  int USE_CASE_TYPE = 80;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.ScenarioType <em>Scenario Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.ScenarioType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getScenarioType()
   * @generated
   */
  int SCENARIO_TYPE = 81;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.StepOperationType <em>Step Operation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.StepOperationType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStepOperationType()
   * @generated
   */
  int STEP_OPERATION_TYPE = 82;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.StepOperationSubType <em>Step Operation Sub Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.StepOperationSubType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStepOperationSubType()
   * @generated
   */
  int STEP_OPERATION_SUB_TYPE = 83;

  /**
   * The meta object id for the '{@link rslingo.rsl.rsl.StateMachineType <em>State Machine Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see rslingo.rsl.rsl.StateMachineType
   * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStateMachineType()
   * @generated
   */
  int STATE_MACHINE_TYPE = 84;


  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see rslingo.rsl.rsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see rslingo.rsl.rsl.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Packages();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.PackageAbstract <em>Package Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Abstract</em>'.
   * @see rslingo.rsl.rsl.PackageAbstract
   * @generated
   */
  EClass getPackageAbstract();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.PackageAbstract#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.PackageAbstract#getName()
   * @see #getPackageAbstract()
   * @generated
   */
  EAttribute getPackageAbstract_Name();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageAbstract#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see rslingo.rsl.rsl.PackageAbstract#getImports()
   * @see #getPackageAbstract()
   * @generated
   */
  EReference getPackageAbstract_Imports();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see rslingo.rsl.rsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see rslingo.rsl.rsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see rslingo.rsl.rsl.Date
   * @generated
   */
  EClass getDate();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Date#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Day</em>'.
   * @see rslingo.rsl.rsl.Date#getDay()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Day();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Date#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Month</em>'.
   * @see rslingo.rsl.rsl.Date#getMonth()
   * @see #getDate()
   * @generated
   */
  EReference getDate_Month();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Date#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see rslingo.rsl.rsl.Date#getYear()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Year();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Month <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Month</em>'.
   * @see rslingo.rsl.rsl.Month
   * @generated
   */
  EClass getMonth();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Month#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Month#getName()
   * @see #getMonth()
   * @generated
   */
  EAttribute getMonth_Name();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Progress <em>Progress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Progress</em>'.
   * @see rslingo.rsl.rsl.Progress
   * @generated
   */
  EClass getProgress();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Progress#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rsl.rsl.Progress#getValue()
   * @see #getProgress()
   * @generated
   */
  EAttribute getProgress_Value();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Priority</em>'.
   * @see rslingo.rsl.rsl.Priority
   * @generated
   */
  EClass getPriority();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Priority#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rsl.rsl.Priority#getValue()
   * @see #getPriority()
   * @generated
   */
  EAttribute getPriority_Value();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.PackageProject <em>Package Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Project</em>'.
   * @see rslingo.rsl.rsl.PackageProject
   * @generated
   */
  EClass getPackageProject();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.PackageProject#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project</em>'.
   * @see rslingo.rsl.rsl.PackageProject#getProject()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_Project();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageProject#getPackageGlossaries <em>Package Glossaries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Glossaries</em>'.
   * @see rslingo.rsl.rsl.PackageProject#getPackageGlossaries()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_PackageGlossaries();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageProject#getPackageStakeholders <em>Package Stakeholders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Stakeholders</em>'.
   * @see rslingo.rsl.rsl.PackageProject#getPackageStakeholders()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_PackageStakeholders();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageProject#getPackageSystems <em>Package Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Systems</em>'.
   * @see rslingo.rsl.rsl.PackageProject#getPackageSystems()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_PackageSystems();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageProject#getSystemRelations <em>System Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>System Relations</em>'.
   * @see rslingo.rsl.rsl.PackageProject#getSystemRelations()
   * @see #getPackageProject()
   * @generated
   */
  EReference getPackageProject_SystemRelations();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.PackageGlossary <em>Package Glossary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Glossary</em>'.
   * @see rslingo.rsl.rsl.PackageGlossary
   * @generated
   */
  EClass getPackageGlossary();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageGlossary#getGlossaryTerms <em>Glossary Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Glossary Terms</em>'.
   * @see rslingo.rsl.rsl.PackageGlossary#getGlossaryTerms()
   * @see #getPackageGlossary()
   * @generated
   */
  EReference getPackageGlossary_GlossaryTerms();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.PackageStakeholder <em>Package Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Stakeholder</em>'.
   * @see rslingo.rsl.rsl.PackageStakeholder
   * @generated
   */
  EClass getPackageStakeholder();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageStakeholder#getStakeholders <em>Stakeholders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stakeholders</em>'.
   * @see rslingo.rsl.rsl.PackageStakeholder#getStakeholders()
   * @see #getPackageStakeholder()
   * @generated
   */
  EReference getPackageStakeholder_Stakeholders();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.PackageSystem <em>Package System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package System</em>'.
   * @see rslingo.rsl.rsl.PackageSystem
   * @generated
   */
  EClass getPackageSystem();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.PackageSystem#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see rslingo.rsl.rsl.PackageSystem#getSystem()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_System();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageSystem#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see rslingo.rsl.rsl.PackageSystem#getEntities()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageSystem#getBusinessEntities <em>Business Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Business Entities</em>'.
   * @see rslingo.rsl.rsl.PackageSystem#getBusinessEntities()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_BusinessEntities();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageSystem#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see rslingo.rsl.rsl.PackageSystem#getActors()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_Actors();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageSystem#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirements</em>'.
   * @see rslingo.rsl.rsl.PackageSystem#getRequirements()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_Requirements();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageSystem#getStateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Machine</em>'.
   * @see rslingo.rsl.rsl.PackageSystem#getStateMachine()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_StateMachine();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageSystem#getRequirementRelations <em>Requirement Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirement Relations</em>'.
   * @see rslingo.rsl.rsl.PackageSystem#getRequirementRelations()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_RequirementRelations();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.PackageSystem#getSystemRelations <em>System Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>System Relations</em>'.
   * @see rslingo.rsl.rsl.PackageSystem#getSystemRelations()
   * @see #getPackageSystem()
   * @generated
   */
  EReference getPackageSystem_SystemRelations();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see rslingo.rsl.rsl.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Project#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.Project#getType()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Project#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.Project#getNameAlias()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Project#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domain</em>'.
   * @see rslingo.rsl.rsl.Project#getDomain()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Domain();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Project#getPlanned <em>Planned</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Planned</em>'.
   * @see rslingo.rsl.rsl.Project#getPlanned()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Planned();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Project#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual</em>'.
   * @see rslingo.rsl.rsl.Project#getActual()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Actual();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Project#getOrganizations <em>Organizations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Organizations</em>'.
   * @see rslingo.rsl.rsl.Project#getOrganizations()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Organizations();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Project#getProgress <em>Progress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Progress</em>'.
   * @see rslingo.rsl.rsl.Project#getProgress()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Progress();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Project#getSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summary</em>'.
   * @see rslingo.rsl.rsl.Project#getSummary()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Summary();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Project#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.Project#getDescription()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.PlannedSchedule <em>Planned Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Planned Schedule</em>'.
   * @see rslingo.rsl.rsl.PlannedSchedule
   * @generated
   */
  EClass getPlannedSchedule();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.PlannedSchedule#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see rslingo.rsl.rsl.PlannedSchedule#getStart()
   * @see #getPlannedSchedule()
   * @generated
   */
  EReference getPlannedSchedule_Start();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.PlannedSchedule#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see rslingo.rsl.rsl.PlannedSchedule#getEnd()
   * @see #getPlannedSchedule()
   * @generated
   */
  EReference getPlannedSchedule_End();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.ActualSchedule <em>Actual Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Schedule</em>'.
   * @see rslingo.rsl.rsl.ActualSchedule
   * @generated
   */
  EClass getActualSchedule();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.ActualSchedule#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see rslingo.rsl.rsl.ActualSchedule#getStart()
   * @see #getActualSchedule()
   * @generated
   */
  EReference getActualSchedule_Start();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.ActualSchedule#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see rslingo.rsl.rsl.ActualSchedule#getEnd()
   * @see #getActualSchedule()
   * @generated
   */
  EReference getActualSchedule_End();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Organizations <em>Organizations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organizations</em>'.
   * @see rslingo.rsl.rsl.Organizations
   * @generated
   */
  EClass getOrganizations();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Organizations#getCustomer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customer</em>'.
   * @see rslingo.rsl.rsl.Organizations#getCustomer()
   * @see #getOrganizations()
   * @generated
   */
  EAttribute getOrganizations_Customer();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Organizations#getSupplier <em>Supplier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supplier</em>'.
   * @see rslingo.rsl.rsl.Organizations#getSupplier()
   * @see #getOrganizations()
   * @generated
   */
  EAttribute getOrganizations_Supplier();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Organizations#getPartners <em>Partners</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partners</em>'.
   * @see rslingo.rsl.rsl.Organizations#getPartners()
   * @see #getOrganizations()
   * @generated
   */
  EAttribute getOrganizations_Partners();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.GlossaryTerm <em>Glossary Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Glossary Term</em>'.
   * @see rslingo.rsl.rsl.GlossaryTerm
   * @generated
   */
  EClass getGlossaryTerm();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.GlossaryTerm#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.GlossaryTerm#getName()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.GlossaryTerm#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.GlossaryTerm#getType()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.GlossaryTerm#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.GlossaryTerm#getNameAlias()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.GlossaryTerm#getAcronym <em>Acronym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acronym</em>'.
   * @see rslingo.rsl.rsl.GlossaryTerm#getAcronym()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Acronym();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.GlossaryTerm#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see rslingo.rsl.rsl.GlossaryTerm#getRef()
   * @see #getGlossaryTerm()
   * @generated
   */
  EReference getGlossaryTerm_Ref();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.GlossaryTerm#getSynonym <em>Synonym</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Synonym</em>'.
   * @see rslingo.rsl.rsl.GlossaryTerm#getSynonym()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Synonym();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.GlossaryTerm#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see rslingo.rsl.rsl.GlossaryTerm#getSuper()
   * @see #getGlossaryTerm()
   * @generated
   */
  EReference getGlossaryTerm_Super();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.GlossaryTerm#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.GlossaryTerm#getDescription()
   * @see #getGlossaryTerm()
   * @generated
   */
  EAttribute getGlossaryTerm_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.TermApplication <em>Term Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Application</em>'.
   * @see rslingo.rsl.rsl.TermApplication
   * @generated
   */
  EClass getTermApplication();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.TermApplication#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rsl.rsl.TermApplication#getValue()
   * @see #getTermApplication()
   * @generated
   */
  EAttribute getTermApplication_Value();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.RefTermApplication <em>Ref Term Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Term Application</em>'.
   * @see rslingo.rsl.rsl.RefTermApplication
   * @generated
   */
  EClass getRefTermApplication();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.RefTermApplication#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refs</em>'.
   * @see rslingo.rsl.rsl.RefTermApplication#getRefs()
   * @see #getRefTermApplication()
   * @generated
   */
  EReference getRefTermApplication_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stakeholder</em>'.
   * @see rslingo.rsl.rsl.Stakeholder
   * @generated
   */
  EClass getStakeholder();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Stakeholder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Stakeholder#getName()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Stakeholder#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.Stakeholder#getType()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Stakeholder#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.Stakeholder#getNameAlias()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Stakeholder#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see rslingo.rsl.rsl.Stakeholder#getCategory()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Category();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.Stakeholder#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see rslingo.rsl.rsl.Stakeholder#getSuper()
   * @see #getStakeholder()
   * @generated
   */
  EReference getStakeholder_Super();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.Stakeholder#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rsl.rsl.Stakeholder#getPartOf()
   * @see #getStakeholder()
   * @generated
   */
  EReference getStakeholder_PartOf();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Stakeholder#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.Stakeholder#getDescription()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see rslingo.rsl.rsl.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.System#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.System#getType()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.System#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.System#getNameAlias()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.System#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see rslingo.rsl.rsl.System#getScope()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Scope();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.System#getSubSystems <em>Sub Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Systems</em>'.
   * @see rslingo.rsl.rsl.System#getSubSystems()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_SubSystems();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.System#getReusableSystems <em>Reusable Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reusable Systems</em>'.
   * @see rslingo.rsl.rsl.System#getReusableSystems()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_ReusableSystems();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.System#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.System#getDescription()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.RefSystem <em>Ref System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref System</em>'.
   * @see rslingo.rsl.rsl.RefSystem
   * @generated
   */
  EClass getRefSystem();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rsl.rsl.RefSystem#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rsl.rsl.RefSystem#getRefs()
   * @see #getRefSystem()
   * @generated
   */
  EReference getRefSystem_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.SystemRelation <em>System Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Relation</em>'.
   * @see rslingo.rsl.rsl.SystemRelation
   * @generated
   */
  EClass getSystemRelation();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.SystemRelation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.SystemRelation#getName()
   * @see #getSystemRelation()
   * @generated
   */
  EAttribute getSystemRelation_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.SystemRelation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.SystemRelation#getType()
   * @see #getSystemRelation()
   * @generated
   */
  EAttribute getSystemRelation_Type();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.SystemRelation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see rslingo.rsl.rsl.SystemRelation#getSource()
   * @see #getSystemRelation()
   * @generated
   */
  EReference getSystemRelation_Source();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.SystemRelation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see rslingo.rsl.rsl.SystemRelation#getTarget()
   * @see #getSystemRelation()
   * @generated
   */
  EReference getSystemRelation_Target();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.SystemRelation#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see rslingo.rsl.rsl.SystemRelation#getCategory()
   * @see #getSystemRelation()
   * @generated
   */
  EAttribute getSystemRelation_Category();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.SystemRelation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.SystemRelation#getDescription()
   * @see #getSystemRelation()
   * @generated
   */
  EAttribute getSystemRelation_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see rslingo.rsl.rsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Entity#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.Entity#getType()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Entity#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.Entity#getNameAlias()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_NameAlias();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.Entity#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see rslingo.rsl.rsl.Entity#getSuper()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Super();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see rslingo.rsl.rsl.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Entity#getPrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Key</em>'.
   * @see rslingo.rsl.rsl.Entity#getPrimaryKey()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PrimaryKey();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.Entity#getForeignKeys <em>Foreign Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
   * @see rslingo.rsl.rsl.Entity#getForeignKeys()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ForeignKeys();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.Entity#getChecks <em>Checks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Checks</em>'.
   * @see rslingo.rsl.rsl.Entity#getChecks()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Checks();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Entity#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.Entity#getDescription()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see rslingo.rsl.rsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Attribute#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see rslingo.rsl.rsl.Attribute#getSize()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Size();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Attribute#getSubsize <em>Subsize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subsize</em>'.
   * @see rslingo.rsl.rsl.Attribute#getSubsize()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Subsize();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Attribute#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.Attribute#getNameAlias()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_NameAlias();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Attribute#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see rslingo.rsl.rsl.Attribute#getMultiplicity()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Multiplicity();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Attribute#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see rslingo.rsl.rsl.Attribute#getDefaultValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_DefaultValue();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Attribute#getNotNull <em>Not Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Null</em>'.
   * @see rslingo.rsl.rsl.Attribute#getNotNull()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_NotNull();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Attribute#getUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see rslingo.rsl.rsl.Attribute#getUnique()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Unique();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Attribute#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.Attribute#getDescription()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity</em>'.
   * @see rslingo.rsl.rsl.Multiplicity
   * @generated
   */
  EClass getMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Multiplicity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rsl.rsl.Multiplicity#getValue()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Value();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.PrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Key</em>'.
   * @see rslingo.rsl.rsl.PrimaryKey
   * @generated
   */
  EClass getPrimaryKey();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.PrimaryKey#getRefTo <em>Ref To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref To</em>'.
   * @see rslingo.rsl.rsl.PrimaryKey#getRefTo()
   * @see #getPrimaryKey()
   * @generated
   */
  EReference getPrimaryKey_RefTo();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreign Key</em>'.
   * @see rslingo.rsl.rsl.ForeignKey
   * @generated
   */
  EClass getForeignKey();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.ForeignKey#getFentity <em>Fentity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fentity</em>'.
   * @see rslingo.rsl.rsl.ForeignKey#getFentity()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_Fentity();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.ForeignKey#getRefTo <em>Ref To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref To</em>'.
   * @see rslingo.rsl.rsl.ForeignKey#getRefTo()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_RefTo();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.RefAttribute <em>Ref Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Attribute</em>'.
   * @see rslingo.rsl.rsl.RefAttribute
   * @generated
   */
  EClass getRefAttribute();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rsl.rsl.RefAttribute#getRefAttr <em>Ref Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ref Attr</em>'.
   * @see rslingo.rsl.rsl.RefAttribute#getRefAttr()
   * @see #getRefAttribute()
   * @generated
   */
  EReference getRefAttribute_RefAttr();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check</em>'.
   * @see rslingo.rsl.rsl.Check
   * @generated
   */
  EClass getCheck();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Check#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Check#getName()
   * @see #getCheck()
   * @generated
   */
  EAttribute getCheck_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Check#getCheckExpression <em>Check Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check Expression</em>'.
   * @see rslingo.rsl.rsl.Check#getCheckExpression()
   * @see #getCheck()
   * @generated
   */
  EAttribute getCheck_CheckExpression();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.BusinessEntity <em>Business Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Entity</em>'.
   * @see rslingo.rsl.rsl.BusinessEntity
   * @generated
   */
  EClass getBusinessEntity();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.BusinessEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.BusinessEntity#getName()
   * @see #getBusinessEntity()
   * @generated
   */
  EAttribute getBusinessEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.BusinessEntity#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.BusinessEntity#getType()
   * @see #getBusinessEntity()
   * @generated
   */
  EAttribute getBusinessEntity_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.BusinessEntity#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.BusinessEntity#getNameAlias()
   * @see #getBusinessEntity()
   * @generated
   */
  EAttribute getBusinessEntity_NameAlias();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.BusinessEntity#getMaster <em>Master</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Master</em>'.
   * @see rslingo.rsl.rsl.BusinessEntity#getMaster()
   * @see #getBusinessEntity()
   * @generated
   */
  EReference getBusinessEntity_Master();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.BusinessEntity#getDetail <em>Detail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Detail</em>'.
   * @see rslingo.rsl.rsl.BusinessEntity#getDetail()
   * @see #getBusinessEntity()
   * @generated
   */
  EReference getBusinessEntity_Detail();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.BusinessEntity#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see rslingo.rsl.rsl.BusinessEntity#getReference()
   * @see #getBusinessEntity()
   * @generated
   */
  EReference getBusinessEntity_Reference();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.BusinessEntity#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.BusinessEntity#getDescription()
   * @see #getBusinessEntity()
   * @generated
   */
  EAttribute getBusinessEntity_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.MasterBEntity <em>Master BEntity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Master BEntity</em>'.
   * @see rslingo.rsl.rsl.MasterBEntity
   * @generated
   */
  EClass getMasterBEntity();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.MasterBEntity#getMasterEntity <em>Master Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Master Entity</em>'.
   * @see rslingo.rsl.rsl.MasterBEntity#getMasterEntity()
   * @see #getMasterBEntity()
   * @generated
   */
  EReference getMasterBEntity_MasterEntity();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.DetailBEntity <em>Detail BEntity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Detail BEntity</em>'.
   * @see rslingo.rsl.rsl.DetailBEntity
   * @generated
   */
  EClass getDetailBEntity();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.DetailBEntity#getEntityDetail <em>Entity Detail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity Detail</em>'.
   * @see rslingo.rsl.rsl.DetailBEntity#getEntityDetail()
   * @see #getDetailBEntity()
   * @generated
   */
  EReference getDetailBEntity_EntityDetail();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.DetailBEntity#getRefEntity <em>Ref Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref Entity</em>'.
   * @see rslingo.rsl.rsl.DetailBEntity#getRefEntity()
   * @see #getDetailBEntity()
   * @generated
   */
  EReference getDetailBEntity_RefEntity();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.ReferenceBEntity <em>Reference BEntity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference BEntity</em>'.
   * @see rslingo.rsl.rsl.ReferenceBEntity
   * @generated
   */
  EClass getReferenceBEntity();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.ReferenceBEntity#getRefEntity <em>Ref Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref Entity</em>'.
   * @see rslingo.rsl.rsl.ReferenceBEntity#getRefEntity()
   * @see #getReferenceBEntity()
   * @generated
   */
  EReference getReferenceBEntity_RefEntity();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.RefEntity <em>Ref Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Entity</em>'.
   * @see rslingo.rsl.rsl.RefEntity
   * @generated
   */
  EClass getRefEntity();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rsl.rsl.RefEntity#getRefEntity <em>Ref Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ref Entity</em>'.
   * @see rslingo.rsl.rsl.RefEntity#getRefEntity()
   * @see #getRefEntity()
   * @generated
   */
  EReference getRefEntity_RefEntity();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see rslingo.rsl.rsl.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Actor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Actor#getName()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Actor#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.Actor#getType()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Actor#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.Actor#getNameAlias()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_NameAlias();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.Actor#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stakeholder</em>'.
   * @see rslingo.rsl.rsl.Actor#getStakeholder()
   * @see #getActor()
   * @generated
   */
  EReference getActor_Stakeholder();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.Actor#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see rslingo.rsl.rsl.Actor#getSuper()
   * @see #getActor()
   * @generated
   */
  EReference getActor_Super();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Actor#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.Actor#getDescription()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see rslingo.rsl.rsl.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Requirement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Requirement#getName()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Requirement#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.Requirement#getNameAlias()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_NameAlias();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.Requirement#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stakeholder</em>'.
   * @see rslingo.rsl.rsl.Requirement#getStakeholder()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Stakeholder();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Requirement#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Priority</em>'.
   * @see rslingo.rsl.rsl.Requirement#getPriority()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Priority();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Requirement#getProgress <em>Progress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Progress</em>'.
   * @see rslingo.rsl.rsl.Requirement#getProgress()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Progress();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Requirement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.Requirement#getDescription()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.RequirementRelation <em>Requirement Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement Relation</em>'.
   * @see rslingo.rsl.rsl.RequirementRelation
   * @generated
   */
  EClass getRequirementRelation();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.RequirementRelation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.RequirementRelation#getName()
   * @see #getRequirementRelation()
   * @generated
   */
  EAttribute getRequirementRelation_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.RequirementRelation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.RequirementRelation#getType()
   * @see #getRequirementRelation()
   * @generated
   */
  EAttribute getRequirementRelation_Type();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.RequirementRelation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see rslingo.rsl.rsl.RequirementRelation#getSource()
   * @see #getRequirementRelation()
   * @generated
   */
  EReference getRequirementRelation_Source();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.RequirementRelation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see rslingo.rsl.rsl.RequirementRelation#getTarget()
   * @see #getRequirementRelation()
   * @generated
   */
  EReference getRequirementRelation_Target();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.RequirementRelation#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.RequirementRelation#getDescription()
   * @see #getRequirementRelation()
   * @generated
   */
  EAttribute getRequirementRelation_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see rslingo.rsl.rsl.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Goal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.Goal#getType()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Type();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.Goal#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rsl.rsl.Goal#getPartOf()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.FR <em>FR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FR</em>'.
   * @see rslingo.rsl.rsl.FR
   * @generated
   */
  EClass getFR();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.FR#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.FR#getType()
   * @see #getFR()
   * @generated
   */
  EAttribute getFR_Type();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.FR#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rsl.rsl.FR#getPartOf()
   * @see #getFR()
   * @generated
   */
  EReference getFR_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.QR <em>QR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QR</em>'.
   * @see rslingo.rsl.rsl.QR
   * @generated
   */
  EClass getQR();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.QR#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.QR#getType()
   * @see #getQR()
   * @generated
   */
  EAttribute getQR_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.QR#getSubType <em>Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sub Type</em>'.
   * @see rslingo.rsl.rsl.QR#getSubType()
   * @see #getQR()
   * @generated
   */
  EAttribute getQR_SubType();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.QR#getMetric <em>Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metric</em>'.
   * @see rslingo.rsl.rsl.QR#getMetric()
   * @see #getQR()
   * @generated
   */
  EAttribute getQR_Metric();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.QR#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see rslingo.rsl.rsl.QR#getValue()
   * @see #getQR()
   * @generated
   */
  EAttribute getQR_Value();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.QR#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rsl.rsl.QR#getPartOf()
   * @see #getQR()
   * @generated
   */
  EReference getQR_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see rslingo.rsl.rsl.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Constraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.Constraint#getType()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Constraint#getSubType <em>Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sub Type</em>'.
   * @see rslingo.rsl.rsl.Constraint#getSubType()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_SubType();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.Constraint#getPartOf <em>Part Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part Of</em>'.
   * @see rslingo.rsl.rsl.Constraint#getPartOf()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_PartOf();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Case</em>'.
   * @see rslingo.rsl.rsl.UseCase
   * @generated
   */
  EClass getUseCase();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.UseCase#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.UseCase#getType()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Type();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.UseCase#getActorInitiates <em>Actor Initiates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actor Initiates</em>'.
   * @see rslingo.rsl.rsl.UseCase#getActorInitiates()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_ActorInitiates();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.UseCase#getActorParticipates <em>Actor Participates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actor Participates</em>'.
   * @see rslingo.rsl.rsl.UseCase#getActorParticipates()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_ActorParticipates();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.UseCase#getBEntity <em>BEntity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>BEntity</em>'.
   * @see rslingo.rsl.rsl.UseCase#getBEntity()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_BEntity();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.UseCase#getPrecondition <em>Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precondition</em>'.
   * @see rslingo.rsl.rsl.UseCase#getPrecondition()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Precondition();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.UseCase#getPostcondition <em>Postcondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postcondition</em>'.
   * @see rslingo.rsl.rsl.UseCase#getPostcondition()
   * @see #getUseCase()
   * @generated
   */
  EAttribute getUseCase_Postcondition();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.UseCase#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actions</em>'.
   * @see rslingo.rsl.rsl.UseCase#getActions()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Actions();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.UseCase#getExtensionPoints <em>Extension Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extension Points</em>'.
   * @see rslingo.rsl.rsl.UseCase#getExtensionPoints()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_ExtensionPoints();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.UseCase#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Includes</em>'.
   * @see rslingo.rsl.rsl.UseCase#getIncludes()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.UseCase#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extends</em>'.
   * @see rslingo.rsl.rsl.UseCase#getExtends()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.UseCase#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see rslingo.rsl.rsl.UseCase#getScenarios()
   * @see #getUseCase()
   * @generated
   */
  EReference getUseCase_Scenarios();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.RefActor <em>Ref Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Actor</em>'.
   * @see rslingo.rsl.rsl.RefActor
   * @generated
   */
  EClass getRefActor();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rsl.rsl.RefActor#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rsl.rsl.RefActor#getRefs()
   * @see #getRefActor()
   * @generated
   */
  EReference getRefActor_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.UCActions <em>UC Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UC Actions</em>'.
   * @see rslingo.rsl.rsl.UCActions
   * @generated
   */
  EClass getUCActions();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.UCActions#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see rslingo.rsl.rsl.UCActions#getActions()
   * @see #getUCActions()
   * @generated
   */
  EReference getUCActions_Actions();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.UCAction <em>UC Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UC Action</em>'.
   * @see rslingo.rsl.rsl.UCAction
   * @generated
   */
  EClass getUCAction();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.UCAction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.UCAction#getName()
   * @see #getUCAction()
   * @generated
   */
  EAttribute getUCAction_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.UCAction#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.UCAction#getDescription()
   * @see #getUCAction()
   * @generated
   */
  EAttribute getUCAction_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.UCIncludes <em>UC Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UC Includes</em>'.
   * @see rslingo.rsl.rsl.UCIncludes
   * @generated
   */
  EClass getUCIncludes();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.UCIncludes#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see rslingo.rsl.rsl.UCIncludes#getIncludes()
   * @see #getUCIncludes()
   * @generated
   */
  EReference getUCIncludes_Includes();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.UCExtends <em>UC Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UC Extends</em>'.
   * @see rslingo.rsl.rsl.UCExtends
   * @generated
   */
  EClass getUCExtends();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.UCExtends#getUsecase <em>Usecase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Usecase</em>'.
   * @see rslingo.rsl.rsl.UCExtends#getUsecase()
   * @see #getUCExtends()
   * @generated
   */
  EReference getUCExtends_Usecase();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.UCExtends#getExtensionPoint <em>Extension Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extension Point</em>'.
   * @see rslingo.rsl.rsl.UCExtends#getExtensionPoint()
   * @see #getUCExtends()
   * @generated
   */
  EReference getUCExtends_ExtensionPoint();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.UCExtensionPoints <em>UC Extension Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UC Extension Points</em>'.
   * @see rslingo.rsl.rsl.UCExtensionPoints
   * @generated
   */
  EClass getUCExtensionPoints();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.UCExtensionPoints#getExtensionPoints <em>Extension Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extension Points</em>'.
   * @see rslingo.rsl.rsl.UCExtensionPoints#getExtensionPoints()
   * @see #getUCExtensionPoints()
   * @generated
   */
  EReference getUCExtensionPoints_ExtensionPoints();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.UCExtensionPoint <em>UC Extension Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UC Extension Point</em>'.
   * @see rslingo.rsl.rsl.UCExtensionPoint
   * @generated
   */
  EClass getUCExtensionPoint();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.UCExtensionPoint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.UCExtensionPoint#getName()
   * @see #getUCExtensionPoint()
   * @generated
   */
  EAttribute getUCExtensionPoint_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.UCExtensionPoint#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.UCExtensionPoint#getDescription()
   * @see #getUCExtensionPoint()
   * @generated
   */
  EAttribute getUCExtensionPoint_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.RefUC <em>Ref UC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref UC</em>'.
   * @see rslingo.rsl.rsl.RefUC
   * @generated
   */
  EClass getRefUC();

  /**
   * Returns the meta object for the reference list '{@link rslingo.rsl.rsl.RefUC#getRefs <em>Refs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refs</em>'.
   * @see rslingo.rsl.rsl.RefUC#getRefs()
   * @see #getRefUC()
   * @generated
   */
  EReference getRefUC_Refs();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see rslingo.rsl.rsl.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Scenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Scenario#getName()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Scenario#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.Scenario#getType()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Scenario#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.Scenario#getNameAlias()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_NameAlias();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Scenario#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see rslingo.rsl.rsl.Scenario#getMode()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Mode();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Scenario#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.Scenario#getDescription()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Description();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.Scenario#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see rslingo.rsl.rsl.Scenario#getSteps()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Steps();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see rslingo.rsl.rsl.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Step#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.Step#getName()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Step#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.Step#getType()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.Step#getSubType <em>Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sub Type</em>'.
   * @see rslingo.rsl.rsl.Step#getSubType()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_SubType();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Step#getSimpleStep <em>Simple Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple Step</em>'.
   * @see rslingo.rsl.rsl.Step#getSimpleStep()
   * @see #getStep()
   * @generated
   */
  EReference getStep_SimpleStep();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.Step#getSubSteps <em>Sub Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
   * @see rslingo.rsl.rsl.Step#getSubSteps()
   * @see #getStep()
   * @generated
   */
  EReference getStep_SubSteps();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.Step#getIfSteps <em>If Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>If Steps</em>'.
   * @see rslingo.rsl.rsl.Step#getIfSteps()
   * @see #getStep()
   * @generated
   */
  EReference getStep_IfSteps();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.SimpleStep <em>Simple Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Step</em>'.
   * @see rslingo.rsl.rsl.SimpleStep
   * @generated
   */
  EClass getSimpleStep();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.SimpleStep#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.SimpleStep#getNameAlias()
   * @see #getSimpleStep()
   * @generated
   */
  EAttribute getSimpleStep_NameAlias();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.SimpleStep#getActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Actor</em>'.
   * @see rslingo.rsl.rsl.SimpleStep#getActor()
   * @see #getSimpleStep()
   * @generated
   */
  EReference getSimpleStep_Actor();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.SimpleStep#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.SimpleStep#getDescription()
   * @see #getSimpleStep()
   * @generated
   */
  EAttribute getSimpleStep_Description();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.SimpleStep#getPrecondition <em>Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precondition</em>'.
   * @see rslingo.rsl.rsl.SimpleStep#getPrecondition()
   * @see #getSimpleStep()
   * @generated
   */
  EAttribute getSimpleStep_Precondition();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.SimpleStep#getPostcondition <em>Postcondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postcondition</em>'.
   * @see rslingo.rsl.rsl.SimpleStep#getPostcondition()
   * @see #getSimpleStep()
   * @generated
   */
  EAttribute getSimpleStep_Postcondition();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.SimpleStep#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Next</em>'.
   * @see rslingo.rsl.rsl.SimpleStep#getNext()
   * @see #getSimpleStep()
   * @generated
   */
  EReference getSimpleStep_Next();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.IfStep <em>If Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Step</em>'.
   * @see rslingo.rsl.rsl.IfStep
   * @generated
   */
  EClass getIfStep();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.IfStep#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see rslingo.rsl.rsl.IfStep#getAction()
   * @see #getIfStep()
   * @generated
   */
  EReference getIfStep_Action();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.IfStep#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see rslingo.rsl.rsl.IfStep#getSteps()
   * @see #getIfStep()
   * @generated
   */
  EReference getIfStep_Steps();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine</em>'.
   * @see rslingo.rsl.rsl.StateMachine
   * @generated
   */
  EClass getStateMachine();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.StateMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.StateMachine#getName()
   * @see #getStateMachine()
   * @generated
   */
  EAttribute getStateMachine_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.StateMachine#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see rslingo.rsl.rsl.StateMachine#getType()
   * @see #getStateMachine()
   * @generated
   */
  EAttribute getStateMachine_Type();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.StateMachine#getNameAlias <em>Name Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Alias</em>'.
   * @see rslingo.rsl.rsl.StateMachine#getNameAlias()
   * @see #getStateMachine()
   * @generated
   */
  EAttribute getStateMachine_NameAlias();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.StateMachine#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see rslingo.rsl.rsl.StateMachine#getEntity()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Entity();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.StateMachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>States</em>'.
   * @see rslingo.rsl.rsl.StateMachine#getStates()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_States();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.StateMachine#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see rslingo.rsl.rsl.StateMachine#getDescription()
   * @see #getStateMachine()
   * @generated
   */
  EAttribute getStateMachine_Description();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>States</em>'.
   * @see rslingo.rsl.rsl.States
   * @generated
   */
  EClass getStates();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see rslingo.rsl.rsl.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.State#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see rslingo.rsl.rsl.State#getStates()
   * @see #getState()
   * @generated
   */
  EReference getState_States();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see rslingo.rsl.rsl.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.State#isIsInitial <em>Is Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Initial</em>'.
   * @see rslingo.rsl.rsl.State#isIsInitial()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsInitial();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.State#isIsFinal <em>Is Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Final</em>'.
   * @see rslingo.rsl.rsl.State#isIsFinal()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsFinal();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.State#getOnEntry <em>On Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>On Entry</em>'.
   * @see rslingo.rsl.rsl.State#getOnEntry()
   * @see #getState()
   * @generated
   */
  EAttribute getState_OnEntry();

  /**
   * Returns the meta object for the attribute '{@link rslingo.rsl.rsl.State#getOnExit <em>On Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>On Exit</em>'.
   * @see rslingo.rsl.rsl.State#getOnExit()
   * @see #getState()
   * @generated
   */
  EAttribute getState_OnExit();

  /**
   * Returns the meta object for the containment reference list '{@link rslingo.rsl.rsl.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see rslingo.rsl.rsl.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see rslingo.rsl.rsl.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link rslingo.rsl.rsl.Transition#getUcAction <em>Uc Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uc Action</em>'.
   * @see rslingo.rsl.rsl.Transition#getUcAction()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_UcAction();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.Transition#getNextstate <em>Nextstate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nextstate</em>'.
   * @see rslingo.rsl.rsl.Transition#getNextstate()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Nextstate();

  /**
   * Returns the meta object for class '{@link rslingo.rsl.rsl.RefUCAction <em>Ref UC Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref UC Action</em>'.
   * @see rslingo.rsl.rsl.RefUCAction
   * @generated
   */
  EClass getRefUCAction();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.RefUCAction#getUseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Use Case</em>'.
   * @see rslingo.rsl.rsl.RefUCAction#getUseCase()
   * @see #getRefUCAction()
   * @generated
   */
  EReference getRefUCAction_UseCase();

  /**
   * Returns the meta object for the reference '{@link rslingo.rsl.rsl.RefUCAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see rslingo.rsl.rsl.RefUCAction#getAction()
   * @see #getRefUCAction()
   * @generated
   */
  EReference getRefUCAction_Action();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.ProjectType <em>Project Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Project Type</em>'.
   * @see rslingo.rsl.rsl.ProjectType
   * @generated
   */
  EEnum getProjectType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.ProjectDomain <em>Project Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Project Domain</em>'.
   * @see rslingo.rsl.rsl.ProjectDomain
   * @generated
   */
  EEnum getProjectDomain();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.TermType <em>Term Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Term Type</em>'.
   * @see rslingo.rsl.rsl.TermType
   * @generated
   */
  EEnum getTermType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.StakeholderType <em>Stakeholder Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Stakeholder Type</em>'.
   * @see rslingo.rsl.rsl.StakeholderType
   * @generated
   */
  EEnum getStakeholderType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.StakeholderCategory <em>Stakeholder Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Stakeholder Category</em>'.
   * @see rslingo.rsl.rsl.StakeholderCategory
   * @generated
   */
  EEnum getStakeholderCategory();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.SystemType <em>System Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>System Type</em>'.
   * @see rslingo.rsl.rsl.SystemType
   * @generated
   */
  EEnum getSystemType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.SystemScope <em>System Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>System Scope</em>'.
   * @see rslingo.rsl.rsl.SystemScope
   * @generated
   */
  EEnum getSystemScope();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.SystemRelationType <em>System Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>System Relation Type</em>'.
   * @see rslingo.rsl.rsl.SystemRelationType
   * @generated
   */
  EEnum getSystemRelationType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.SystemRelationCategory <em>System Relation Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>System Relation Category</em>'.
   * @see rslingo.rsl.rsl.SystemRelationCategory
   * @generated
   */
  EEnum getSystemRelationCategory();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Entity Type</em>'.
   * @see rslingo.rsl.rsl.EntityType
   * @generated
   */
  EEnum getEntityType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type</em>'.
   * @see rslingo.rsl.rsl.AttributeType
   * @generated
   */
  EEnum getAttributeType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.BusinessEntityType <em>Business Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Business Entity Type</em>'.
   * @see rslingo.rsl.rsl.BusinessEntityType
   * @generated
   */
  EEnum getBusinessEntityType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.ActorType <em>Actor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Actor Type</em>'.
   * @see rslingo.rsl.rsl.ActorType
   * @generated
   */
  EEnum getActorType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.RequirementRelationType <em>Requirement Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Requirement Relation Type</em>'.
   * @see rslingo.rsl.rsl.RequirementRelationType
   * @generated
   */
  EEnum getRequirementRelationType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.GoalType <em>Goal Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Goal Type</em>'.
   * @see rslingo.rsl.rsl.GoalType
   * @generated
   */
  EEnum getGoalType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.FRType <em>FR Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>FR Type</em>'.
   * @see rslingo.rsl.rsl.FRType
   * @generated
   */
  EEnum getFRType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.QRType <em>QR Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>QR Type</em>'.
   * @see rslingo.rsl.rsl.QRType
   * @generated
   */
  EEnum getQRType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.QRSubType <em>QR Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>QR Sub Type</em>'.
   * @see rslingo.rsl.rsl.QRSubType
   * @generated
   */
  EEnum getQRSubType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.Metric <em>Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Metric</em>'.
   * @see rslingo.rsl.rsl.Metric
   * @generated
   */
  EEnum getMetric();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.ConstraintType <em>Constraint Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Constraint Type</em>'.
   * @see rslingo.rsl.rsl.ConstraintType
   * @generated
   */
  EEnum getConstraintType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.ConstraintSubType <em>Constraint Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Constraint Sub Type</em>'.
   * @see rslingo.rsl.rsl.ConstraintSubType
   * @generated
   */
  EEnum getConstraintSubType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.UseCaseType <em>Use Case Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Use Case Type</em>'.
   * @see rslingo.rsl.rsl.UseCaseType
   * @generated
   */
  EEnum getUseCaseType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.ScenarioType <em>Scenario Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Scenario Type</em>'.
   * @see rslingo.rsl.rsl.ScenarioType
   * @generated
   */
  EEnum getScenarioType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.StepOperationType <em>Step Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Step Operation Type</em>'.
   * @see rslingo.rsl.rsl.StepOperationType
   * @generated
   */
  EEnum getStepOperationType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.StepOperationSubType <em>Step Operation Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Step Operation Sub Type</em>'.
   * @see rslingo.rsl.rsl.StepOperationSubType
   * @generated
   */
  EEnum getStepOperationSubType();

  /**
   * Returns the meta object for enum '{@link rslingo.rsl.rsl.StateMachineType <em>State Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>State Machine Type</em>'.
   * @see rslingo.rsl.rsl.StateMachineType
   * @generated
   */
  EEnum getStateMachineType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RslFactory getRslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ModelImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.PackageAbstractImpl <em>Package Abstract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.PackageAbstractImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageAbstract()
     * @generated
     */
    EClass PACKAGE_ABSTRACT = eINSTANCE.getPackageAbstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_ABSTRACT__NAME = eINSTANCE.getPackageAbstract_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_ABSTRACT__IMPORTS = eINSTANCE.getPackageAbstract_Imports();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ImportImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.DateImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getDate()
     * @generated
     */
    EClass DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__DAY = eINSTANCE.getDate_Day();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATE__MONTH = eINSTANCE.getDate_Month();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.MonthImpl <em>Month</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.MonthImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getMonth()
     * @generated
     */
    EClass MONTH = eINSTANCE.getMonth();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONTH__NAME = eINSTANCE.getMonth_Name();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ProgressImpl <em>Progress</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ProgressImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getProgress()
     * @generated
     */
    EClass PROGRESS = eINSTANCE.getProgress();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRESS__VALUE = eINSTANCE.getProgress_Value();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.PriorityImpl <em>Priority</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.PriorityImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPriority()
     * @generated
     */
    EClass PRIORITY = eINSTANCE.getPriority();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIORITY__VALUE = eINSTANCE.getPriority_Value();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.PackageProjectImpl <em>Package Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.PackageProjectImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageProject()
     * @generated
     */
    EClass PACKAGE_PROJECT = eINSTANCE.getPackageProject();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__PROJECT = eINSTANCE.getPackageProject_Project();

    /**
     * The meta object literal for the '<em><b>Package Glossaries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__PACKAGE_GLOSSARIES = eINSTANCE.getPackageProject_PackageGlossaries();

    /**
     * The meta object literal for the '<em><b>Package Stakeholders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS = eINSTANCE.getPackageProject_PackageStakeholders();

    /**
     * The meta object literal for the '<em><b>Package Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__PACKAGE_SYSTEMS = eINSTANCE.getPackageProject_PackageSystems();

    /**
     * The meta object literal for the '<em><b>System Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_PROJECT__SYSTEM_RELATIONS = eINSTANCE.getPackageProject_SystemRelations();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.PackageGlossaryImpl <em>Package Glossary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.PackageGlossaryImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageGlossary()
     * @generated
     */
    EClass PACKAGE_GLOSSARY = eINSTANCE.getPackageGlossary();

    /**
     * The meta object literal for the '<em><b>Glossary Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_GLOSSARY__GLOSSARY_TERMS = eINSTANCE.getPackageGlossary_GlossaryTerms();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.PackageStakeholderImpl <em>Package Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.PackageStakeholderImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageStakeholder()
     * @generated
     */
    EClass PACKAGE_STAKEHOLDER = eINSTANCE.getPackageStakeholder();

    /**
     * The meta object literal for the '<em><b>Stakeholders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_STAKEHOLDER__STAKEHOLDERS = eINSTANCE.getPackageStakeholder_Stakeholders();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.PackageSystemImpl <em>Package System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.PackageSystemImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPackageSystem()
     * @generated
     */
    EClass PACKAGE_SYSTEM = eINSTANCE.getPackageSystem();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__SYSTEM = eINSTANCE.getPackageSystem_System();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__ENTITIES = eINSTANCE.getPackageSystem_Entities();

    /**
     * The meta object literal for the '<em><b>Business Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__BUSINESS_ENTITIES = eINSTANCE.getPackageSystem_BusinessEntities();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__ACTORS = eINSTANCE.getPackageSystem_Actors();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__REQUIREMENTS = eINSTANCE.getPackageSystem_Requirements();

    /**
     * The meta object literal for the '<em><b>State Machine</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__STATE_MACHINE = eINSTANCE.getPackageSystem_StateMachine();

    /**
     * The meta object literal for the '<em><b>Requirement Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__REQUIREMENT_RELATIONS = eINSTANCE.getPackageSystem_RequirementRelations();

    /**
     * The meta object literal for the '<em><b>System Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SYSTEM__SYSTEM_RELATIONS = eINSTANCE.getPackageSystem_SystemRelations();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ProjectImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__TYPE = eINSTANCE.getProject_Type();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME_ALIAS = eINSTANCE.getProject_NameAlias();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__DOMAIN = eINSTANCE.getProject_Domain();

    /**
     * The meta object literal for the '<em><b>Planned</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PLANNED = eINSTANCE.getProject_Planned();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__ACTUAL = eINSTANCE.getProject_Actual();

    /**
     * The meta object literal for the '<em><b>Organizations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__ORGANIZATIONS = eINSTANCE.getProject_Organizations();

    /**
     * The meta object literal for the '<em><b>Progress</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PROGRESS = eINSTANCE.getProject_Progress();

    /**
     * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__SUMMARY = eINSTANCE.getProject_Summary();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.PlannedScheduleImpl <em>Planned Schedule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.PlannedScheduleImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPlannedSchedule()
     * @generated
     */
    EClass PLANNED_SCHEDULE = eINSTANCE.getPlannedSchedule();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANNED_SCHEDULE__START = eINSTANCE.getPlannedSchedule_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLANNED_SCHEDULE__END = eINSTANCE.getPlannedSchedule_End();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ActualScheduleImpl <em>Actual Schedule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ActualScheduleImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getActualSchedule()
     * @generated
     */
    EClass ACTUAL_SCHEDULE = eINSTANCE.getActualSchedule();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_SCHEDULE__START = eINSTANCE.getActualSchedule_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_SCHEDULE__END = eINSTANCE.getActualSchedule_End();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.OrganizationsImpl <em>Organizations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.OrganizationsImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getOrganizations()
     * @generated
     */
    EClass ORGANIZATIONS = eINSTANCE.getOrganizations();

    /**
     * The meta object literal for the '<em><b>Customer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZATIONS__CUSTOMER = eINSTANCE.getOrganizations_Customer();

    /**
     * The meta object literal for the '<em><b>Supplier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZATIONS__SUPPLIER = eINSTANCE.getOrganizations_Supplier();

    /**
     * The meta object literal for the '<em><b>Partners</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANIZATIONS__PARTNERS = eINSTANCE.getOrganizations_Partners();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.GlossaryTermImpl <em>Glossary Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.GlossaryTermImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getGlossaryTerm()
     * @generated
     */
    EClass GLOSSARY_TERM = eINSTANCE.getGlossaryTerm();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__NAME = eINSTANCE.getGlossaryTerm_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__TYPE = eINSTANCE.getGlossaryTerm_Type();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__NAME_ALIAS = eINSTANCE.getGlossaryTerm_NameAlias();

    /**
     * The meta object literal for the '<em><b>Acronym</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__ACRONYM = eINSTANCE.getGlossaryTerm_Acronym();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOSSARY_TERM__REF = eINSTANCE.getGlossaryTerm_Ref();

    /**
     * The meta object literal for the '<em><b>Synonym</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__SYNONYM = eINSTANCE.getGlossaryTerm_Synonym();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOSSARY_TERM__SUPER = eINSTANCE.getGlossaryTerm_Super();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOSSARY_TERM__DESCRIPTION = eINSTANCE.getGlossaryTerm_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.TermApplicationImpl <em>Term Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.TermApplicationImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getTermApplication()
     * @generated
     */
    EClass TERM_APPLICATION = eINSTANCE.getTermApplication();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_APPLICATION__VALUE = eINSTANCE.getTermApplication_Value();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.RefTermApplicationImpl <em>Ref Term Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.RefTermApplicationImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefTermApplication()
     * @generated
     */
    EClass REF_TERM_APPLICATION = eINSTANCE.getRefTermApplication();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_TERM_APPLICATION__REFS = eINSTANCE.getRefTermApplication_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.StakeholderImpl <em>Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.StakeholderImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStakeholder()
     * @generated
     */
    EClass STAKEHOLDER = eINSTANCE.getStakeholder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__NAME = eINSTANCE.getStakeholder_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__TYPE = eINSTANCE.getStakeholder_Type();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__NAME_ALIAS = eINSTANCE.getStakeholder_NameAlias();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__CATEGORY = eINSTANCE.getStakeholder_Category();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKEHOLDER__SUPER = eINSTANCE.getStakeholder_Super();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKEHOLDER__PART_OF = eINSTANCE.getStakeholder_PartOf();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__DESCRIPTION = eINSTANCE.getStakeholder_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.SystemImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__TYPE = eINSTANCE.getSystem_Type();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME_ALIAS = eINSTANCE.getSystem_NameAlias();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__SCOPE = eINSTANCE.getSystem_Scope();

    /**
     * The meta object literal for the '<em><b>Sub Systems</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__SUB_SYSTEMS = eINSTANCE.getSystem_SubSystems();

    /**
     * The meta object literal for the '<em><b>Reusable Systems</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__REUSABLE_SYSTEMS = eINSTANCE.getSystem_ReusableSystems();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__DESCRIPTION = eINSTANCE.getSystem_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.RefSystemImpl <em>Ref System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.RefSystemImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefSystem()
     * @generated
     */
    EClass REF_SYSTEM = eINSTANCE.getRefSystem();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_SYSTEM__REFS = eINSTANCE.getRefSystem_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.SystemRelationImpl <em>System Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.SystemRelationImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemRelation()
     * @generated
     */
    EClass SYSTEM_RELATION = eINSTANCE.getSystemRelation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_RELATION__NAME = eINSTANCE.getSystemRelation_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_RELATION__TYPE = eINSTANCE.getSystemRelation_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_RELATION__SOURCE = eINSTANCE.getSystemRelation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_RELATION__TARGET = eINSTANCE.getSystemRelation_Target();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_RELATION__CATEGORY = eINSTANCE.getSystemRelation_Category();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_RELATION__DESCRIPTION = eINSTANCE.getSystemRelation_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.EntityImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__TYPE = eINSTANCE.getEntity_Type();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME_ALIAS = eINSTANCE.getEntity_NameAlias();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER = eINSTANCE.getEntity_Super();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

    /**
     * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PRIMARY_KEY = eINSTANCE.getEntity_PrimaryKey();

    /**
     * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FOREIGN_KEYS = eINSTANCE.getEntity_ForeignKeys();

    /**
     * The meta object literal for the '<em><b>Checks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__CHECKS = eINSTANCE.getEntity_Checks();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__DESCRIPTION = eINSTANCE.getEntity_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.AttributeImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__SIZE = eINSTANCE.getAttribute_Size();

    /**
     * The meta object literal for the '<em><b>Subsize</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__SUBSIZE = eINSTANCE.getAttribute_Subsize();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME_ALIAS = eINSTANCE.getAttribute_NameAlias();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__MULTIPLICITY = eINSTANCE.getAttribute_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Not Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NOT_NULL = eINSTANCE.getAttribute_NotNull();

    /**
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__UNIQUE = eINSTANCE.getAttribute_Unique();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.MultiplicityImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getMultiplicity()
     * @generated
     */
    EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__VALUE = eINSTANCE.getMultiplicity_Value();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.PrimaryKeyImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getPrimaryKey()
     * @generated
     */
    EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

    /**
     * The meta object literal for the '<em><b>Ref To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_KEY__REF_TO = eINSTANCE.getPrimaryKey_RefTo();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ForeignKeyImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getForeignKey()
     * @generated
     */
    EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

    /**
     * The meta object literal for the '<em><b>Fentity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__FENTITY = eINSTANCE.getForeignKey_Fentity();

    /**
     * The meta object literal for the '<em><b>Ref To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__REF_TO = eINSTANCE.getForeignKey_RefTo();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.RefAttributeImpl <em>Ref Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.RefAttributeImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefAttribute()
     * @generated
     */
    EClass REF_ATTRIBUTE = eINSTANCE.getRefAttribute();

    /**
     * The meta object literal for the '<em><b>Ref Attr</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ATTRIBUTE__REF_ATTR = eINSTANCE.getRefAttribute_RefAttr();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.CheckImpl <em>Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.CheckImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getCheck()
     * @generated
     */
    EClass CHECK = eINSTANCE.getCheck();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK__NAME = eINSTANCE.getCheck_Name();

    /**
     * The meta object literal for the '<em><b>Check Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK__CHECK_EXPRESSION = eINSTANCE.getCheck_CheckExpression();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.BusinessEntityImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getBusinessEntity()
     * @generated
     */
    EClass BUSINESS_ENTITY = eINSTANCE.getBusinessEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_ENTITY__NAME = eINSTANCE.getBusinessEntity_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_ENTITY__TYPE = eINSTANCE.getBusinessEntity_Type();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_ENTITY__NAME_ALIAS = eINSTANCE.getBusinessEntity_NameAlias();

    /**
     * The meta object literal for the '<em><b>Master</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_ENTITY__MASTER = eINSTANCE.getBusinessEntity_Master();

    /**
     * The meta object literal for the '<em><b>Detail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_ENTITY__DETAIL = eINSTANCE.getBusinessEntity_Detail();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_ENTITY__REFERENCE = eINSTANCE.getBusinessEntity_Reference();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_ENTITY__DESCRIPTION = eINSTANCE.getBusinessEntity_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.MasterBEntityImpl <em>Master BEntity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.MasterBEntityImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getMasterBEntity()
     * @generated
     */
    EClass MASTER_BENTITY = eINSTANCE.getMasterBEntity();

    /**
     * The meta object literal for the '<em><b>Master Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MASTER_BENTITY__MASTER_ENTITY = eINSTANCE.getMasterBEntity_MasterEntity();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.DetailBEntityImpl <em>Detail BEntity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.DetailBEntityImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getDetailBEntity()
     * @generated
     */
    EClass DETAIL_BENTITY = eINSTANCE.getDetailBEntity();

    /**
     * The meta object literal for the '<em><b>Entity Detail</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DETAIL_BENTITY__ENTITY_DETAIL = eINSTANCE.getDetailBEntity_EntityDetail();

    /**
     * The meta object literal for the '<em><b>Ref Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DETAIL_BENTITY__REF_ENTITY = eINSTANCE.getDetailBEntity_RefEntity();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ReferenceBEntityImpl <em>Reference BEntity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ReferenceBEntityImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getReferenceBEntity()
     * @generated
     */
    EClass REFERENCE_BENTITY = eINSTANCE.getReferenceBEntity();

    /**
     * The meta object literal for the '<em><b>Ref Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_BENTITY__REF_ENTITY = eINSTANCE.getReferenceBEntity_RefEntity();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.RefEntityImpl <em>Ref Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.RefEntityImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefEntity()
     * @generated
     */
    EClass REF_ENTITY = eINSTANCE.getRefEntity();

    /**
     * The meta object literal for the '<em><b>Ref Entity</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ENTITY__REF_ENTITY = eINSTANCE.getRefEntity_RefEntity();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ActorImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__TYPE = eINSTANCE.getActor_Type();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__NAME_ALIAS = eINSTANCE.getActor_NameAlias();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__STAKEHOLDER = eINSTANCE.getActor_Stakeholder();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__SUPER = eINSTANCE.getActor_Super();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__DESCRIPTION = eINSTANCE.getActor_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.RequirementImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__NAME_ALIAS = eINSTANCE.getRequirement_NameAlias();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__STAKEHOLDER = eINSTANCE.getRequirement_Stakeholder();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

    /**
     * The meta object literal for the '<em><b>Progress</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__PROGRESS = eINSTANCE.getRequirement_Progress();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.RequirementRelationImpl <em>Requirement Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.RequirementRelationImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRequirementRelation()
     * @generated
     */
    EClass REQUIREMENT_RELATION = eINSTANCE.getRequirementRelation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT_RELATION__NAME = eINSTANCE.getRequirementRelation_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT_RELATION__TYPE = eINSTANCE.getRequirementRelation_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT_RELATION__SOURCE = eINSTANCE.getRequirementRelation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT_RELATION__TARGET = eINSTANCE.getRequirementRelation_Target();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT_RELATION__DESCRIPTION = eINSTANCE.getRequirementRelation_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.GoalImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__TYPE = eINSTANCE.getGoal_Type();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__PART_OF = eINSTANCE.getGoal_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.FRImpl <em>FR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.FRImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getFR()
     * @generated
     */
    EClass FR = eINSTANCE.getFR();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FR__TYPE = eINSTANCE.getFR_Type();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FR__PART_OF = eINSTANCE.getFR_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.QRImpl <em>QR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.QRImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getQR()
     * @generated
     */
    EClass QR = eINSTANCE.getQR();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QR__TYPE = eINSTANCE.getQR_Type();

    /**
     * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QR__SUB_TYPE = eINSTANCE.getQR_SubType();

    /**
     * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QR__METRIC = eINSTANCE.getQR_Metric();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QR__VALUE = eINSTANCE.getQR_Value();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QR__PART_OF = eINSTANCE.getQR_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ConstraintImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__TYPE = eINSTANCE.getConstraint_Type();

    /**
     * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__SUB_TYPE = eINSTANCE.getConstraint_SubType();

    /**
     * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__PART_OF = eINSTANCE.getConstraint_PartOf();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.UseCaseImpl <em>Use Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.UseCaseImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUseCase()
     * @generated
     */
    EClass USE_CASE = eINSTANCE.getUseCase();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__TYPE = eINSTANCE.getUseCase_Type();

    /**
     * The meta object literal for the '<em><b>Actor Initiates</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__ACTOR_INITIATES = eINSTANCE.getUseCase_ActorInitiates();

    /**
     * The meta object literal for the '<em><b>Actor Participates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__ACTOR_PARTICIPATES = eINSTANCE.getUseCase_ActorParticipates();

    /**
     * The meta object literal for the '<em><b>BEntity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__BENTITY = eINSTANCE.getUseCase_BEntity();

    /**
     * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__PRECONDITION = eINSTANCE.getUseCase_Precondition();

    /**
     * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_CASE__POSTCONDITION = eINSTANCE.getUseCase_Postcondition();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__ACTIONS = eINSTANCE.getUseCase_Actions();

    /**
     * The meta object literal for the '<em><b>Extension Points</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__EXTENSION_POINTS = eINSTANCE.getUseCase_ExtensionPoints();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__INCLUDES = eINSTANCE.getUseCase_Includes();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__EXTENDS = eINSTANCE.getUseCase_Extends();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_CASE__SCENARIOS = eINSTANCE.getUseCase_Scenarios();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.RefActorImpl <em>Ref Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.RefActorImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefActor()
     * @generated
     */
    EClass REF_ACTOR = eINSTANCE.getRefActor();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_ACTOR__REFS = eINSTANCE.getRefActor_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.UCActionsImpl <em>UC Actions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.UCActionsImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCActions()
     * @generated
     */
    EClass UC_ACTIONS = eINSTANCE.getUCActions();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UC_ACTIONS__ACTIONS = eINSTANCE.getUCActions_Actions();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.UCActionImpl <em>UC Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.UCActionImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCAction()
     * @generated
     */
    EClass UC_ACTION = eINSTANCE.getUCAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UC_ACTION__NAME = eINSTANCE.getUCAction_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UC_ACTION__DESCRIPTION = eINSTANCE.getUCAction_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.UCIncludesImpl <em>UC Includes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.UCIncludesImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCIncludes()
     * @generated
     */
    EClass UC_INCLUDES = eINSTANCE.getUCIncludes();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UC_INCLUDES__INCLUDES = eINSTANCE.getUCIncludes_Includes();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.UCExtendsImpl <em>UC Extends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.UCExtendsImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCExtends()
     * @generated
     */
    EClass UC_EXTENDS = eINSTANCE.getUCExtends();

    /**
     * The meta object literal for the '<em><b>Usecase</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UC_EXTENDS__USECASE = eINSTANCE.getUCExtends_Usecase();

    /**
     * The meta object literal for the '<em><b>Extension Point</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UC_EXTENDS__EXTENSION_POINT = eINSTANCE.getUCExtends_ExtensionPoint();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.UCExtensionPointsImpl <em>UC Extension Points</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.UCExtensionPointsImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCExtensionPoints()
     * @generated
     */
    EClass UC_EXTENSION_POINTS = eINSTANCE.getUCExtensionPoints();

    /**
     * The meta object literal for the '<em><b>Extension Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UC_EXTENSION_POINTS__EXTENSION_POINTS = eINSTANCE.getUCExtensionPoints_ExtensionPoints();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.UCExtensionPointImpl <em>UC Extension Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.UCExtensionPointImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUCExtensionPoint()
     * @generated
     */
    EClass UC_EXTENSION_POINT = eINSTANCE.getUCExtensionPoint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UC_EXTENSION_POINT__NAME = eINSTANCE.getUCExtensionPoint_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UC_EXTENSION_POINT__DESCRIPTION = eINSTANCE.getUCExtensionPoint_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.RefUCImpl <em>Ref UC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.RefUCImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefUC()
     * @generated
     */
    EClass REF_UC = eINSTANCE.getRefUC();

    /**
     * The meta object literal for the '<em><b>Refs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_UC__REFS = eINSTANCE.getRefUC_Refs();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.ScenarioImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__TYPE = eINSTANCE.getScenario_Type();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME_ALIAS = eINSTANCE.getScenario_NameAlias();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__MODE = eINSTANCE.getScenario_Mode();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__DESCRIPTION = eINSTANCE.getScenario_Description();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__STEPS = eINSTANCE.getScenario_Steps();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.StepImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__NAME = eINSTANCE.getStep_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__TYPE = eINSTANCE.getStep_Type();

    /**
     * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__SUB_TYPE = eINSTANCE.getStep_SubType();

    /**
     * The meta object literal for the '<em><b>Simple Step</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__SIMPLE_STEP = eINSTANCE.getStep_SimpleStep();

    /**
     * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__SUB_STEPS = eINSTANCE.getStep_SubSteps();

    /**
     * The meta object literal for the '<em><b>If Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__IF_STEPS = eINSTANCE.getStep_IfSteps();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.SimpleStepImpl <em>Simple Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.SimpleStepImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSimpleStep()
     * @generated
     */
    EClass SIMPLE_STEP = eINSTANCE.getSimpleStep();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_STEP__NAME_ALIAS = eINSTANCE.getSimpleStep_NameAlias();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STEP__ACTOR = eINSTANCE.getSimpleStep_Actor();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_STEP__DESCRIPTION = eINSTANCE.getSimpleStep_Description();

    /**
     * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_STEP__PRECONDITION = eINSTANCE.getSimpleStep_Precondition();

    /**
     * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_STEP__POSTCONDITION = eINSTANCE.getSimpleStep_Postcondition();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_STEP__NEXT = eINSTANCE.getSimpleStep_Next();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.IfStepImpl <em>If Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.IfStepImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getIfStep()
     * @generated
     */
    EClass IF_STEP = eINSTANCE.getIfStep();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STEP__ACTION = eINSTANCE.getIfStep_Action();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STEP__STEPS = eINSTANCE.getIfStep_Steps();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.StateMachineImpl <em>State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.StateMachineImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStateMachine()
     * @generated
     */
    EClass STATE_MACHINE = eINSTANCE.getStateMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_MACHINE__NAME = eINSTANCE.getStateMachine_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_MACHINE__TYPE = eINSTANCE.getStateMachine_Type();

    /**
     * The meta object literal for the '<em><b>Name Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_MACHINE__NAME_ALIAS = eINSTANCE.getStateMachine_NameAlias();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__ENTITY = eINSTANCE.getStateMachine_Entity();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_MACHINE__DESCRIPTION = eINSTANCE.getStateMachine_Description();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.StatesImpl <em>States</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.StatesImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStates()
     * @generated
     */
    EClass STATES = eINSTANCE.getStates();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.StateImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATES = eINSTANCE.getState_States();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

    /**
     * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__IS_FINAL = eINSTANCE.getState_IsFinal();

    /**
     * The meta object literal for the '<em><b>On Entry</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__ON_ENTRY = eINSTANCE.getState_OnEntry();

    /**
     * The meta object literal for the '<em><b>On Exit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__ON_EXIT = eINSTANCE.getState_OnExit();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.TransitionImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Uc Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__UC_ACTION = eINSTANCE.getTransition_UcAction();

    /**
     * The meta object literal for the '<em><b>Nextstate</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__NEXTSTATE = eINSTANCE.getTransition_Nextstate();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.impl.RefUCActionImpl <em>Ref UC Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.impl.RefUCActionImpl
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRefUCAction()
     * @generated
     */
    EClass REF_UC_ACTION = eINSTANCE.getRefUCAction();

    /**
     * The meta object literal for the '<em><b>Use Case</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_UC_ACTION__USE_CASE = eINSTANCE.getRefUCAction_UseCase();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_UC_ACTION__ACTION = eINSTANCE.getRefUCAction_Action();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.ProjectType <em>Project Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.ProjectType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getProjectType()
     * @generated
     */
    EEnum PROJECT_TYPE = eINSTANCE.getProjectType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.ProjectDomain <em>Project Domain</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.ProjectDomain
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getProjectDomain()
     * @generated
     */
    EEnum PROJECT_DOMAIN = eINSTANCE.getProjectDomain();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.TermType <em>Term Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.TermType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getTermType()
     * @generated
     */
    EEnum TERM_TYPE = eINSTANCE.getTermType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.StakeholderType <em>Stakeholder Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.StakeholderType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStakeholderType()
     * @generated
     */
    EEnum STAKEHOLDER_TYPE = eINSTANCE.getStakeholderType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.StakeholderCategory <em>Stakeholder Category</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.StakeholderCategory
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStakeholderCategory()
     * @generated
     */
    EEnum STAKEHOLDER_CATEGORY = eINSTANCE.getStakeholderCategory();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.SystemType <em>System Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.SystemType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemType()
     * @generated
     */
    EEnum SYSTEM_TYPE = eINSTANCE.getSystemType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.SystemScope <em>System Scope</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.SystemScope
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemScope()
     * @generated
     */
    EEnum SYSTEM_SCOPE = eINSTANCE.getSystemScope();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.SystemRelationType <em>System Relation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.SystemRelationType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemRelationType()
     * @generated
     */
    EEnum SYSTEM_RELATION_TYPE = eINSTANCE.getSystemRelationType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.SystemRelationCategory <em>System Relation Category</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.SystemRelationCategory
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getSystemRelationCategory()
     * @generated
     */
    EEnum SYSTEM_RELATION_CATEGORY = eINSTANCE.getSystemRelationCategory();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.EntityType <em>Entity Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.EntityType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getEntityType()
     * @generated
     */
    EEnum ENTITY_TYPE = eINSTANCE.getEntityType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.AttributeType <em>Attribute Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.AttributeType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getAttributeType()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.BusinessEntityType <em>Business Entity Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.BusinessEntityType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getBusinessEntityType()
     * @generated
     */
    EEnum BUSINESS_ENTITY_TYPE = eINSTANCE.getBusinessEntityType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.ActorType <em>Actor Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.ActorType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getActorType()
     * @generated
     */
    EEnum ACTOR_TYPE = eINSTANCE.getActorType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.RequirementRelationType <em>Requirement Relation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.RequirementRelationType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getRequirementRelationType()
     * @generated
     */
    EEnum REQUIREMENT_RELATION_TYPE = eINSTANCE.getRequirementRelationType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.GoalType <em>Goal Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.GoalType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getGoalType()
     * @generated
     */
    EEnum GOAL_TYPE = eINSTANCE.getGoalType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.FRType <em>FR Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.FRType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getFRType()
     * @generated
     */
    EEnum FR_TYPE = eINSTANCE.getFRType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.QRType <em>QR Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.QRType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getQRType()
     * @generated
     */
    EEnum QR_TYPE = eINSTANCE.getQRType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.QRSubType <em>QR Sub Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.QRSubType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getQRSubType()
     * @generated
     */
    EEnum QR_SUB_TYPE = eINSTANCE.getQRSubType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.Metric <em>Metric</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.Metric
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getMetric()
     * @generated
     */
    EEnum METRIC = eINSTANCE.getMetric();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.ConstraintType <em>Constraint Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.ConstraintType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getConstraintType()
     * @generated
     */
    EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.ConstraintSubType <em>Constraint Sub Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.ConstraintSubType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getConstraintSubType()
     * @generated
     */
    EEnum CONSTRAINT_SUB_TYPE = eINSTANCE.getConstraintSubType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.UseCaseType <em>Use Case Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.UseCaseType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getUseCaseType()
     * @generated
     */
    EEnum USE_CASE_TYPE = eINSTANCE.getUseCaseType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.ScenarioType <em>Scenario Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.ScenarioType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getScenarioType()
     * @generated
     */
    EEnum SCENARIO_TYPE = eINSTANCE.getScenarioType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.StepOperationType <em>Step Operation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.StepOperationType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStepOperationType()
     * @generated
     */
    EEnum STEP_OPERATION_TYPE = eINSTANCE.getStepOperationType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.StepOperationSubType <em>Step Operation Sub Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.StepOperationSubType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStepOperationSubType()
     * @generated
     */
    EEnum STEP_OPERATION_SUB_TYPE = eINSTANCE.getStepOperationSubType();

    /**
     * The meta object literal for the '{@link rslingo.rsl.rsl.StateMachineType <em>State Machine Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see rslingo.rsl.rsl.StateMachineType
     * @see rslingo.rsl.rsl.impl.RslPackageImpl#getStateMachineType()
     * @generated
     */
    EEnum STATE_MACHINE_TYPE = eINSTANCE.getStateMachineType();

  }

} //RslPackage
