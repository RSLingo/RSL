/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.RefAttribute#getRefAttr <em>Ref Attr</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getRefAttribute()
 * @model
 * @generated
 */
public interface RefAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Attr</b></em>' reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Attr</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Attr</em>' reference list.
   * @see rslingo.rsl.rsl.RslPackage#getRefAttribute_RefAttr()
   * @model
   * @generated
   */
  EList<Attribute> getRefAttr();

} // RefAttribute
