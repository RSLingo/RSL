/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference BEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.ReferenceBEntity#getRefEntity <em>Ref Entity</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getReferenceBEntity()
 * @model
 * @generated
 */
public interface ReferenceBEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Entity</em>' containment reference.
   * @see #setRefEntity(RefEntity)
   * @see rslingo.rsl.rsl.RslPackage#getReferenceBEntity_RefEntity()
   * @model containment="true"
   * @generated
   */
  RefEntity getRefEntity();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.ReferenceBEntity#getRefEntity <em>Ref Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Entity</em>' containment reference.
   * @see #getRefEntity()
   * @generated
   */
  void setRefEntity(RefEntity value);

} // ReferenceBEntity
