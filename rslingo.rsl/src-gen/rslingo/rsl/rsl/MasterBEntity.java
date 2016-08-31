/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master BEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.MasterBEntity#getMasterEntity <em>Master Entity</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getMasterBEntity()
 * @model
 * @generated
 */
public interface MasterBEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Master Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master Entity</em>' reference.
   * @see #setMasterEntity(Entity)
   * @see rslingo.rsl.rsl.RslPackage#getMasterBEntity_MasterEntity()
   * @model
   * @generated
   */
  Entity getMasterEntity();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.MasterBEntity#getMasterEntity <em>Master Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master Entity</em>' reference.
   * @see #getMasterEntity()
   * @generated
   */
  void setMasterEntity(Entity value);

} // MasterBEntity
