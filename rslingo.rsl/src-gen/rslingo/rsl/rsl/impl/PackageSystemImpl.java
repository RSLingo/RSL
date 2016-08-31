/**
 */
package rslingo.rsl.rsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rsl.rsl.Actor;
import rslingo.rsl.rsl.BusinessEntity;
import rslingo.rsl.rsl.Entity;
import rslingo.rsl.rsl.PackageSystem;
import rslingo.rsl.rsl.Requirement;
import rslingo.rsl.rsl.RequirementRelation;
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.StateMachine;
import rslingo.rsl.rsl.SystemRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.PackageSystemImpl#getSystem <em>System</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.PackageSystemImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.PackageSystemImpl#getBusinessEntities <em>Business Entities</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.PackageSystemImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.PackageSystemImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.PackageSystemImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.PackageSystemImpl#getRequirementRelations <em>Requirement Relations</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.PackageSystemImpl#getSystemRelations <em>System Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageSystemImpl extends PackageAbstractImpl implements PackageSystem
{
  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected rslingo.rsl.rsl.System system;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * The cached value of the '{@link #getBusinessEntities() <em>Business Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusinessEntities()
   * @generated
   * @ordered
   */
  protected EList<BusinessEntity> businessEntities;

  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected EList<Actor> actors;

  /**
   * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirements()
   * @generated
   * @ordered
   */
  protected EList<Requirement> requirements;

  /**
   * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateMachine()
   * @generated
   * @ordered
   */
  protected EList<StateMachine> stateMachine;

  /**
   * The cached value of the '{@link #getRequirementRelations() <em>Requirement Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirementRelations()
   * @generated
   * @ordered
   */
  protected EList<RequirementRelation> requirementRelations;

  /**
   * The cached value of the '{@link #getSystemRelations() <em>System Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemRelations()
   * @generated
   * @ordered
   */
  protected EList<SystemRelation> systemRelations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageSystemImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RslPackage.Literals.PACKAGE_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rslingo.rsl.rsl.System getSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystem(rslingo.rsl.rsl.System newSystem, NotificationChain msgs)
  {
    rslingo.rsl.rsl.System oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.PACKAGE_SYSTEM__SYSTEM, oldSystem, newSystem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(rslingo.rsl.rsl.System newSystem)
  {
    if (newSystem != system)
    {
      NotificationChain msgs = null;
      if (system != null)
        msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.PACKAGE_SYSTEM__SYSTEM, null, msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.PACKAGE_SYSTEM__SYSTEM, null, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.PACKAGE_SYSTEM__SYSTEM, newSystem, newSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, RslPackage.PACKAGE_SYSTEM__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BusinessEntity> getBusinessEntities()
  {
    if (businessEntities == null)
    {
      businessEntities = new EObjectContainmentEList<BusinessEntity>(BusinessEntity.class, this, RslPackage.PACKAGE_SYSTEM__BUSINESS_ENTITIES);
    }
    return businessEntities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actor> getActors()
  {
    if (actors == null)
    {
      actors = new EObjectContainmentEList<Actor>(Actor.class, this, RslPackage.PACKAGE_SYSTEM__ACTORS);
    }
    return actors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getRequirements()
  {
    if (requirements == null)
    {
      requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, RslPackage.PACKAGE_SYSTEM__REQUIREMENTS);
    }
    return requirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateMachine> getStateMachine()
  {
    if (stateMachine == null)
    {
      stateMachine = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, RslPackage.PACKAGE_SYSTEM__STATE_MACHINE);
    }
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RequirementRelation> getRequirementRelations()
  {
    if (requirementRelations == null)
    {
      requirementRelations = new EObjectContainmentEList<RequirementRelation>(RequirementRelation.class, this, RslPackage.PACKAGE_SYSTEM__REQUIREMENT_RELATIONS);
    }
    return requirementRelations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SystemRelation> getSystemRelations()
  {
    if (systemRelations == null)
    {
      systemRelations = new EObjectContainmentEList<SystemRelation>(SystemRelation.class, this, RslPackage.PACKAGE_SYSTEM__SYSTEM_RELATIONS);
    }
    return systemRelations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RslPackage.PACKAGE_SYSTEM__SYSTEM:
        return basicSetSystem(null, msgs);
      case RslPackage.PACKAGE_SYSTEM__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case RslPackage.PACKAGE_SYSTEM__BUSINESS_ENTITIES:
        return ((InternalEList<?>)getBusinessEntities()).basicRemove(otherEnd, msgs);
      case RslPackage.PACKAGE_SYSTEM__ACTORS:
        return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENTS:
        return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
      case RslPackage.PACKAGE_SYSTEM__STATE_MACHINE:
        return ((InternalEList<?>)getStateMachine()).basicRemove(otherEnd, msgs);
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENT_RELATIONS:
        return ((InternalEList<?>)getRequirementRelations()).basicRemove(otherEnd, msgs);
      case RslPackage.PACKAGE_SYSTEM__SYSTEM_RELATIONS:
        return ((InternalEList<?>)getSystemRelations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RslPackage.PACKAGE_SYSTEM__SYSTEM:
        return getSystem();
      case RslPackage.PACKAGE_SYSTEM__ENTITIES:
        return getEntities();
      case RslPackage.PACKAGE_SYSTEM__BUSINESS_ENTITIES:
        return getBusinessEntities();
      case RslPackage.PACKAGE_SYSTEM__ACTORS:
        return getActors();
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENTS:
        return getRequirements();
      case RslPackage.PACKAGE_SYSTEM__STATE_MACHINE:
        return getStateMachine();
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENT_RELATIONS:
        return getRequirementRelations();
      case RslPackage.PACKAGE_SYSTEM__SYSTEM_RELATIONS:
        return getSystemRelations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RslPackage.PACKAGE_SYSTEM__SYSTEM:
        setSystem((rslingo.rsl.rsl.System)newValue);
        return;
      case RslPackage.PACKAGE_SYSTEM__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case RslPackage.PACKAGE_SYSTEM__BUSINESS_ENTITIES:
        getBusinessEntities().clear();
        getBusinessEntities().addAll((Collection<? extends BusinessEntity>)newValue);
        return;
      case RslPackage.PACKAGE_SYSTEM__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends Actor>)newValue);
        return;
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENTS:
        getRequirements().clear();
        getRequirements().addAll((Collection<? extends Requirement>)newValue);
        return;
      case RslPackage.PACKAGE_SYSTEM__STATE_MACHINE:
        getStateMachine().clear();
        getStateMachine().addAll((Collection<? extends StateMachine>)newValue);
        return;
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENT_RELATIONS:
        getRequirementRelations().clear();
        getRequirementRelations().addAll((Collection<? extends RequirementRelation>)newValue);
        return;
      case RslPackage.PACKAGE_SYSTEM__SYSTEM_RELATIONS:
        getSystemRelations().clear();
        getSystemRelations().addAll((Collection<? extends SystemRelation>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RslPackage.PACKAGE_SYSTEM__SYSTEM:
        setSystem((rslingo.rsl.rsl.System)null);
        return;
      case RslPackage.PACKAGE_SYSTEM__ENTITIES:
        getEntities().clear();
        return;
      case RslPackage.PACKAGE_SYSTEM__BUSINESS_ENTITIES:
        getBusinessEntities().clear();
        return;
      case RslPackage.PACKAGE_SYSTEM__ACTORS:
        getActors().clear();
        return;
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENTS:
        getRequirements().clear();
        return;
      case RslPackage.PACKAGE_SYSTEM__STATE_MACHINE:
        getStateMachine().clear();
        return;
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENT_RELATIONS:
        getRequirementRelations().clear();
        return;
      case RslPackage.PACKAGE_SYSTEM__SYSTEM_RELATIONS:
        getSystemRelations().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RslPackage.PACKAGE_SYSTEM__SYSTEM:
        return system != null;
      case RslPackage.PACKAGE_SYSTEM__ENTITIES:
        return entities != null && !entities.isEmpty();
      case RslPackage.PACKAGE_SYSTEM__BUSINESS_ENTITIES:
        return businessEntities != null && !businessEntities.isEmpty();
      case RslPackage.PACKAGE_SYSTEM__ACTORS:
        return actors != null && !actors.isEmpty();
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENTS:
        return requirements != null && !requirements.isEmpty();
      case RslPackage.PACKAGE_SYSTEM__STATE_MACHINE:
        return stateMachine != null && !stateMachine.isEmpty();
      case RslPackage.PACKAGE_SYSTEM__REQUIREMENT_RELATIONS:
        return requirementRelations != null && !requirementRelations.isEmpty();
      case RslPackage.PACKAGE_SYSTEM__SYSTEM_RELATIONS:
        return systemRelations != null && !systemRelations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PackageSystemImpl
