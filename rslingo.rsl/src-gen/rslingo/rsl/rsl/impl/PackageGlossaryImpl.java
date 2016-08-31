/**
 */
package rslingo.rsl.rsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rslingo.rsl.rsl.GlossaryTerm;
import rslingo.rsl.rsl.PackageGlossary;
import rslingo.rsl.rsl.RslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Glossary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.impl.PackageGlossaryImpl#getGlossaryTerms <em>Glossary Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageGlossaryImpl extends PackageAbstractImpl implements PackageGlossary
{
  /**
   * The cached value of the '{@link #getGlossaryTerms() <em>Glossary Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlossaryTerms()
   * @generated
   * @ordered
   */
  protected EList<GlossaryTerm> glossaryTerms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageGlossaryImpl()
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
    return RslPackage.Literals.PACKAGE_GLOSSARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GlossaryTerm> getGlossaryTerms()
  {
    if (glossaryTerms == null)
    {
      glossaryTerms = new EObjectContainmentEList<GlossaryTerm>(GlossaryTerm.class, this, RslPackage.PACKAGE_GLOSSARY__GLOSSARY_TERMS);
    }
    return glossaryTerms;
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
      case RslPackage.PACKAGE_GLOSSARY__GLOSSARY_TERMS:
        return ((InternalEList<?>)getGlossaryTerms()).basicRemove(otherEnd, msgs);
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
      case RslPackage.PACKAGE_GLOSSARY__GLOSSARY_TERMS:
        return getGlossaryTerms();
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
      case RslPackage.PACKAGE_GLOSSARY__GLOSSARY_TERMS:
        getGlossaryTerms().clear();
        getGlossaryTerms().addAll((Collection<? extends GlossaryTerm>)newValue);
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
      case RslPackage.PACKAGE_GLOSSARY__GLOSSARY_TERMS:
        getGlossaryTerms().clear();
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
      case RslPackage.PACKAGE_GLOSSARY__GLOSSARY_TERMS:
        return glossaryTerms != null && !glossaryTerms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PackageGlossaryImpl
