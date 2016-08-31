/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.RefUCAction;
import rslingo.rsl.rsl.RslPackage;
import rslingo.rsl.rsl.State;
import rslingo.rsl.rsl.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.TransitionImpl#getUcAction <em>Uc Action</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.TransitionImpl#getNextstate <em>Nextstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getUcAction() <em>Uc Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUcAction()
   * @generated
   * @ordered
   */
  protected RefUCAction ucAction;

  /**
   * The cached value of the '{@link #getNextstate() <em>Nextstate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextstate()
   * @generated
   * @ordered
   */
  protected State nextstate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return RslPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefUCAction getUcAction()
  {
    return ucAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUcAction(RefUCAction newUcAction, NotificationChain msgs)
  {
    RefUCAction oldUcAction = ucAction;
    ucAction = newUcAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.TRANSITION__UC_ACTION, oldUcAction, newUcAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUcAction(RefUCAction newUcAction)
  {
    if (newUcAction != ucAction)
    {
      NotificationChain msgs = null;
      if (ucAction != null)
        msgs = ((InternalEObject)ucAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.TRANSITION__UC_ACTION, null, msgs);
      if (newUcAction != null)
        msgs = ((InternalEObject)newUcAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.TRANSITION__UC_ACTION, null, msgs);
      msgs = basicSetUcAction(newUcAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.TRANSITION__UC_ACTION, newUcAction, newUcAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getNextstate()
  {
    if (nextstate != null && nextstate.eIsProxy())
    {
      InternalEObject oldNextstate = (InternalEObject)nextstate;
      nextstate = (State)eResolveProxy(oldNextstate);
      if (nextstate != oldNextstate)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.TRANSITION__NEXTSTATE, oldNextstate, nextstate));
      }
    }
    return nextstate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetNextstate()
  {
    return nextstate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextstate(State newNextstate)
  {
    State oldNextstate = nextstate;
    nextstate = newNextstate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.TRANSITION__NEXTSTATE, oldNextstate, nextstate));
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
      case RslPackage.TRANSITION__UC_ACTION:
        return basicSetUcAction(null, msgs);
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
      case RslPackage.TRANSITION__UC_ACTION:
        return getUcAction();
      case RslPackage.TRANSITION__NEXTSTATE:
        if (resolve) return getNextstate();
        return basicGetNextstate();
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
      case RslPackage.TRANSITION__UC_ACTION:
        setUcAction((RefUCAction)newValue);
        return;
      case RslPackage.TRANSITION__NEXTSTATE:
        setNextstate((State)newValue);
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
      case RslPackage.TRANSITION__UC_ACTION:
        setUcAction((RefUCAction)null);
        return;
      case RslPackage.TRANSITION__NEXTSTATE:
        setNextstate((State)null);
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
      case RslPackage.TRANSITION__UC_ACTION:
        return ucAction != null;
      case RslPackage.TRANSITION__NEXTSTATE:
        return nextstate != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionImpl
