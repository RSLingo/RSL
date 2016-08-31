/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rslingo.rsl.rsl.Actor;
import rslingo.rsl.rsl.ActorType;
import rslingo.rsl.rsl.ActualSchedule;
import rslingo.rsl.rsl.Attribute;
import rslingo.rsl.rsl.AttributeType;
import rslingo.rsl.rsl.BusinessEntity;
import rslingo.rsl.rsl.BusinessEntityType;
import rslingo.rsl.rsl.Check;
import rslingo.rsl.rsl.Constraint;
import rslingo.rsl.rsl.ConstraintSubType;
import rslingo.rsl.rsl.ConstraintType;
import rslingo.rsl.rsl.Date;
import rslingo.rsl.rsl.DetailBEntity;
import rslingo.rsl.rsl.Entity;
import rslingo.rsl.rsl.EntityType;
import rslingo.rsl.rsl.FR;
import rslingo.rsl.rsl.FRType;
import rslingo.rsl.rsl.ForeignKey;
import rslingo.rsl.rsl.GlossaryTerm;
import rslingo.rsl.rsl.Goal;
import rslingo.rsl.rsl.GoalType;
import rslingo.rsl.rsl.IfStep;
import rslingo.rsl.rsl.Import;
import rslingo.rsl.rsl.MasterBEntity;
import rslingo.rsl.rsl.Metric;
import rslingo.rsl.rsl.Model;
import rslingo.rsl.rsl.Month;
import rslingo.rsl.rsl.Multiplicity;
import rslingo.rsl.rsl.Organizations;
import rslingo.rsl.rsl.PackageAbstract;
import rslingo.rsl.rsl.PackageGlossary;
import rslingo.rsl.rsl.PackageProject;
import rslingo.rsl.rsl.PackageStakeholder;
import rslingo.rsl.rsl.PackageSystem;
import rslingo.rsl.rsl.PlannedSchedule;
import rslingo.rsl.rsl.PrimaryKey;
import rslingo.rsl.rsl.Priority;
import rslingo.rsl.rsl.Progress;
import rslingo.rsl.rsl.Project;
import rslingo.rsl.rsl.ProjectDomain;
import rslingo.rsl.rsl.ProjectType;
import rslingo.rsl.rsl.QR;
import rslingo.rsl.rsl.QRSubType;
import rslingo.rsl.rsl.QRType;
import rslingo.rsl.rsl.RefActor;
import rslingo.rsl.rsl.RefAttribute;
import rslingo.rsl.rsl.RefEntity;
import rslingo.rsl.rsl.RefSystem;
import rslingo.rsl.rsl.RefTermApplication;
import rslingo.rsl.rsl.RefUC;
import rslingo.rsl.rsl.RefUCAction;
import rslingo.rsl.rsl.ReferenceBEntity;
import rslingo.rsl.rsl.Requirement;
import rslingo.rsl.rsl.RequirementRelation;
import rslingo.rsl.rsl.RequirementRelationType;
import rslingo.rsl.rsl.RslFactory;
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.Scenario;
import rslingo.rsl.rsl.ScenarioType;
import rslingo.rsl.rsl.SimpleStep;
import rslingo.rsl.rsl.Stakeholder;
import rslingo.rsl.rsl.StakeholderCategory;
import rslingo.rsl.rsl.StakeholderType;
import rslingo.rsl.rsl.State;
import rslingo.rsl.rsl.StateMachine;
import rslingo.rsl.rsl.StateMachineType;
import rslingo.rsl.rsl.States;
import rslingo.rsl.rsl.Step;
import rslingo.rsl.rsl.StepOperationSubType;
import rslingo.rsl.rsl.StepOperationType;
import rslingo.rsl.rsl.SystemRelation;
import rslingo.rsl.rsl.SystemRelationCategory;
import rslingo.rsl.rsl.SystemRelationType;
import rslingo.rsl.rsl.SystemScope;
import rslingo.rsl.rsl.SystemType;
import rslingo.rsl.rsl.TermApplication;
import rslingo.rsl.rsl.TermType;
import rslingo.rsl.rsl.Transition;
import rslingo.rsl.rsl.UCAction;
import rslingo.rsl.rsl.UCActions;
import rslingo.rsl.rsl.UCExtends;
import rslingo.rsl.rsl.UCExtensionPoint;
import rslingo.rsl.rsl.UCExtensionPoints;
import rslingo.rsl.rsl.UCIncludes;
import rslingo.rsl.rsl.UseCase;
import rslingo.rsl.rsl.UseCaseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RslFactoryImpl extends EFactoryImpl implements RslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RslFactory init()
  {
    try
    {
      RslFactory theRslFactory = (RslFactory)EPackage.Registry.INSTANCE.getEFactory(RslPackage.eNS_URI);
      if (theRslFactory != null)
      {
        return theRslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RslPackage.MODEL: return createModel();
      case RslPackage.PACKAGE_ABSTRACT: return createPackageAbstract();
      case RslPackage.IMPORT: return createImport();
      case RslPackage.DATE: return createDate();
      case RslPackage.MONTH: return createMonth();
      case RslPackage.PROGRESS: return createProgress();
      case RslPackage.PRIORITY: return createPriority();
      case RslPackage.PACKAGE_PROJECT: return createPackageProject();
      case RslPackage.PACKAGE_GLOSSARY: return createPackageGlossary();
      case RslPackage.PACKAGE_STAKEHOLDER: return createPackageStakeholder();
      case RslPackage.PACKAGE_SYSTEM: return createPackageSystem();
      case RslPackage.PROJECT: return createProject();
      case RslPackage.PLANNED_SCHEDULE: return createPlannedSchedule();
      case RslPackage.ACTUAL_SCHEDULE: return createActualSchedule();
      case RslPackage.ORGANIZATIONS: return createOrganizations();
      case RslPackage.GLOSSARY_TERM: return createGlossaryTerm();
      case RslPackage.TERM_APPLICATION: return createTermApplication();
      case RslPackage.REF_TERM_APPLICATION: return createRefTermApplication();
      case RslPackage.STAKEHOLDER: return createStakeholder();
      case RslPackage.SYSTEM: return createSystem();
      case RslPackage.REF_SYSTEM: return createRefSystem();
      case RslPackage.SYSTEM_RELATION: return createSystemRelation();
      case RslPackage.ENTITY: return createEntity();
      case RslPackage.ATTRIBUTE: return createAttribute();
      case RslPackage.MULTIPLICITY: return createMultiplicity();
      case RslPackage.PRIMARY_KEY: return createPrimaryKey();
      case RslPackage.FOREIGN_KEY: return createForeignKey();
      case RslPackage.REF_ATTRIBUTE: return createRefAttribute();
      case RslPackage.CHECK: return createCheck();
      case RslPackage.BUSINESS_ENTITY: return createBusinessEntity();
      case RslPackage.MASTER_BENTITY: return createMasterBEntity();
      case RslPackage.DETAIL_BENTITY: return createDetailBEntity();
      case RslPackage.REFERENCE_BENTITY: return createReferenceBEntity();
      case RslPackage.REF_ENTITY: return createRefEntity();
      case RslPackage.ACTOR: return createActor();
      case RslPackage.REQUIREMENT: return createRequirement();
      case RslPackage.REQUIREMENT_RELATION: return createRequirementRelation();
      case RslPackage.GOAL: return createGoal();
      case RslPackage.FR: return createFR();
      case RslPackage.QR: return createQR();
      case RslPackage.CONSTRAINT: return createConstraint();
      case RslPackage.USE_CASE: return createUseCase();
      case RslPackage.REF_ACTOR: return createRefActor();
      case RslPackage.UC_ACTIONS: return createUCActions();
      case RslPackage.UC_ACTION: return createUCAction();
      case RslPackage.UC_INCLUDES: return createUCIncludes();
      case RslPackage.UC_EXTENDS: return createUCExtends();
      case RslPackage.UC_EXTENSION_POINTS: return createUCExtensionPoints();
      case RslPackage.UC_EXTENSION_POINT: return createUCExtensionPoint();
      case RslPackage.REF_UC: return createRefUC();
      case RslPackage.SCENARIO: return createScenario();
      case RslPackage.STEP: return createStep();
      case RslPackage.SIMPLE_STEP: return createSimpleStep();
      case RslPackage.IF_STEP: return createIfStep();
      case RslPackage.STATE_MACHINE: return createStateMachine();
      case RslPackage.STATES: return createStates();
      case RslPackage.STATE: return createState();
      case RslPackage.TRANSITION: return createTransition();
      case RslPackage.REF_UC_ACTION: return createRefUCAction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RslPackage.PROJECT_TYPE:
        return createProjectTypeFromString(eDataType, initialValue);
      case RslPackage.PROJECT_DOMAIN:
        return createProjectDomainFromString(eDataType, initialValue);
      case RslPackage.TERM_TYPE:
        return createTermTypeFromString(eDataType, initialValue);
      case RslPackage.STAKEHOLDER_TYPE:
        return createStakeholderTypeFromString(eDataType, initialValue);
      case RslPackage.STAKEHOLDER_CATEGORY:
        return createStakeholderCategoryFromString(eDataType, initialValue);
      case RslPackage.SYSTEM_TYPE:
        return createSystemTypeFromString(eDataType, initialValue);
      case RslPackage.SYSTEM_SCOPE:
        return createSystemScopeFromString(eDataType, initialValue);
      case RslPackage.SYSTEM_RELATION_TYPE:
        return createSystemRelationTypeFromString(eDataType, initialValue);
      case RslPackage.SYSTEM_RELATION_CATEGORY:
        return createSystemRelationCategoryFromString(eDataType, initialValue);
      case RslPackage.ENTITY_TYPE:
        return createEntityTypeFromString(eDataType, initialValue);
      case RslPackage.ATTRIBUTE_TYPE:
        return createAttributeTypeFromString(eDataType, initialValue);
      case RslPackage.BUSINESS_ENTITY_TYPE:
        return createBusinessEntityTypeFromString(eDataType, initialValue);
      case RslPackage.ACTOR_TYPE:
        return createActorTypeFromString(eDataType, initialValue);
      case RslPackage.REQUIREMENT_RELATION_TYPE:
        return createRequirementRelationTypeFromString(eDataType, initialValue);
      case RslPackage.GOAL_TYPE:
        return createGoalTypeFromString(eDataType, initialValue);
      case RslPackage.FR_TYPE:
        return createFRTypeFromString(eDataType, initialValue);
      case RslPackage.QR_TYPE:
        return createQRTypeFromString(eDataType, initialValue);
      case RslPackage.QR_SUB_TYPE:
        return createQRSubTypeFromString(eDataType, initialValue);
      case RslPackage.METRIC:
        return createMetricFromString(eDataType, initialValue);
      case RslPackage.CONSTRAINT_TYPE:
        return createConstraintTypeFromString(eDataType, initialValue);
      case RslPackage.CONSTRAINT_SUB_TYPE:
        return createConstraintSubTypeFromString(eDataType, initialValue);
      case RslPackage.USE_CASE_TYPE:
        return createUseCaseTypeFromString(eDataType, initialValue);
      case RslPackage.SCENARIO_TYPE:
        return createScenarioTypeFromString(eDataType, initialValue);
      case RslPackage.STEP_OPERATION_TYPE:
        return createStepOperationTypeFromString(eDataType, initialValue);
      case RslPackage.STEP_OPERATION_SUB_TYPE:
        return createStepOperationSubTypeFromString(eDataType, initialValue);
      case RslPackage.STATE_MACHINE_TYPE:
        return createStateMachineTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RslPackage.PROJECT_TYPE:
        return convertProjectTypeToString(eDataType, instanceValue);
      case RslPackage.PROJECT_DOMAIN:
        return convertProjectDomainToString(eDataType, instanceValue);
      case RslPackage.TERM_TYPE:
        return convertTermTypeToString(eDataType, instanceValue);
      case RslPackage.STAKEHOLDER_TYPE:
        return convertStakeholderTypeToString(eDataType, instanceValue);
      case RslPackage.STAKEHOLDER_CATEGORY:
        return convertStakeholderCategoryToString(eDataType, instanceValue);
      case RslPackage.SYSTEM_TYPE:
        return convertSystemTypeToString(eDataType, instanceValue);
      case RslPackage.SYSTEM_SCOPE:
        return convertSystemScopeToString(eDataType, instanceValue);
      case RslPackage.SYSTEM_RELATION_TYPE:
        return convertSystemRelationTypeToString(eDataType, instanceValue);
      case RslPackage.SYSTEM_RELATION_CATEGORY:
        return convertSystemRelationCategoryToString(eDataType, instanceValue);
      case RslPackage.ENTITY_TYPE:
        return convertEntityTypeToString(eDataType, instanceValue);
      case RslPackage.ATTRIBUTE_TYPE:
        return convertAttributeTypeToString(eDataType, instanceValue);
      case RslPackage.BUSINESS_ENTITY_TYPE:
        return convertBusinessEntityTypeToString(eDataType, instanceValue);
      case RslPackage.ACTOR_TYPE:
        return convertActorTypeToString(eDataType, instanceValue);
      case RslPackage.REQUIREMENT_RELATION_TYPE:
        return convertRequirementRelationTypeToString(eDataType, instanceValue);
      case RslPackage.GOAL_TYPE:
        return convertGoalTypeToString(eDataType, instanceValue);
      case RslPackage.FR_TYPE:
        return convertFRTypeToString(eDataType, instanceValue);
      case RslPackage.QR_TYPE:
        return convertQRTypeToString(eDataType, instanceValue);
      case RslPackage.QR_SUB_TYPE:
        return convertQRSubTypeToString(eDataType, instanceValue);
      case RslPackage.METRIC:
        return convertMetricToString(eDataType, instanceValue);
      case RslPackage.CONSTRAINT_TYPE:
        return convertConstraintTypeToString(eDataType, instanceValue);
      case RslPackage.CONSTRAINT_SUB_TYPE:
        return convertConstraintSubTypeToString(eDataType, instanceValue);
      case RslPackage.USE_CASE_TYPE:
        return convertUseCaseTypeToString(eDataType, instanceValue);
      case RslPackage.SCENARIO_TYPE:
        return convertScenarioTypeToString(eDataType, instanceValue);
      case RslPackage.STEP_OPERATION_TYPE:
        return convertStepOperationTypeToString(eDataType, instanceValue);
      case RslPackage.STEP_OPERATION_SUB_TYPE:
        return convertStepOperationSubTypeToString(eDataType, instanceValue);
      case RslPackage.STATE_MACHINE_TYPE:
        return convertStateMachineTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageAbstract createPackageAbstract()
  {
    PackageAbstractImpl packageAbstract = new PackageAbstractImpl();
    return packageAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Month createMonth()
  {
    MonthImpl month = new MonthImpl();
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Progress createProgress()
  {
    ProgressImpl progress = new ProgressImpl();
    return progress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority createPriority()
  {
    PriorityImpl priority = new PriorityImpl();
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageProject createPackageProject()
  {
    PackageProjectImpl packageProject = new PackageProjectImpl();
    return packageProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageGlossary createPackageGlossary()
  {
    PackageGlossaryImpl packageGlossary = new PackageGlossaryImpl();
    return packageGlossary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageStakeholder createPackageStakeholder()
  {
    PackageStakeholderImpl packageStakeholder = new PackageStakeholderImpl();
    return packageStakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageSystem createPackageSystem()
  {
    PackageSystemImpl packageSystem = new PackageSystemImpl();
    return packageSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedSchedule createPlannedSchedule()
  {
    PlannedScheduleImpl plannedSchedule = new PlannedScheduleImpl();
    return plannedSchedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualSchedule createActualSchedule()
  {
    ActualScheduleImpl actualSchedule = new ActualScheduleImpl();
    return actualSchedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organizations createOrganizations()
  {
    OrganizationsImpl organizations = new OrganizationsImpl();
    return organizations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlossaryTerm createGlossaryTerm()
  {
    GlossaryTermImpl glossaryTerm = new GlossaryTermImpl();
    return glossaryTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermApplication createTermApplication()
  {
    TermApplicationImpl termApplication = new TermApplicationImpl();
    return termApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefTermApplication createRefTermApplication()
  {
    RefTermApplicationImpl refTermApplication = new RefTermApplicationImpl();
    return refTermApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder createStakeholder()
  {
    StakeholderImpl stakeholder = new StakeholderImpl();
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rsl.rsl.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefSystem createRefSystem()
  {
    RefSystemImpl refSystem = new RefSystemImpl();
    return refSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemRelation createSystemRelation()
  {
    SystemRelationImpl systemRelation = new SystemRelationImpl();
    return systemRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity createMultiplicity()
  {
    MultiplicityImpl multiplicity = new MultiplicityImpl();
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKey createPrimaryKey()
  {
    PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeignKey createForeignKey()
  {
    ForeignKeyImpl foreignKey = new ForeignKeyImpl();
    return foreignKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefAttribute createRefAttribute()
  {
    RefAttributeImpl refAttribute = new RefAttributeImpl();
    return refAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Check createCheck()
  {
    CheckImpl check = new CheckImpl();
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessEntity createBusinessEntity()
  {
    BusinessEntityImpl businessEntity = new BusinessEntityImpl();
    return businessEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MasterBEntity createMasterBEntity()
  {
    MasterBEntityImpl masterBEntity = new MasterBEntityImpl();
    return masterBEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetailBEntity createDetailBEntity()
  {
    DetailBEntityImpl detailBEntity = new DetailBEntityImpl();
    return detailBEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceBEntity createReferenceBEntity()
  {
    ReferenceBEntityImpl referenceBEntity = new ReferenceBEntityImpl();
    return referenceBEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefEntity createRefEntity()
  {
    RefEntityImpl refEntity = new RefEntityImpl();
    return refEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementRelation createRequirementRelation()
  {
    RequirementRelationImpl requirementRelation = new RequirementRelationImpl();
    return requirementRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FR createFR()
  {
    FRImpl fr = new FRImpl();
    return fr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QR createQR()
  {
    QRImpl qr = new QRImpl();
    return qr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCase createUseCase()
  {
    UseCaseImpl useCase = new UseCaseImpl();
    return useCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefActor createRefActor()
  {
    RefActorImpl refActor = new RefActorImpl();
    return refActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCActions createUCActions()
  {
    UCActionsImpl ucActions = new UCActionsImpl();
    return ucActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCAction createUCAction()
  {
    UCActionImpl ucAction = new UCActionImpl();
    return ucAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCIncludes createUCIncludes()
  {
    UCIncludesImpl ucIncludes = new UCIncludesImpl();
    return ucIncludes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCExtends createUCExtends()
  {
    UCExtendsImpl ucExtends = new UCExtendsImpl();
    return ucExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCExtensionPoints createUCExtensionPoints()
  {
    UCExtensionPointsImpl ucExtensionPoints = new UCExtensionPointsImpl();
    return ucExtensionPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCExtensionPoint createUCExtensionPoint()
  {
    UCExtensionPointImpl ucExtensionPoint = new UCExtensionPointImpl();
    return ucExtensionPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefUC createRefUC()
  {
    RefUCImpl refUC = new RefUCImpl();
    return refUC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleStep createSimpleStep()
  {
    SimpleStepImpl simpleStep = new SimpleStepImpl();
    return simpleStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStep createIfStep()
  {
    IfStepImpl ifStep = new IfStepImpl();
    return ifStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachine createStateMachine()
  {
    StateMachineImpl stateMachine = new StateMachineImpl();
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States createStates()
  {
    StatesImpl states = new StatesImpl();
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefUCAction createRefUCAction()
  {
    RefUCActionImpl refUCAction = new RefUCActionImpl();
    return refUCAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectType createProjectTypeFromString(EDataType eDataType, String initialValue)
  {
    ProjectType result = ProjectType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertProjectTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectDomain createProjectDomainFromString(EDataType eDataType, String initialValue)
  {
    ProjectDomain result = ProjectDomain.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertProjectDomainToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermType createTermTypeFromString(EDataType eDataType, String initialValue)
  {
    TermType result = TermType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTermTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StakeholderType createStakeholderTypeFromString(EDataType eDataType, String initialValue)
  {
    StakeholderType result = StakeholderType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStakeholderTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StakeholderCategory createStakeholderCategoryFromString(EDataType eDataType, String initialValue)
  {
    StakeholderCategory result = StakeholderCategory.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStakeholderCategoryToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemType createSystemTypeFromString(EDataType eDataType, String initialValue)
  {
    SystemType result = SystemType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSystemTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemScope createSystemScopeFromString(EDataType eDataType, String initialValue)
  {
    SystemScope result = SystemScope.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSystemScopeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemRelationType createSystemRelationTypeFromString(EDataType eDataType, String initialValue)
  {
    SystemRelationType result = SystemRelationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSystemRelationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemRelationCategory createSystemRelationCategoryFromString(EDataType eDataType, String initialValue)
  {
    SystemRelationCategory result = SystemRelationCategory.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSystemRelationCategoryToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType createEntityTypeFromString(EDataType eDataType, String initialValue)
  {
    EntityType result = EntityType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEntityTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue)
  {
    AttributeType result = AttributeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessEntityType createBusinessEntityTypeFromString(EDataType eDataType, String initialValue)
  {
    BusinessEntityType result = BusinessEntityType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBusinessEntityTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorType createActorTypeFromString(EDataType eDataType, String initialValue)
  {
    ActorType result = ActorType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertActorTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementRelationType createRequirementRelationTypeFromString(EDataType eDataType, String initialValue)
  {
    RequirementRelationType result = RequirementRelationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRequirementRelationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoalType createGoalTypeFromString(EDataType eDataType, String initialValue)
  {
    GoalType result = GoalType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGoalTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FRType createFRTypeFromString(EDataType eDataType, String initialValue)
  {
    FRType result = FRType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFRTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QRType createQRTypeFromString(EDataType eDataType, String initialValue)
  {
    QRType result = QRType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQRTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QRSubType createQRSubTypeFromString(EDataType eDataType, String initialValue)
  {
    QRSubType result = QRSubType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQRSubTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metric createMetricFromString(EDataType eDataType, String initialValue)
  {
    Metric result = Metric.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMetricToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintType createConstraintTypeFromString(EDataType eDataType, String initialValue)
  {
    ConstraintType result = ConstraintType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConstraintTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintSubType createConstraintSubTypeFromString(EDataType eDataType, String initialValue)
  {
    ConstraintSubType result = ConstraintSubType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConstraintSubTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCaseType createUseCaseTypeFromString(EDataType eDataType, String initialValue)
  {
    UseCaseType result = UseCaseType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUseCaseTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioType createScenarioTypeFromString(EDataType eDataType, String initialValue)
  {
    ScenarioType result = ScenarioType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertScenarioTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StepOperationType createStepOperationTypeFromString(EDataType eDataType, String initialValue)
  {
    StepOperationType result = StepOperationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStepOperationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StepOperationSubType createStepOperationSubTypeFromString(EDataType eDataType, String initialValue)
  {
    StepOperationSubType result = StepOperationSubType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStepOperationSubTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachineType createStateMachineTypeFromString(EDataType eDataType, String initialValue)
  {
    StateMachineType result = StateMachineType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStateMachineTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RslPackage getRslPackage()
  {
    return (RslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RslPackage getPackage()
  {
    return RslPackage.eINSTANCE;
  }

} //RslFactoryImpl
