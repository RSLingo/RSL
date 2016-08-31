/**
 */
package rslingo.rsl.rsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import rslingo.rsl.rsl.Entity;
import rslingo.rsl.rsl.RefEntity;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.RefEntityImpl#getRefEntity <em>Ref Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefEntityImpl extends MinimalEObjectImpl.Container implements RefEntity
{
  /**
   * The cached value of the '{@link #getRefEntity() <em>Ref Entity</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefEntity()
   * @generated
   * @ordered
   */
  protected EList<Entity> refEntity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefEntityImpl()
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
    return RslPackage.Literals.REF_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getRefEntity()
  {
    if (refEntity == null)
    {
      refEntity = new EObjectResolvingEList<Entity>(Entity.class, this, RslPackage.REF_ENTITY__REF_ENTITY);
    }
    return refEntity;
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
      case RslPackage.REF_ENTITY__REF_ENTITY:
        return getRefEntity();
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
      case RslPackage.REF_ENTITY__REF_ENTITY:
        getRefEntity().clear();
        getRefEntity().addAll((Collection<? extends Entity>)newValue);
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
      case RslPackage.REF_ENTITY__REF_ENTITY:
        getRefEntity().clear();
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
      case RslPackage.REF_ENTITY__REF_ENTITY:
        return refEntity != null && !refEntity.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefEntityImpl
