/**
 */
package rslingo.rsl.rsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rslingo.rsl.rsl.Actor;
import rslingo.rsl.rsl.ActualSchedule;
import rslingo.rsl.rsl.Attribute;
import rslingo.rsl.rsl.BusinessEntity;
import rslingo.rsl.rsl.Check;
import rslingo.rsl.rsl.Constraint;
import rslingo.rsl.rsl.Date;
import rslingo.rsl.rsl.DetailBEntity;
import rslingo.rsl.rsl.Entity;
import rslingo.rsl.rsl.FR;
import rslingo.rsl.rsl.ForeignKey;
import rslingo.rsl.rsl.GlossaryTerm;
import rslingo.rsl.rsl.Goal;
import rslingo.rsl.rsl.IfStep;
import rslingo.rsl.rsl.Import;
import rslingo.rsl.rsl.MasterBEntity;
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
import rslingo.rsl.rsl.QR;
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
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.Scenario;
import rslingo.rsl.rsl.SimpleStep;
import rslingo.rsl.rsl.Stakeholder;
import rslingo.rsl.rsl.State;
import rslingo.rsl.rsl.StateMachine;
import rslingo.rsl.rsl.States;
import rslingo.rsl.rsl.Step;
import rslingo.rsl.rsl.SystemRelation;
import rslingo.rsl.rsl.TermApplication;
import rslingo.rsl.rsl.Transition;
import rslingo.rsl.rsl.UCAction;
import rslingo.rsl.rsl.UCActions;
import rslingo.rsl.rsl.UCExtends;
import rslingo.rsl.rsl.UCExtensionPoint;
import rslingo.rsl.rsl.UCExtensionPoints;
import rslingo.rsl.rsl.UCIncludes;
import rslingo.rsl.rsl.UseCase;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage
 * @generated
 */
public class RslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PACKAGE_ABSTRACT:
      {
        PackageAbstract packageAbstract = (PackageAbstract)theEObject;
        T result = casePackageAbstract(packageAbstract);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.DATE:
      {
        Date date = (Date)theEObject;
        T result = caseDate(date);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.MONTH:
      {
        Month month = (Month)theEObject;
        T result = caseMonth(month);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PROGRESS:
      {
        Progress progress = (Progress)theEObject;
        T result = caseProgress(progress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PRIORITY:
      {
        Priority priority = (Priority)theEObject;
        T result = casePriority(priority);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PACKAGE_PROJECT:
      {
        PackageProject packageProject = (PackageProject)theEObject;
        T result = casePackageProject(packageProject);
        if (result == null) result = casePackageAbstract(packageProject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PACKAGE_GLOSSARY:
      {
        PackageGlossary packageGlossary = (PackageGlossary)theEObject;
        T result = casePackageGlossary(packageGlossary);
        if (result == null) result = casePackageAbstract(packageGlossary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PACKAGE_STAKEHOLDER:
      {
        PackageStakeholder packageStakeholder = (PackageStakeholder)theEObject;
        T result = casePackageStakeholder(packageStakeholder);
        if (result == null) result = casePackageAbstract(packageStakeholder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PACKAGE_SYSTEM:
      {
        PackageSystem packageSystem = (PackageSystem)theEObject;
        T result = casePackageSystem(packageSystem);
        if (result == null) result = casePackageAbstract(packageSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PROJECT:
      {
        Project project = (Project)theEObject;
        T result = caseProject(project);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PLANNED_SCHEDULE:
      {
        PlannedSchedule plannedSchedule = (PlannedSchedule)theEObject;
        T result = casePlannedSchedule(plannedSchedule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.ACTUAL_SCHEDULE:
      {
        ActualSchedule actualSchedule = (ActualSchedule)theEObject;
        T result = caseActualSchedule(actualSchedule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.ORGANIZATIONS:
      {
        Organizations organizations = (Organizations)theEObject;
        T result = caseOrganizations(organizations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.GLOSSARY_TERM:
      {
        GlossaryTerm glossaryTerm = (GlossaryTerm)theEObject;
        T result = caseGlossaryTerm(glossaryTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.TERM_APPLICATION:
      {
        TermApplication termApplication = (TermApplication)theEObject;
        T result = caseTermApplication(termApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REF_TERM_APPLICATION:
      {
        RefTermApplication refTermApplication = (RefTermApplication)theEObject;
        T result = caseRefTermApplication(refTermApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.STAKEHOLDER:
      {
        Stakeholder stakeholder = (Stakeholder)theEObject;
        T result = caseStakeholder(stakeholder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.SYSTEM:
      {
        rslingo.rsl.rsl.System system = (rslingo.rsl.rsl.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REF_SYSTEM:
      {
        RefSystem refSystem = (RefSystem)theEObject;
        T result = caseRefSystem(refSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.SYSTEM_RELATION:
      {
        SystemRelation systemRelation = (SystemRelation)theEObject;
        T result = caseSystemRelation(systemRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.MULTIPLICITY:
      {
        Multiplicity multiplicity = (Multiplicity)theEObject;
        T result = caseMultiplicity(multiplicity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.PRIMARY_KEY:
      {
        PrimaryKey primaryKey = (PrimaryKey)theEObject;
        T result = casePrimaryKey(primaryKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.FOREIGN_KEY:
      {
        ForeignKey foreignKey = (ForeignKey)theEObject;
        T result = caseForeignKey(foreignKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REF_ATTRIBUTE:
      {
        RefAttribute refAttribute = (RefAttribute)theEObject;
        T result = caseRefAttribute(refAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.CHECK:
      {
        Check check = (Check)theEObject;
        T result = caseCheck(check);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.BUSINESS_ENTITY:
      {
        BusinessEntity businessEntity = (BusinessEntity)theEObject;
        T result = caseBusinessEntity(businessEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.MASTER_BENTITY:
      {
        MasterBEntity masterBEntity = (MasterBEntity)theEObject;
        T result = caseMasterBEntity(masterBEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.DETAIL_BENTITY:
      {
        DetailBEntity detailBEntity = (DetailBEntity)theEObject;
        T result = caseDetailBEntity(detailBEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REFERENCE_BENTITY:
      {
        ReferenceBEntity referenceBEntity = (ReferenceBEntity)theEObject;
        T result = caseReferenceBEntity(referenceBEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REF_ENTITY:
      {
        RefEntity refEntity = (RefEntity)theEObject;
        T result = caseRefEntity(refEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REQUIREMENT_RELATION:
      {
        RequirementRelation requirementRelation = (RequirementRelation)theEObject;
        T result = caseRequirementRelation(requirementRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.GOAL:
      {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = caseRequirement(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.FR:
      {
        FR fr = (FR)theEObject;
        T result = caseFR(fr);
        if (result == null) result = caseRequirement(fr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.QR:
      {
        QR qr = (QR)theEObject;
        T result = caseQR(qr);
        if (result == null) result = caseRequirement(qr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = caseRequirement(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.USE_CASE:
      {
        UseCase useCase = (UseCase)theEObject;
        T result = caseUseCase(useCase);
        if (result == null) result = caseRequirement(useCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REF_ACTOR:
      {
        RefActor refActor = (RefActor)theEObject;
        T result = caseRefActor(refActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.UC_ACTIONS:
      {
        UCActions ucActions = (UCActions)theEObject;
        T result = caseUCActions(ucActions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.UC_ACTION:
      {
        UCAction ucAction = (UCAction)theEObject;
        T result = caseUCAction(ucAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.UC_INCLUDES:
      {
        UCIncludes ucIncludes = (UCIncludes)theEObject;
        T result = caseUCIncludes(ucIncludes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.UC_EXTENDS:
      {
        UCExtends ucExtends = (UCExtends)theEObject;
        T result = caseUCExtends(ucExtends);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.UC_EXTENSION_POINTS:
      {
        UCExtensionPoints ucExtensionPoints = (UCExtensionPoints)theEObject;
        T result = caseUCExtensionPoints(ucExtensionPoints);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.UC_EXTENSION_POINT:
      {
        UCExtensionPoint ucExtensionPoint = (UCExtensionPoint)theEObject;
        T result = caseUCExtensionPoint(ucExtensionPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REF_UC:
      {
        RefUC refUC = (RefUC)theEObject;
        T result = caseRefUC(refUC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.STEP:
      {
        Step step = (Step)theEObject;
        T result = caseStep(step);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.SIMPLE_STEP:
      {
        SimpleStep simpleStep = (SimpleStep)theEObject;
        T result = caseSimpleStep(simpleStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.IF_STEP:
      {
        IfStep ifStep = (IfStep)theEObject;
        T result = caseIfStep(ifStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.STATE_MACHINE:
      {
        StateMachine stateMachine = (StateMachine)theEObject;
        T result = caseStateMachine(stateMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.STATES:
      {
        States states = (States)theEObject;
        T result = caseStates(states);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = caseStates(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RslPackage.REF_UC_ACTION:
      {
        RefUCAction refUCAction = (RefUCAction)theEObject;
        T result = caseRefUCAction(refUCAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Abstract</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Abstract</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageAbstract(PackageAbstract object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDate(Date object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Month</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Month</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonth(Month object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Progress</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Progress</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgress(Progress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Priority</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Priority</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePriority(Priority object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageProject(PackageProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Glossary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Glossary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageGlossary(PackageGlossary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Stakeholder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Stakeholder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageStakeholder(PackageStakeholder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageSystem(PackageSystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Planned Schedule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Planned Schedule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlannedSchedule(PlannedSchedule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Schedule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Schedule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualSchedule(ActualSchedule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Organizations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Organizations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrganizations(Organizations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Glossary Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Glossary Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlossaryTerm(GlossaryTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermApplication(TermApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Term Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Term Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefTermApplication(RefTermApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStakeholder(Stakeholder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(rslingo.rsl.rsl.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefSystem(RefSystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemRelation(SystemRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicity(Multiplicity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryKey(PrimaryKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeignKey(ForeignKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefAttribute(RefAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheck(Check object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Business Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Business Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBusinessEntity(BusinessEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Master BEntity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Master BEntity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMasterBEntity(MasterBEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Detail BEntity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Detail BEntity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDetailBEntity(DetailBEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference BEntity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference BEntity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceBEntity(ReferenceBEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefEntity(RefEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementRelation(RequirementRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoal(Goal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFR(FR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQR(QR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseCase(UseCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefActor(RefActor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UC Actions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UC Actions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUCActions(UCActions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UC Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UC Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUCAction(UCAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UC Includes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UC Includes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUCIncludes(UCIncludes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UC Extends</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UC Extends</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUCExtends(UCExtends object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UC Extension Points</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UC Extension Points</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUCExtensionPoints(UCExtensionPoints object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UC Extension Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UC Extension Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUCExtensionPoint(UCExtensionPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref UC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref UC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefUC(RefUC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStep(Step object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleStep(SimpleStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStep(IfStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateMachine(StateMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>States</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>States</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStates(States object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref UC Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref UC Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefUCAction(RefUCAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RslSwitch
