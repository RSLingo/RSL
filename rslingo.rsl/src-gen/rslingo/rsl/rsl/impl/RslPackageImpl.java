/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RslPackageImpl extends EPackageImpl implements RslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageAbstractEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass progressEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass priorityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageProjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageGlossaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageStakeholderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plannedScheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actualScheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass organizationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass glossaryTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refTermApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stakeholderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryKeyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foreignKeyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass businessEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass masterBEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass detailBEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceBEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass frEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refActorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ucActionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ucActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ucIncludesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ucExtendsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ucExtensionPointsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ucExtensionPointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refUCEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateMachineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refUCActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum projectTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum projectDomainEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum termTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stakeholderTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stakeholderCategoryEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum systemTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum systemScopeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum systemRelationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum systemRelationCategoryEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum entityTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum attributeTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum businessEntityTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum actorTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum requirementRelationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum goalTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum frTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum qrTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum qrSubTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum metricEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum constraintTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum constraintSubTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum useCaseTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum scenarioTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stepOperationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stepOperationSubTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stateMachineTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see rslingo.rsl.rsl.RslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RslPackageImpl()
  {
    super(eNS_URI, RslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RslPackage init()
  {
    if (isInited) return (RslPackage)EPackage.Registry.INSTANCE.getEPackage(RslPackage.eNS_URI);

    // Obtain or create and register package
    RslPackageImpl theRslPackage = (RslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRslPackage.createPackageContents();

    // Initialize created meta-data
    theRslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RslPackage.eNS_URI, theRslPackage);
    return theRslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Packages()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageAbstract()
  {
    return packageAbstractEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageAbstract_Name()
  {
    return (EAttribute)packageAbstractEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageAbstract_Imports()
  {
    return (EReference)packageAbstractEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDate()
  {
    return dateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDate_Day()
  {
    return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDate_Month()
  {
    return (EReference)dateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDate_Year()
  {
    return (EAttribute)dateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonth()
  {
    return monthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonth_Name()
  {
    return (EAttribute)monthEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgress()
  {
    return progressEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProgress_Value()
  {
    return (EAttribute)progressEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPriority()
  {
    return priorityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPriority_Value()
  {
    return (EAttribute)priorityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageProject()
  {
    return packageProjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageProject_Project()
  {
    return (EReference)packageProjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageProject_PackageGlossaries()
  {
    return (EReference)packageProjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageProject_PackageStakeholders()
  {
    return (EReference)packageProjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageProject_PackageSystems()
  {
    return (EReference)packageProjectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageProject_SystemRelations()
  {
    return (EReference)packageProjectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageGlossary()
  {
    return packageGlossaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageGlossary_GlossaryTerms()
  {
    return (EReference)packageGlossaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageStakeholder()
  {
    return packageStakeholderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageStakeholder_Stakeholders()
  {
    return (EReference)packageStakeholderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageSystem()
  {
    return packageSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSystem_System()
  {
    return (EReference)packageSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSystem_Entities()
  {
    return (EReference)packageSystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSystem_BusinessEntities()
  {
    return (EReference)packageSystemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSystem_Actors()
  {
    return (EReference)packageSystemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSystem_Requirements()
  {
    return (EReference)packageSystemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSystem_StateMachine()
  {
    return (EReference)packageSystemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSystem_RequirementRelations()
  {
    return (EReference)packageSystemEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageSystem_SystemRelations()
  {
    return (EReference)packageSystemEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProject()
  {
    return projectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Name()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Type()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_NameAlias()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Domain()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Planned()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Actual()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Organizations()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_Progress()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Summary()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Description()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlannedSchedule()
  {
    return plannedScheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlannedSchedule_Start()
  {
    return (EReference)plannedScheduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlannedSchedule_End()
  {
    return (EReference)plannedScheduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActualSchedule()
  {
    return actualScheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActualSchedule_Start()
  {
    return (EReference)actualScheduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActualSchedule_End()
  {
    return (EReference)actualScheduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrganizations()
  {
    return organizationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganizations_Customer()
  {
    return (EAttribute)organizationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganizations_Supplier()
  {
    return (EAttribute)organizationsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganizations_Partners()
  {
    return (EAttribute)organizationsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlossaryTerm()
  {
    return glossaryTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlossaryTerm_Name()
  {
    return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlossaryTerm_Type()
  {
    return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlossaryTerm_NameAlias()
  {
    return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlossaryTerm_Acronym()
  {
    return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlossaryTerm_Ref()
  {
    return (EReference)glossaryTermEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlossaryTerm_Synonym()
  {
    return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlossaryTerm_Super()
  {
    return (EReference)glossaryTermEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlossaryTerm_Description()
  {
    return (EAttribute)glossaryTermEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermApplication()
  {
    return termApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTermApplication_Value()
  {
    return (EAttribute)termApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefTermApplication()
  {
    return refTermApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefTermApplication_Refs()
  {
    return (EReference)refTermApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStakeholder()
  {
    return stakeholderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Name()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Type()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_NameAlias()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Category()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStakeholder_Super()
  {
    return (EReference)stakeholderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStakeholder_PartOf()
  {
    return (EReference)stakeholderEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Description()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystem()
  {
    return systemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystem_Name()
  {
    return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystem_Type()
  {
    return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystem_NameAlias()
  {
    return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystem_Scope()
  {
    return (EAttribute)systemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_SubSystems()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_ReusableSystems()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystem_Description()
  {
    return (EAttribute)systemEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefSystem()
  {
    return refSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefSystem_Refs()
  {
    return (EReference)refSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemRelation()
  {
    return systemRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemRelation_Name()
  {
    return (EAttribute)systemRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemRelation_Type()
  {
    return (EAttribute)systemRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemRelation_Source()
  {
    return (EReference)systemRelationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemRelation_Target()
  {
    return (EReference)systemRelationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemRelation_Category()
  {
    return (EAttribute)systemRelationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemRelation_Description()
  {
    return (EAttribute)systemRelationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Type()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_NameAlias()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Super()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Attributes()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_PrimaryKey()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_ForeignKeys()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Checks()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Description()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Type()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Size()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Subsize()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_NameAlias()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Multiplicity()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_DefaultValue()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_NotNull()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Unique()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Description()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicity()
  {
    return multiplicityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_Value()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryKey()
  {
    return primaryKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryKey_RefTo()
  {
    return (EReference)primaryKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForeignKey()
  {
    return foreignKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeignKey_Fentity()
  {
    return (EReference)foreignKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeignKey_RefTo()
  {
    return (EReference)foreignKeyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefAttribute()
  {
    return refAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefAttribute_RefAttr()
  {
    return (EReference)refAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheck()
  {
    return checkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheck_Name()
  {
    return (EAttribute)checkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCheck_CheckExpression()
  {
    return (EAttribute)checkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBusinessEntity()
  {
    return businessEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessEntity_Name()
  {
    return (EAttribute)businessEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessEntity_Type()
  {
    return (EAttribute)businessEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessEntity_NameAlias()
  {
    return (EAttribute)businessEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessEntity_Master()
  {
    return (EReference)businessEntityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessEntity_Detail()
  {
    return (EReference)businessEntityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBusinessEntity_Reference()
  {
    return (EReference)businessEntityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBusinessEntity_Description()
  {
    return (EAttribute)businessEntityEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMasterBEntity()
  {
    return masterBEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMasterBEntity_MasterEntity()
  {
    return (EReference)masterBEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDetailBEntity()
  {
    return detailBEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDetailBEntity_EntityDetail()
  {
    return (EReference)detailBEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDetailBEntity_RefEntity()
  {
    return (EReference)detailBEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceBEntity()
  {
    return referenceBEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceBEntity_RefEntity()
  {
    return (EReference)referenceBEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefEntity()
  {
    return refEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefEntity_RefEntity()
  {
    return (EReference)refEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActor()
  {
    return actorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_Name()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_Type()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_NameAlias()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActor_Stakeholder()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActor_Super()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActor_Description()
  {
    return (EAttribute)actorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirement()
  {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Name()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_NameAlias()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_Stakeholder()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_Priority()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_Progress()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Description()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirementRelation()
  {
    return requirementRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirementRelation_Name()
  {
    return (EAttribute)requirementRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirementRelation_Type()
  {
    return (EAttribute)requirementRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirementRelation_Source()
  {
    return (EReference)requirementRelationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirementRelation_Target()
  {
    return (EReference)requirementRelationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirementRelation_Description()
  {
    return (EAttribute)requirementRelationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoal()
  {
    return goalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Type()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_PartOf()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFR()
  {
    return frEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFR_Type()
  {
    return (EAttribute)frEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFR_PartOf()
  {
    return (EReference)frEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQR()
  {
    return qrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQR_Type()
  {
    return (EAttribute)qrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQR_SubType()
  {
    return (EAttribute)qrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQR_Metric()
  {
    return (EAttribute)qrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQR_Value()
  {
    return (EAttribute)qrEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQR_PartOf()
  {
    return (EReference)qrEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_Type()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraint_SubType()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_PartOf()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUseCase()
  {
    return useCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseCase_Type()
  {
    return (EAttribute)useCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseCase_ActorInitiates()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseCase_ActorParticipates()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseCase_BEntity()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseCase_Precondition()
  {
    return (EAttribute)useCaseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseCase_Postcondition()
  {
    return (EAttribute)useCaseEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseCase_Actions()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseCase_ExtensionPoints()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseCase_Includes()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseCase_Extends()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseCase_Scenarios()
  {
    return (EReference)useCaseEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefActor()
  {
    return refActorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefActor_Refs()
  {
    return (EReference)refActorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUCActions()
  {
    return ucActionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUCActions_Actions()
  {
    return (EReference)ucActionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUCAction()
  {
    return ucActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUCAction_Name()
  {
    return (EAttribute)ucActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUCAction_Description()
  {
    return (EAttribute)ucActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUCIncludes()
  {
    return ucIncludesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUCIncludes_Includes()
  {
    return (EReference)ucIncludesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUCExtends()
  {
    return ucExtendsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUCExtends_Usecase()
  {
    return (EReference)ucExtendsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUCExtends_ExtensionPoint()
  {
    return (EReference)ucExtendsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUCExtensionPoints()
  {
    return ucExtensionPointsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUCExtensionPoints_ExtensionPoints()
  {
    return (EReference)ucExtensionPointsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUCExtensionPoint()
  {
    return ucExtensionPointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUCExtensionPoint_Name()
  {
    return (EAttribute)ucExtensionPointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUCExtensionPoint_Description()
  {
    return (EAttribute)ucExtensionPointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefUC()
  {
    return refUCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefUC_Refs()
  {
    return (EReference)refUCEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScenario()
  {
    return scenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenario_Name()
  {
    return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenario_Type()
  {
    return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenario_NameAlias()
  {
    return (EAttribute)scenarioEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenario_Mode()
  {
    return (EAttribute)scenarioEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenario_Description()
  {
    return (EAttribute)scenarioEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenario_Steps()
  {
    return (EReference)scenarioEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStep()
  {
    return stepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStep_Name()
  {
    return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStep_Type()
  {
    return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStep_SubType()
  {
    return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStep_SimpleStep()
  {
    return (EReference)stepEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStep_SubSteps()
  {
    return (EReference)stepEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStep_IfSteps()
  {
    return (EReference)stepEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleStep()
  {
    return simpleStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleStep_NameAlias()
  {
    return (EAttribute)simpleStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleStep_Actor()
  {
    return (EReference)simpleStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleStep_Description()
  {
    return (EAttribute)simpleStepEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleStep_Precondition()
  {
    return (EAttribute)simpleStepEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleStep_Postcondition()
  {
    return (EAttribute)simpleStepEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleStep_Next()
  {
    return (EReference)simpleStepEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStep()
  {
    return ifStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStep_Action()
  {
    return (EReference)ifStepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStep_Steps()
  {
    return (EReference)ifStepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateMachine()
  {
    return stateMachineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateMachine_Name()
  {
    return (EAttribute)stateMachineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateMachine_Type()
  {
    return (EAttribute)stateMachineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateMachine_NameAlias()
  {
    return (EAttribute)stateMachineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachine_Entity()
  {
    return (EReference)stateMachineEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateMachine_States()
  {
    return (EReference)stateMachineEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateMachine_Description()
  {
    return (EAttribute)stateMachineEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStates()
  {
    return statesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_States()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Name()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_IsInitial()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_IsFinal()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_OnEntry()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_OnExit()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Transitions()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_UcAction()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Nextstate()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefUCAction()
  {
    return refUCActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefUCAction_UseCase()
  {
    return (EReference)refUCActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefUCAction_Action()
  {
    return (EReference)refUCActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getProjectType()
  {
    return projectTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getProjectDomain()
  {
    return projectDomainEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTermType()
  {
    return termTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStakeholderType()
  {
    return stakeholderTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStakeholderCategory()
  {
    return stakeholderCategoryEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSystemType()
  {
    return systemTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSystemScope()
  {
    return systemScopeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSystemRelationType()
  {
    return systemRelationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSystemRelationCategory()
  {
    return systemRelationCategoryEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEntityType()
  {
    return entityTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAttributeType()
  {
    return attributeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBusinessEntityType()
  {
    return businessEntityTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getActorType()
  {
    return actorTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRequirementRelationType()
  {
    return requirementRelationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGoalType()
  {
    return goalTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFRType()
  {
    return frTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getQRType()
  {
    return qrTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getQRSubType()
  {
    return qrSubTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMetric()
  {
    return metricEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConstraintType()
  {
    return constraintTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConstraintSubType()
  {
    return constraintSubTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUseCaseType()
  {
    return useCaseTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getScenarioType()
  {
    return scenarioTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStepOperationType()
  {
    return stepOperationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStepOperationSubType()
  {
    return stepOperationSubTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStateMachineType()
  {
    return stateMachineTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RslFactory getRslFactory()
  {
    return (RslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PACKAGES);

    packageAbstractEClass = createEClass(PACKAGE_ABSTRACT);
    createEAttribute(packageAbstractEClass, PACKAGE_ABSTRACT__NAME);
    createEReference(packageAbstractEClass, PACKAGE_ABSTRACT__IMPORTS);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    dateEClass = createEClass(DATE);
    createEAttribute(dateEClass, DATE__DAY);
    createEReference(dateEClass, DATE__MONTH);
    createEAttribute(dateEClass, DATE__YEAR);

    monthEClass = createEClass(MONTH);
    createEAttribute(monthEClass, MONTH__NAME);

    progressEClass = createEClass(PROGRESS);
    createEAttribute(progressEClass, PROGRESS__VALUE);

    priorityEClass = createEClass(PRIORITY);
    createEAttribute(priorityEClass, PRIORITY__VALUE);

    packageProjectEClass = createEClass(PACKAGE_PROJECT);
    createEReference(packageProjectEClass, PACKAGE_PROJECT__PROJECT);
    createEReference(packageProjectEClass, PACKAGE_PROJECT__PACKAGE_GLOSSARIES);
    createEReference(packageProjectEClass, PACKAGE_PROJECT__PACKAGE_STAKEHOLDERS);
    createEReference(packageProjectEClass, PACKAGE_PROJECT__PACKAGE_SYSTEMS);
    createEReference(packageProjectEClass, PACKAGE_PROJECT__SYSTEM_RELATIONS);

    packageGlossaryEClass = createEClass(PACKAGE_GLOSSARY);
    createEReference(packageGlossaryEClass, PACKAGE_GLOSSARY__GLOSSARY_TERMS);

    packageStakeholderEClass = createEClass(PACKAGE_STAKEHOLDER);
    createEReference(packageStakeholderEClass, PACKAGE_STAKEHOLDER__STAKEHOLDERS);

    packageSystemEClass = createEClass(PACKAGE_SYSTEM);
    createEReference(packageSystemEClass, PACKAGE_SYSTEM__SYSTEM);
    createEReference(packageSystemEClass, PACKAGE_SYSTEM__ENTITIES);
    createEReference(packageSystemEClass, PACKAGE_SYSTEM__BUSINESS_ENTITIES);
    createEReference(packageSystemEClass, PACKAGE_SYSTEM__ACTORS);
    createEReference(packageSystemEClass, PACKAGE_SYSTEM__REQUIREMENTS);
    createEReference(packageSystemEClass, PACKAGE_SYSTEM__STATE_MACHINE);
    createEReference(packageSystemEClass, PACKAGE_SYSTEM__REQUIREMENT_RELATIONS);
    createEReference(packageSystemEClass, PACKAGE_SYSTEM__SYSTEM_RELATIONS);

    projectEClass = createEClass(PROJECT);
    createEAttribute(projectEClass, PROJECT__NAME);
    createEAttribute(projectEClass, PROJECT__TYPE);
    createEAttribute(projectEClass, PROJECT__NAME_ALIAS);
    createEAttribute(projectEClass, PROJECT__DOMAIN);
    createEReference(projectEClass, PROJECT__PLANNED);
    createEReference(projectEClass, PROJECT__ACTUAL);
    createEReference(projectEClass, PROJECT__ORGANIZATIONS);
    createEReference(projectEClass, PROJECT__PROGRESS);
    createEAttribute(projectEClass, PROJECT__SUMMARY);
    createEAttribute(projectEClass, PROJECT__DESCRIPTION);

    plannedScheduleEClass = createEClass(PLANNED_SCHEDULE);
    createEReference(plannedScheduleEClass, PLANNED_SCHEDULE__START);
    createEReference(plannedScheduleEClass, PLANNED_SCHEDULE__END);

    actualScheduleEClass = createEClass(ACTUAL_SCHEDULE);
    createEReference(actualScheduleEClass, ACTUAL_SCHEDULE__START);
    createEReference(actualScheduleEClass, ACTUAL_SCHEDULE__END);

    organizationsEClass = createEClass(ORGANIZATIONS);
    createEAttribute(organizationsEClass, ORGANIZATIONS__CUSTOMER);
    createEAttribute(organizationsEClass, ORGANIZATIONS__SUPPLIER);
    createEAttribute(organizationsEClass, ORGANIZATIONS__PARTNERS);

    glossaryTermEClass = createEClass(GLOSSARY_TERM);
    createEAttribute(glossaryTermEClass, GLOSSARY_TERM__NAME);
    createEAttribute(glossaryTermEClass, GLOSSARY_TERM__TYPE);
    createEAttribute(glossaryTermEClass, GLOSSARY_TERM__NAME_ALIAS);
    createEAttribute(glossaryTermEClass, GLOSSARY_TERM__ACRONYM);
    createEReference(glossaryTermEClass, GLOSSARY_TERM__REF);
    createEAttribute(glossaryTermEClass, GLOSSARY_TERM__SYNONYM);
    createEReference(glossaryTermEClass, GLOSSARY_TERM__SUPER);
    createEAttribute(glossaryTermEClass, GLOSSARY_TERM__DESCRIPTION);

    termApplicationEClass = createEClass(TERM_APPLICATION);
    createEAttribute(termApplicationEClass, TERM_APPLICATION__VALUE);

    refTermApplicationEClass = createEClass(REF_TERM_APPLICATION);
    createEReference(refTermApplicationEClass, REF_TERM_APPLICATION__REFS);

    stakeholderEClass = createEClass(STAKEHOLDER);
    createEAttribute(stakeholderEClass, STAKEHOLDER__NAME);
    createEAttribute(stakeholderEClass, STAKEHOLDER__TYPE);
    createEAttribute(stakeholderEClass, STAKEHOLDER__NAME_ALIAS);
    createEAttribute(stakeholderEClass, STAKEHOLDER__CATEGORY);
    createEReference(stakeholderEClass, STAKEHOLDER__SUPER);
    createEReference(stakeholderEClass, STAKEHOLDER__PART_OF);
    createEAttribute(stakeholderEClass, STAKEHOLDER__DESCRIPTION);

    systemEClass = createEClass(SYSTEM);
    createEAttribute(systemEClass, SYSTEM__NAME);
    createEAttribute(systemEClass, SYSTEM__TYPE);
    createEAttribute(systemEClass, SYSTEM__NAME_ALIAS);
    createEAttribute(systemEClass, SYSTEM__SCOPE);
    createEReference(systemEClass, SYSTEM__SUB_SYSTEMS);
    createEReference(systemEClass, SYSTEM__REUSABLE_SYSTEMS);
    createEAttribute(systemEClass, SYSTEM__DESCRIPTION);

    refSystemEClass = createEClass(REF_SYSTEM);
    createEReference(refSystemEClass, REF_SYSTEM__REFS);

    systemRelationEClass = createEClass(SYSTEM_RELATION);
    createEAttribute(systemRelationEClass, SYSTEM_RELATION__NAME);
    createEAttribute(systemRelationEClass, SYSTEM_RELATION__TYPE);
    createEReference(systemRelationEClass, SYSTEM_RELATION__SOURCE);
    createEReference(systemRelationEClass, SYSTEM_RELATION__TARGET);
    createEAttribute(systemRelationEClass, SYSTEM_RELATION__CATEGORY);
    createEAttribute(systemRelationEClass, SYSTEM_RELATION__DESCRIPTION);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);
    createEAttribute(entityEClass, ENTITY__TYPE);
    createEAttribute(entityEClass, ENTITY__NAME_ALIAS);
    createEReference(entityEClass, ENTITY__SUPER);
    createEReference(entityEClass, ENTITY__ATTRIBUTES);
    createEReference(entityEClass, ENTITY__PRIMARY_KEY);
    createEReference(entityEClass, ENTITY__FOREIGN_KEYS);
    createEReference(entityEClass, ENTITY__CHECKS);
    createEAttribute(entityEClass, ENTITY__DESCRIPTION);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__SIZE);
    createEAttribute(attributeEClass, ATTRIBUTE__SUBSIZE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME_ALIAS);
    createEReference(attributeEClass, ATTRIBUTE__MULTIPLICITY);
    createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT_VALUE);
    createEAttribute(attributeEClass, ATTRIBUTE__NOT_NULL);
    createEAttribute(attributeEClass, ATTRIBUTE__UNIQUE);
    createEAttribute(attributeEClass, ATTRIBUTE__DESCRIPTION);

    multiplicityEClass = createEClass(MULTIPLICITY);
    createEAttribute(multiplicityEClass, MULTIPLICITY__VALUE);

    primaryKeyEClass = createEClass(PRIMARY_KEY);
    createEReference(primaryKeyEClass, PRIMARY_KEY__REF_TO);

    foreignKeyEClass = createEClass(FOREIGN_KEY);
    createEReference(foreignKeyEClass, FOREIGN_KEY__FENTITY);
    createEReference(foreignKeyEClass, FOREIGN_KEY__REF_TO);

    refAttributeEClass = createEClass(REF_ATTRIBUTE);
    createEReference(refAttributeEClass, REF_ATTRIBUTE__REF_ATTR);

    checkEClass = createEClass(CHECK);
    createEAttribute(checkEClass, CHECK__NAME);
    createEAttribute(checkEClass, CHECK__CHECK_EXPRESSION);

    businessEntityEClass = createEClass(BUSINESS_ENTITY);
    createEAttribute(businessEntityEClass, BUSINESS_ENTITY__NAME);
    createEAttribute(businessEntityEClass, BUSINESS_ENTITY__TYPE);
    createEAttribute(businessEntityEClass, BUSINESS_ENTITY__NAME_ALIAS);
    createEReference(businessEntityEClass, BUSINESS_ENTITY__MASTER);
    createEReference(businessEntityEClass, BUSINESS_ENTITY__DETAIL);
    createEReference(businessEntityEClass, BUSINESS_ENTITY__REFERENCE);
    createEAttribute(businessEntityEClass, BUSINESS_ENTITY__DESCRIPTION);

    masterBEntityEClass = createEClass(MASTER_BENTITY);
    createEReference(masterBEntityEClass, MASTER_BENTITY__MASTER_ENTITY);

    detailBEntityEClass = createEClass(DETAIL_BENTITY);
    createEReference(detailBEntityEClass, DETAIL_BENTITY__ENTITY_DETAIL);
    createEReference(detailBEntityEClass, DETAIL_BENTITY__REF_ENTITY);

    referenceBEntityEClass = createEClass(REFERENCE_BENTITY);
    createEReference(referenceBEntityEClass, REFERENCE_BENTITY__REF_ENTITY);

    refEntityEClass = createEClass(REF_ENTITY);
    createEReference(refEntityEClass, REF_ENTITY__REF_ENTITY);

    actorEClass = createEClass(ACTOR);
    createEAttribute(actorEClass, ACTOR__NAME);
    createEAttribute(actorEClass, ACTOR__TYPE);
    createEAttribute(actorEClass, ACTOR__NAME_ALIAS);
    createEReference(actorEClass, ACTOR__STAKEHOLDER);
    createEReference(actorEClass, ACTOR__SUPER);
    createEAttribute(actorEClass, ACTOR__DESCRIPTION);

    requirementEClass = createEClass(REQUIREMENT);
    createEAttribute(requirementEClass, REQUIREMENT__NAME);
    createEAttribute(requirementEClass, REQUIREMENT__NAME_ALIAS);
    createEReference(requirementEClass, REQUIREMENT__STAKEHOLDER);
    createEReference(requirementEClass, REQUIREMENT__PRIORITY);
    createEReference(requirementEClass, REQUIREMENT__PROGRESS);
    createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);

    requirementRelationEClass = createEClass(REQUIREMENT_RELATION);
    createEAttribute(requirementRelationEClass, REQUIREMENT_RELATION__NAME);
    createEAttribute(requirementRelationEClass, REQUIREMENT_RELATION__TYPE);
    createEReference(requirementRelationEClass, REQUIREMENT_RELATION__SOURCE);
    createEReference(requirementRelationEClass, REQUIREMENT_RELATION__TARGET);
    createEAttribute(requirementRelationEClass, REQUIREMENT_RELATION__DESCRIPTION);

    goalEClass = createEClass(GOAL);
    createEAttribute(goalEClass, GOAL__TYPE);
    createEReference(goalEClass, GOAL__PART_OF);

    frEClass = createEClass(FR);
    createEAttribute(frEClass, FR__TYPE);
    createEReference(frEClass, FR__PART_OF);

    qrEClass = createEClass(QR);
    createEAttribute(qrEClass, QR__TYPE);
    createEAttribute(qrEClass, QR__SUB_TYPE);
    createEAttribute(qrEClass, QR__METRIC);
    createEAttribute(qrEClass, QR__VALUE);
    createEReference(qrEClass, QR__PART_OF);

    constraintEClass = createEClass(CONSTRAINT);
    createEAttribute(constraintEClass, CONSTRAINT__TYPE);
    createEAttribute(constraintEClass, CONSTRAINT__SUB_TYPE);
    createEReference(constraintEClass, CONSTRAINT__PART_OF);

    useCaseEClass = createEClass(USE_CASE);
    createEAttribute(useCaseEClass, USE_CASE__TYPE);
    createEReference(useCaseEClass, USE_CASE__ACTOR_INITIATES);
    createEReference(useCaseEClass, USE_CASE__ACTOR_PARTICIPATES);
    createEReference(useCaseEClass, USE_CASE__BENTITY);
    createEAttribute(useCaseEClass, USE_CASE__PRECONDITION);
    createEAttribute(useCaseEClass, USE_CASE__POSTCONDITION);
    createEReference(useCaseEClass, USE_CASE__ACTIONS);
    createEReference(useCaseEClass, USE_CASE__EXTENSION_POINTS);
    createEReference(useCaseEClass, USE_CASE__INCLUDES);
    createEReference(useCaseEClass, USE_CASE__EXTENDS);
    createEReference(useCaseEClass, USE_CASE__SCENARIOS);

    refActorEClass = createEClass(REF_ACTOR);
    createEReference(refActorEClass, REF_ACTOR__REFS);

    ucActionsEClass = createEClass(UC_ACTIONS);
    createEReference(ucActionsEClass, UC_ACTIONS__ACTIONS);

    ucActionEClass = createEClass(UC_ACTION);
    createEAttribute(ucActionEClass, UC_ACTION__NAME);
    createEAttribute(ucActionEClass, UC_ACTION__DESCRIPTION);

    ucIncludesEClass = createEClass(UC_INCLUDES);
    createEReference(ucIncludesEClass, UC_INCLUDES__INCLUDES);

    ucExtendsEClass = createEClass(UC_EXTENDS);
    createEReference(ucExtendsEClass, UC_EXTENDS__USECASE);
    createEReference(ucExtendsEClass, UC_EXTENDS__EXTENSION_POINT);

    ucExtensionPointsEClass = createEClass(UC_EXTENSION_POINTS);
    createEReference(ucExtensionPointsEClass, UC_EXTENSION_POINTS__EXTENSION_POINTS);

    ucExtensionPointEClass = createEClass(UC_EXTENSION_POINT);
    createEAttribute(ucExtensionPointEClass, UC_EXTENSION_POINT__NAME);
    createEAttribute(ucExtensionPointEClass, UC_EXTENSION_POINT__DESCRIPTION);

    refUCEClass = createEClass(REF_UC);
    createEReference(refUCEClass, REF_UC__REFS);

    scenarioEClass = createEClass(SCENARIO);
    createEAttribute(scenarioEClass, SCENARIO__NAME);
    createEAttribute(scenarioEClass, SCENARIO__TYPE);
    createEAttribute(scenarioEClass, SCENARIO__NAME_ALIAS);
    createEAttribute(scenarioEClass, SCENARIO__MODE);
    createEAttribute(scenarioEClass, SCENARIO__DESCRIPTION);
    createEReference(scenarioEClass, SCENARIO__STEPS);

    stepEClass = createEClass(STEP);
    createEAttribute(stepEClass, STEP__NAME);
    createEAttribute(stepEClass, STEP__TYPE);
    createEAttribute(stepEClass, STEP__SUB_TYPE);
    createEReference(stepEClass, STEP__SIMPLE_STEP);
    createEReference(stepEClass, STEP__SUB_STEPS);
    createEReference(stepEClass, STEP__IF_STEPS);

    simpleStepEClass = createEClass(SIMPLE_STEP);
    createEAttribute(simpleStepEClass, SIMPLE_STEP__NAME_ALIAS);
    createEReference(simpleStepEClass, SIMPLE_STEP__ACTOR);
    createEAttribute(simpleStepEClass, SIMPLE_STEP__DESCRIPTION);
    createEAttribute(simpleStepEClass, SIMPLE_STEP__PRECONDITION);
    createEAttribute(simpleStepEClass, SIMPLE_STEP__POSTCONDITION);
    createEReference(simpleStepEClass, SIMPLE_STEP__NEXT);

    ifStepEClass = createEClass(IF_STEP);
    createEReference(ifStepEClass, IF_STEP__ACTION);
    createEReference(ifStepEClass, IF_STEP__STEPS);

    stateMachineEClass = createEClass(STATE_MACHINE);
    createEAttribute(stateMachineEClass, STATE_MACHINE__NAME);
    createEAttribute(stateMachineEClass, STATE_MACHINE__TYPE);
    createEAttribute(stateMachineEClass, STATE_MACHINE__NAME_ALIAS);
    createEReference(stateMachineEClass, STATE_MACHINE__ENTITY);
    createEReference(stateMachineEClass, STATE_MACHINE__STATES);
    createEAttribute(stateMachineEClass, STATE_MACHINE__DESCRIPTION);

    statesEClass = createEClass(STATES);

    stateEClass = createEClass(STATE);
    createEReference(stateEClass, STATE__STATES);
    createEAttribute(stateEClass, STATE__NAME);
    createEAttribute(stateEClass, STATE__IS_INITIAL);
    createEAttribute(stateEClass, STATE__IS_FINAL);
    createEAttribute(stateEClass, STATE__ON_ENTRY);
    createEAttribute(stateEClass, STATE__ON_EXIT);
    createEReference(stateEClass, STATE__TRANSITIONS);

    transitionEClass = createEClass(TRANSITION);
    createEReference(transitionEClass, TRANSITION__UC_ACTION);
    createEReference(transitionEClass, TRANSITION__NEXTSTATE);

    refUCActionEClass = createEClass(REF_UC_ACTION);
    createEReference(refUCActionEClass, REF_UC_ACTION__USE_CASE);
    createEReference(refUCActionEClass, REF_UC_ACTION__ACTION);

    // Create enums
    projectTypeEEnum = createEEnum(PROJECT_TYPE);
    projectDomainEEnum = createEEnum(PROJECT_DOMAIN);
    termTypeEEnum = createEEnum(TERM_TYPE);
    stakeholderTypeEEnum = createEEnum(STAKEHOLDER_TYPE);
    stakeholderCategoryEEnum = createEEnum(STAKEHOLDER_CATEGORY);
    systemTypeEEnum = createEEnum(SYSTEM_TYPE);
    systemScopeEEnum = createEEnum(SYSTEM_SCOPE);
    systemRelationTypeEEnum = createEEnum(SYSTEM_RELATION_TYPE);
    systemRelationCategoryEEnum = createEEnum(SYSTEM_RELATION_CATEGORY);
    entityTypeEEnum = createEEnum(ENTITY_TYPE);
    attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
    businessEntityTypeEEnum = createEEnum(BUSINESS_ENTITY_TYPE);
    actorTypeEEnum = createEEnum(ACTOR_TYPE);
    requirementRelationTypeEEnum = createEEnum(REQUIREMENT_RELATION_TYPE);
    goalTypeEEnum = createEEnum(GOAL_TYPE);
    frTypeEEnum = createEEnum(FR_TYPE);
    qrTypeEEnum = createEEnum(QR_TYPE);
    qrSubTypeEEnum = createEEnum(QR_SUB_TYPE);
    metricEEnum = createEEnum(METRIC);
    constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
    constraintSubTypeEEnum = createEEnum(CONSTRAINT_SUB_TYPE);
    useCaseTypeEEnum = createEEnum(USE_CASE_TYPE);
    scenarioTypeEEnum = createEEnum(SCENARIO_TYPE);
    stepOperationTypeEEnum = createEEnum(STEP_OPERATION_TYPE);
    stepOperationSubTypeEEnum = createEEnum(STEP_OPERATION_SUB_TYPE);
    stateMachineTypeEEnum = createEEnum(STATE_MACHINE_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageProjectEClass.getESuperTypes().add(this.getPackageAbstract());
    packageGlossaryEClass.getESuperTypes().add(this.getPackageAbstract());
    packageStakeholderEClass.getESuperTypes().add(this.getPackageAbstract());
    packageSystemEClass.getESuperTypes().add(this.getPackageAbstract());
    goalEClass.getESuperTypes().add(this.getRequirement());
    frEClass.getESuperTypes().add(this.getRequirement());
    qrEClass.getESuperTypes().add(this.getRequirement());
    constraintEClass.getESuperTypes().add(this.getRequirement());
    useCaseEClass.getESuperTypes().add(this.getRequirement());
    stateEClass.getESuperTypes().add(this.getStates());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Packages(), this.getPackageAbstract(), null, "packages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageAbstractEClass, PackageAbstract.class, "PackageAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageAbstract_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageAbstract_Imports(), this.getImport(), null, "imports", null, 0, -1, PackageAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDate_Day(), ecorePackage.getEInt(), "day", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDate_Month(), this.getMonth(), null, "month", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDate_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(monthEClass, Month.class, "Month", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMonth_Name(), ecorePackage.getEString(), "name", null, 0, 1, Month.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(progressEClass, Progress.class, "Progress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProgress_Value(), ecorePackage.getEString(), "value", null, 0, 1, Progress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(priorityEClass, Priority.class, "Priority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPriority_Value(), ecorePackage.getEString(), "value", null, 0, 1, Priority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageProjectEClass, PackageProject.class, "PackageProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageProject_Project(), this.getProject(), null, "project", null, 0, 1, PackageProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageProject_PackageGlossaries(), this.getPackageGlossary(), null, "packageGlossaries", null, 0, -1, PackageProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageProject_PackageStakeholders(), this.getPackageStakeholder(), null, "packageStakeholders", null, 0, -1, PackageProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageProject_PackageSystems(), this.getPackageSystem(), null, "packageSystems", null, 0, -1, PackageProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageProject_SystemRelations(), this.getSystemRelation(), null, "systemRelations", null, 0, -1, PackageProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageGlossaryEClass, PackageGlossary.class, "PackageGlossary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageGlossary_GlossaryTerms(), this.getGlossaryTerm(), null, "glossaryTerms", null, 0, -1, PackageGlossary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageStakeholderEClass, PackageStakeholder.class, "PackageStakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageStakeholder_Stakeholders(), this.getStakeholder(), null, "stakeholders", null, 0, -1, PackageStakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageSystemEClass, PackageSystem.class, "PackageSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageSystem_System(), this.getSystem(), null, "system", null, 0, 1, PackageSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageSystem_Entities(), this.getEntity(), null, "entities", null, 0, -1, PackageSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageSystem_BusinessEntities(), this.getBusinessEntity(), null, "businessEntities", null, 0, -1, PackageSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageSystem_Actors(), this.getActor(), null, "actors", null, 0, -1, PackageSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageSystem_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, PackageSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageSystem_StateMachine(), this.getStateMachine(), null, "stateMachine", null, 0, -1, PackageSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageSystem_RequirementRelations(), this.getRequirementRelation(), null, "requirementRelations", null, 0, -1, PackageSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageSystem_SystemRelations(), this.getSystemRelation(), null, "systemRelations", null, 0, -1, PackageSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProject_Type(), this.getProjectType(), "type", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProject_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProject_Domain(), this.getProjectDomain(), "domain", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Planned(), this.getPlannedSchedule(), null, "planned", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Actual(), this.getActualSchedule(), null, "actual", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Organizations(), this.getOrganizations(), null, "organizations", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_Progress(), this.getProgress(), null, "progress", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProject_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProject_Description(), ecorePackage.getEString(), "description", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plannedScheduleEClass, PlannedSchedule.class, "PlannedSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlannedSchedule_Start(), this.getDate(), null, "start", null, 0, 1, PlannedSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlannedSchedule_End(), this.getDate(), null, "end", null, 0, 1, PlannedSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actualScheduleEClass, ActualSchedule.class, "ActualSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActualSchedule_Start(), this.getDate(), null, "start", null, 0, 1, ActualSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActualSchedule_End(), this.getDate(), null, "end", null, 0, 1, ActualSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(organizationsEClass, Organizations.class, "Organizations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrganizations_Customer(), ecorePackage.getEString(), "customer", null, 0, 1, Organizations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrganizations_Supplier(), ecorePackage.getEString(), "supplier", null, 0, 1, Organizations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOrganizations_Partners(), ecorePackage.getEString(), "partners", null, 0, 1, Organizations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(glossaryTermEClass, GlossaryTerm.class, "GlossaryTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlossaryTerm_Name(), ecorePackage.getEString(), "name", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlossaryTerm_Type(), this.getTermType(), "type", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlossaryTerm_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlossaryTerm_Acronym(), ecorePackage.getEString(), "acronym", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlossaryTerm_Ref(), this.getRefTermApplication(), null, "ref", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlossaryTerm_Synonym(), ecorePackage.getEString(), "synonym", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlossaryTerm_Super(), this.getGlossaryTerm(), null, "super", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGlossaryTerm_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termApplicationEClass, TermApplication.class, "TermApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTermApplication_Value(), ecorePackage.getEString(), "value", null, 0, 1, TermApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refTermApplicationEClass, RefTermApplication.class, "RefTermApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefTermApplication_Refs(), this.getTermApplication(), null, "refs", null, 0, -1, RefTermApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStakeholder_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Type(), this.getStakeholderType(), "type", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Category(), this.getStakeholderCategory(), "category", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStakeholder_Super(), this.getStakeholder(), null, "super", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStakeholder_PartOf(), this.getStakeholder(), null, "partOf", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Description(), ecorePackage.getEString(), "description", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemEClass, rslingo.rsl.rsl.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, rslingo.rsl.rsl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystem_Type(), this.getSystemType(), "type", null, 0, 1, rslingo.rsl.rsl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystem_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, rslingo.rsl.rsl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystem_Scope(), this.getSystemScope(), "scope", null, 0, 1, rslingo.rsl.rsl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystem_SubSystems(), this.getRefSystem(), null, "subSystems", null, 0, 1, rslingo.rsl.rsl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystem_ReusableSystems(), this.getRefSystem(), null, "reusableSystems", null, 0, 1, rslingo.rsl.rsl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystem_Description(), ecorePackage.getEString(), "description", null, 0, 1, rslingo.rsl.rsl.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refSystemEClass, RefSystem.class, "RefSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefSystem_Refs(), this.getSystem(), null, "refs", null, 0, -1, RefSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemRelationEClass, SystemRelation.class, "SystemRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystemRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystemRelation_Type(), this.getSystemRelationType(), "type", null, 0, 1, SystemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemRelation_Source(), this.getSystem(), null, "source", null, 0, 1, SystemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemRelation_Target(), this.getSystem(), null, "target", null, 0, 1, SystemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystemRelation_Category(), this.getSystemRelationCategory(), "category", null, 0, 1, SystemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystemRelation_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntity_Type(), this.getEntityType(), "type", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntity_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Super(), this.getEntity(), null, "super", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_PrimaryKey(), this.getPrimaryKey(), null, "primaryKey", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_ForeignKeys(), this.getForeignKey(), null, "foreignKeys", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Checks(), this.getCheck(), null, "checks", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Type(), this.getAttributeType(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Subsize(), ecorePackage.getEInt(), "subsize", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_NotNull(), ecorePackage.getEString(), "notNull", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Unique(), ecorePackage.getEString(), "unique", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Description(), ecorePackage.getEString(), "description", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiplicity_Value(), ecorePackage.getEString(), "value", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryKey_RefTo(), this.getRefAttribute(), null, "refTo", null, 0, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreignKeyEClass, ForeignKey.class, "ForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForeignKey_Fentity(), this.getEntity(), null, "fentity", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeignKey_RefTo(), this.getRefAttribute(), null, "refTo", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refAttributeEClass, RefAttribute.class, "RefAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefAttribute_RefAttr(), this.getAttribute(), null, "refAttr", null, 0, -1, RefAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCheck_Name(), ecorePackage.getEString(), "name", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCheck_CheckExpression(), ecorePackage.getEString(), "checkExpression", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(businessEntityEClass, BusinessEntity.class, "BusinessEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBusinessEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, BusinessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessEntity_Type(), this.getBusinessEntityType(), "type", null, 0, 1, BusinessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessEntity_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, BusinessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessEntity_Master(), this.getMasterBEntity(), null, "master", null, 0, 1, BusinessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessEntity_Detail(), this.getDetailBEntity(), null, "detail", null, 0, 1, BusinessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBusinessEntity_Reference(), this.getReferenceBEntity(), null, "reference", null, 0, 1, BusinessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBusinessEntity_Description(), ecorePackage.getEString(), "description", null, 0, 1, BusinessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(masterBEntityEClass, MasterBEntity.class, "MasterBEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMasterBEntity_MasterEntity(), this.getEntity(), null, "masterEntity", null, 0, 1, MasterBEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(detailBEntityEClass, DetailBEntity.class, "DetailBEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDetailBEntity_EntityDetail(), this.getEntity(), null, "entityDetail", null, 0, 1, DetailBEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDetailBEntity_RefEntity(), this.getRefEntity(), null, "refEntity", null, 0, 1, DetailBEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceBEntityEClass, ReferenceBEntity.class, "ReferenceBEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceBEntity_RefEntity(), this.getRefEntity(), null, "refEntity", null, 0, 1, ReferenceBEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refEntityEClass, RefEntity.class, "RefEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefEntity_RefEntity(), this.getEntity(), null, "refEntity", null, 0, -1, RefEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_Type(), this.getActorType(), "type", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActor_Stakeholder(), this.getStakeholder(), null, "stakeholder", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActor_Super(), this.getActor(), null, "super", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActor_Description(), ecorePackage.getEString(), "description", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_Stakeholder(), this.getStakeholder(), null, "stakeholder", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_Priority(), this.getPriority(), null, "priority", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_Progress(), this.getProgress(), null, "progress", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementRelationEClass, RequirementRelation.class, "RequirementRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirementRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, RequirementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirementRelation_Type(), this.getRequirementRelationType(), "type", null, 0, 1, RequirementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirementRelation_Source(), this.getRequirement(), null, "source", null, 0, 1, RequirementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirementRelation_Target(), this.getRequirement(), null, "target", null, 0, 1, RequirementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirementRelation_Description(), ecorePackage.getEString(), "description", null, 0, 1, RequirementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoal_Type(), this.getGoalType(), "type", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_PartOf(), this.getGoal(), null, "partOf", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(frEClass, rslingo.rsl.rsl.FR.class, "FR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFR_Type(), this.getFRType(), "type", null, 0, 1, rslingo.rsl.rsl.FR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFR_PartOf(), this.getFR(), null, "partOf", null, 0, 1, rslingo.rsl.rsl.FR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qrEClass, rslingo.rsl.rsl.QR.class, "QR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQR_Type(), this.getQRType(), "type", null, 0, 1, rslingo.rsl.rsl.QR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQR_SubType(), this.getQRSubType(), "subType", null, 0, 1, rslingo.rsl.rsl.QR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQR_Metric(), this.getMetric(), "metric", null, 0, 1, rslingo.rsl.rsl.QR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQR_Value(), ecorePackage.getEInt(), "value", null, 0, 1, rslingo.rsl.rsl.QR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQR_PartOf(), this.getQR(), null, "partOf", null, 0, 1, rslingo.rsl.rsl.QR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstraint_Type(), this.getConstraintType(), "type", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_SubType(), this.getConstraintSubType(), "subType", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_PartOf(), this.getConstraint(), null, "partOf", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUseCase_Type(), this.getUseCaseType(), "type", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_ActorInitiates(), this.getActor(), null, "actorInitiates", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_ActorParticipates(), this.getRefActor(), null, "actorParticipates", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_BEntity(), this.getBusinessEntity(), null, "bEntity", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUseCase_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUseCase_Postcondition(), ecorePackage.getEString(), "postcondition", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_Actions(), this.getUCActions(), null, "actions", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_ExtensionPoints(), this.getUCExtensionPoints(), null, "extensionPoints", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_Includes(), this.getUCIncludes(), null, "includes", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_Extends(), this.getUCExtends(), null, "extends", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseCase_Scenarios(), this.getScenario(), null, "scenarios", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refActorEClass, RefActor.class, "RefActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefActor_Refs(), this.getActor(), null, "refs", null, 0, -1, RefActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ucActionsEClass, UCActions.class, "UCActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUCActions_Actions(), this.getUCAction(), null, "actions", null, 0, -1, UCActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ucActionEClass, UCAction.class, "UCAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUCAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, UCAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUCAction_Description(), ecorePackage.getEString(), "description", null, 0, 1, UCAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ucIncludesEClass, UCIncludes.class, "UCIncludes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUCIncludes_Includes(), this.getRefUC(), null, "includes", null, 0, -1, UCIncludes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ucExtendsEClass, UCExtends.class, "UCExtends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUCExtends_Usecase(), this.getUseCase(), null, "usecase", null, 0, 1, UCExtends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUCExtends_ExtensionPoint(), this.getUCExtensionPoint(), null, "extensionPoint", null, 0, 1, UCExtends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ucExtensionPointsEClass, UCExtensionPoints.class, "UCExtensionPoints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUCExtensionPoints_ExtensionPoints(), this.getUCExtensionPoint(), null, "extensionPoints", null, 0, -1, UCExtensionPoints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ucExtensionPointEClass, UCExtensionPoint.class, "UCExtensionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUCExtensionPoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, UCExtensionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUCExtensionPoint_Description(), ecorePackage.getEString(), "description", null, 0, 1, UCExtensionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refUCEClass, RefUC.class, "RefUC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefUC_Refs(), this.getUseCase(), null, "refs", null, 0, -1, RefUC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScenario_Type(), this.getScenarioType(), "type", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScenario_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScenario_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScenario_Description(), ecorePackage.getEString(), "description", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenario_Steps(), this.getStep(), null, "steps", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStep_Type(), this.getStepOperationType(), "type", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStep_SubType(), this.getStepOperationSubType(), "subType", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStep_SimpleStep(), this.getSimpleStep(), null, "simpleStep", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStep_SubSteps(), this.getStep(), null, "subSteps", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStep_IfSteps(), this.getIfStep(), null, "ifSteps", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleStepEClass, SimpleStep.class, "SimpleStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleStep_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, SimpleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleStep_Actor(), this.getActor(), null, "actor", null, 0, 1, SimpleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, SimpleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleStep_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, SimpleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleStep_Postcondition(), ecorePackage.getEString(), "postcondition", null, 0, 1, SimpleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleStep_Next(), this.getStep(), null, "next", null, 0, 1, SimpleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStepEClass, IfStep.class, "IfStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStep_Action(), this.getUCAction(), null, "action", null, 0, 1, IfStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStep_Steps(), this.getStep(), null, "steps", null, 0, -1, IfStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateMachine_Type(), this.getStateMachineType(), "type", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateMachine_NameAlias(), ecorePackage.getEString(), "nameAlias", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMachine_Entity(), this.getEntity(), null, "entity", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateMachine_States(), this.getStates(), null, "states", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateMachine_Description(), ecorePackage.getEString(), "description", null, 0, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statesEClass, States.class, "States", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getState_States(), this.getState(), null, "states", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_OnEntry(), ecorePackage.getEString(), "onEntry", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_OnExit(), ecorePackage.getEString(), "onExit", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransition_UcAction(), this.getRefUCAction(), null, "ucAction", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Nextstate(), this.getState(), null, "nextstate", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refUCActionEClass, RefUCAction.class, "RefUCAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefUCAction_UseCase(), this.getUseCase(), null, "useCase", null, 0, 1, RefUCAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRefUCAction_Action(), this.getUCAction(), null, "action", null, 0, 1, RefUCAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(projectTypeEEnum, ProjectType.class, "ProjectType");
    addEEnumLiteral(projectTypeEEnum, ProjectType.DEVELOPMENT);
    addEEnumLiteral(projectTypeEEnum, ProjectType.DESIGN);
    addEEnumLiteral(projectTypeEEnum, ProjectType.DEPLOYMENT);
    addEEnumLiteral(projectTypeEEnum, ProjectType.MAINTENANCE);
    addEEnumLiteral(projectTypeEEnum, ProjectType.AUDITING);
    addEEnumLiteral(projectTypeEEnum, ProjectType.TRAINING);
    addEEnumLiteral(projectTypeEEnum, ProjectType.RESEARCH);
    addEEnumLiteral(projectTypeEEnum, ProjectType.OTHER);

    initEEnum(projectDomainEEnum, ProjectDomain.class, "ProjectDomain");
    addEEnumLiteral(projectDomainEEnum, ProjectDomain.PUBLIC_SECTOR);
    addEEnumLiteral(projectDomainEEnum, ProjectDomain.EDUCATION);
    addEEnumLiteral(projectDomainEEnum, ProjectDomain.HEALTH);
    addEEnumLiteral(projectDomainEEnum, ProjectDomain.TELECOMS);
    addEEnumLiteral(projectDomainEEnum, ProjectDomain.ENERGY_AND_UTILITIES);
    addEEnumLiteral(projectDomainEEnum, ProjectDomain.FINANCE_AND_BANKS);
    addEEnumLiteral(projectDomainEEnum, ProjectDomain.OTHER);

    initEEnum(termTypeEEnum, TermType.class, "TermType");
    addEEnumLiteral(termTypeEEnum, TermType.ADJECTIVE);
    addEEnumLiteral(termTypeEEnum, TermType.ADVERB);
    addEEnumLiteral(termTypeEEnum, TermType.NOUN);
    addEEnumLiteral(termTypeEEnum, TermType.VERB);

    initEEnum(stakeholderTypeEEnum, StakeholderType.class, "StakeholderType");
    addEEnumLiteral(stakeholderTypeEEnum, StakeholderType.ORGANIZATION);
    addEEnumLiteral(stakeholderTypeEEnum, StakeholderType.BUSINESS_UNIT);
    addEEnumLiteral(stakeholderTypeEEnum, StakeholderType.TEAM);
    addEEnumLiteral(stakeholderTypeEEnum, StakeholderType.PERSON);
    addEEnumLiteral(stakeholderTypeEEnum, StakeholderType.EXTERNAL_SYSTEM);
    addEEnumLiteral(stakeholderTypeEEnum, StakeholderType.OTHER);

    initEEnum(stakeholderCategoryEEnum, StakeholderCategory.class, "StakeholderCategory");
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_CUSTOMER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_SPONSOR);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_USER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_USER_DIRECT);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_USER_INDIRECT);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_ADVISOR);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_DOMAIN_EXPERT);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_GOVERNMENT);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_REGULATOR_AGENT);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.BUSINESS_OTHER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.MANAGER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.MANAGER_PROJECT_MANAGER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.MANAGER_TEAM_MANAGER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.MANAGER_FUNCTIONAL_MANAGER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.MANAGER_OTHER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.TECHNICAL);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.TECHNICAL_BUSINESS_ANALYST);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.TECHNICAL_REQUIREMENTS_ENGINEER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.TECHNICAL_TRAINER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.TECHNICAL_SOFTWARE_ARCHITECT);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.TECHNICAL_SOFTWARE_DESIGNER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.TECHNICAL_SOFTWARE_TESTER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.TECHNICAL_OTHER);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.EXTERNAL_SYSTEM);
    addEEnumLiteral(stakeholderCategoryEEnum, StakeholderCategory.OTHER);

    initEEnum(systemTypeEEnum, SystemType.class, "SystemType");
    addEEnumLiteral(systemTypeEEnum, SystemType.SYSTEM);
    addEEnumLiteral(systemTypeEEnum, SystemType.SUB_SYSTEM);
    addEEnumLiteral(systemTypeEEnum, SystemType.REUSABLE_SYSTEM);
    addEEnumLiteral(systemTypeEEnum, SystemType.OTHER);

    initEEnum(systemScopeEEnum, SystemScope.class, "SystemScope");
    addEEnumLiteral(systemScopeEEnum, SystemScope.IN);
    addEEnumLiteral(systemScopeEEnum, SystemScope.OUT);

    initEEnum(systemRelationTypeEEnum, SystemRelationType.class, "SystemRelationType");
    addEEnumLiteral(systemRelationTypeEEnum, SystemRelationType.IN);
    addEEnumLiteral(systemRelationTypeEEnum, SystemRelationType.OUT);
    addEEnumLiteral(systemRelationTypeEEnum, SystemRelationType.IN_OUT);

    initEEnum(systemRelationCategoryEEnum, SystemRelationCategory.class, "SystemRelationCategory");
    addEEnumLiteral(systemRelationCategoryEEnum, SystemRelationCategory.IMPORT);
    addEEnumLiteral(systemRelationCategoryEEnum, SystemRelationCategory.EXPORT);
    addEEnumLiteral(systemRelationCategoryEEnum, SystemRelationCategory.IMPORT_EXPORT);
    addEEnumLiteral(systemRelationCategoryEEnum, SystemRelationCategory.SYNC);
    addEEnumLiteral(systemRelationCategoryEEnum, SystemRelationCategory.INTERACT);
    addEEnumLiteral(systemRelationCategoryEEnum, SystemRelationCategory.OTHER);

    initEEnum(entityTypeEEnum, EntityType.class, "EntityType");
    addEEnumLiteral(entityTypeEEnum, EntityType.PRINCIPAL);
    addEEnumLiteral(entityTypeEEnum, EntityType.SECONDARY);

    initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
    addEEnumLiteral(attributeTypeEEnum, AttributeType.INTEGER);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.DECIMAL);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.BOOLEAN);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.CURRENCY);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.DATE);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.TIME);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.DATETIME);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.STRING);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.TEXT);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.REGEX);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.URL);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.IMAGE);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.XML);
    addEEnumLiteral(attributeTypeEEnum, AttributeType.BINARY);

    initEEnum(businessEntityTypeEEnum, BusinessEntityType.class, "BusinessEntityType");
    addEEnumLiteral(businessEntityTypeEEnum, BusinessEntityType.VERY_SIMPLE);
    addEEnumLiteral(businessEntityTypeEEnum, BusinessEntityType.SIMPLE);
    addEEnumLiteral(businessEntityTypeEEnum, BusinessEntityType.COMPLEX);

    initEEnum(actorTypeEEnum, ActorType.class, "ActorType");
    addEEnumLiteral(actorTypeEEnum, ActorType.USER);
    addEEnumLiteral(actorTypeEEnum, ActorType.EXTERNAL_SYSTEM);
    addEEnumLiteral(actorTypeEEnum, ActorType.TIMER);

    initEEnum(requirementRelationTypeEEnum, RequirementRelationType.class, "RequirementRelationType");
    addEEnumLiteral(requirementRelationTypeEEnum, RequirementRelationType.REQUIRES);
    addEEnumLiteral(requirementRelationTypeEEnum, RequirementRelationType.SUPPORTS);
    addEEnumLiteral(requirementRelationTypeEEnum, RequirementRelationType.OBSTRUCTS);
    addEEnumLiteral(requirementRelationTypeEEnum, RequirementRelationType.CONFLICTS);
    addEEnumLiteral(requirementRelationTypeEEnum, RequirementRelationType.IDENTICAL);
    addEEnumLiteral(requirementRelationTypeEEnum, RequirementRelationType.RELATES);
    addEEnumLiteral(requirementRelationTypeEEnum, RequirementRelationType.OTHER);

    initEEnum(goalTypeEEnum, GoalType.class, "GoalType");
    addEEnumLiteral(goalTypeEEnum, GoalType.ABSTRACT);
    addEEnumLiteral(goalTypeEEnum, GoalType.CONCRETE);

    initEEnum(frTypeEEnum, FRType.class, "FRType");
    addEEnumLiteral(frTypeEEnum, FRType.FUNCTIONAL);
    addEEnumLiteral(frTypeEEnum, FRType.BEHAVIORAL);
    addEEnumLiteral(frTypeEEnum, FRType.DATA);

    initEEnum(qrTypeEEnum, QRType.class, "QRType");
    addEEnumLiteral(qrTypeEEnum, QRType.SECURITY);
    addEEnumLiteral(qrTypeEEnum, QRType.PERFORMANCE);
    addEEnumLiteral(qrTypeEEnum, QRType.USABILITY);
    addEEnumLiteral(qrTypeEEnum, QRType.APPEARANCE);
    addEEnumLiteral(qrTypeEEnum, QRType.OPERATIONAL);
    addEEnumLiteral(qrTypeEEnum, QRType.MAINTENANCE);
    addEEnumLiteral(qrTypeEEnum, QRType.CULTURAL);
    addEEnumLiteral(qrTypeEEnum, QRType.LEGAL);
    addEEnumLiteral(qrTypeEEnum, QRType.EFFICIENCY);
    addEEnumLiteral(qrTypeEEnum, QRType.RELIABILITY);
    addEEnumLiteral(qrTypeEEnum, QRType.INTEROPERABILITY);

    initEEnum(qrSubTypeEEnum, QRSubType.class, "QRSubType");
    addEEnumLiteral(qrSubTypeEEnum, QRSubType.SECURITY_PRIVACY);
    addEEnumLiteral(qrSubTypeEEnum, QRSubType.SECURITY_INTEGRITY);
    addEEnumLiteral(qrSubTypeEEnum, QRSubType.USABILITY_EASE_OF_USE);
    addEEnumLiteral(qrSubTypeEEnum, QRSubType.USABILITY_EASE_OF_LEARN);
    addEEnumLiteral(qrSubTypeEEnum, QRSubType.USABILITY_ACCESSIBILITY);
    addEEnumLiteral(qrSubTypeEEnum, QRSubType.USABILITY_UNDERSTANDABILITY);
    addEEnumLiteral(qrSubTypeEEnum, QRSubType.USABILITY_LEARNABILITY);
    addEEnumLiteral(qrSubTypeEEnum, QRSubType.USABILITY_ATTRACTIVENESS);
    addEEnumLiteral(qrSubTypeEEnum, QRSubType.EFFICIENCY_RESOURCE_USE);

    initEEnum(metricEEnum, Metric.class, "Metric");
    addEEnumLiteral(metricEEnum, Metric.TIME_DAY);
    addEEnumLiteral(metricEEnum, Metric.TIME_HOUR);
    addEEnumLiteral(metricEEnum, Metric.TIME_MIN);
    addEEnumLiteral(metricEEnum, Metric.TIME_SEC);
    addEEnumLiteral(metricEEnum, Metric.TIME_MSEC);
    addEEnumLiteral(metricEEnum, Metric.FREQUENCY_HZ);
    addEEnumLiteral(metricEEnum, Metric.FREQUENCY_KHZ);
    addEEnumLiteral(metricEEnum, Metric.FREQUENCY_MHZ);
    addEEnumLiteral(metricEEnum, Metric.CAPACITY_KBYTE);
    addEEnumLiteral(metricEEnum, Metric.CAPACITY_MBYTE);
    addEEnumLiteral(metricEEnum, Metric.CAPACITY_GBYTE);
    addEEnumLiteral(metricEEnum, Metric.CAPACITY_TBYTE);
    addEEnumLiteral(metricEEnum, Metric.TASK);
    addEEnumLiteral(metricEEnum, Metric.OTHER);

    initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.CULTURAL);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.LEGAL);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.ORGANIZATIONAL);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.PROJECT);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.TECHNOLOGICAL);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.PHYSICAL);
    addEEnumLiteral(constraintTypeEEnum, ConstraintType.OTHER);

    initEEnum(constraintSubTypeEEnum, ConstraintSubType.class, "ConstraintSubType");
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.CULTURAL_LANGUAGE);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.CULTURAL_OTHER);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.LEGAL_NATIONAL);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.LEGAL_INTERNATIONAL);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.LEGAL_OTHER);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.ORGANIZATIONAL_POLITICS);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.ORGANIZATIONAL_MANAGEMENT);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.ORGANIZATIONAL_OTHER);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.PROJECT_COST);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.PROJECT_TIME);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.PROJECT_SCOPE);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.PROJECT_QUALITY);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.PROJECT_RISK);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.TECHNOLOGICAL_PLATFORM_HARDWARE);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.TECHNOLOGICAL_PLATFORM_SOFTWARE);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.TECHNOLOGICAL_DEVELOPMENT_TOOL);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.PHYSICAL_CONCRETE);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.PHYSICAL_ABSTRACT);
    addEEnumLiteral(constraintSubTypeEEnum, ConstraintSubType.OTHER_OTHER);

    initEEnum(useCaseTypeEEnum, UseCaseType.class, "UseCaseType");
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITY_CREATE);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITY_READ);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITY_UPDATE);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITY_DELETE);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITY_REPORT);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITY_DASHBOARD);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITY_OTHER);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_MANAGE);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_BROWSE);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_SEARCH);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_REPORT);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_DASHBOARD);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_INTEROP_IMPORT);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_INTEROP_EXPORT);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_INTEROP_SYNC);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_INTEROP_SEND_MESSAGE);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_INTEROP_SERVICE_INVOCATION);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_MAP_SHOW);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_MAP_INTERACT);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.ENTITIES_OTHER);
    addEEnumLiteral(useCaseTypeEEnum, UseCaseType.OTHER);

    initEEnum(scenarioTypeEEnum, ScenarioType.class, "ScenarioType");
    addEEnumLiteral(scenarioTypeEEnum, ScenarioType.MAIN);
    addEEnumLiteral(scenarioTypeEEnum, ScenarioType.ALTERNATIVE);
    addEEnumLiteral(scenarioTypeEEnum, ScenarioType.EXCEPTION);

    initEEnum(stepOperationTypeEEnum, StepOperationType.class, "StepOperationType");
    addEEnumLiteral(stepOperationTypeEEnum, StepOperationType.ACTOR_PREPARE_DATA);
    addEEnumLiteral(stepOperationTypeEEnum, StepOperationType.ACTOR_CALL_SYSTEM);
    addEEnumLiteral(stepOperationTypeEEnum, StepOperationType.SYSTEM_EXECUTES);
    addEEnumLiteral(stepOperationTypeEEnum, StepOperationType.SYSTEM_RETURN_RESULT);
    addEEnumLiteral(stepOperationTypeEEnum, StepOperationType.OTHER);
    addEEnumLiteral(stepOperationTypeEEnum, StepOperationType.NONE);

    initEEnum(stepOperationSubTypeEEnum, StepOperationSubType.class, "StepOperationSubType");
    addEEnumLiteral(stepOperationSubTypeEEnum, StepOperationSubType.SUBMIT_DATA);
    addEEnumLiteral(stepOperationSubTypeEEnum, StepOperationSubType.SHOW_DATA);
    addEEnumLiteral(stepOperationSubTypeEEnum, StepOperationSubType.CANCEL_USE_CASE);
    addEEnumLiteral(stepOperationSubTypeEEnum, StepOperationSubType.TERMINATE_USE_CASE);
    addEEnumLiteral(stepOperationSubTypeEEnum, StepOperationSubType.OTHER);

    initEEnum(stateMachineTypeEEnum, StateMachineType.class, "StateMachineType");
    addEEnumLiteral(stateMachineTypeEEnum, StateMachineType.SIMPLE);
    addEEnumLiteral(stateMachineTypeEEnum, StateMachineType.COMPLEX);

    // Create resource
    createResource(eNS_URI);
  }

} //RslPackageImpl
