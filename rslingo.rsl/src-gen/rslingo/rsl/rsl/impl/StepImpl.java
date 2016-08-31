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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rsl.rsl.IfStep;
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.SimpleStep;
import rslingo.rsl.rsl.Step;
import rslingo.rsl.rsl.StepOperationSubType;
import rslingo.rsl.rsl.StepOperationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StepImpl#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StepImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StepImpl#getSimpleStep <em>Simple Step</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StepImpl#getSubSteps <em>Sub Steps</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.StepImpl#getIfSteps <em>If Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final StepOperationType TYPE_EDEFAULT = StepOperationType.ACTOR_PREPARE_DATA;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected StepOperationType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubType()
   * @generated
   * @ordered
   */
  protected static final StepOperationSubType SUB_TYPE_EDEFAULT = StepOperationSubType.SUBMIT_DATA;

  /**
   * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubType()
   * @generated
   * @ordered
   */
  protected StepOperationSubType subType = SUB_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSimpleStep() <em>Simple Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleStep()
   * @generated
   * @ordered
   */
  protected SimpleStep simpleStep;

  /**
   * The cached value of the '{@link #getSubSteps() <em>Sub Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSteps()
   * @generated
   * @ordered
   */
  protected EList<Step> subSteps;

  /**
   * The cached value of the '{@link #getIfSteps() <em>If Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfSteps()
   * @generated
   * @ordered
   */
  protected EList<IfStep> ifSteps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StepImpl()
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
    return RslPackage.Literals.STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STEP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StepOperationType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(StepOperationType newType)
  {
    StepOperationType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STEP__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StepOperationSubType getSubType()
  {
    return subType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubType(StepOperationSubType newSubType)
  {
    StepOperationSubType oldSubType = subType;
    subType = newSubType == null ? SUB_TYPE_EDEFAULT : newSubType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STEP__SUB_TYPE, oldSubType, subType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleStep getSimpleStep()
  {
    return simpleStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleStep(SimpleStep newSimpleStep, NotificationChain msgs)
  {
    SimpleStep oldSimpleStep = simpleStep;
    simpleStep = newSimpleStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.STEP__SIMPLE_STEP, oldSimpleStep, newSimpleStep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleStep(SimpleStep newSimpleStep)
  {
    if (newSimpleStep != simpleStep)
    {
      NotificationChain msgs = null;
      if (simpleStep != null)
        msgs = ((InternalEObject)simpleStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.STEP__SIMPLE_STEP, null, msgs);
      if (newSimpleStep != null)
        msgs = ((InternalEObject)newSimpleStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.STEP__SIMPLE_STEP, null, msgs);
      msgs = basicSetSimpleStep(newSimpleStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.STEP__SIMPLE_STEP, newSimpleStep, newSimpleStep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Step> getSubSteps()
  {
    if (subSteps == null)
    {
      subSteps = new EObjectContainmentEList<Step>(Step.class, this, RslPackage.STEP__SUB_STEPS);
    }
    return subSteps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IfStep> getIfSteps()
  {
    if (ifSteps == null)
    {
      ifSteps = new EObjectContainmentEList<IfStep>(IfStep.class, this, RslPackage.STEP__IF_STEPS);
    }
    return ifSteps;
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
      case RslPackage.STEP__SIMPLE_STEP:
        return basicSetSimpleStep(null, msgs);
      case RslPackage.STEP__SUB_STEPS:
        return ((InternalEList<?>)getSubSteps()).basicRemove(otherEnd, msgs);
      case RslPackage.STEP__IF_STEPS:
        return ((InternalEList<?>)getIfSteps()).basicRemove(otherEnd, msgs);
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
      case RslPackage.STEP__NAME:
        return getName();
      case RslPackage.STEP__TYPE:
        return getType();
      case RslPackage.STEP__SUB_TYPE:
        return getSubType();
      case RslPackage.STEP__SIMPLE_STEP:
        return getSimpleStep();
      case RslPackage.STEP__SUB_STEPS:
        return getSubSteps();
      case RslPackage.STEP__IF_STEPS:
        return getIfSteps();
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
      case RslPackage.STEP__NAME:
        setName((String)newValue);
        return;
      case RslPackage.STEP__TYPE:
        setType((StepOperationType)newValue);
        return;
      case RslPackage.STEP__SUB_TYPE:
        setSubType((StepOperationSubType)newValue);
        return;
      case RslPackage.STEP__SIMPLE_STEP:
        setSimpleStep((SimpleStep)newValue);
        return;
      case RslPackage.STEP__SUB_STEPS:
        getSubSteps().clear();
        getSubSteps().addAll((Collection<? extends Step>)newValue);
        return;
      case RslPackage.STEP__IF_STEPS:
        getIfSteps().clear();
        getIfSteps().addAll((Collection<? extends IfStep>)newValue);
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
      case RslPackage.STEP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RslPackage.STEP__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RslPackage.STEP__SUB_TYPE:
        setSubType(SUB_TYPE_EDEFAULT);
        return;
      case RslPackage.STEP__SIMPLE_STEP:
        setSimpleStep((SimpleStep)null);
        return;
      case RslPackage.STEP__SUB_STEPS:
        getSubSteps().clear();
        return;
      case RslPackage.STEP__IF_STEPS:
        getIfSteps().clear();
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
      case RslPackage.STEP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RslPackage.STEP__TYPE:
        return type != TYPE_EDEFAULT;
      case RslPackage.STEP__SUB_TYPE:
        return subType != SUB_TYPE_EDEFAULT;
      case RslPackage.STEP__SIMPLE_STEP:
        return simpleStep != null;
      case RslPackage.STEP__SUB_STEPS:
        return subSteps != null && !subSteps.isEmpty();
      case RslPackage.STEP__IF_STEPS:
        return ifSteps != null && !ifSteps.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", subType: ");
    result.append(subType);
    result.append(')');
    return result.toString();
  }

} //StepImpl
