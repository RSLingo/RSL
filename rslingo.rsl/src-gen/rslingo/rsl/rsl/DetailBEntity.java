/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detail BEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.DetailBEntity#getEntityDetail <em>Entity Detail</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.DetailBEntity#getRefEntity <em>Ref Entity</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getDetailBEntity()
 * @model
 * @generated
 */
public interface DetailBEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity Detail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Detail</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Detail</em>' reference.
   * @see #setEntityDetail(Entity)
   * @see rslingo.rsl.rsl.RslPackage#getDetailBEntity_EntityDetail()
   * @model
   * @generated
   */
  Entity getEntityDetail();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.DetailBEntity#getEntityDetail <em>Entity Detail</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Detail</em>' reference.
   * @see #getEntityDetail()
   * @generated
   */
  void setEntityDetail(Entity value);

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
   * @see rslingo.rsl.rsl.RslPackage#getDetailBEntity_RefEntity()
   * @model containment="true"
   * @generated
   */
  RefEntity getRefEntity();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.DetailBEntity#getRefEntity <em>Ref Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Entity</em>' containment reference.
   * @see #getRefEntity()
   * @generated
   */
  void setRefEntity(RefEntity value);

} // DetailBEntity
