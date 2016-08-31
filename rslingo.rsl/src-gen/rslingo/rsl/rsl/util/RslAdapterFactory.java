/**
 */
package rslingo.rsl.rsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rslingo.rsl.rsl.RslPackage
 * @generated
 */
public class RslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RslSwitch<Adapter> modelSwitch =
    new RslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePackageAbstract(PackageAbstract object)
      {
        return createPackageAbstractAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseDate(Date object)
      {
        return createDateAdapter();
      }
      @Override
      public Adapter caseMonth(Month object)
      {
        return createMonthAdapter();
      }
      @Override
      public Adapter caseProgress(Progress object)
      {
        return createProgressAdapter();
      }
      @Override
      public Adapter casePriority(Priority object)
      {
        return createPriorityAdapter();
      }
      @Override
      public Adapter casePackageProject(PackageProject object)
      {
        return createPackageProjectAdapter();
      }
      @Override
      public Adapter casePackageGlossary(PackageGlossary object)
      {
        return createPackageGlossaryAdapter();
      }
      @Override
      public Adapter casePackageStakeholder(PackageStakeholder object)
      {
        return createPackageStakeholderAdapter();
      }
      @Override
      public Adapter casePackageSystem(PackageSystem object)
      {
        return createPackageSystemAdapter();
      }
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter casePlannedSchedule(PlannedSchedule object)
      {
        return createPlannedScheduleAdapter();
      }
      @Override
      public Adapter caseActualSchedule(ActualSchedule object)
      {
        return createActualScheduleAdapter();
      }
      @Override
      public Adapter caseOrganizations(Organizations object)
      {
        return createOrganizationsAdapter();
      }
      @Override
      public Adapter caseGlossaryTerm(GlossaryTerm object)
      {
        return createGlossaryTermAdapter();
      }
      @Override
      public Adapter caseTermApplication(TermApplication object)
      {
        return createTermApplicationAdapter();
      }
      @Override
      public Adapter caseRefTermApplication(RefTermApplication object)
      {
        return createRefTermApplicationAdapter();
      }
      @Override
      public Adapter caseStakeholder(Stakeholder object)
      {
        return createStakeholderAdapter();
      }
      @Override
      public Adapter caseSystem(rslingo.rsl.rsl.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseRefSystem(RefSystem object)
      {
        return createRefSystemAdapter();
      }
      @Override
      public Adapter caseSystemRelation(SystemRelation object)
      {
        return createSystemRelationAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseMultiplicity(Multiplicity object)
      {
        return createMultiplicityAdapter();
      }
      @Override
      public Adapter casePrimaryKey(PrimaryKey object)
      {
        return createPrimaryKeyAdapter();
      }
      @Override
      public Adapter caseForeignKey(ForeignKey object)
      {
        return createForeignKeyAdapter();
      }
      @Override
      public Adapter caseRefAttribute(RefAttribute object)
      {
        return createRefAttributeAdapter();
      }
      @Override
      public Adapter caseCheck(Check object)
      {
        return createCheckAdapter();
      }
      @Override
      public Adapter caseBusinessEntity(BusinessEntity object)
      {
        return createBusinessEntityAdapter();
      }
      @Override
      public Adapter caseMasterBEntity(MasterBEntity object)
      {
        return createMasterBEntityAdapter();
      }
      @Override
      public Adapter caseDetailBEntity(DetailBEntity object)
      {
        return createDetailBEntityAdapter();
      }
      @Override
      public Adapter caseReferenceBEntity(ReferenceBEntity object)
      {
        return createReferenceBEntityAdapter();
      }
      @Override
      public Adapter caseRefEntity(RefEntity object)
      {
        return createRefEntityAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseRequirementRelation(RequirementRelation object)
      {
        return createRequirementRelationAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseFR(FR object)
      {
        return createFRAdapter();
      }
      @Override
      public Adapter caseQR(QR object)
      {
        return createQRAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseUseCase(UseCase object)
      {
        return createUseCaseAdapter();
      }
      @Override
      public Adapter caseRefActor(RefActor object)
      {
        return createRefActorAdapter();
      }
      @Override
      public Adapter caseUCActions(UCActions object)
      {
        return createUCActionsAdapter();
      }
      @Override
      public Adapter caseUCAction(UCAction object)
      {
        return createUCActionAdapter();
      }
      @Override
      public Adapter caseUCIncludes(UCIncludes object)
      {
        return createUCIncludesAdapter();
      }
      @Override
      public Adapter caseUCExtends(UCExtends object)
      {
        return createUCExtendsAdapter();
      }
      @Override
      public Adapter caseUCExtensionPoints(UCExtensionPoints object)
      {
        return createUCExtensionPointsAdapter();
      }
      @Override
      public Adapter caseUCExtensionPoint(UCExtensionPoint object)
      {
        return createUCExtensionPointAdapter();
      }
      @Override
      public Adapter caseRefUC(RefUC object)
      {
        return createRefUCAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseStep(Step object)
      {
        return createStepAdapter();
      }
      @Override
      public Adapter caseSimpleStep(SimpleStep object)
      {
        return createSimpleStepAdapter();
      }
      @Override
      public Adapter caseIfStep(IfStep object)
      {
        return createIfStepAdapter();
      }
      @Override
      public Adapter caseStateMachine(StateMachine object)
      {
        return createStateMachineAdapter();
      }
      @Override
      public Adapter caseStates(States object)
      {
        return createStatesAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseRefUCAction(RefUCAction object)
      {
        return createRefUCActionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.PackageAbstract <em>Package Abstract</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.PackageAbstract
   * @generated
   */
  public Adapter createPackageAbstractAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Date
   * @generated
   */
  public Adapter createDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Month <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Month
   * @generated
   */
  public Adapter createMonthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Progress <em>Progress</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Progress
   * @generated
   */
  public Adapter createProgressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Priority
   * @generated
   */
  public Adapter createPriorityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.PackageProject <em>Package Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.PackageProject
   * @generated
   */
  public Adapter createPackageProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.PackageGlossary <em>Package Glossary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.PackageGlossary
   * @generated
   */
  public Adapter createPackageGlossaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.PackageStakeholder <em>Package Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.PackageStakeholder
   * @generated
   */
  public Adapter createPackageStakeholderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.PackageSystem <em>Package System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.PackageSystem
   * @generated
   */
  public Adapter createPackageSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.PlannedSchedule <em>Planned Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.PlannedSchedule
   * @generated
   */
  public Adapter createPlannedScheduleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.ActualSchedule <em>Actual Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.ActualSchedule
   * @generated
   */
  public Adapter createActualScheduleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Organizations <em>Organizations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Organizations
   * @generated
   */
  public Adapter createOrganizationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.GlossaryTerm <em>Glossary Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.GlossaryTerm
   * @generated
   */
  public Adapter createGlossaryTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.TermApplication <em>Term Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.TermApplication
   * @generated
   */
  public Adapter createTermApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.RefTermApplication <em>Ref Term Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.RefTermApplication
   * @generated
   */
  public Adapter createRefTermApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Stakeholder
   * @generated
   */
  public Adapter createStakeholderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.RefSystem <em>Ref System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.RefSystem
   * @generated
   */
  public Adapter createRefSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.SystemRelation <em>System Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.SystemRelation
   * @generated
   */
  public Adapter createSystemRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Multiplicity
   * @generated
   */
  public Adapter createMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.PrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.PrimaryKey
   * @generated
   */
  public Adapter createPrimaryKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.ForeignKey
   * @generated
   */
  public Adapter createForeignKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.RefAttribute <em>Ref Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.RefAttribute
   * @generated
   */
  public Adapter createRefAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Check
   * @generated
   */
  public Adapter createCheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.BusinessEntity <em>Business Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.BusinessEntity
   * @generated
   */
  public Adapter createBusinessEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.MasterBEntity <em>Master BEntity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.MasterBEntity
   * @generated
   */
  public Adapter createMasterBEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.DetailBEntity <em>Detail BEntity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.DetailBEntity
   * @generated
   */
  public Adapter createDetailBEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.ReferenceBEntity <em>Reference BEntity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.ReferenceBEntity
   * @generated
   */
  public Adapter createReferenceBEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.RefEntity <em>Ref Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.RefEntity
   * @generated
   */
  public Adapter createRefEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.RequirementRelation <em>Requirement Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.RequirementRelation
   * @generated
   */
  public Adapter createRequirementRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.FR <em>FR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.FR
   * @generated
   */
  public Adapter createFRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.QR <em>QR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.QR
   * @generated
   */
  public Adapter createQRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.UseCase
   * @generated
   */
  public Adapter createUseCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.RefActor <em>Ref Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.RefActor
   * @generated
   */
  public Adapter createRefActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.UCActions <em>UC Actions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.UCActions
   * @generated
   */
  public Adapter createUCActionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.UCAction <em>UC Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.UCAction
   * @generated
   */
  public Adapter createUCActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.UCIncludes <em>UC Includes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.UCIncludes
   * @generated
   */
  public Adapter createUCIncludesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.UCExtends <em>UC Extends</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.UCExtends
   * @generated
   */
  public Adapter createUCExtendsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.UCExtensionPoints <em>UC Extension Points</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.UCExtensionPoints
   * @generated
   */
  public Adapter createUCExtensionPointsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.UCExtensionPoint <em>UC Extension Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.UCExtensionPoint
   * @generated
   */
  public Adapter createUCExtensionPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.RefUC <em>Ref UC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.RefUC
   * @generated
   */
  public Adapter createRefUCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Step
   * @generated
   */
  public Adapter createStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.SimpleStep <em>Simple Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.SimpleStep
   * @generated
   */
  public Adapter createSimpleStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.IfStep <em>If Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.IfStep
   * @generated
   */
  public Adapter createIfStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.StateMachine
   * @generated
   */
  public Adapter createStateMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.States
   * @generated
   */
  public Adapter createStatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link rslingo.rsl.rsl.RefUCAction <em>Ref UC Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see rslingo.rsl.rsl.RefUCAction
   * @generated
   */
  public Adapter createRefUCActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RslAdapterFactory
