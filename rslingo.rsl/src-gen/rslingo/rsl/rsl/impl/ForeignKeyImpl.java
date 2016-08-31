/**
 */
package rslingo.rsl.rsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rslingo.rsl.rsl.Entity;
import rslingo.rsl.rsl.ForeignKey;
import rslingo.rsl.rsl.RefAttribute;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.ForeignKeyImpl#getFentity <em>Fentity</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.impl.ForeignKeyImpl#getRefTo <em>Ref To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends MinimalEObjectImpl.Container implements ForeignKey
{
  /**
   * The cached value of the '{@link #getFentity() <em>Fentity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFentity()
   * @generated
   * @ordered
   */
  protected Entity fentity;

  /**
   * The cached value of the '{@link #getRefTo() <em>Ref To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefTo()
   * @generated
   * @ordered
   */
  protected RefAttribute refTo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeignKeyImpl()
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
    return RslPackage.Literals.FOREIGN_KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getFentity()
  {
    if (fentity != null && fentity.eIsProxy())
    {
      InternalEObject oldFentity = (InternalEObject)fentity;
      fentity = (Entity)eResolveProxy(oldFentity);
      if (fentity != oldFentity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RslPackage.FOREIGN_KEY__FENTITY, oldFentity, fentity));
      }
    }
    return fentity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetFentity()
  {
    return fentity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFentity(Entity newFentity)
  {
    Entity oldFentity = fentity;
    fentity = newFentity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.FOREIGN_KEY__FENTITY, oldFentity, fentity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefAttribute getRefTo()
  {
    return refTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefTo(RefAttribute newRefTo, NotificationChain msgs)
  {
    RefAttribute oldRefTo = refTo;
    refTo = newRefTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RslPackage.FOREIGN_KEY__REF_TO, oldRefTo, newRefTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefTo(RefAttribute newRefTo)
  {
    if (newRefTo != refTo)
    {
      NotificationChain msgs = null;
      if (refTo != null)
        msgs = ((InternalEObject)refTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RslPackage.FOREIGN_KEY__REF_TO, null, msgs);
      if (newRefTo != null)
        msgs = ((InternalEObject)newRefTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RslPackage.FOREIGN_KEY__REF_TO, null, msgs);
      msgs = basicSetRefTo(newRefTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RslPackage.FOREIGN_KEY__REF_TO, newRefTo, newRefTo));
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
      case RslPackage.FOREIGN_KEY__REF_TO:
        return basicSetRefTo(null, msgs);
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
      case RslPackage.FOREIGN_KEY__FENTITY:
        if (resolve) return getFentity();
        return basicGetFentity();
      case RslPackage.FOREIGN_KEY__REF_TO:
        return getRefTo();
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
      case RslPackage.FOREIGN_KEY__FENTITY:
        setFentity((Entity)newValue);
        return;
      case RslPackage.FOREIGN_KEY__REF_TO:
        setRefTo((RefAttribute)newValue);
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
      case RslPackage.FOREIGN_KEY__FENTITY:
        setFentity((Entity)null);
        return;
      case RslPackage.FOREIGN_KEY__REF_TO:
        setRefTo((RefAttribute)null);
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
      case RslPackage.FOREIGN_KEY__FENTITY:
        return fentity != null;
      case RslPackage.FOREIGN_KEY__REF_TO:
        return refTo != null;
    }
    return super.eIsSet(featureID);
  }

} //ForeignKeyImpl
