/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.Actor;
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.SimpleStep;
import rslingo.rsl.rsl.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.SimpleStepImpl#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SimpleStepImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SimpleStepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SimpleStepImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SimpleStepImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.SimpleStepImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleStepImpl extends MinimalEObjectImpl.Container implements SimpleStep
{
  /**
   * The default value of the '{@link #getNameAlias() <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAlias()
   * @generated
   * @ordered
   */
  protected static final String NAME_ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameAlias() <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameAlias()
   * @generated
   * @ordered
   */
  protected String nameAlias = NAME_ALIAS_EDEFAULT;

  /**
   * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActor()
   * @generated
   * @ordered
   */
  protected Actor actor;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

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
   * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected Step next;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleStepImpl()
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
    return RslPackage.Literals.SIMPLE_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameAlias()
  {
    return nameAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameAlias(String newNameAlias)
  {
    String oldNameAlias = nameAlias;
    nameAlias = newNameAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SIMPLE_STEP__NAME_ALIAS, oldNameAlias, nameAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getActor()
  {
    if (actor != null && actor.eIsProxy())
    {
      InternalEObject oldActor = (InternalEObject)actor;
      actor = (Actor)eResolveProxy(oldActor);
      if (actor != oldActor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.SIMPLE_STEP__ACTOR, oldActor, actor));
      }
    }
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetActor()
  {
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActor(Actor newActor)
  {
    Actor oldActor = actor;
    actor = newActor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SIMPLE_STEP__ACTOR, oldActor, actor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SIMPLE_STEP__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SIMPLE_STEP__PRECONDITION, oldPrecondition, precondition));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SIMPLE_STEP__POSTCONDITION, oldPostcondition, postcondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step getNext()
  {
    if (next != null && next.eIsProxy())
    {
      InternalEObject oldNext = (InternalEObject)next;
      next = (Step)eResolveProxy(oldNext);
      if (next != oldNext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.SIMPLE_STEP__NEXT, oldNext, next));
      }
    }
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step basicGetNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(Step newNext)
  {
    Step oldNext = next;
    next = newNext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.SIMPLE_STEP__NEXT, oldNext, next));
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
      case RslPackage.SIMPLE_STEP__NAME_ALIAS:
        return getNameAlias();
      case RslPackage.SIMPLE_STEP__ACTOR:
        if (resolve) return getActor();
        return basicGetActor();
      case RslPackage.SIMPLE_STEP__DESCRIPTION:
        return getDescription();
      case RslPackage.SIMPLE_STEP__PRECONDITION:
        return getPrecondition();
      case RslPackage.SIMPLE_STEP__POSTCONDITION:
        return getPostcondition();
      case RslPackage.SIMPLE_STEP__NEXT:
        if (resolve) return getNext();
        return basicGetNext();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RslPackage.SIMPLE_STEP__NAME_ALIAS:
        setNameAlias((String)newValue);
        return;
      case RslPackage.SIMPLE_STEP__ACTOR:
        setActor((Actor)newValue);
        return;
      case RslPackage.SIMPLE_STEP__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RslPackage.SIMPLE_STEP__PRECONDITION:
        setPrecondition((String)newValue);
        return;
      case RslPackage.SIMPLE_STEP__POSTCONDITION:
        setPostcondition((String)newValue);
        return;
      case RslPackage.SIMPLE_STEP__NEXT:
        setNext((Step)newValue);
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
      case RslPackage.SIMPLE_STEP__NAME_ALIAS:
        setNameAlias(NAME_ALIAS_EDEFAULT);
        return;
      case RslPackage.SIMPLE_STEP__ACTOR:
        setActor((Actor)null);
        return;
      case RslPackage.SIMPLE_STEP__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RslPackage.SIMPLE_STEP__PRECONDITION:
        setPrecondition(PRECONDITION_EDEFAULT);
        return;
      case RslPackage.SIMPLE_STEP__POSTCONDITION:
        setPostcondition(POSTCONDITION_EDEFAULT);
        return;
      case RslPackage.SIMPLE_STEP__NEXT:
        setNext((Step)null);
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
      case RslPackage.SIMPLE_STEP__NAME_ALIAS:
        return NAME_ALIAS_EDEFAULT == null ? nameAlias != null : !NAME_ALIAS_EDEFAULT.equals(nameAlias);
      case RslPackage.SIMPLE_STEP__ACTOR:
        return actor != null;
      case RslPackage.SIMPLE_STEP__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RslPackage.SIMPLE_STEP__PRECONDITION:
        return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
      case RslPackage.SIMPLE_STEP__POSTCONDITION:
        return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
      case RslPackage.SIMPLE_STEP__NEXT:
        return next != null;
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
    result.append(" (nameAlias: ");
    result.append(nameAlias);
    result.append(", description: ");
    result.append(description);
    result.append(", precondition: ");
    result.append(precondition);
    result.append(", postcondition: ");
    result.append(postcondition);
    result.append(')');
    return result.toString();
  }

} //SimpleStepImpl
