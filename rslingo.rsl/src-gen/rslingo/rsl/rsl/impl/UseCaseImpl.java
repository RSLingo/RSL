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
import rslingo.rsl.rsl.RefActor;
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.Scenario;
import rslingo.rsl.rsl.UCActions;
import rslingo.rsl.rsl.UCExtends;
import rslingo.rsl.rsl.UCExtensionPoints;
import rslingo.rsl.rsl.UCIncludes;
import rslingo.rsl.rsl.UseCase;
import rslingo.rsl.rsl.UseCaseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getActorInitiates <em>Actor Initiates</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getActorParticipates <em>Actor Participates</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getBEntity <em>BEntity</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.UseCaseImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends RequirementImpl implements UseCase
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final UseCaseType TYPE_EDEFAULT = UseCaseType.ENTITY_CREATE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected UseCaseType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getActorInitiates() <em>Actor Initiates</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorInitiates()
   * @generated
   * @ordered
   */
  protected Actor actorInitiates;

  /**
   * The cached value of the '{@link #getActorParticipates() <em>Actor Participates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorParticipates()
   * @generated
   * @ordered
   */
  protected EList<RefActor> actorParticipates;

  /**
   * The cached value of the '{@link #getBEntity() <em>BEntity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBEntity()
   * @generated
   * @ordered
   */
  protected BusinessEntity bEntity;

  /**
   * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected static final String PRECONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected String precondition = PRECONDITION_EDEFAULT;

  /**
   * The default value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostcondition()
   * @generated
   * @ordered
   */
  protected static final String POSTCONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostcondition()
   * @generated
   * @ordered
   */
  protected String postcondition = POSTCONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected UCActions actions;

  /**
   * The cached value of the '{@link #getExtensionPoints() <em>Extension Points</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionPoints()
   * @generated
   * @ordered
   */
  protected UCExtensionPoints extensionPoints;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected UCIncludes includes;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected EList<UCExtends> extends_;

  /**
   * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarios()
   * @generated
   * @ordered
   */
  protected EList<Scenario> scenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseCaseImpl()
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
    return RslPackage.Literals.USE_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCaseType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(UseCaseType newType)
  {
    UseCaseType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getActorInitiates()
  {
    if (actorInitiates != null && actorInitiates.eIsProxy())
    {
      InternalEObject oldActorInitiates = (InternalEObject)actorInitiates;
      actorInitiates = (Actor)eResolveProxy(oldActorInitiates);
      if (actorInitiates != oldActorInitiates)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.USE_CASE__ACTOR_INITIATES, oldActorInitiates, actorInitiates));
      }
    }
    return actorInitiates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetActorInitiates()
  {
    return actorInitiates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActorInitiates(Actor newActorInitiates)
  {
    Actor oldActorInitiates = actorInitiates;
    actorInitiates = newActorInitiates;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__ACTOR_INITIATES, oldActorInitiates, actorInitiates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RefActor> getActorParticipates()
  {
    if (actorParticipates == null)
    {
      actorParticipates = new EObjectContainmentEList<RefActor>(RefActor.class, this, RslPackage.USE_CASE__ACTOR_PARTICIPATES);
    }
    return actorParticipates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessEntity getBEntity()
  {
    if (bEntity != null && bEntity.eIsProxy())
    {
      InternalEObject oldBEntity = (InternalEObject)bEntity;
      bEntity = (BusinessEntity)eResolveProxy(oldBEntity);
      if (bEntity != oldBEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.USE_CASE__BENTITY, oldBEntity, bEntity));
      }
    }
    return bEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessEntity basicGetBEntity()
  {
    return bEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBEntity(BusinessEntity newBEntity)
  {
    BusinessEntity oldBEntity = bEntity;
    bEntity = newBEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__BENTITY, oldBEntity, bEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrecondition()
  {
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecondition(String newPrecondition)
  {
    String oldPrecondition = precondition;
    precondition = newPrecondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__PRECONDITION, oldPrecondition, precondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPostcondition()
  {
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostcondition(String newPostcondition)
  {
    String oldPostcondition = postcondition;
    postcondition = newPostcondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__POSTCONDITION, oldPostcondition, postcondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCActions getActions()
  {
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActions(UCActions newActions, NotificationChain msgs)
  {
    UCActions oldActions = actions;
    actions = newActions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__ACTIONS, oldActions, newActions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActions(UCActions newActions)
  {
    if (newActions != actions)
    {
      NotificationChain msgs = null;
      if (actions != null)
        msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.USE_CASE__ACTIONS, null, msgs);
      if (newActions != null)
        msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.USE_CASE__ACTIONS, null, msgs);
      msgs = basicSetActions(newActions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__ACTIONS, newActions, newActions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCExtensionPoints getExtensionPoints()
  {
    return extensionPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtensionPoints(UCExtensionPoints newExtensionPoints, NotificationChain msgs)
  {
    UCExtensionPoints oldExtensionPoints = extensionPoints;
    extensionPoints = newExtensionPoints;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__EXTENSION_POINTS, oldExtensionPoints, newExtensionPoints);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtensionPoints(UCExtensionPoints newExtensionPoints)
  {
    if (newExtensionPoints != extensionPoints)
    {
      NotificationChain msgs = null;
      if (extensionPoints != null)
        msgs = ((InternalEObject)extensionPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.USE_CASE__EXTENSION_POINTS, null, msgs);
      if (newExtensionPoints != null)
        msgs = ((InternalEObject)newExtensionPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.USE_CASE__EXTENSION_POINTS, null, msgs);
      msgs = basicSetExtensionPoints(newExtensionPoints, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__EXTENSION_POINTS, newExtensionPoints, newExtensionPoints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCIncludes getIncludes()
  {
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncludes(UCIncludes newIncludes, NotificationChain msgs)
  {
    UCIncludes oldIncludes = includes;
    includes = newIncludes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__INCLUDES, oldIncludes, newIncludes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludes(UCIncludes newIncludes)
  {
    if (newIncludes != includes)
    {
      NotificationChain msgs = null;
      if (includes != null)
        msgs = ((InternalEObject)includes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.USE_CASE__INCLUDES, null, msgs);
      if (newIncludes != null)
        msgs = ((InternalEObject)newIncludes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.USE_CASE__INCLUDES, null, msgs);
      msgs = basicSetIncludes(newIncludes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.USE_CASE__INCLUDES, newIncludes, newIncludes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UCExtends> getExtends()
  {
    if (extends_ == null)
    {
      extends_ = new EObjectContainmentEList<UCExtends>(UCExtends.class, this, RslPackage.USE_CASE__EXTENDS);
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Scenario> getScenarios()
  {
    if (scenarios == null)
    {
      scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, RslPackage.USE_CASE__SCENARIOS);
    }
    return scenarios;
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
      case RslPackage.USE_CASE__ACTOR_PARTICIPATES:
        return ((InternalEList<?>)getActorParticipates()).basicRemove(otherEnd, msgs);
      case RslPackage.USE_CASE__ACTIONS:
        return basicSetActions(null, msgs);
      case RslPackage.USE_CASE__EXTENSION_POINTS:
        return basicSetExtensionPoints(null, msgs);
      case RslPackage.USE_CASE__INCLUDES:
        return basicSetIncludes(null, msgs);
      case RslPackage.USE_CASE__EXTENDS:
        return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
      case RslPackage.USE_CASE__SCENARIOS:
        return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
      case RslPackage.USE_CASE__TYPE:
        return getType();
      case RslPackage.USE_CASE__ACTOR_INITIATES:
        if (resolve) return getActorInitiates();
        return basicGetActorInitiates();
      case RslPackage.USE_CASE__ACTOR_PARTICIPATES:
        return getActorParticipates();
      case RslPackage.USE_CASE__BENTITY:
        if (resolve) return getBEntity();
        return basicGetBEntity();
      case RslPackage.USE_CASE__PRECONDITION:
        return getPrecondition();
      case RslPackage.USE_CASE__POSTCONDITION:
        return getPostcondition();
      case RslPackage.USE_CASE__ACTIONS:
        return getActions();
      case RslPackage.USE_CASE__EXTENSION_POINTS:
        return getExtensionPoints();
      case RslPackage.USE_CASE__INCLUDES:
        return getIncludes();
      case RslPackage.USE_CASE__EXTENDS:
        return getExtends();
      case RslPackage.USE_CASE__SCENARIOS:
        return getScenarios();
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
      case RslPackage.USE_CASE__TYPE:
        setType((UseCaseType)newValue);
        return;
      case RslPackage.USE_CASE__ACTOR_INITIATES:
        setActorInitiates((Actor)newValue);
        return;
      case RslPackage.USE_CASE__ACTOR_PARTICIPATES:
        getActorParticipates().clear();
        getActorParticipates().addAll((Collection<? extends RefActor>)newValue);
        return;
      case RslPackage.USE_CASE__BENTITY:
        setBEntity((BusinessEntity)newValue);
        return;
      case RslPackage.USE_CASE__PRECONDITION:
        setPrecondition((String)newValue);
        return;
      case RslPackage.USE_CASE__POSTCONDITION:
        setPostcondition((String)newValue);
        return;
      case RslPackage.USE_CASE__ACTIONS:
        setActions((UCActions)newValue);
        return;
      case RslPackage.USE_CASE__EXTENSION_POINTS:
        setExtensionPoints((UCExtensionPoints)newValue);
        return;
      case RslPackage.USE_CASE__INCLUDES:
        setIncludes((UCIncludes)newValue);
        return;
      case RslPackage.USE_CASE__EXTENDS:
        getExtends().clear();
        getExtends().addAll((Collection<? extends UCExtends>)newValue);
        return;
      case RslPackage.USE_CASE__SCENARIOS:
        getScenarios().clear();
        getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
      case RslPackage.USE_CASE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.USE_CASE__ACTOR_INITIATES:
        setActorInitiates((Actor)null);
        return;
      case RslPackage.USE_CASE__ACTOR_PARTICIPATES:
        getActorParticipates().clear();
        return;
      case RslPackage.USE_CASE__BENTITY:
        setBEntity((BusinessEntity)null);
        return;
      case RslPackage.USE_CASE__PRECONDITION:
        setPrecondition(PRECONDITION_EDEFAULT);
        return;
      case RslPackage.USE_CASE__POSTCONDITION:
        setPostcondition(POSTCONDITION_EDEFAULT);
        return;
      case RslPackage.USE_CASE__ACTIONS:
        setActions((UCActions)null);
        return;
      case RslPackage.USE_CASE__EXTENSION_POINTS:
        setExtensionPoints((UCExtensionPoints)null);
        return;
      case RslPackage.USE_CASE__INCLUDES:
        setIncludes((UCIncludes)null);
        return;
      case RslPackage.USE_CASE__EXTENDS:
        getExtends().clear();
        return;
      case RslPackage.USE_CASE__SCENARIOS:
        getScenarios().clear();
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
      case RslPackage.USE_CASE__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.USE_CASE__ACTOR_INITIATES:
        return actorInitiates != null;
      case RslPackage.USE_CASE__ACTOR_PARTICIPATES:
        return actorParticipates != null && !actorParticipates.isEmpty();
      case RslPackage.USE_CASE__BENTITY:
        return bEntity != null;
      case RslPackage.USE_CASE__PRECONDITION:
        return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
      case RslPackage.USE_CASE__POSTCONDITION:
        return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
      case RslPackage.USE_CASE__ACTIONS:
        return actions != null;
      case RslPackage.USE_CASE__EXTENSION_POINTS:
        return extensionPoints != null;
      case RslPackage.USE_CASE__INCLUDES:
        return includes != null;
      case RslPackage.USE_CASE__EXTENDS:
        return extends_ != null && !extends_.isEmpty();
      case RslPackage.USE_CASE__SCENARIOS:
        return scenarios != null && !scenarios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", precondition: ");
    result.append(precondition);
    result.append(", postcondition: ");
    result.append(postcondition);
    result.append(')');
    return result.toString();
  }

} //UseCaseImpl
